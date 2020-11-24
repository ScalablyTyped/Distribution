package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  def add(value1: Double, value2: Double): Double = js.native
  
  def bytesToHexString(arr: js.Array[js.Any]): String = js.native
  
  def calcPercent(min: Double, max: Double, value: Double, offset: Double): Double = js.native
  
  def calcPosition(value: Double, min: Double, max: Double, newMin: Double, newMax: Double): Double = js.native
  
  def changeBitValue(num: Double, count: Double): Double = js.native
  
  def getBitValue(num: Double, count: Double): Double = js.native
  
  def highLowToInt(high: Double, low: Double): Double = js.native
  
  def inMaxMin(min: Double, max: Double, value: Double): Double = js.native
  
  def intToHighLow(num: Double): js.Array[js.Any] = js.native
  
  def numToByteNumbers(num: Double, bytes: Double): js.Array[js.Any] = js.native
  
  def numToHexString(num: Double, padding: Double): String = js.native
  
  def range(start: Double, end: Double, step: Double): js.Array[Double] = js.native
  
  def scaleNumber(scale: Double, value: Double): Double = js.native
  
  def setBitValueWithOne(num: Double, count: Double): Double = js.native
  
  def setBitValueWithZero(num: Double, count: Double): Double = js.native
  
  def subtract(value1: Double, value2: Double): Double = js.native
  
  def toFilledString(num: Double, count: Double): String = js.native
  
  def toFixedString(num: Double, count: Double): String = js.native
}
object Add {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (Double, Double) => Double): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBytesToHexString(value: js.Array[js.Any] => String): Self = this.set("bytesToHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalcPercent(value: (Double, Double, Double, Double) => Double): Self = this.set("calcPercent", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCalcPosition(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("calcPosition", js.Any.fromFunction5(value))
    
    @scala.inline
    def setChangeBitValue(value: (Double, Double) => Double): Self = this.set("changeBitValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBitValue(value: (Double, Double) => Double): Self = this.set("getBitValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHighLowToInt(value: (Double, Double) => Double): Self = this.set("highLowToInt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInMaxMin(value: (Double, Double, Double) => Double): Self = this.set("inMaxMin", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIntToHighLow(value: Double => js.Array[js.Any]): Self = this.set("intToHighLow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNumToByteNumbers(value: (Double, Double) => js.Array[js.Any]): Self = this.set("numToByteNumbers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumToHexString(value: (Double, Double) => String): Self = this.set("numToHexString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRange(value: (Double, Double, Double) => js.Array[Double]): Self = this.set("range", js.Any.fromFunction3(value))
    
    @scala.inline
    def setScaleNumber(value: (Double, Double) => Double): Self = this.set("scaleNumber", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBitValueWithOne(value: (Double, Double) => Double): Self = this.set("setBitValueWithOne", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBitValueWithZero(value: (Double, Double) => Double): Self = this.set("setBitValueWithZero", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubtract(value: (Double, Double) => Double): Self = this.set("subtract", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToFilledString(value: (Double, Double) => String): Self = this.set("toFilledString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToFixedString(value: (Double, Double) => String): Self = this.set("toFixedString", js.Any.fromFunction2(value))
  }
}
