package typings
package threeLib.srcMathSphericalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Spherical", "Spherical")
@js.native
class Spherical () extends js.Object {
  def this(radius: scala.Double) = this()
  def this(radius: scala.Double, phi: scala.Double) = this()
  def this(radius: scala.Double, phi: scala.Double, theta: scala.Double) = this()
  var phi: scala.Double = js.native
  var radius: scala.Double = js.native
  var theta: scala.Double = js.native
  def copy(other: Spherical): this.type = js.native
  def makeSafe(): scala.Unit = js.native
  def set(radius: scala.Double, phi: scala.Double, theta: scala.Double): Spherical = js.native
  def setFromVector3(vec3: threeLib.srcMathVector3Mod.Vector3): Spherical = js.native
}

