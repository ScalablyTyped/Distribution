package typings.wonderDotJs.distEs2015MathMatrix4Mod

import typings.std.Float32Array
import typings.wonderDotJs.distEs2015MathMatrix3Mod.Matrix3
import typings.wonderDotJs.distEs2015MathQuaternionMod.Quaternion
import typings.wonderDotJs.distEs2015MathVector3Mod.Vector3
import typings.wonderDotJs.distEs2015MathVector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Matrix4", "Matrix4")
@js.native
class Matrix4 () extends js.Object {
  def this(mat: Float32Array) = this()
  var values: Float32Array = js.native
  def applyMatrix(other: Matrix4): Matrix4 = js.native
  def applyMatrix(other: Matrix4, notChangeSelf: Boolean): Matrix4 = js.native
  def cloneToArray(array: Float32Array): Matrix4 = js.native
  def cloneToArray(array: Float32Array, offset: Double): Matrix4 = js.native
  def getEulerAngles(): js.Any = js.native
  def getRotation(): Quaternion = js.native
  def getScale(): Vector3 = js.native
  def getTranslation(): Vector3 = js.native
  def getX(): Vector3 = js.native
  def getY(): Vector3 = js.native
  def getZ(): Vector3 = js.native
  def invert(): Matrix4 = js.native
  def invertTo3x3(): Matrix3 = js.native
  def lookAt(
    eyeX: Double,
    eyeY: Double,
    eyeZ: Double,
    centerX: Double,
    centerY: Double,
    centerZ: Double,
    upX: Double,
    upY: Double,
    upZ: Double
  ): Matrix4 = js.native
  def lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 = js.native
  def multiply(matrix1: Matrix4, matrix2: Matrix4): Matrix4 = js.native
  def multiply(matrix: Matrix4): Matrix4 = js.native
  def multiplyPoint(vector: Vector3): Vector3 = js.native
  def multiplyVector3(vector: Vector3): Vector3 = js.native
  def multiplyVector4(vector: Vector4): Vector4 = js.native
  def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  def perspective(fovy: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
  def pop(): Unit = js.native
  def push(): Unit = js.native
  def rotate(angle: js.Any, vector3: Vector3): Matrix4 = js.native
  def rotate(angle: js.Any, x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def scale(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def set(
    initialM11: Double,
    initialM12: Double,
    initialM13: Double,
    initialM14: Double,
    initialM21: Double,
    initialM22: Double,
    initialM23: Double,
    initialM24: Double,
    initialM31: Double,
    initialM32: Double,
    initialM33: Double,
    initialM34: Double,
    initialM41: Double,
    initialM42: Double,
    initialM43: Double,
    initialM44: Double
  ): js.Any = js.native
  def set(matrix: Matrix4): js.Any = js.native
  def setIdentity(): Matrix4 = js.native
  def setLookAt(
    eyeX: Double,
    eyeY: Double,
    eyeZ: Double,
    centerX: Double,
    centerY: Double,
    centerZ: Double,
    upX: Double,
    upY: Double,
    upZ: Double
  ): Matrix4 = js.native
  def setLookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 = js.native
  def setOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  def setPerspective(fovy: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
  def setRotate(angle: Double, x: Double, y: Double, z: Double): Matrix4 = js.native
  def setScale(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def setTRS(t: Vector3, r: Quaternion, s: Vector3): this.type = js.native
  def setTranslate(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def translate(x: js.Any, y: js.Any, z: js.Any): Matrix4 = js.native
  def transpose(): Matrix4 = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/math/Matrix4", "Matrix4")
@js.native
object Matrix4 extends js.Object {
  def create(): Matrix4 = js.native
  def create(mat: Float32Array): Matrix4 = js.native
}

