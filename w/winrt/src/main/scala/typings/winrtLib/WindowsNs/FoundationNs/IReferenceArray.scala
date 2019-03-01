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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getBooleanArray")(getBooleanArray)
    __obj.updateDynamic("getChar16")(getChar16)
    __obj.updateDynamic("getChar16Array")(getChar16Array)
    __obj.updateDynamic("getDateTime")(getDateTime)
    __obj.updateDynamic("getDateTimeArray")(getDateTimeArray)
    __obj.updateDynamic("getDouble")(getDouble)
    __obj.updateDynamic("getDoubleArray")(getDoubleArray)
    __obj.updateDynamic("getGuid")(getGuid)
    __obj.updateDynamic("getGuidArray")(getGuidArray)
    __obj.updateDynamic("getInspectableArray")(getInspectableArray)
    __obj.updateDynamic("getInt16")(getInt16)
    __obj.updateDynamic("getInt16Array")(getInt16Array)
    __obj.updateDynamic("getInt32")(getInt32)
    __obj.updateDynamic("getInt32Array")(getInt32Array)
    __obj.updateDynamic("getInt64")(getInt64)
    __obj.updateDynamic("getInt64Array")(getInt64Array)
    __obj.updateDynamic("getPoint")(getPoint)
    __obj.updateDynamic("getPointArray")(getPointArray)
    __obj.updateDynamic("getRect")(getRect)
    __obj.updateDynamic("getRectArray")(getRectArray)
    __obj.updateDynamic("getSingle")(getSingle)
    __obj.updateDynamic("getSingleArray")(getSingleArray)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getSizeArray")(getSizeArray)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getStringArray")(getStringArray)
    __obj.updateDynamic("getTimeSpan")(getTimeSpan)
    __obj.updateDynamic("getTimeSpanArray")(getTimeSpanArray)
    __obj.updateDynamic("getUInt16")(getUInt16)
    __obj.updateDynamic("getUInt16Array")(getUInt16Array)
    __obj.updateDynamic("getUInt32")(getUInt32)
    __obj.updateDynamic("getUInt32Array")(getUInt32Array)
    __obj.updateDynamic("getUInt64")(getUInt64)
    __obj.updateDynamic("getUInt64Array")(getUInt64Array)
    __obj.updateDynamic("getUInt8")(getUInt8)
    __obj.updateDynamic("getUInt8Array")(getUInt8Array)
    __obj.updateDynamic("isNumericScalar")(isNumericScalar)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IReferenceArray[T]]
  }
}

