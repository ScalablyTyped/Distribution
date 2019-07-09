package typings
package threeLib.srcGeometriesExtrudeGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtrudeGeometryOptions extends js.Object {
  var UVGenerator: js.UndefOr[UVGenerator] = js.undefined
  var bevelEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var bevelOffset: js.UndefOr[scala.Double] = js.undefined
  var bevelSegments: js.UndefOr[scala.Double] = js.undefined
  var bevelSize: js.UndefOr[scala.Double] = js.undefined
  var bevelThickness: js.UndefOr[scala.Double] = js.undefined
  var curveSegments: js.UndefOr[scala.Double] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var extrudePath: js.UndefOr[threeLib.srcExtrasCoreCurvePathMod.CurvePath[threeLib.srcMathVector3Mod.Vector3]] = js.undefined
  var steps: js.UndefOr[scala.Double] = js.undefined
}

object ExtrudeGeometryOptions {
  @scala.inline
  def apply(
    UVGenerator: UVGenerator = null,
    bevelEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    bevelOffset: scala.Int | scala.Double = null,
    bevelSegments: scala.Int | scala.Double = null,
    bevelSize: scala.Int | scala.Double = null,
    bevelThickness: scala.Int | scala.Double = null,
    curveSegments: scala.Int | scala.Double = null,
    depth: scala.Int | scala.Double = null,
    extrudePath: threeLib.srcExtrasCoreCurvePathMod.CurvePath[threeLib.srcMathVector3Mod.Vector3] = null,
    steps: scala.Int | scala.Double = null
  ): ExtrudeGeometryOptions = {
    val __obj = js.Dynamic.literal()
    if (UVGenerator != null) __obj.updateDynamic("UVGenerator")(UVGenerator)
    if (!js.isUndefined(bevelEnabled)) __obj.updateDynamic("bevelEnabled")(bevelEnabled)
    if (bevelOffset != null) __obj.updateDynamic("bevelOffset")(bevelOffset.asInstanceOf[js.Any])
    if (bevelSegments != null) __obj.updateDynamic("bevelSegments")(bevelSegments.asInstanceOf[js.Any])
    if (bevelSize != null) __obj.updateDynamic("bevelSize")(bevelSize.asInstanceOf[js.Any])
    if (bevelThickness != null) __obj.updateDynamic("bevelThickness")(bevelThickness.asInstanceOf[js.Any])
    if (curveSegments != null) __obj.updateDynamic("curveSegments")(curveSegments.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (extrudePath != null) __obj.updateDynamic("extrudePath")(extrudePath)
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudeGeometryOptions]
  }
}

