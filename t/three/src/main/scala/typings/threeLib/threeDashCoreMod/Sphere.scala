package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Sphere")
@js.native
class Sphere () extends js.Object {
  def this(center: Vector3) = this()
  def this(center: Vector3, radius: scala.Double) = this()
  var center: Vector3 = js.native
  var radius: scala.Double = js.native
  def applyMatrix4(matrix: Matrix4): Sphere = js.native
  def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
  def containsPoint(point: Vector3): scala.Boolean = js.native
  def copy(sphere: Sphere): this.type = js.native
  def distanceToPoint(point: Vector3): scala.Double = js.native
  def empty(): scala.Boolean = js.native
  def equals(sphere: Sphere): scala.Boolean = js.native
  def getBoundingBox(target: Box3): Box3 = js.native
  def intersectsBox(box: Box3): scala.Boolean = js.native
  def intersectsPlane(plane: Plane): scala.Boolean = js.native
  def intersectsSphere(sphere: Sphere): scala.Boolean = js.native
  def set(center: Vector3, radius: scala.Double): Sphere = js.native
  def setFromPoints(points: js.Array[Vector3]): Sphere = js.native
  def setFromPoints(points: js.Array[Vector3], optionalCenter: Vector3): Sphere = js.native
  def translate(offset: Vector3): Sphere = js.native
}

