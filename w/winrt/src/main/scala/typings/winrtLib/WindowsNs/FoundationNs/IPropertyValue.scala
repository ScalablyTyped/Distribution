package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValue extends js.Object {
  var isNumericScalar: scala.Boolean
  var `type`: PropertyType
  def getBoolean(): scala.Boolean
  def getBooleanArray(): js.Array[scala.Boolean]
  def getChar16(): java.lang.String
  def getChar16Array(): js.Array[java.lang.String]
  def getDateTime(): stdLib.Date
  def getDateTimeArray(): js.Array[stdLib.Date]
  def getDouble(): scala.Double
  def getDoubleArray(): stdLib.Float64Array
  def getGuid(): java.lang.String
  def getGuidArray(): js.Array[java.lang.String]
  def getInspectableArray(): js.Array[_]
  def getInt16(): scala.Double
  def getInt16Array(): stdLib.Int16Array
  def getInt32(): scala.Double
  def getInt32Array(): stdLib.Int32Array
  def getInt64(): scala.Double
  def getInt64Array(): js.Array[scala.Double]
  def getPoint(): Point
  def getPointArray(): js.Array[Point]
  def getRect(): Rect
  def getRectArray(): js.Array[Rect]
  def getSingle(): scala.Double
  def getSingleArray(): stdLib.Float32Array
  def getSize(): Size
  def getSizeArray(): js.Array[Size]
  def getString(): java.lang.String
  def getStringArray(): js.Array[java.lang.String]
  def getTimeSpan(): scala.Double
  def getTimeSpanArray(): js.Array[scala.Double]
  def getUInt16(): scala.Double
  def getUInt16Array(): stdLib.Uint16Array
  def getUInt32(): scala.Double
  def getUInt32Array(): stdLib.Uint32Array
  def getUInt64(): scala.Double
  def getUInt64Array(): js.Array[scala.Double]
  def getUInt8(): scala.Double
  def getUInt8Array(): stdLib.Uint8Array
}

object IPropertyValue {
  @scala.inline
  def apply(
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
    `type`: PropertyType
  ): IPropertyValue = {
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
    __obj.asInstanceOf[IPropertyValue]
  }
}

