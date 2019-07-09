package typings
package threeLib.srcMathBox3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Box3", "Box3")
@js.native
class Box3 () extends js.Object {
  def this(min: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(min: threeLib.srcMathVector3Mod.Vector3, max: threeLib.srcMathVector3Mod.Vector3) = this()
  var max: threeLib.srcMathVector3Mod.Vector3 = js.native
  var min: threeLib.srcMathVector3Mod.Vector3 = js.native
  def applyMatrix4(matrix: threeLib.srcMathMatrix4Mod.Matrix4): this.type = js.native
  def clampPoint(point: threeLib.srcMathVector3Mod.Vector3, target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def containsBox(box: Box3): scala.Boolean = js.native
  def containsPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Boolean = js.native
  def copy(box: Box3): this.type = js.native
  def distanceToPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Double = js.native
  /**
  	 * @deprecated Use {@link Box3#isEmpty .isEmpty()} instead.
  	 */
  def empty(): js.Any = js.native
  def equals(box: Box3): scala.Boolean = js.native
  def expandByObject(`object`: threeLib.srcCoreObject3DMod.Object3D): this.type = js.native
  def expandByPoint(point: threeLib.srcMathVector3Mod.Vector3): this.type = js.native
  def expandByScalar(scalar: scala.Double): this.type = js.native
  def expandByVector(vector: threeLib.srcMathVector3Mod.Vector3): this.type = js.native
  def getBoundingSphere(target: threeLib.srcMathSphereMod.Sphere): threeLib.srcMathSphereMod.Sphere = js.native
  def getCenter(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getParameter(point: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def getSize(target: threeLib.srcMathVector3Mod.Vector3): threeLib.srcMathVector3Mod.Vector3 = js.native
  def intersect(box: Box3): this.type = js.native
  def intersectsBox(box: Box3): scala.Boolean = js.native
  def intersectsPlane(plane: threeLib.srcMathPlaneMod.Plane): scala.Boolean = js.native
  def intersectsSphere(sphere: threeLib.srcMathSphereMod.Sphere): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  /**
  	 * @deprecated Use {@link Box3#intersectsBox .intersectsBox()} instead.
  	 */
  def isIntersectionBox(b: js.Any): js.Any = js.native
  /**
  	 * @deprecated Use {@link Box3#intersectsSphere .intersectsSphere()} instead.
  	 */
  def isIntersectionSphere(s: js.Any): js.Any = js.native
  def makeEmpty(): this.type = js.native
  def set(min: threeLib.srcMathVector3Mod.Vector3, max: threeLib.srcMathVector3Mod.Vector3): this.type = js.native
  def setFromArray(array: stdLib.ArrayLike[scala.Double]): this.type = js.native
  def setFromCenterAndSize(center: threeLib.srcMathVector3Mod.Vector3, size: threeLib.srcMathVector3Mod.Vector3): this.type = js.native
  def setFromObject(`object`: threeLib.srcCoreObject3DMod.Object3D): this.type = js.native
  def setFromPoints(points: js.Array[threeLib.srcMathVector3Mod.Vector3]): this.type = js.native
  def translate(offset: threeLib.srcMathVector3Mod.Vector3): this.type = js.native
  def union(box: Box3): this.type = js.native
}

