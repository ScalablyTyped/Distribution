package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Spherical")
@js.native
class Spherical () extends js.Object {
  def this(radius: scala.Double) = this()
  def this(radius: scala.Double, phi: scala.Double) = this()
  def this(radius: scala.Double, phi: scala.Double, theta: scala.Double) = this()
  var phi: scala.Double = js.native
  var radius: scala.Double = js.native
  var theta: scala.Double = js.native
  def copy(other: this.type): this.type = js.native
  def makeSafe(): scala.Unit = js.native
  def set(radius: scala.Double, phi: scala.Double, theta: scala.Double): Spherical = js.native
  def setFromVector3(vec3: Vector3): Spherical = js.native
}

