package typings.wonderDotJs.distEs2015MathQuaternionMod

import typings.wonderDotJs.distEs2015MathMatrix4Mod.Matrix4
import typings.wonderDotJs.distEs2015MathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Quaternion", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var w: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  def conjugate(): this.type = js.native
  def getEulerAngles(): js.Any = js.native
  def invert(): this.type = js.native
  def length(): js.Any = js.native
  def multiply(rhs1: Quaternion, rhs2: Quaternion): js.Any = js.native
  def multiply(rhs: Quaternion): js.Any = js.native
  def multiplyVector3(vector: Vector3): Vector3 = js.native
  def normalize(): this.type = js.native
  def set(x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setFromAxisAngle(angle: Double, axis: Vector3): this.type = js.native
  def setFromEulerAngles(eulerAngles: Vector3): this.type = js.native
  def setFromMatrix(matrix: Matrix4): this.type = js.native
  def slerp(left: Quaternion, right: Quaternion, amount: Double): Quaternion = js.native
  def sub(quat: Quaternion): this.type = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/math/Quaternion", "Quaternion")
@js.native
object Quaternion extends js.Object {
  def create(): Quaternion = js.native
  def create(x: Double): Quaternion = js.native
  def create(x: Double, y: Double): Quaternion = js.native
  def create(x: Double, y: Double, z: Double): Quaternion = js.native
  def create(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
}

