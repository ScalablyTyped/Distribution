package typings
package typedarrayDashPoolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedarray-pool", JSImport.Namespace)
@js.native
object typedarrayDashPoolMod extends js.Object {
  def clearCache(): scala.Unit = js.native
  def free(array: js.Any): scala.Unit = js.native
  def freeArrayBuffer(buffer: stdLib.ArrayBuffer): scala.Unit = js.native
  def freeBuffer(buffer: js.Any): scala.Unit = js.native
  def freeDataView(view: stdLib.DataView): scala.Unit = js.native
  def freeDouble(array: stdLib.Float64Array): scala.Unit = js.native
  def freeFloat(array: stdLib.Float32Array): scala.Unit = js.native
  def freeInt16(array: stdLib.Int16Array): scala.Unit = js.native
  def freeInt32(array: stdLib.Int32Array): scala.Unit = js.native
  def freeInt8(array: stdLib.Int8Array): scala.Unit = js.native
  def freeUint16(array: stdLib.Uint16Array): scala.Unit = js.native
  def freeUint32(array: stdLib.Uint32Array): scala.Unit = js.native
  def freeUint8(array: stdLib.Uint8Array): scala.Unit = js.native
  def freeUint8Clamped(array: stdLib.Uint8ClampedArray): scala.Unit = js.native
  def malloc(n: scala.Double): js.Any = js.native
  def malloc(n: scala.Double, dtype: typedarrayDashPoolLib.DataType): js.Any = js.native
  def mallocArrayBuffer(n: scala.Double): stdLib.ArrayBuffer = js.native
  def mallocBuffer(n: scala.Double): js.Any = js.native
  def mallocDataView(n: scala.Double): stdLib.DataView = js.native
  def mallocDouble(n: scala.Double): stdLib.Float64Array = js.native
  def mallocFloat(n: scala.Double): stdLib.Float32Array = js.native
  def mallocInt16(n: scala.Double): stdLib.Int16Array = js.native
  def mallocInt32(n: scala.Double): stdLib.Int32Array = js.native
  def mallocInt8(n: scala.Double): stdLib.Int8Array = js.native
  def mallocUint16(n: scala.Double): stdLib.Uint16Array = js.native
  def mallocUint32(n: scala.Double): stdLib.Uint32Array = js.native
  def mallocUint8(n: scala.Double): stdLib.Uint8Array = js.native
  def mallocUint8Clamped(n: scala.Double): stdLib.Uint8ClampedArray = js.native
}

