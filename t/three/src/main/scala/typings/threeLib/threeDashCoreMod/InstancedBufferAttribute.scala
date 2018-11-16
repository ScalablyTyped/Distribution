package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "InstancedBufferAttribute")
@js.native
class InstancedBufferAttribute protected () extends BufferAttribute {
  def this(data: stdLib.ArrayLike[scala.Double], itemSize: scala.Double) = this()
  def this(data: stdLib.ArrayLike[scala.Double], itemSize: scala.Double, meshPerAttribute: scala.Double) = this()
  var meshPerAttribute: scala.Double = js.native
}

