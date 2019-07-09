package typings
package threeLib.srcMathRayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Ray", "Ray")
@js.native
class Ray () extends js.Object {
  def this(origin: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(origin: threeLib.srcMathVector3Mod.Vector3, direction: threeLib.srcMathVector3Mod.Vector3) = this()
  var direction: threeLib.srcMathVector3Mod.Vector3 = js.native
  var origin: threeLib.srcMathVector3Mod.Vector3 = js.native
  def applyMatrix4(matrix4: threeLib.srcMathMatrix4Mod.Matrix4): Ray = js.native
  def at(t: scala.Double, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def closestPointToPoint(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def copy(ray: Ray): this.type = js.native
  def distanceSqToPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  def distanceSqToSegment(v0: threeLib.srcMathVector3Mod.Vector3, v1: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  def distanceSqToSegment(
    v0: threeLib.srcMathVector3Mod.Vector3,
    v1: threeLib.srcMathVector3Mod.Vector3,
    optionalPointOnRay: threeLib.srcMathVector3Mod.Vector3
  ): scala.Double = js.native
  def distanceSqToSegment(
    v0: threeLib.srcMathVector3Mod.Vector3,
    v1: threeLib.srcMathVector3Mod.Vector3,
    optionalPointOnRay: threeLib.srcMathVector3Mod.Vector3,
    optionalPointOnSegment: threeLib.srcMathVector3Mod.Vector3
  ): scala.Double = js.native
  def distanceToPlane(plane: threeLib.srcMathPlaneMod.Plane): scala.Double = js.native
  def distanceToPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  def equals(ray: Ray): scala.Boolean = js.native
  def intersectBox(box: threeLib.srcMathBox3Mod.Box3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def intersectPlane(plane: threeLib.srcMathPlaneMod.Plane, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def intersectSphere(sphere: threeLib.srcMathSphereMod.Sphere, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def intersectTriangle(
    a: threeLib.srcMathVector3Mod.Vector3,
    b: threeLib.srcMathVector3Mod.Vector3,
    c: threeLib.srcMathVector3Mod.Vector3,
    backfaceCulling: scala.Boolean,
    target: threeLib.srcMathVector3Mod.Vector3
  ): threeLib.srcMathVector3Mod.Vector3 = js.native
  def intersectsBox(box: threeLib.srcMathBox3Mod.Box3): scala.Boolean = js.native
  def intersectsPlane(plane: threeLib.srcMathPlaneMod.Plane): scala.Boolean = js.native
  def intersectsSphere(sphere: threeLib.srcMathSphereMod.Sphere): scala.Boolean = js.native
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
  def lookAt(v: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def recast(t: scala.Double): Ray = js.native
  def set(origin: threeLib.srcMathVector3Mod.Vector3, direction: threeLib.srcMathVector3Mod.Vector3): Ray = js.native
}

