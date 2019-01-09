package typings
package wonderDotJsLib.distEs2015MathQuaternionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Quaternion", "Quaternion")
@js.native
class Quaternion () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  var w: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def conjugate(): this.type = js.native
  def getEulerAngles(): js.Any = js.native
  def invert(): this.type = js.native
  def length(): js.Any = js.native
  def multiply(rhs1: Quaternion, rhs2: Quaternion): js.Any = js.native
  def multiply(rhs: Quaternion): js.Any = js.native
  def multiplyVector3(vector: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def normalize(): this.type = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Unit = js.native
  def setFromAxisAngle(angle: scala.Double, axis: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): this.type = js.native
  def setFromEulerAngles(eulerAngles: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): this.type = js.native
  def setFromMatrix(matrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4): this.type = js.native
  def slerp(left: Quaternion, right: Quaternion, amount: scala.Double): Quaternion = js.native
  def sub(quat: Quaternion): this.type = js.native
}

@JSImport("wonder.js/dist/es2015/math/Quaternion", "Quaternion")
@js.native
object Quaternion extends js.Object {
  def create(): wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  def create(x: scala.Double): wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  def create(x: scala.Double, y: scala.Double): wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  def create(x: scala.Double, y: scala.Double, z: scala.Double): wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  def create(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
}

