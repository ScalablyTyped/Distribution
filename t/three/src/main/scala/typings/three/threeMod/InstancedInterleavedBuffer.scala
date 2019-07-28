package typings.three.threeMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "InstancedInterleavedBuffer")
@js.native
class InstancedInterleavedBuffer protected ()
  extends typings.three.srcCoreInstancedInterleavedBufferMod.InstancedInterleavedBuffer {
  def this(array: ArrayLike[Double], stride: Double) = this()
  def this(array: ArrayLike[Double], stride: Double, meshPerAttribute: Double) = this()
}

