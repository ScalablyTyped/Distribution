package typings.winrt.Windows.Foundation

import typings.std.Date
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReferenceArray[T] extends IPropertyValue {
  var value: js.Array[T]
}

object IReferenceArray {
  @scala.inline
  def apply[T](
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
    getInspectableArray: () => js.Array[_],
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
    `type`: PropertyType,
    value: js.Array[T]
  ): IReferenceArray[T] = {
    val __obj = js.Dynamic.literal(getBoolean = js.Any.fromFunction0(getBoolean), getBooleanArray = js.Any.fromFunction0(getBooleanArray), getChar16 = js.Any.fromFunction0(getChar16), getChar16Array = js.Any.fromFunction0(getChar16Array), getDateTime = js.Any.fromFunction0(getDateTime), getDateTimeArray = js.Any.fromFunction0(getDateTimeArray), getDouble = js.Any.fromFunction0(getDouble), getDoubleArray = js.Any.fromFunction0(getDoubleArray), getGuid = js.Any.fromFunction0(getGuid), getGuidArray = js.Any.fromFunction0(getGuidArray), getInspectableArray = js.Any.fromFunction0(getInspectableArray), getInt16 = js.Any.fromFunction0(getInt16), getInt16Array = js.Any.fromFunction0(getInt16Array), getInt32 = js.Any.fromFunction0(getInt32), getInt32Array = js.Any.fromFunction0(getInt32Array), getInt64 = js.Any.fromFunction0(getInt64), getInt64Array = js.Any.fromFunction0(getInt64Array), getPoint = js.Any.fromFunction0(getPoint), getPointArray = js.Any.fromFunction0(getPointArray), getRect = js.Any.fromFunction0(getRect), getRectArray = js.Any.fromFunction0(getRectArray), getSingle = js.Any.fromFunction0(getSingle), getSingleArray = js.Any.fromFunction0(getSingleArray), getSize = js.Any.fromFunction0(getSize), getSizeArray = js.Any.fromFunction0(getSizeArray), getString = js.Any.fromFunction0(getString), getStringArray = js.Any.fromFunction0(getStringArray), getTimeSpan = js.Any.fromFunction0(getTimeSpan), getTimeSpanArray = js.Any.fromFunction0(getTimeSpanArray), getUInt16 = js.Any.fromFunction0(getUInt16), getUInt16Array = js.Any.fromFunction0(getUInt16Array), getUInt32 = js.Any.fromFunction0(getUInt32), getUInt32Array = js.Any.fromFunction0(getUInt32Array), getUInt64 = js.Any.fromFunction0(getUInt64), getUInt64Array = js.Any.fromFunction0(getUInt64Array), getUInt8 = js.Any.fromFunction0(getUInt8), getUInt8Array = js.Any.fromFunction0(getUInt8Array), isNumericScalar = isNumericScalar.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReferenceArray[T]]
  }
}

