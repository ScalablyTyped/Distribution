package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Ray")
@js.native
class Ray () extends js.Object {
  def this(origin: Vector3) = this()
  def this(origin: Vector3, direction: Vector3) = this()
  var direction: Vector3 = js.native
  var origin: Vector3 = js.native
  def applyMatrix4(matrix4: Matrix4): Ray = js.native
  def at(t: scala.Double, target: Vector3): Vector3 = js.native
  def closestPointToPoint(point: Vector3, target: Vector3): Vector3 = js.native
  def copy(ray: this.type): this.type = js.native
  def distanceSqToPoint(point: Vector3): scala.Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3): scala.Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3): scala.Double = js.native
  def distanceSqToSegment(v0: Vector3, v1: Vector3, optionalPointOnRay: Vector3, optionalPointOnSegment: Vector3): scala.Double = js.native
  def distanceToPlane(plane: Plane): scala.Double = js.native
  def distanceToPoint(point: Vector3): scala.Double = js.native
  def equals(ray: Ray): scala.Boolean = js.native
  def intersectBox(box: Box3, target: Vector3): Vector3 = js.native
  def intersectPlane(plane: Plane, target: Vector3): Vector3 = js.native
  def intersectSphere(sphere: Sphere, target: Vector3): Vector3 = js.native
  def intersectTriangle(a: Vector3, b: Vector3, c: Vector3, backfaceCulling: scala.Boolean, target: Vector3): Vector3 = js.native
  def intersectsBox(box: Box3): scala.Boolean = js.native
  def intersectsPlane(plane: Plane): scala.Boolean = js.native
  def intersectsSphere(sphere: Sphere): scala.Boolean = js.native
  /**
    * @deprecated Use {@link Ray#intersectsBox .intersectsBox()} instead.
    */
  def isIntersectionBox(b: js.Any): js.Any = js.native
  /**
    * @deprecated Use {@link Ray#intersectsPlane .intersectsPlane()} instead.
    */
  def isIntersectionPlane(p: js.Any): js.Any = js.native
  /**
    * @deprecated Use {@link Ray#intersectsSphere .intersectsSphere()} instead.
    */
  def isIntersectionSphere(s: js.Any): js.Any = js.native
  def lookAt(v: Vector3): Vector3 = js.native
  def recast(t: scala.Double): Ray = js.native
  def set(origin: Vector3, direction: Vector3): Ray = js.native
}

