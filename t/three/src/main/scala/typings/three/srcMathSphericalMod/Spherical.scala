package typings.three.srcMathSphericalMod

import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Spherical", "Spherical")
@js.native
class Spherical () extends js.Object {
  def this(radius: Double) = this()
  def this(radius: Double, phi: Double) = this()
  def this(radius: Double, phi: Double, theta: Double) = this()
  var phi: Double = js.native
  var radius: Double = js.native
  var theta: Double = js.native
  def copy(other: Spherical): this.type = js.native
  def makeSafe(): Unit = js.native
  def set(radius: Double, phi: Double, theta: Double): Spherical = js.native
  def setFromVector3(vec3: Vector3): Spherical = js.native
}

