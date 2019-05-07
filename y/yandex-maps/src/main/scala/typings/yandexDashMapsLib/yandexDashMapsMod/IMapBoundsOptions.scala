package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapBoundsOptions extends IMapPositionOptions {
  var preciseZoom: js.UndefOr[scala.Boolean] = js.undefined
  var zoomMargin: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double]] = js.undefined
}

object IMapBoundsOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    preciseZoom: js.UndefOr[scala.Boolean] = js.undefined,
    timingFunction: java.lang.String = null,
    useMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    zoomMargin: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] = null
  ): IMapBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(preciseZoom)) __obj.updateDynamic("preciseZoom")(preciseZoom)
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapBoundsOptions]
  }
}

