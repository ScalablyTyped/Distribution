package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Plane")
@js.native
class Plane () extends js.Object {
  def this(normal: Vector3) = this()
  def this(normal: Vector3, constant: scala.Double) = this()
  var constant: scala.Double = js.native
  var normal: Vector3 = js.native
  def applyMatrix4(matrix: Matrix4): Plane = js.native
  def applyMatrix4(matrix: Matrix4, optionalNormalMatrix: Matrix3): Plane = js.native
  def coplanarPoint(target: Vector3): Vector3 = js.native
  def copy(plane: Plane): this.type = js.native
  def distanceToPoint(point: Vector3): scala.Double = js.native
  def distanceToSphere(sphere: Sphere): scala.Double = js.native
  def equals(plane: Plane): scala.Boolean = js.native
  def intersectLine(line: Line3, target: Vector3): Vector3 = js.native
  def intersectsBox(box: Box3): scala.Boolean = js.native
  def intersectsLine(line: Line3): scala.Boolean = js.native
  /**
    * @deprecated Use {@link Plane#intersectsLine .intersectsLine()} instead.
    */
  def isIntersectionLine(l: js.Any): js.Any = js.native
  def negate(): Plane = js.native
  def normalize(): Plane = js.native
  def orthoPoint(point: Vector3, target: Vector3): Vector3 = js.native
  def projectPoint(point: Vector3, target: Vector3): Vector3 = js.native
  def set(normal: Vector3, constant: scala.Double): Plane = js.native
  def setComponents(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Plane = js.native
  def setFromCoplanarPoints(a: Vector3, b: Vector3, c: Vector3): Plane = js.native
  def setFromNormalAndCoplanarPoint(normal: Vector3, point: Vector3): Plane = js.native
  def translate(offset: Vector3): Plane = js.native
}

