import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int funciones, moneda,M20=0,M50=0,M100=0,M200=0,M500=0,M1000=0,total;
        System.out.println("Hola bienvenido a tu alcancia virtual");
        System.out.println("Puedes realizar las siguientes funciones en tu alcancia");
        System.out.println("""  
                1.Ahorrar
                2.Cuantas monedas hay por cada denominacion
                3.Saber el valor acumulado por cada denominacion de moneda
                4.Cual seria el total del dinero ahorrado
                5.Establecer una meta de ahorro
                """);
        System.out.println("¿Cual es la funcion que deseas");
        funciones = teclado.nextInt();
        switch (funciones) {
            case 1:
                System.out.println("""
                        Cual es la moneda que deseas ahorrar
                        1.$20
                        2.$50
                        3.$100
                        4.$200
                        5.$500
                        6.$1000
                        """);
                moneda = teclado.nextInt();
                System.out.println("Perfecto vas ahorrar monedas de");

                switch (moneda){
                    case 1:
                        System.out.println("Has ingresado moneda de 20");
                        M20++;
                        break;
                    case 2:
                        System.out.println("Has ingresado moneda de 50");
                        M50++;
                        break;
                    case 3:
                        System.out.println("Has ingresado moneda de 100");
                        M100++;
                        break;
                    case 4:
                        System.out.println("Has ingresado moneda de 200");
                        M200++;
                        break;
                    case 5:
                        System.out.println("Has ingresado moneda de 500");
                        M500++;
                        break;
                    case 6:
                        System.out.println("Has ingresado moneda de 1000");
                        M1000++;
                        break;
                }
                break;
            case 2:
                System.out.println("Por supesto a continuacion sabras cuantas monedas hay por denominacion");
                System.out.println("Denominacion de las monedas de 20"+M20);
                System.out.println("Denominacion de las monedas de 50"+M50);
                System.out.println("Denominacion de las monedas de 100"+M100);
                System.out.println("Denominacion de las monedas de 50"+M200);
                System.out.println("Denominacion de las monedas de 50"+M500);
                System.out.println("Denominacion de las monedas de 50"+M1000);
                break;
            case 3:
                System.out.println("Perfecto ahora vas a saber el valor acumulado por denominacion");
                System.out.println("20:"+(M20*20));
                System.out.println("50:"+(M50*50));
                System.out.println("100:"+(M100*100));
                System.out.println("200:"+(M200*200));
                System.out.println("500:"+(M500*500));
                System.out.println("1000:"+(M1000*1000));
                break;
            case 4:
                System.out.println("Perfecto deseas saber el valor del total de tu ahorro");
                total=(M20*20)+(M50*50)+(M100*100)+(M200*200)+(M500*500)+(M1000*1000);
                System.out.println("El total de su ahoro es"+total);
                break;
            case 5:

        }

    }
}