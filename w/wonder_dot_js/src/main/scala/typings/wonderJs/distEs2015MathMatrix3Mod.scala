package typings.wonderJs

import typings.wonderJs.distEs2015MathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015MathMatrix3Mod {
  
  @JSImport("wonder.js/dist/es2015/math/Matrix3", "Matrix3")
  @js.native
  open class Matrix3 () extends StObject {
    def this(mat: js.typedarray.Float32Array) = this()
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    def cloneToArray(array: js.typedarray.Float32Array): Matrix3 = js.native
    def cloneToArray(array: js.typedarray.Float32Array, offset: Double): Matrix3 = js.native
    
    var d: Double = js.native
    
    def getRotation(): Double = js.native
    
    def getScale(): Vector2 = js.native
    
    def getSkew(): Vector2 = js.native
    
    def getTranslation(): Vector2 = js.native
    
    def invert(): Matrix3 = js.native
    
    def multiply(matrix: Matrix3): this.type = js.native
    
    def multiplyPoint(vector: Vector2): Vector2 = js.native
    
    def multiplyScalar(s: Double): this.type = js.native
    
    def multiplyVector2(vector: Vector2): Vector2 = js.native
    
    def rotate(angle: Double): this.type = js.native
    
    def scale(x: Double, y: Double): this.type = js.native
    
    def set(matrix: Matrix3): this.type = js.native
    
    def setIdentity(): Matrix3 = js.native
    
    def setPosition(x: Double, y: Double): Unit = js.native
    
    def setRotation(angle: Double): this.type = js.native
    
    def setScale(x: Double, y: Double): this.type = js.native
    
    def setTS(t: Vector2, s: Vector2): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
    
    def transpose(): Matrix3 = js.native
    
    var tx: Double = js.native
    
    var ty: Double = js.native
    
    var values: js.typedarray.Float32Array = js.native
  }
  /* static members */
  object Matrix3 {
    
    @JSImport("wonder.js/dist/es2015/math/Matrix3", "Matrix3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Matrix3]
    inline def create(mat: js.typedarray.Float32Array): Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[Matrix3]
  }
}
