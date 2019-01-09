package typings
package wonderDotJsLib.distEs2015MathVector3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3")
@js.native
class Vector3 () extends js.Object {
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var values: stdLib.Float32Array = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def add(v: Vector3): this.type = js.native
  def add2(v1: Vector3, v2: Vector3): this.type = js.native
  def applyMatrix3(m: wonderDotJsLib.distEs2015MathMatrix3Mod.Matrix3): this.type = js.native
  def applyMatrix4(m: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4): this.type = js.native
  def calAngleCos(v1: Vector3): scala.Double = js.native
  def cross(lhs: Vector3, rhs: Vector3): this.type = js.native
  def distanceTo(v: Vector3): js.Any = js.native
  def distanceToSquared(v: Vector3): scala.Double = js.native
  def dot(rhs: js.Any): scala.Double = js.native
  def isEqual(v: Vector3): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def length(): js.Any = js.native
  def lerp(lhs: Vector3, rhs: Vector3, alpha: scala.Double): this.type = js.native
  def max(v: Vector3): this.type = js.native
  def min(v: Vector3): this.type = js.native
  def mul(v: Vector3): this.type = js.native
  def mul2(v1: Vector3, v2: Vector3): this.type = js.native
  def normalize(): Vector3 = js.native
  def reverse(): Vector3 = js.native
  def scale(scalar: scala.Double): js.Any = js.native
  def scale(x: scala.Double, y: scala.Double, z: scala.Double): js.Any = js.native
  def set(v: Vector3): js.Any = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): js.Any = js.native
  def sub(v: Vector3): Vector3 = js.native
  def sub2(v1: Vector3, v2: Vector3): this.type = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toVector4(): wonderDotJsLib.distEs2015MathVector4Mod.Vector4 = js.native
}

@JSImport("wonder.js/dist/es2015/math/Vector3", "Vector3")
@js.native
object Vector3 extends js.Object {
  var forward: js.Any = js.native
  var right: js.Any = js.native
  var up: js.Any = js.native
  def create(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def create(x: scala.Double, y: scala.Double, z: scala.Double): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
}

