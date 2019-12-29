package typings.three

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathPlaneMod.Plane
import typings.three.srcMathSphereMod.Sphere
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcObjectsSpriteMod.Sprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Frustum", JSImport.Namespace)
@js.native
object srcMathFrustumMod extends js.Object {
  @js.native
  class Frustum protected () extends js.Object {
    def this(
      p0: js.UndefOr[Plane],
      p1: js.UndefOr[Plane],
      p2: js.UndefOr[Plane],
      p3: js.UndefOr[Plane],
      p4: js.UndefOr[Plane],
      p5: js.UndefOr[Plane]
    ) = this()
    /**
    	 * Array of 6 vectors.
    	 */
    var planes: js.Array[Plane] = js.native
    def containsPoint(point: Vector3): Boolean = js.native
    def copy(frustum: Frustum): this.type = js.native
    def intersectsBox(box: Box3): Boolean = js.native
    def intersectsObject(`object`: Object3D): Boolean = js.native
    def intersectsSphere(sphere: Sphere): Boolean = js.native
    def intersectsSprite(sprite: Sprite): Boolean = js.native
    def set(
      p0: js.UndefOr[Double],
      p1: js.UndefOr[Double],
      p2: js.UndefOr[Double],
      p3: js.UndefOr[Double],
      p4: js.UndefOr[Double],
      p5: js.UndefOr[Double]
    ): Frustum = js.native
    def setFromMatrix(m: Matrix4): Frustum = js.native
  }
  
}

