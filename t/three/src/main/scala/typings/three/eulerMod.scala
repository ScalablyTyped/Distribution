package typings.three

import typings.three.matrix4Mod.Matrix4
import typings.three.quaternionMod.Quaternion
import typings.three.threeBooleans.`true`
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Euler", JSImport.Namespace)
@js.native
object eulerMod extends js.Object {
  @js.native
  class Euler () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, order: String) = this()
    var _onChangeCallback: js.Function = js.native
    val isEuler: `true` = js.native
    var order: String = js.native
    var x: Double = js.native
    var y: Double = js.native
    var z: Double = js.native
    def _onChange(callback: js.Function): this.type = js.native
    def copy(euler: Euler): this.type = js.native
    def equals(euler: Euler): Boolean = js.native
    def fromArray(xyzo: js.Array[_]): Euler = js.native
    def reorder(newOrder: String): Euler = js.native
    def set(x: Double, y: Double, z: Double): Euler = js.native
    def set(x: Double, y: Double, z: Double, order: String): Euler = js.native
    def setFromQuaternion(q: Quaternion): Euler = js.native
    def setFromQuaternion(q: Quaternion, order: String): Euler = js.native
    def setFromRotationMatrix(m: Matrix4): Euler = js.native
    def setFromRotationMatrix(m: Matrix4, order: String): Euler = js.native
    def setFromVector3(v: Vector3): Euler = js.native
    def setFromVector3(v: Vector3, order: String): Euler = js.native
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def toVector3(): Vector3 = js.native
    def toVector3(optionalResult: Vector3): Vector3 = js.native
  }
  
  /* static members */
  @js.native
  object Euler extends js.Object {
    var DefaultOrder: String = js.native
    var RotationOrders: js.Array[String] = js.native
  }
  
}

