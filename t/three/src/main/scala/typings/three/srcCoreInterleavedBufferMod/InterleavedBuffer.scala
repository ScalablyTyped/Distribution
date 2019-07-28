package typings.three.srcCoreInterleavedBufferMod

import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.three.Anon_Count
import typings.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InterleavedBuffer", "InterleavedBuffer")
@js.native
class InterleavedBuffer protected () extends js.Object {
  def this(array: ArrayLike[Double], stride: Double) = this()
  var array: ArrayLike[Double] = js.native
  var count: Double = js.native
  var dynamic: Boolean = js.native
  var length: Double = js.native
  var needsUpdate: Boolean = js.native
  var stride: Double = js.native
  var updateRange: Anon_Count = js.native
  var version: Double = js.native
  def copy(source: InterleavedBuffer): this.type = js.native
  def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer = js.native
  def set(value: ArrayLike[Double], index: Double): InterleavedBuffer = js.native
  def setArray(): Unit = js.native
  def setArray(array: ArrayBufferView): Unit = js.native
  def setDynamic(dynamic: Boolean): InterleavedBuffer = js.native
}

