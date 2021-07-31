package typings.winrt.Windows.Foundation

import typings.std.Date
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyValue extends StObject {
  
  def getBoolean(): Boolean
  
  def getBooleanArray(): js.Array[Boolean]
  
  def getChar16(): String
  
  def getChar16Array(): js.Array[String]
  
  def getDateTime(): Date
  
  def getDateTimeArray(): js.Array[Date]
  
  def getDouble(): Double
  
  def getDoubleArray(): Float64Array
  
  def getGuid(): String
  
  def getGuidArray(): js.Array[String]
  
  def getInspectableArray(): js.Array[js.Any]
  
  def getInt16(): Double
  
  def getInt16Array(): Int16Array
  
  def getInt32(): Double
  
  def getInt32Array(): Int32Array
  
  def getInt64(): Double
  
  def getInt64Array(): js.Array[Double]
  
  def getPoint(): Point
  
  def getPointArray(): js.Array[Point]
  
  def getRect(): Rect
  
  def getRectArray(): js.Array[Rect]
  
  def getSingle(): Double
  
  def getSingleArray(): Float32Array
  
  def getSize(): Size
  
  def getSizeArray(): js.Array[Size]
  
  def getString(): String
  
  def getStringArray(): js.Array[String]
  
  def getTimeSpan(): Double
  
  def getTimeSpanArray(): js.Array[Double]
  
  def getUInt16(): Double
  
  def getUInt16Array(): Uint16Array
  
  def getUInt32(): Double
  
  def getUInt32Array(): Uint32Array
  
  def getUInt64(): Double
  
  def getUInt64Array(): js.Array[Double]
  
  def getUInt8(): Double
  
  def getUInt8Array(): Uint8Array
  
  var isNumericScalar: Boolean
  
  var `type`: PropertyType
}
object IPropertyValue {
  
  @scala.inline
  def apply(
    getBoolean: () => Boolean,
    getBooleanArray: () => js.Array[Boolean],
    getChar16: () => String,
    getChar16Array: () => js.Array[String],
    getDateTime: () => Date,
    getDateTimeArray: () => js.Array[Date],
    getDouble: () => Double,
    getDoubleArray: () => Float64Array,
    getGuid: () => String,
    getGuidArray: () => js.Array[String],
    getInspectableArray: () => js.Array[js.Any],
    getInt16: () => Double,
    getInt16Array: () => Int16Array,
    getInt32: () => Double,
    getInt32Array: () => Int32Array,
    getInt64: () => Double,
    getInt64Array: () => js.Array[Double],
    getPoint: () => Point,
    getPointArray: () => js.Array[Point],
    getRect: () => Rect,
    getRectArray: () => js.Array[Rect],
    getSingle: () => Double,
    getSingleArray: () => Float32Array,
    getSize: () => Size,
    getSizeArray: () => js.Array[Size],
    getString: () => String,
    getStringArray: () => js.Array[String],
    getTimeSpan: () => Double,
    getTimeSpanArray: () => js.Array[Double],
    getUInt16: () => Double,
    getUInt16Array: () => Uint16Array,
    getUInt32: () => Double,
    getUInt32Array: () => Uint32Array,
    getUInt64: () => Double,
    getUInt64Array: () => js.Array[Double],
    getUInt8: () => Double,
    getUInt8Array: () => Uint8Array,
    isNumericScalar: Boolean,
    `type`: PropertyType
  ): IPropertyValue = {
    val __obj = js.Dynamic.literal(getBoolean = js.Any.fromFunction0(getBoolean), getBooleanArray = js.Any.fromFunction0(getBooleanArray), getChar16 = js.Any.fromFunction0(getChar16), getChar16Array = js.Any.fromFunction0(getChar16Array), getDateTime = js.Any.fromFunction0(getDateTime), getDateTimeArray = js.Any.fromFunction0(getDateTimeArray), getDouble = js.Any.fromFunction0(getDouble), getDoubleArray = js.Any.fromFunction0(getDoubleArray), getGuid = js.Any.fromFunction0(getGuid), getGuidArray = js.Any.fromFunction0(getGuidArray), getInspectableArray = js.Any.fromFunction0(getInspectableArray), getInt16 = js.Any.fromFunction0(getInt16), getInt16Array = js.Any.fromFunction0(getInt16Array), getInt32 = js.Any.fromFunction0(getInt32), getInt32Array = js.Any.fromFunction0(getInt32Array), getInt64 = js.Any.fromFunction0(getInt64), getInt64Array = js.Any.fromFunction0(getInt64Array), getPoint = js.Any.fromFunction0(getPoint), getPointArray = js.Any.fromFunction0(getPointArray), getRect = js.Any.fromFunction0(getRect), getRectArray = js.Any.fromFunction0(getRectArray), getSingle = js.Any.fromFunction0(getSingle), getSingleArray = js.Any.fromFunction0(getSingleArray), getSize = js.Any.fromFunction0(getSize), getSizeArray = js.Any.fromFunction0(getSizeArray), getString = js.Any.fromFunction0(getString), getStringArray = js.Any.fromFunction0(getStringArray), getTimeSpan = js.Any.fromFunction0(getTimeSpan), getTimeSpanArray = js.Any.fromFunction0(getTimeSpanArray), getUInt16 = js.Any.fromFunction0(getUInt16), getUInt16Array = js.Any.fromFunction0(getUInt16Array), getUInt32 = js.Any.fromFunction0(getUInt32), getUInt32Array = js.Any.fromFunction0(getUInt32Array), getUInt64 = js.Any.fromFunction0(getUInt64), getUInt64Array = js.Any.fromFunction0(getUInt64Array), getUInt8 = js.Any.fromFunction0(getUInt8), getUInt8Array = js.Any.fromFunction0(getUInt8Array), isNumericScalar = isNumericScalar.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValue]
  }
  
  @scala.inline
  implicit class IPropertyValueMutableBuilder[Self <: IPropertyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBoolean(value: () => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBooleanArray(value: () => js.Array[Boolean]): Self = StObject.set(x, "getBooleanArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChar16(value: () => String): Self = StObject.set(x, "getChar16", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChar16Array(value: () => js.Array[String]): Self = StObject.set(x, "getChar16Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateTime(value: () => Date): Self = StObject.set(x, "getDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDateTimeArray(value: () => js.Array[Date]): Self = StObject.set(x, "getDateTimeArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDouble(value: () => Double): Self = StObject.set(x, "getDouble", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDoubleArray(value: () => Float64Array): Self = StObject.set(x, "getDoubleArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGuid(value: () => String): Self = StObject.set(x, "getGuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGuidArray(value: () => js.Array[String]): Self = StObject.set(x, "getGuidArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInspectableArray(value: () => js.Array[js.Any]): Self = StObject.set(x, "getInspectableArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt16(value: () => Double): Self = StObject.set(x, "getInt16", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt16Array(value: () => Int16Array): Self = StObject.set(x, "getInt16Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt32(value: () => Double): Self = StObject.set(x, "getInt32", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt32Array(value: () => Int32Array): Self = StObject.set(x, "getInt32Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt64(value: () => Double): Self = StObject.set(x, "getInt64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt64Array(value: () => js.Array[Double]): Self = StObject.set(x, "getInt64Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoint(value: () => Point): Self = StObject.set(x, "getPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointArray(value: () => js.Array[Point]): Self = StObject.set(x, "getPointArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRect(value: () => Rect): Self = StObject.set(x, "getRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRectArray(value: () => js.Array[Rect]): Self = StObject.set(x, "getRectArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSingle(value: () => Double): Self = StObject.set(x, "getSingle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSingleArray(value: () => Float32Array): Self = StObject.set(x, "getSingleArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeArray(value: () => js.Array[Size]): Self = StObject.set(x, "getSizeArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStringArray(value: () => js.Array[String]): Self = StObject.set(x, "getStringArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeSpan(value: () => Double): Self = StObject.set(x, "getTimeSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeSpanArray(value: () => js.Array[Double]): Self = StObject.set(x, "getTimeSpanArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt16(value: () => Double): Self = StObject.set(x, "getUInt16", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt16Array(value: () => Uint16Array): Self = StObject.set(x, "getUInt16Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt32(value: () => Double): Self = StObject.set(x, "getUInt32", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt32Array(value: () => Uint32Array): Self = StObject.set(x, "getUInt32Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt64(value: () => Double): Self = StObject.set(x, "getUInt64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt64Array(value: () => js.Array[Double]): Self = StObject.set(x, "getUInt64Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt8(value: () => Double): Self = StObject.set(x, "getUInt8", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUInt8Array(value: () => Uint8Array): Self = StObject.set(x, "getUInt8Array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumericScalar(value: Boolean): Self = StObject.set(x, "isNumericScalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
