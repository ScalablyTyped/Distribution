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
    getBoolean: js.Function0[scala.Boolean],
    getBooleanArray: js.Function0[js.Array[scala.Boolean]],
    getChar16: js.Function0[java.lang.String],
    getChar16Array: js.Function0[js.Array[java.lang.String]],
    getDateTime: js.Function0[stdLib.Date],
    getDateTimeArray: js.Function0[js.Array[stdLib.Date]],
    getDouble: js.Function0[scala.Double],
    getDoubleArray: js.Function0[stdLib.Float64Array],
    getGuid: js.Function0[java.lang.String],
    getGuidArray: js.Function0[js.Array[java.lang.String]],
    getInspectableArray: js.Function0[js.Array[_]],
    getInt16: js.Function0[scala.Double],
    getInt16Array: js.Function0[stdLib.Int16Array],
    getInt32: js.Function0[scala.Double],
    getInt32Array: js.Function0[stdLib.Int32Array],
    getInt64: js.Function0[scala.Double],
    getInt64Array: js.Function0[js.Array[scala.Double]],
    getPoint: js.Function0[Point],
    getPointArray: js.Function0[js.Array[Point]],
    getRect: js.Function0[Rect],
    getRectArray: js.Function0[js.Array[Rect]],
    getSingle: js.Function0[scala.Double],
    getSingleArray: js.Function0[stdLib.Float32Array],
    getSize: js.Function0[Size],
    getSizeArray: js.Function0[js.Array[Size]],
    getString: js.Function0[java.lang.String],
    getStringArray: js.Function0[js.Array[java.lang.String]],
    getTimeSpan: js.Function0[scala.Double],
    getTimeSpanArray: js.Function0[js.Array[scala.Double]],
    getUInt16: js.Function0[scala.Double],
    getUInt16Array: js.Function0[stdLib.Uint16Array],
    getUInt32: js.Function0[scala.Double],
    getUInt32Array: js.Function0[stdLib.Uint32Array],
    getUInt64: js.Function0[scala.Double],
    getUInt64Array: js.Function0[js.Array[scala.Double]],
    getUInt8: js.Function0[scala.Double],
    getUInt8Array: js.Function0[stdLib.Uint8Array],
    isNumericScalar: scala.Boolean,
    `type`: PropertyType,
    value: js.Array[T]
  ): IReferenceArray[T] = {
    val __obj = js.Dynamic.literal(getBoolean = getBoolean, getBooleanArray = getBooleanArray, getChar16 = getChar16, getChar16Array = getChar16Array, getDateTime = getDateTime, getDateTimeArray = getDateTimeArray, getDouble = getDouble, getDoubleArray = getDoubleArray, getGuid = getGuid, getGuidArray = getGuidArray, getInspectableArray = getInspectableArray, getInt16 = getInt16, getInt16Array = getInt16Array, getInt32 = getInt32, getInt32Array = getInt32Array, getInt64 = getInt64, getInt64Array = getInt64Array, getPoint = getPoint, getPointArray = getPointArray, getRect = getRect, getRectArray = getRectArray, getSingle = getSingle, getSingleArray = getSingleArray, getSize = getSize, getSizeArray = getSizeArray, getString = getString, getStringArray = getStringArray, getTimeSpan = getTimeSpan, getTimeSpanArray = getTimeSpanArray, getUInt16 = getUInt16, getUInt16Array = getUInt16Array, getUInt32 = getUInt32, getUInt32Array = getUInt32Array, getUInt64 = getUInt64, getUInt64Array = getUInt64Array, getUInt8 = getUInt8, getUInt8Array = getUInt8Array, isNumericScalar = isNumericScalar, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IReferenceArray[T]]
  }
}

