package typings.superNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(n: js.Array[Double]): Integer = ^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any]).asInstanceOf[Integer]
  inline def apply(n: Double): Integer = ^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any]).asInstanceOf[Integer]
  
  @JSImport("super-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Integer extends StObject {
    
    def findNearestInteger(n: Double): Double
    
    def getDivisiblesOf(n: Double): js.Array[Double]
    
    def getEvenNumbers(): js.Array[Double]
    
    def getEvenNumbersGreaterOrEqualThan(n: Double): js.Array[Double]
    
    def getEvenNumbersGreaterThan(n: Double): js.Array[Double]
    
    def getEvenNumbersLessOrEqualThan(n: Double): js.Array[Double]
    
    def getEvenNumbersLessThan(n: Double): js.Array[Double]
    
    def getGreatersThan(n: Double): js.Array[Double]
    
    def getLessEvenNumbers(): js.Array[Double]
    
    def getLessOddNumbers(): js.Array[Double]
    
    def getLessOrEqualEvenNumbers(): js.Array[Double]
    
    def getLessOrEqualOddNumbers(): js.Array[Double]
    
    def getLessOrEqualPrimeNumbers(): js.Array[Double]
    
    def getLessPrimeNumbers(): js.Array[Double]
    
    def getLessersThan(n: Double): js.Array[Double]
    
    def getMultiplesOf(n: Double): js.Array[Double]
    
    def getNegativesNumbers(): js.Array[Double]
    
    def getOddNumbers(): js.Array[Double]
    
    def getOddNumbersGreaterOrEqualThan(n: Double): js.Array[Double]
    
    def getOddNumbersGreaterThan(n: Double): js.Array[Double]
    
    def getOddNumbersLessOrEqualThan(n: Double): js.Array[Double]
    
    def getOddNumbersLessThan(n: Double): js.Array[Double]
    
    def getPositivesNumbers(): js.Array[Double]
    
    def getPrimeNumbers(): js.Array[Double]
    
    def getPrimeNumbersGreaterOrEqualThan(n: Double): js.Array[Double]
    
    def getPrimeNumbersGreaterThan(n: Double): js.Array[Double]
    
    def getPrimeNumbersLessOrEqualThan(n: Double): js.Array[Double]
    
    def getPrimeNumbersLessThan(n: Double): js.Array[Double]
    
    def isEvenNumber(): Boolean
    
    def isOddNumber(): Boolean
    
    def isPrimeNumber(): Boolean
  }
  object Integer {
    
    inline def apply(
      findNearestInteger: Double => Double,
      getDivisiblesOf: Double => js.Array[Double],
      getEvenNumbers: () => js.Array[Double],
      getEvenNumbersGreaterOrEqualThan: Double => js.Array[Double],
      getEvenNumbersGreaterThan: Double => js.Array[Double],
      getEvenNumbersLessOrEqualThan: Double => js.Array[Double],
      getEvenNumbersLessThan: Double => js.Array[Double],
      getGreatersThan: Double => js.Array[Double],
      getLessEvenNumbers: () => js.Array[Double],
      getLessOddNumbers: () => js.Array[Double],
      getLessOrEqualEvenNumbers: () => js.Array[Double],
      getLessOrEqualOddNumbers: () => js.Array[Double],
      getLessOrEqualPrimeNumbers: () => js.Array[Double],
      getLessPrimeNumbers: () => js.Array[Double],
      getLessersThan: Double => js.Array[Double],
      getMultiplesOf: Double => js.Array[Double],
      getNegativesNumbers: () => js.Array[Double],
      getOddNumbers: () => js.Array[Double],
      getOddNumbersGreaterOrEqualThan: Double => js.Array[Double],
      getOddNumbersGreaterThan: Double => js.Array[Double],
      getOddNumbersLessOrEqualThan: Double => js.Array[Double],
      getOddNumbersLessThan: Double => js.Array[Double],
      getPositivesNumbers: () => js.Array[Double],
      getPrimeNumbers: () => js.Array[Double],
      getPrimeNumbersGreaterOrEqualThan: Double => js.Array[Double],
      getPrimeNumbersGreaterThan: Double => js.Array[Double],
      getPrimeNumbersLessOrEqualThan: Double => js.Array[Double],
      getPrimeNumbersLessThan: Double => js.Array[Double],
      isEvenNumber: () => Boolean,
      isOddNumber: () => Boolean,
      isPrimeNumber: () => Boolean
    ): Integer = {
      val __obj = js.Dynamic.literal(findNearestInteger = js.Any.fromFunction1(findNearestInteger), getDivisiblesOf = js.Any.fromFunction1(getDivisiblesOf), getEvenNumbers = js.Any.fromFunction0(getEvenNumbers), getEvenNumbersGreaterOrEqualThan = js.Any.fromFunction1(getEvenNumbersGreaterOrEqualThan), getEvenNumbersGreaterThan = js.Any.fromFunction1(getEvenNumbersGreaterThan), getEvenNumbersLessOrEqualThan = js.Any.fromFunction1(getEvenNumbersLessOrEqualThan), getEvenNumbersLessThan = js.Any.fromFunction1(getEvenNumbersLessThan), getGreatersThan = js.Any.fromFunction1(getGreatersThan), getLessEvenNumbers = js.Any.fromFunction0(getLessEvenNumbers), getLessOddNumbers = js.Any.fromFunction0(getLessOddNumbers), getLessOrEqualEvenNumbers = js.Any.fromFunction0(getLessOrEqualEvenNumbers), getLessOrEqualOddNumbers = js.Any.fromFunction0(getLessOrEqualOddNumbers), getLessOrEqualPrimeNumbers = js.Any.fromFunction0(getLessOrEqualPrimeNumbers), getLessPrimeNumbers = js.Any.fromFunction0(getLessPrimeNumbers), getLessersThan = js.Any.fromFunction1(getLessersThan), getMultiplesOf = js.Any.fromFunction1(getMultiplesOf), getNegativesNumbers = js.Any.fromFunction0(getNegativesNumbers), getOddNumbers = js.Any.fromFunction0(getOddNumbers), getOddNumbersGreaterOrEqualThan = js.Any.fromFunction1(getOddNumbersGreaterOrEqualThan), getOddNumbersGreaterThan = js.Any.fromFunction1(getOddNumbersGreaterThan), getOddNumbersLessOrEqualThan = js.Any.fromFunction1(getOddNumbersLessOrEqualThan), getOddNumbersLessThan = js.Any.fromFunction1(getOddNumbersLessThan), getPositivesNumbers = js.Any.fromFunction0(getPositivesNumbers), getPrimeNumbers = js.Any.fromFunction0(getPrimeNumbers), getPrimeNumbersGreaterOrEqualThan = js.Any.fromFunction1(getPrimeNumbersGreaterOrEqualThan), getPrimeNumbersGreaterThan = js.Any.fromFunction1(getPrimeNumbersGreaterThan), getPrimeNumbersLessOrEqualThan = js.Any.fromFunction1(getPrimeNumbersLessOrEqualThan), getPrimeNumbersLessThan = js.Any.fromFunction1(getPrimeNumbersLessThan), isEvenNumber = js.Any.fromFunction0(isEvenNumber), isOddNumber = js.Any.fromFunction0(isOddNumber), isPrimeNumber = js.Any.fromFunction0(isPrimeNumber))
      __obj.asInstanceOf[Integer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Integer] (val x: Self) extends AnyVal {
      
      inline def setFindNearestInteger(value: Double => Double): Self = StObject.set(x, "findNearestInteger", js.Any.fromFunction1(value))
      
      inline def setGetDivisiblesOf(value: Double => js.Array[Double]): Self = StObject.set(x, "getDivisiblesOf", js.Any.fromFunction1(value))
      
      inline def setGetEvenNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getEvenNumbers", js.Any.fromFunction0(value))
      
      inline def setGetEvenNumbersGreaterOrEqualThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getEvenNumbersGreaterOrEqualThan", js.Any.fromFunction1(value))
      
      inline def setGetEvenNumbersGreaterThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getEvenNumbersGreaterThan", js.Any.fromFunction1(value))
      
      inline def setGetEvenNumbersLessOrEqualThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getEvenNumbersLessOrEqualThan", js.Any.fromFunction1(value))
      
      inline def setGetEvenNumbersLessThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getEvenNumbersLessThan", js.Any.fromFunction1(value))
      
      inline def setGetGreatersThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getGreatersThan", js.Any.fromFunction1(value))
      
      inline def setGetLessEvenNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getLessEvenNumbers", js.Any.fromFunction0(value))
      
      inline def setGetLessOddNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getLessOddNumbers", js.Any.fromFunction0(value))
      
      inline def setGetLessOrEqualEvenNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getLessOrEqualEvenNumbers", js.Any.fromFunction0(value))
      
      inline def setGetLessOrEqualOddNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getLessOrEqualOddNumbers", js.Any.fromFunction0(value))
      
      inline def setGetLessOrEqualPrimeNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getLessOrEqualPrimeNumbers", js.Any.fromFunction0(value))
      
      inline def setGetLessPrimeNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getLessPrimeNumbers", js.Any.fromFunction0(value))
      
      inline def setGetLessersThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getLessersThan", js.Any.fromFunction1(value))
      
      inline def setGetMultiplesOf(value: Double => js.Array[Double]): Self = StObject.set(x, "getMultiplesOf", js.Any.fromFunction1(value))
      
      inline def setGetNegativesNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getNegativesNumbers", js.Any.fromFunction0(value))
      
      inline def setGetOddNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getOddNumbers", js.Any.fromFunction0(value))
      
      inline def setGetOddNumbersGreaterOrEqualThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getOddNumbersGreaterOrEqualThan", js.Any.fromFunction1(value))
      
      inline def setGetOddNumbersGreaterThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getOddNumbersGreaterThan", js.Any.fromFunction1(value))
      
      inline def setGetOddNumbersLessOrEqualThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getOddNumbersLessOrEqualThan", js.Any.fromFunction1(value))
      
      inline def setGetOddNumbersLessThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getOddNumbersLessThan", js.Any.fromFunction1(value))
      
      inline def setGetPositivesNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getPositivesNumbers", js.Any.fromFunction0(value))
      
      inline def setGetPrimeNumbers(value: () => js.Array[Double]): Self = StObject.set(x, "getPrimeNumbers", js.Any.fromFunction0(value))
      
      inline def setGetPrimeNumbersGreaterOrEqualThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getPrimeNumbersGreaterOrEqualThan", js.Any.fromFunction1(value))
      
      inline def setGetPrimeNumbersGreaterThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getPrimeNumbersGreaterThan", js.Any.fromFunction1(value))
      
      inline def setGetPrimeNumbersLessOrEqualThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getPrimeNumbersLessOrEqualThan", js.Any.fromFunction1(value))
      
      inline def setGetPrimeNumbersLessThan(value: Double => js.Array[Double]): Self = StObject.set(x, "getPrimeNumbersLessThan", js.Any.fromFunction1(value))
      
      inline def setIsEvenNumber(value: () => Boolean): Self = StObject.set(x, "isEvenNumber", js.Any.fromFunction0(value))
      
      inline def setIsOddNumber(value: () => Boolean): Self = StObject.set(x, "isOddNumber", js.Any.fromFunction0(value))
      
      inline def setIsPrimeNumber(value: () => Boolean): Self = StObject.set(x, "isPrimeNumber", js.Any.fromFunction0(value))
    }
  }
}
