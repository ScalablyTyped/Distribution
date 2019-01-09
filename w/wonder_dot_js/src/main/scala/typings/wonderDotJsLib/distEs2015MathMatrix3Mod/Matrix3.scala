package typings
package wonderDotJsLib.distEs2015MathMatrix3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Matrix3", "Matrix3")
@js.native
class Matrix3 () extends js.Object {
  def this(mat: stdLib.Float32Array) = this()
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var tx: scala.Double = js.native
  var ty: scala.Double = js.native
  var values: stdLib.Float32Array = js.native
  def cloneToArray(array: stdLib.Float32Array): Matrix3 = js.native
  def cloneToArray(array: stdLib.Float32Array, offset: scala.Double): Matrix3 = js.native
  def getRotation(): scala.Double = js.native
  def getScale(): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  def getSkew(): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  def getTranslation(): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  def invert(): Matrix3 = js.native
  def multiply(matrix: Matrix3): this.type = js.native
  def multiplyPoint(vector: wonderDotJsLib.distEs2015MathVector2Mod.Vector2): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  def multiplyScalar(s: scala.Double): this.type = js.native
  def multiplyVector2(vector: wonderDotJsLib.distEs2015MathVector2Mod.Vector2): wonderDotJsLib.distEs2015MathVector2Mod.Vector2 = js.native
  def rotate(angle: scala.Double): this.type = js.native
  def scale(x: scala.Double, y: scala.Double): this.type = js.native
  def set(matrix: Matrix3): this.type = js.native
  def setIdentity(): Matrix3 = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setRotation(angle: scala.Double): this.type = js.native
  def setScale(x: scala.Double, y: scala.Double): this.type = js.native
  def setTS(
    t: wonderDotJsLib.distEs2015MathVector2Mod.Vector2,
    s: wonderDotJsLib.distEs2015MathVector2Mod.Vector2
  ): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def transpose(): Matrix3 = js.native
}

@JSImport("wonder.js/dist/es2015/math/Matrix3", "Matrix3")
@js.native
object Matrix3 extends js.Object {
  def create(): wonderDotJsLib.distEs2015MathMatrix3Mod.Matrix3 = js.native
  def create(mat: stdLib.Float32Array): wonderDotJsLib.distEs2015MathMatrix3Mod.Matrix3 = js.native
}

