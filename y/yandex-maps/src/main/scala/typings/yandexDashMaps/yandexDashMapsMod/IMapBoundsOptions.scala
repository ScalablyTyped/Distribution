package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapBoundsOptions extends IMapPositionOptions {
  var preciseZoom: js.UndefOr[Boolean] = js.undefined
  var zoomMargin: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.undefined
}

object IMapBoundsOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    preciseZoom: js.UndefOr[Boolean] = js.undefined,
    timingFunction: String = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined,
    zoomMargin: js.Array[js.Array[Double] | Double] = null
  ): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(preciseZoom)) __obj.updateDynamic("preciseZoom")(preciseZoom.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapBoundsOptions]
  }
}

