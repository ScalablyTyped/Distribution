package typings.yandexDashMaps

import typings.yandexDashMaps.yandexDashMapsMod.IProjection
import typings.yandexDashMaps.yandexDashMapsStrings.jumpy
import typings.yandexDashMaps.yandexDashMapsStrings.shortestPath
import typings.yandexDashMaps.yandexDashMapsStrings.static
import typings.yandexDashMaps.yandexDashMapsStrings.straightPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CoordRendering extends js.Object {
  var coordRendering: js.UndefOr[shortestPath | straightPath] = js.undefined
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var pixelRendering: js.UndefOr[jumpy | static] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var simplification: js.UndefOr[Boolean] = js.undefined
}

object Anon_CoordRendering {
  @scala.inline
  def apply(
    coordRendering: shortestPath | straightPath = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    pixelRendering: jumpy | static = null,
    projection: IProjection = null,
    simplification: js.UndefOr[Boolean] = js.undefined
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

