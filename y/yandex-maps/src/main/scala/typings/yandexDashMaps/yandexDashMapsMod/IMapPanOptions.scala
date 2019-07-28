package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapPanOptions extends IMapPositionOptions {
  var delay: js.UndefOr[Double] = js.undefined
  var flying: js.UndefOr[Boolean] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
}

object IMapPanOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[Boolean] = js.undefined,
    delay: Int | Double = null,
    duration: Int | Double = null,
    flying: js.UndefOr[Boolean] = js.undefined,
    safe: js.UndefOr[Boolean] = js.undefined,
    timingFunction: String = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined
  ): IMapPanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(flying)) __obj.updateDynamic("flying")(flying)
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    __obj.asInstanceOf[IMapPanOptions]
  }
}

