package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "InstancedInterleavedBuffer")
@js.native
class InstancedInterleavedBuffer protected () extends InterleavedBuffer {
  def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double) = this()
  def this(array: stdLib.ArrayLike[scala.Double], stride: scala.Double, meshPerAttribute: scala.Double) = this()
  var meshPerAttribute: scala.Double = js.native
}

