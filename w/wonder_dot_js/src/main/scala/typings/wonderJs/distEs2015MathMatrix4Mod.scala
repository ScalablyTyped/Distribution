package typings.wonderJs

import typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3
import typings.wonderJs.distEs2015MathQuaternionMod.Quaternion
import typings.wonderJs.distEs2015MathVector3Mod.Vector3
import typings.wonderJs.distEs2015MathVector4Mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015MathMatrix4Mod {
  
  @JSImport("wonder.js/dist/es2015/math/Matrix4", "Matrix4")
  @js.native
  open class Matrix4 () extends StObject {
    def this(mat: js.typedarray.Float32Array) = this()
    
    def applyMatrix(other: Matrix4): Matrix4 = js.native
    def applyMatrix(other: Matrix4, notChangeSelf: Boolean): Matrix4 = js.native
    
    def cloneToArray(array: js.typedarray.Float32Array): Matrix4 = js.native
    def cloneToArray(array: js.typedarray.Float32Array, offset: Double): Matrix4 = js.native
    
    def getEulerAngles(): Any = js.native
    
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
    
    def rotate(angle: Any, vector3: Vector3): Matrix4 = js.native
    def rotate(angle: Any, x: Any, y: Any, z: Any): Matrix4 = js.native
    
    def scale(x: Any, y: Any, z: Any): Matrix4 = js.native
    
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
    ): Any = js.native
    def set(matrix: Matrix4): Any = js.native
    
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
    
    def setScale(x: Any, y: Any, z: Any): Matrix4 = js.native
    
    def setTRS(t: Vector3, r: Quaternion, s: Vector3): this.type = js.native
    
    def setTranslate(x: Any, y: Any, z: Any): Matrix4 = js.native
    
    def translate(x: Any, y: Any, z: Any): Matrix4 = js.native
    
    def transpose(): Matrix4 = js.native
    
    var values: js.typedarray.Float32Array = js.native
  }
  /* static members */
  object Matrix4 {
    
    @JSImport("wonder.js/dist/es2015/math/Matrix4", "Matrix4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Matrix4]
    inline def create(mat: js.typedarray.Float32Array): Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[Matrix4]
  }
}
