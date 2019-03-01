package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordRendering extends js.Object {
  var coordRendering: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.shortestPath | yandexDashMapsLib.yandexDashMapsLibStrings.straightPath
  ] = js.undefined
  var geodesic: js.UndefOr[scala.Boolean] = js.undefined
  var pixelRendering: js.UndefOr[
    yandexDashMapsLib.yandexDashMapsLibStrings.jumpy | yandexDashMapsLib.yandexDashMapsLibStrings.static
  ] = js.undefined
  var projection: js.UndefOr[yandexDashMapsLib.ymapsNs.IProjection] = js.undefined
  var simplification: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CoordRendering {
  @scala.inline
  def apply(
    coordRendering: yandexDashMapsLib.yandexDashMapsLibStrings.shortestPath | yandexDashMapsLib.yandexDashMapsLibStrings.straightPath = null,
    geodesic: js.UndefOr[scala.Boolean] = js.undefined,
    pixelRendering: yandexDashMapsLib.yandexDashMapsLibStrings.jumpy | yandexDashMapsLib.yandexDashMapsLibStrings.static = null,
    projection: yandexDashMapsLib.ymapsNs.IProjection = null,
    simplification: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CoordRendering = {
    val __obj = js.Dynamic.literal()
    if (coordRendering != null) __obj.updateDynamic("coordRendering")(coordRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic)
    if (pixelRendering != null) __obj.updateDynamic("pixelRendering")(pixelRendering.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(simplification)) __obj.updateDynamic("simplification")(simplification)
    __obj.asInstanceOf[Anon_CoordRendering]
  }
}

