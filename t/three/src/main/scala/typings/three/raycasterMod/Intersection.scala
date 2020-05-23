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
  var instanceId: js.UndefOr[Double] = js.undefined
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
    distanceToRay: js.UndefOr[Double] = js.undefined,
    face: js.UndefOr[Null | Face3] = js.undefined,
    faceIndex: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    instanceId: js.UndefOr[Double] = js.undefined,
    uv: Vector2 = null
  ): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceToRay)) __obj.updateDynamic("distanceToRay")(distanceToRay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(face)) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (!js.isUndefined(faceIndex)) __obj.updateDynamic("faceIndex")(faceIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(instanceId)) __obj.updateDynamic("instanceId")(instanceId.get.asInstanceOf[js.Any])
    if (uv != null) __obj.updateDynamic("uv")(uv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
}

