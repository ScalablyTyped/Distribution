package typings.three.raycasterMod

import typings.three.face3Mod.Face3
import typings.three.object3DMod.Object3D
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intersection extends js.Object {
  var distance: Double
  var distanceToRay: js.UndefOr[Double] = js.undefined
  var face: js.UndefOr[Face3 | Null] = js.undefined
  var faceIndex: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var `object`: Object3D
  var point: Vector3
  var uv: js.UndefOr[Vector2] = js.undefined
}

object Intersection {
  @scala.inline
  def apply(
    distance: Double,
    `object`: Object3D,
    point: Vector3,
    distanceToRay: Int | Double = null,
    face: Face3 = null,
    faceIndex: Int | Double = null,
    index: Int | Double = null,
    uv: Vector2 = null
  ): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (distanceToRay != null) __obj.updateDynamic("distanceToRay")(distanceToRay.asInstanceOf[js.Any])
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (faceIndex != null) __obj.updateDynamic("faceIndex")(faceIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (uv != null) __obj.updateDynamic("uv")(uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
}

