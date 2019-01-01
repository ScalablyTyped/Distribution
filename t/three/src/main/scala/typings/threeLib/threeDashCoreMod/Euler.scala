package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Euler")
@js.native
class Euler () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, order: java.lang.String) = this()
  var onChangeCallback: js.Function = js.native
  var order: java.lang.String = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def copy(euler: Euler): this.type = js.native
  def equals(euler: Euler): scala.Boolean = js.native
  def fromArray(xyzo: js.Array[_]): Euler = js.native
  def onChange(callback: js.Function): this.type = js.native
  def reorder(newOrder: java.lang.String): Euler = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Euler = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, order: java.lang.String): Euler = js.native
  def setFromQuaternion(q: Quaternion): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: java.lang.String): Euler = js.native
  def setFromQuaternion(q: Quaternion, order: java.lang.String, update: scala.Boolean): Euler = js.native
  def setFromRotationMatrix(m: Matrix4): Euler = js.native
  def setFromRotationMatrix(m: Matrix4, order: java.lang.String): Euler = js.native
  def setFromRotationMatrix(m: Matrix4, order: java.lang.String, update: scala.Boolean): Euler = js.native
  def setFromVector3(v: Vector3): Euler = js.native
  def setFromVector3(v: Vector3, order: java.lang.String): Euler = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toArray(array: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  def toVector3(): Vector3 = js.native
  def toVector3(optionalResult: Vector3): Vector3 = js.native
}

@JSImport("three/three-core", "Euler")
@js.native
object Euler extends js.Object {
  var DefaultOrder: java.lang.String = js.native
  var RotationOrders: js.Array[java.lang.String] = js.native
}

