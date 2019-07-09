package typings
package threeLib.srcMathCylindricalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Cylindrical", "Cylindrical")
@js.native
class Cylindrical () extends js.Object {
  def this(radius: scala.Double) = this()
  def this(radius: scala.Double, theta: scala.Double) = this()
  def this(radius: scala.Double, theta: scala.Double, y: scala.Double) = this()
  var radius: scala.Double = js.native
  var theta: scala.Double = js.native
  var y: scala.Double = js.native
  def copy(other: Cylindrical): this.type = js.native
  def set(radius: scala.Double, theta: scala.Double, y: scala.Double): this.type = js.native
  def setFromCartesianCoords(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
  def setFromVector3(vec3: threeLib.srcMathVector3Mod.Vector3): this.type = js.native
}

