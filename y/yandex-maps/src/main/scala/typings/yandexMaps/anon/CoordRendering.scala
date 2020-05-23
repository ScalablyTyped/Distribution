package typings.yandexMaps.anon

import typings.yandexMaps.mod.IProjection
import typings.yandexMaps.yandexMapsStrings.jumpy
import typings.yandexMaps.yandexMapsStrings.shortestPath
import typings.yandexMaps.yandexMapsStrings.static
import typings.yandexMaps.yandexMapsStrings.straightPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordRendering extends js.Object {
  var coordRendering: js.UndefOr[shortestPath | straightPath] = js.undefined
  var geodesic: js.UndefOr[Boolean] = js.undefined
  var pixelRendering: js.UndefOr[jumpy | static] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
  var simplification: js.UndefOr[Boolean] = js.undefined
}

object CoordRendering {
  @scala.inline
  def apply(
    coordRendering: shortestPath | straightPath = null,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    pixelRendering: jumpy | static = null,
    projection: IProjection = null,
    simplification: js.UndefOr[Boolean] = js.undefined
  ): CoordRendering = {
    val __obj = js.Dynamic.literal()
    if (coordRendering != null) __obj.updateDynamic("coordRendering")(coordRendering.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic.get.asInstanceOf[js.Any])
    if (pixelRendering != null) __obj.updateDynamic("pixelRendering")(pixelRendering.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(simplification)) __obj.updateDynamic("simplification")(simplification.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordRendering]
  }
}

