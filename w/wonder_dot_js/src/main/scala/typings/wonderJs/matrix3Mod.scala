package typings.wonderJs

import typings.std.Float32Array
import typings.wonderJs.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Matrix3", JSImport.Namespace)
@js.native
object matrix3Mod extends js.Object {
  @js.native
  class Matrix3 () extends js.Object {
    def this(mat: Float32Array) = this()
    var a: Double = js.native
    var b: Double = js.native
    var c: Double = js.native
    var d: Double = js.native
    var tx: Double = js.native
    var ty: Double = js.native
    var values: Float32Array = js.native
    def cloneToArray(array: Float32Array): Matrix3 = js.native
    def cloneToArray(array: Float32Array, offset: Double): Matrix3 = js.native
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
  }
  
  /* static members */
  @js.native
  object Matrix3 extends js.Object {
    def create(): Matrix3 = js.native
    def create(mat: Float32Array): Matrix3 = js.native
  }
  
}

