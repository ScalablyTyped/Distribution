package typings.yandexMaps.mod

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
    duration: js.UndefOr[Double] = js.undefined,
    preciseZoom: js.UndefOr[Boolean] = js.undefined,
    timingFunction: String = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined,
    zoomMargin: js.Array[js.Array[Double] | Double] = null
  ): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preciseZoom)) __obj.updateDynamic("preciseZoom")(preciseZoom.get.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.get.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapBoundsOptions]
  }
}

