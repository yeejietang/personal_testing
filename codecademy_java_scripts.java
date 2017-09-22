public class YourName {
	public static void main(String[] args) {

		System.out.println("YJ");

	}
}


public class Switch {
	public static void main(String[] args) {
		
		char penaltyKick = 'X';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println();

		}

	}
}

class Dog extends Animal{
  
  int age;
  
  public Dog(int dogsAge) {
    age = dogsAge;
  }
  
  public void bark() {
    System.out.println("Woof!");
  }
  
  public void run(int feet) {
    System.out.println("Your dog ran " + feet + " feet!");
  }
  
  public int getAge() {
    return age;
  }

	public static void main(String[] args) {
    
    Dog spike = new Dog(5);
    spike.bark();
    spike.run(40);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);
    spike.checkStatus();

	}
}

import java.util.HashMap;

public class RestaurantForEach {
	public static void main(String[] args) {

		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		System.out.println(restaurantMenu.size());

		for (String item : restaurantMenu.keySet()) {
			System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
		}

	}
}

import java.util.*;

public class GeneralizationsD {
	public static void main(String[] args) {
    ArrayList<String> sports = new ArrayList<String>();
    
    sports.add("Football");
    sports.add("Boxing");

		for(String sport : sports) {
      System.out.println(sport)
		}

		//Major cities and the year they were founded
		HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

		majorCities.put("New York", 1624);
		majorCities.put("London", 43);
		majorCities.put("Mexico City", 1521);
		majorCities.put("Sao Paulo", 1554);

		for ( String city : majorCities.keySet() ) {

			System.out.println(city + " was founded in " + majorCities.get(city));

		}
	}
}