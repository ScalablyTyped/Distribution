package typings.three.extrudeGeometryMod

import typings.three.curveMod.Curve
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtrudeGeometryOptions extends js.Object {
  var UVGenerator: js.UndefOr[typings.three.extrudeGeometryMod.UVGenerator] = js.undefined
  var bevelEnabled: js.UndefOr[Boolean] = js.undefined
  var bevelOffset: js.UndefOr[Double] = js.undefined
  var bevelSegments: js.UndefOr[Double] = js.undefined
  var bevelSize: js.UndefOr[Double] = js.undefined
  var bevelThickness: js.UndefOr[Double] = js.undefined
  var curveSegments: js.UndefOr[Double] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var extrudePath: js.UndefOr[Curve[Vector3]] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
}

object ExtrudeGeometryOptions {
  @scala.inline
  def apply(
    UVGenerator: UVGenerator = null,
    bevelEnabled: js.UndefOr[Boolean] = js.undefined,
    bevelOffset: Int | Double = null,
    bevelSegments: Int | Double = null,
    bevelSize: Int | Double = null,
    bevelThickness: Int | Double = null,
    curveSegments: Int | Double = null,
    depth: Int | Double = null,
    extrudePath: Curve[Vector3] = null,
    steps: Int | Double = null
  ): ExtrudeGeometryOptions = {
    val __obj = js.Dynamic.literal()
    if (UVGenerator != null) __obj.updateDynamic("UVGenerator")(UVGenerator.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled.asInstanceOf[js.Any])
    if (bevelOffset != null) __obj.updateDynamic("bevelOffset")(bevelOffset.asInstanceOf[js.Any])
    if (bevelSegments != null) __obj.updateDynamic("bevelSegments")(bevelSegments.asInstanceOf[js.Any])
    if (bevelSize != null) __obj.updateDynamic("bevelSize")(bevelSize.asInstanceOf[js.Any])
    if (bevelThickness != null) __obj.updateDynamic("bevelThickness")(bevelThickness.asInstanceOf[js.Any])
    if (curveSegments != null) __obj.updateDynamic("curveSegments")(curveSegments.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (extrudePath != null) __obj.updateDynamic("extrudePath")(extrudePath.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudeGeometryOptions]
  }
}

