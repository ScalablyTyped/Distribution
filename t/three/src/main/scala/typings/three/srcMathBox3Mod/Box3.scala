package typings.three.srcMathBox3Mod

import typings.std.ArrayLike
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcMathSphereMod.Sphere
import typings.three.srcMathTriangleMod.Triangle
import typings.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Box3", "Box3")
@js.native
class Box3 () extends js.Object {
  def this(min: Vector3) = this()
  def this(min: Vector3, max: Vector3) = this()
  var max: Vector3 = js.native
  var min: Vector3 = js.native
  def applyMatrix4(matrix: Matrix4): this.type = js.native
  def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native
  def containsBox(box: Box3): Boolean = js.native
  def containsPoint(point: Vector3): Boolean = js.native
  def copy(box: Box3): this.type = js.native
  def distanceToPoint(point: Vector3): Double = js.native
  /**
  	 * @deprecated Use {@link Box3#isEmpty .isEmpty()} instead.
  	 */
  def empty(): js.Any = js.native
  def equals(box: Box3): Boolean = js.native
  def expandByObject(`object`: Object3D): this.type = js.native
  def expandByPoint(point: Vector3): this.type = js.native
  def expandByScalar(scalar: Double): this.type = js.native
  def expandByVector(vector: Vector3): this.type = js.native
  def getBoundingSphere(target: Sphere): Sphere = js.native
  def getCenter(target: Vector3): Vector3 = js.native
  def getParameter(point: Vector3): Vector3 = js.native
  def getSize(target: Vector3): Vector3 = js.native
  def intersect(box: Box3): this.type = js.native
  def intersectsBox(box: Box3): Boolean = js.native
  def intersectsPlane(plane: Plane): Boolean = js.native
  def intersectsSphere(sphere: Sphere): Boolean = js.native
  def intersectsTriangle(triangle: Triangle): Boolean = js.native
  def isEmpty(): Boolean = js.native
  /**
  	 * @deprecated Use {@link Box3#intersectsBox .intersectsBox()} instead.
  	 */
  def isIntersectionBox(b: js.Any): js.Any = js.native
  /**
  	 * @deprecated Use {@link Box3#intersectsSphere .intersectsSphere()} instead.
  	 */
  def isIntersectionSphere(s: js.Any): js.Any = js.native
  def makeEmpty(): this.type = js.native
  def set(min: Vector3, max: Vector3): this.type = js.native
  def setFromArray(array: ArrayLike[Double]): this.type = js.native
  def setFromCenterAndSize(center: Vector3, size: Vector3): this.type = js.native
  def setFromObject(`object`: Object3D): this.type = js.native
  def setFromPoints(points: js.Array[Vector3]): this.type = js.native
  def translate(offset: Vector3): this.type = js.native
  def union(box: Box3): this.type = js.native
}

