package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapZoomOptions
  extends IMapMarginOptions
     with IMapCheckZoomRangeOptions {
  var duration: js.UndefOr[Double] = js.undefined
}

object IMapZoomOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined
  ): IMapZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    __obj.asInstanceOf[IMapZoomOptions]
  }
}

