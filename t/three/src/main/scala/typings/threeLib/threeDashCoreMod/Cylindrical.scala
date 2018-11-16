package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Cylindrical")
@js.native
class Cylindrical () extends js.Object {
  def this(radius: scala.Double) = this()
  def this(radius: scala.Double, theta: scala.Double) = this()
  def this(radius: scala.Double, theta: scala.Double, y: scala.Double) = this()
  var radius: scala.Double = js.native
  var theta: scala.Double = js.native
  var y: scala.Double = js.native
  def copy(other: this.type): this.type = js.native
  def set(radius: scala.Double, theta: scala.Double, y: scala.Double): this.type = js.native
  def setFromVector3(vec3: Vector3): this.type = js.native
}

