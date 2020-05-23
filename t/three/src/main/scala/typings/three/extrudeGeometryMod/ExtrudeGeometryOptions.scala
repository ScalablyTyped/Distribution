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
    bevelOffset: js.UndefOr[Double] = js.undefined,
    bevelSegments: js.UndefOr[Double] = js.undefined,
    bevelSize: js.UndefOr[Double] = js.undefined,
    bevelThickness: js.UndefOr[Double] = js.undefined,
    curveSegments: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    extrudePath: Curve[Vector3] = null,
    steps: js.UndefOr[Double] = js.undefined
  ): ExtrudeGeometryOptions = {
    val __obj = js.Dynamic.literal()
    if (UVGenerator != null) __obj.updateDynamic("UVGenerator")(UVGenerator.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelOffset)) __obj.updateDynamic("bevelOffset")(bevelOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelSegments)) __obj.updateDynamic("bevelSegments")(bevelSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelSize)) __obj.updateDynamic("bevelSize")(bevelSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bevelThickness)) __obj.updateDynamic("bevelThickness")(bevelThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(curveSegments)) __obj.updateDynamic("curveSegments")(curveSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (extrudePath != null) __obj.updateDynamic("extrudePath")(extrudePath.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudeGeometryOptions]
  }
}

