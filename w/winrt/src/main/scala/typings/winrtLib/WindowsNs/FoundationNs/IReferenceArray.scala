package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReferenceArray[T] extends IPropertyValue {
  var value: js.Array[T]
}

object IReferenceArray {
  @scala.inline
  def apply[T](
    getBoolean: () => scala.Boolean,
    getBooleanArray: () => js.Array[scala.Boolean],
    getChar16: () => java.lang.String,
    getChar16Array: () => js.Array[java.lang.String],
    getDateTime: () => stdLib.Date,
    getDateTimeArray: () => js.Array[stdLib.Date],
    getDouble: () => scala.Double,
    getDoubleArray: () => stdLib.Float64Array,
    getGuid: () => java.lang.String,
    getGuidArray: () => js.Array[java.lang.String],
    getInspectableArray: () => js.Array[_],
    getInt16: () => scala.Double,
    getInt16Array: () => stdLib.Int16Array,
    getInt32: () => scala.Double,
    getInt32Array: () => stdLib.Int32Array,
    getInt64: () => scala.Double,
    getInt64Array: () => js.Array[scala.Double],
    getPoint: () => Point,
    getPointArray: () => js.Array[Point],
    getRect: () => Rect,
    getRectArray: () => js.Array[Rect],
    getSingle: () => scala.Double,
    getSingleArray: () => stdLib.Float32Array,
    getSize: () => Size,
    getSizeArray: () => js.Array[Size],
    getString: () => java.lang.String,
    getStringArray: () => js.Array[java.lang.String],
    getTimeSpan: () => scala.Double,
    getTimeSpanArray: () => js.Array[scala.Double],
    getUInt16: () => scala.Double,
    getUInt16Array: () => stdLib.Uint16Array,
    getUInt32: () => scala.Double,
    getUInt32Array: () => stdLib.Uint32Array,
    getUInt64: () => scala.Double,
    getUInt64Array: () => js.Array[scala.Double],
    getUInt8: () => scala.Double,
    getUInt8Array: () => stdLib.Uint8Array,
    isNumericScalar: scala.Boolean,
    `type`: PropertyType,
    value: js.Array[T]
  ): IReferenceArray[T] = {
    val __obj = js.Dynamic.literal(getBoolean = js.Any.fromFunction0(getBoolean), getBooleanArray = js.Any.fromFunction0(getBooleanArray), getChar16 = js.Any.fromFunction0(getChar16), getChar16Array = js.Any.fromFunction0(getChar16Array), getDateTime = js.Any.fromFunction0(getDateTime), getDateTimeArray = js.Any.fromFunction0(getDateTimeArray), getDouble = js.Any.fromFunction0(getDouble), getDoubleArray = js.Any.fromFunction0(getDoubleArray), getGuid = js.Any.fromFunction0(getGuid), getGuidArray = js.Any.fromFunction0(getGuidArray), getInspectableArray = js.Any.fromFunction0(getInspectableArray), getInt16 = js.Any.fromFunction0(getInt16), getInt16Array = js.Any.fromFunction0(getInt16Array), getInt32 = js.Any.fromFunction0(getInt32), getInt32Array = js.Any.fromFunction0(getInt32Array), getInt64 = js.Any.fromFunction0(getInt64), getInt64Array = js.Any.fromFunction0(getInt64Array), getPoint = js.Any.fromFunction0(getPoint), getPointArray = js.Any.fromFunction0(getPointArray), getRect = js.Any.fromFunction0(getRect), getRectArray = js.Any.fromFunction0(getRectArray), getSingle = js.Any.fromFunction0(getSingle), getSingleArray = js.Any.fromFunction0(getSingleArray), getSize = js.Any.fromFunction0(getSize), getSizeArray = js.Any.fromFunction0(getSizeArray), getString = js.Any.fromFunction0(getString), getStringArray = js.Any.fromFunction0(getStringArray), getTimeSpan = js.Any.fromFunction0(getTimeSpan), getTimeSpanArray = js.Any.fromFunction0(getTimeSpanArray), getUInt16 = js.Any.fromFunction0(getUInt16), getUInt16Array = js.Any.fromFunction0(getUInt16Array), getUInt32 = js.Any.fromFunction0(getUInt32), getUInt32Array = js.Any.fromFunction0(getUInt32Array), getUInt64 = js.Any.fromFunction0(getUInt64), getUInt64Array = js.Any.fromFunction0(getUInt64Array), getUInt8 = js.Any.fromFunction0(getUInt8), getUInt8Array = js.Any.fromFunction0(getUInt8Array), isNumericScalar = isNumericScalar, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IReferenceArray[T]]
  }
}

