package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Frustum")
@js.native
class Frustum protected () extends js.Object {
  def this(p0: js.UndefOr[Plane], p1: js.UndefOr[Plane], p2: js.UndefOr[Plane], p3: js.UndefOr[Plane], p4: js.UndefOr[Plane], p5: js.UndefOr[Plane]) = this()
  /**
    * Array of 6 vectors.
    */
  var planes: js.Array[Plane] = js.native
  def containsPoint(point: Vector3): scala.Boolean = js.native
  def copy(frustum: this.type): this.type = js.native
  def intersectsBox(box: Box3): scala.Boolean = js.native
  def intersectsObject(`object`: Object3D): scala.Boolean = js.native
  def intersectsObject(sprite: Sprite): scala.Boolean = js.native
  def intersectsSphere(sphere: Sphere): scala.Boolean = js.native
  def set(
    p0: js.UndefOr[scala.Double],
    p1: js.UndefOr[scala.Double],
    p2: js.UndefOr[scala.Double],
    p3: js.UndefOr[scala.Double],
    p4: js.UndefOr[scala.Double],
    p5: js.UndefOr[scala.Double]
  ): Frustum = js.native
  def setFromMatrix(m: Matrix4): Frustum = js.native
}

