package typings
package wonderDotJsLib.distEs2015MathMatrix4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Matrix4", "Matrix4")
@js.native
class Matrix4 () extends js.Object {
  def this(mat: stdLib.Float32Array) = this()
  var values: stdLib.Float32Array = js.native
  def applyMatrix(other: Matrix4): Matrix4 = js.native
  def applyMatrix(other: Matrix4, notChangeSelf: scala.Boolean): Matrix4 = js.native
  def cloneToArray(array: stdLib.Float32Array): Matrix4 = js.native
  def cloneToArray(array: stdLib.Float32Array, offset: scala.Double): Matrix4 = js.native
  def getEulerAngles(): js.Any = js.native
  def getRotation(): wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion = js.native
  def getScale(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def getTranslation(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def getX(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def getY(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def getZ(): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def invert(): Matrix4 = js.native
  def invertTo3x3(): wonderDotJsLib.distEs2015MathMatrix3Mod.Matrix3 = js.native
  def lookAt(
    eyeX: scala.Double,
    eyeY: scala.Double,
    eyeZ: scala.Double,
    centerX: scala.Double,
    centerY: scala.Double,
    centerZ: scala.Double,
    upX: scala.Double,
    upY: scala.Double,
    upZ: scala.Double
  ): Matrix4 = js.native
  def lookAt(
    eye: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    center: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    up: wonderDotJsLib.distEs2015MathVector3Mod.Vector3
  ): Matrix4 = js.native
  def multiply(matrix1: Matrix4, matrix2: Matrix4): Matrix4 = js.native
  def multiply(matrix: Matrix4): Matrix4 = js.native
  def multiplyPoint(vector: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def multiplyVector3(vector: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): wonderDotJsLib.distEs2015MathVector3Mod.Vector3 = js.native
  def multiplyVector4(vector: wonderDotJsLib.distEs2015MathVector4Mod.Vector4): wonderDotJsLib.distEs2015MathVector4Mod.Vector4 = js.native
  def ortho(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): Matrix4 = js.native
  def perspective(fovy: scala.Double, aspect: scala.Double, near: scala.Double, far: scala.Double): Matrix4 = js.native
  def pop(): scala.Unit = js.native
  def push(): scala.Unit = js.native
  def rotate(angle: js.Any, vector3: wonderDotJsLib.distEs2015MathVector3Mod.Vector3): Matrix4 = js.native
  def rotate(angle: js.Any, x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def scale(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def set(
    initialM11: scala.Double,
    initialM12: scala.Double,
    initialM13: scala.Double,
    initialM14: scala.Double,
    initialM21: scala.Double,
    initialM22: scala.Double,
    initialM23: scala.Double,
    initialM24: scala.Double,
    initialM31: scala.Double,
    initialM32: scala.Double,
    initialM33: scala.Double,
    initialM34: scala.Double,
    initialM41: scala.Double,
    initialM42: scala.Double,
    initialM43: scala.Double,
    initialM44: scala.Double
  ): js.Any = js.native
  def set(matrix: Matrix4): js.Any = js.native
  def setIdentity(): Matrix4 = js.native
  def setLookAt(
    eyeX: scala.Double,
    eyeY: scala.Double,
    eyeZ: scala.Double,
    centerX: scala.Double,
    centerY: scala.Double,
    centerZ: scala.Double,
    upX: scala.Double,
    upY: scala.Double,
    upZ: scala.Double
  ): Matrix4 = js.native
  def setLookAt(
    eye: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    center: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    up: wonderDotJsLib.distEs2015MathVector3Mod.Vector3
  ): Matrix4 = js.native
  def setOrtho(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): Matrix4 = js.native
  def setPerspective(fovy: scala.Double, aspect: scala.Double, near: scala.Double, far: scala.Double): Matrix4 = js.native
  def setRotate(angle: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): Matrix4 = js.native
  def setScale(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def setTRS(
    t: wonderDotJsLib.distEs2015MathVector3Mod.Vector3,
    r: wonderDotJsLib.distEs2015MathQuaternionMod.Quaternion,
    s: wonderDotJsLib.distEs2015MathVector3Mod.Vector3
  ): this.type = js.native
  def setTranslate(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def translate(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def transpose(): Matrix4 = js.native
}

@JSImport("wonder.js/dist/es2015/math/Matrix4", "Matrix4")
@js.native
object Matrix4 extends js.Object {
  def create(): wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  def create(mat: stdLib.Float32Array): wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
}

