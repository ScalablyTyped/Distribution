package typings
package threeLib.srcMathFrustumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Frustum", "Frustum")
@js.native
class Frustum protected () extends js.Object {
  def this(p0: js.UndefOr[threeLib.srcMathPlaneMod.Plane], p1: js.UndefOr[threeLib.srcMathPlaneMod.Plane], p2: js.UndefOr[threeLib.srcMathPlaneMod.Plane], p3: js.UndefOr[threeLib.srcMathPlaneMod.Plane], p4: js.UndefOr[threeLib.srcMathPlaneMod.Plane], p5: js.UndefOr[threeLib.srcMathPlaneMod.Plane]) = this()
  /**
    * Array of 6 vectors.
    */
  var planes: js.Array[threeLib.srcMathPlaneMod.Plane] = js.native
  def containsPoint(point: threeLib.srcMathVector3Mod.Vector3): scala.Boolean = js.native
  def copy(frustum: Frustum): this.type = js.native
  def intersectsBox(box: threeLib.srcMathBox3Mod.Box3): scala.Boolean = js.native
  def intersectsObject(`object`: threeLib.srcCoreObject3DMod.Object3D): scala.Boolean = js.native
  def intersectsObject(sprite: threeLib.srcObjectsSpriteMod.Sprite): scala.Boolean = js.native
  def intersectsSphere(sphere: threeLib.srcMathSphereMod.Sphere): scala.Boolean = js.native
  def set(
    p0: js.UndefOr[scala.Double],
    p1: js.UndefOr[scala.Double],
    p2: js.UndefOr[scala.Double],
    p3: js.UndefOr[scala.Double],
    p4: js.UndefOr[scala.Double],
    p5: js.UndefOr[scala.Double]
  ): Frustum = js.native
  def setFromMatrix(m: threeLib.srcMathMatrix4Mod.Matrix4): Frustum = js.native
}

