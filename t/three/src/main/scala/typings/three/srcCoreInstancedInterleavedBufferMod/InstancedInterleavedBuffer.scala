package typings.three.srcCoreInstancedInterleavedBufferMod

import typings.std.ArrayLike
import typings.three.srcCoreInterleavedBufferMod.InterleavedBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InstancedInterleavedBuffer", "InstancedInterleavedBuffer")
@js.native
class InstancedInterleavedBuffer protected () extends InterleavedBuffer {
  def this(array: ArrayLike[Double], stride: Double) = this()
  def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: Double) = this()
  var meshPerAttribute: Double = js.native
}

