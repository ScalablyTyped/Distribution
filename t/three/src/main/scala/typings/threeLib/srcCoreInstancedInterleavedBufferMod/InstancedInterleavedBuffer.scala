package typings
package threeLib.srcCoreInstancedInterleavedBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/InstancedInterleavedBuffer", "InstancedInterleavedBuffer")
@js.native
class InstancedInterleavedBuffer protected ()
  extends threeLib.srcCoreInterleavedBufferMod.InterleavedBuffer {
  def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double) = this()
  def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double, meshPerAttribute: scala.Double) = this()
  var meshPerAttribute: scala.Double = js.native
}

