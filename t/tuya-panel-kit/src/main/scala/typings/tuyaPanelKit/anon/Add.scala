package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  def add(value1: Double, value2: Double): Double
  
  def bytesToHexString(arr: js.Array[js.Any]): String
  
  def calcPercent(min: Double, max: Double, value: Double, offset: Double): Double
  
  def calcPosition(value: Double, min: Double, max: Double, newMin: Double, newMax: Double): Double
  
  def changeBitValue(num: Double, count: Double): Double
  
  def getBitValue(num: Double, count: Double): Double
  
  def highLowToInt(high: Double, low: Double): Double
  
  def inMaxMin(min: Double, max: Double, value: Double): Double
  
  def intToHighLow(num: Double): js.Array[js.Any]
  
  def numToByteNumbers(num: Double, bytes: Double): js.Array[js.Any]
  
  def numToHexString(num: Double, padding: Double): String
  
  def range(start: Double, end: Double, step: Double): js.Array[Double]
  
  def scaleNumber(scale: Double, value: Double): Double
  
  def setBitValueWithOne(num: Double, count: Double): Double
  
  def setBitValueWithZero(num: Double, count: Double): Double
  
  def subtract(value1: Double, value2: Double): Double
  
  def toFilledString(num: Double, count: Double): String
  
  def toFixedString(num: Double, count: Double): String
}
object Add {
  
  inline def apply(
    add: (Double, Double) => Double,
    bytesToHexString: js.Array[js.Any] => String,
    calcPercent: (Double, Double, Double, Double) => Double,
    calcPosition: (Double, Double, Double, Double, Double) => Double,
    changeBitValue: (Double, Double) => Double,
    getBitValue: (Double, Double) => Double,
    highLowToInt: (Double, Double) => Double,
    inMaxMin: (Double, Double, Double) => Double,
    intToHighLow: Double => js.Array[js.Any],
    numToByteNumbers: (Double, Double) => js.Array[js.Any],
    numToHexString: (Double, Double) => String,
    range: (Double, Double, Double) => js.Array[Double],
    scaleNumber: (Double, Double) => Double,
    setBitValueWithOne: (Double, Double) => Double,
    setBitValueWithZero: (Double, Double) => Double,
    subtract: (Double, Double) => Double,
    toFilledString: (Double, Double) => String,
    toFixedString: (Double, Double) => String
  ): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bytesToHexString = js.Any.fromFunction1(bytesToHexString), calcPercent = js.Any.fromFunction4(calcPercent), calcPosition = js.Any.fromFunction5(calcPosition), changeBitValue = js.Any.fromFunction2(changeBitValue), getBitValue = js.Any.fromFunction2(getBitValue), highLowToInt = js.Any.fromFunction2(highLowToInt), inMaxMin = js.Any.fromFunction3(inMaxMin), intToHighLow = js.Any.fromFunction1(intToHighLow), numToByteNumbers = js.Any.fromFunction2(numToByteNumbers), numToHexString = js.Any.fromFunction2(numToHexString), range = js.Any.fromFunction3(range), scaleNumber = js.Any.fromFunction2(scaleNumber), setBitValueWithOne = js.Any.fromFunction2(setBitValueWithOne), setBitValueWithZero = js.Any.fromFunction2(setBitValueWithZero), subtract = js.Any.fromFunction2(subtract), toFilledString = js.Any.fromFunction2(toFilledString), toFixedString = js.Any.fromFunction2(toFixedString))
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(value: (Double, Double) => Double): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBytesToHexString(value: js.Array[js.Any] => String): Self = StObject.set(x, "bytesToHexString", js.Any.fromFunction1(value))
    
    inline def setCalcPercent(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "calcPercent", js.Any.fromFunction4(value))
    
    inline def setCalcPosition(value: (Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "calcPosition", js.Any.fromFunction5(value))
    
    inline def setChangeBitValue(value: (Double, Double) => Double): Self = StObject.set(x, "changeBitValue", js.Any.fromFunction2(value))
    
    inline def setGetBitValue(value: (Double, Double) => Double): Self = StObject.set(x, "getBitValue", js.Any.fromFunction2(value))
    
    inline def setHighLowToInt(value: (Double, Double) => Double): Self = StObject.set(x, "highLowToInt", js.Any.fromFunction2(value))
    
    inline def setInMaxMin(value: (Double, Double, Double) => Double): Self = StObject.set(x, "inMaxMin", js.Any.fromFunction3(value))
    
    inline def setIntToHighLow(value: Double => js.Array[js.Any]): Self = StObject.set(x, "intToHighLow", js.Any.fromFunction1(value))
    
    inline def setNumToByteNumbers(value: (Double, Double) => js.Array[js.Any]): Self = StObject.set(x, "numToByteNumbers", js.Any.fromFunction2(value))
    
    inline def setNumToHexString(value: (Double, Double) => String): Self = StObject.set(x, "numToHexString", js.Any.fromFunction2(value))
    
    inline def setRange(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "range", js.Any.fromFunction3(value))
    
    inline def setScaleNumber(value: (Double, Double) => Double): Self = StObject.set(x, "scaleNumber", js.Any.fromFunction2(value))
    
    inline def setSetBitValueWithOne(value: (Double, Double) => Double): Self = StObject.set(x, "setBitValueWithOne", js.Any.fromFunction2(value))
    
    inline def setSetBitValueWithZero(value: (Double, Double) => Double): Self = StObject.set(x, "setBitValueWithZero", js.Any.fromFunction2(value))
    
    inline def setSubtract(value: (Double, Double) => Double): Self = StObject.set(x, "subtract", js.Any.fromFunction2(value))
    
    inline def setToFilledString(value: (Double, Double) => String): Self = StObject.set(x, "toFilledString", js.Any.fromFunction2(value))
    
    inline def setToFixedString(value: (Double, Double) => String): Self = StObject.set(x, "toFixedString", js.Any.fromFunction2(value))
  }
}
