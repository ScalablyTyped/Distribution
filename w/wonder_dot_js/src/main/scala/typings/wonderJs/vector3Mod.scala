package typings.wonderJs

import typings.std.Float32Array
import typings.wonderJs.matrix3Mod.Matrix3
import typings.wonderJs.matrix4Mod.Matrix4
import typings.wonderJs.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/math/Vector3", JSImport.Namespace)
@js.native
object vector3Mod extends js.Object {
  @js.native
  class Vector3 () extends js.Object {
    def this(x: Double, y: Double, z: Double) = this()
    var values: Float32Array = js.native
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    def add(v: Vector3): this.type = js.native
    def add2(v1: Vector3, v2: Vector3): this.type = js.native
    def applyMatrix3(m: Matrix3): this.type = js.native
    def applyMatrix4(m: Matrix4): this.type = js.native
    def calAngleCos(v1: Vector3): Double = js.native
    def cross(lhs: Vector3, rhs: Vector3): this.type = js.native
    def distanceTo(v: Vector3): js.Any = js.native
    def distanceToSquared(v: Vector3): Double = js.native
    def dot(rhs: js.Any): Double = js.native
    def isEqual(v: Vector3): Boolean = js.native
    def isZero(): Boolean = js.native
    def length(): js.Any = js.native
    def lerp(lhs: Vector3, rhs: Vector3, alpha: Double): this.type = js.native
    def max(v: Vector3): this.type = js.native
    def min(v: Vector3): this.type = js.native
    def mul(v: Vector3): this.type = js.native
    def mul2(v1: Vector3, v2: Vector3): this.type = js.native
    def normalize(): Vector3 = js.native
    def reverse(): Vector3 = js.native
    def scale(scalar: Double): js.Any = js.native
    def scale(x: Double, y: Double, z: Double): js.Any = js.native
    def set(v: Vector3): js.Any = js.native
    def set(x: Double, y: Double, z: Double): js.Any = js.native
    def sub(v: Vector3): Vector3 = js.native
    def sub2(v1: Vector3, v2: Vector3): this.type = js.native
    def toArray(): js.Array[Double] = js.native
    def toVector4(): Vector4 = js.native
  }
  
  /* static members */
  @js.native
  object Vector3 extends js.Object {
    var forward: js.Any = js.native
    var right: js.Any = js.native
    var up: js.Any = js.native
    def create(): Vector3 = js.native
    def create(x: Double, y: Double, z: Double): Vector3 = js.native
  }
  
}

