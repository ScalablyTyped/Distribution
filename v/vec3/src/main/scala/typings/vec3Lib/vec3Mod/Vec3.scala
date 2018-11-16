package typings
package vec3Lib.vec3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vec3", "Vec3")
@js.native
class Vec3 protected () extends js.Object {
  def this(locationStr: java.lang.String) = this()
  def this(location: js.Array[scala.Double]) = this()
  def this(location: vec3Lib.Anon_Z) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def abs(): Vec3 = js.native
  def add(other: Vec3): Vec3 = js.native
  def distanceTo(other: Vec3): scala.Double = js.native
  def equals(other: Vec3): scala.Boolean = js.native
  def floor(): Vec3 = js.native
  def floored(): Vec3 = js.native
  def max(other: Vec3): Vec3 = js.native
  def min(other: Vec3): Vec3 = js.native
  def minus(other: Vec3): Vec3 = js.native
  def modulus(): Vec3 = js.native
  def offset(dx: scala.Double, dy: scala.Double, dz: scala.Double): Vec3 = js.native
  def plus(other: Vec3): Vec3 = js.native
  def scaled(scalar: scala.Double): Vec3 = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Vec3 = js.native
  def substract(other: Vec3): Vec3 = js.native
  def translate(dx: scala.Double, dy: scala.Double, dz: scala.Double): Vec3 = js.native
  def update(other: Vec3): Vec3 = js.native
  def volume(): scala.Double = js.native
}

