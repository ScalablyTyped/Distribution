package typings.typedarrayDashPool.typedarrayDashPoolMod

import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedarray-pool", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearCache(): Unit = js.native
  def free(array: js.Any): Unit = js.native
  def freeArrayBuffer(buffer: ArrayBuffer): Unit = js.native
  def freeBuffer(buffer: js.Any): Unit = js.native
  def freeDataView(view: DataView): Unit = js.native
  def freeDouble(array: Float64Array): Unit = js.native
  def freeFloat(array: Float32Array): Unit = js.native
  def freeInt16(array: Int16Array): Unit = js.native
  def freeInt32(array: Int32Array): Unit = js.native
  def freeInt8(array: Int8Array): Unit = js.native
  def freeUint16(array: Uint16Array): Unit = js.native
  def freeUint32(array: Uint32Array): Unit = js.native
  def freeUint8(array: Uint8Array): Unit = js.native
  def freeUint8Clamped(array: Uint8ClampedArray): Unit = js.native
  def malloc(n: Double): js.Any = js.native
  def malloc(n: Double, dtype: DataType): js.Any = js.native
  def mallocArrayBuffer(n: Double): ArrayBuffer = js.native
  def mallocBuffer(n: Double): js.Any = js.native
  def mallocDataView(n: Double): DataView = js.native
  def mallocDouble(n: Double): Float64Array = js.native
  def mallocFloat(n: Double): Float32Array = js.native
  def mallocInt16(n: Double): Int16Array = js.native
  def mallocInt32(n: Double): Int32Array = js.native
  def mallocInt8(n: Double): Int8Array = js.native
  def mallocUint16(n: Double): Uint16Array = js.native
  def mallocUint32(n: Double): Uint32Array = js.native
  def mallocUint8(n: Double): Uint8Array = js.native
  def mallocUint8Clamped(n: Double): Uint8ClampedArray = js.native
}

