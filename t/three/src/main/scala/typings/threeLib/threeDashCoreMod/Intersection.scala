package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intersection extends js.Object {
  var distance: scala.Double
  var distanceToRay: js.UndefOr[scala.Double] = js.undefined
  var face: js.UndefOr[Face3 | scala.Null] = js.undefined
  var faceIndex: js.UndefOr[scala.Double] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var `object`: Object3D
  var point: Vector3
  var uv: js.UndefOr[Vector2] = js.undefined
}

object Intersection {
  @scala.inline
  def apply(
    distance: scala.Double,
    `object`: Object3D,
    point: Vector3,
    distanceToRay: scala.Int | scala.Double = null,
    face: Face3 = null,
    faceIndex: scala.Int | scala.Double = null,
    index: scala.Int | scala.Double = null,
    uv: Vector2 = null
  ): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance, point = point)
    __obj.updateDynamic("object")(`object`)
    if (distanceToRay != null) __obj.updateDynamic("distanceToRay")(distanceToRay.asInstanceOf[js.Any])
    if (face != null) __obj.updateDynamic("face")(face)
    if (faceIndex != null) __obj.updateDynamic("faceIndex")(faceIndex.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (uv != null) __obj.updateDynamic("uv")(uv)
    __obj.asInstanceOf[Intersection]
  }
}

