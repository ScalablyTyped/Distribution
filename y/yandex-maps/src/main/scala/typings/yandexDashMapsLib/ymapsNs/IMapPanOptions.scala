package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapPanOptions extends IMapPositionOptions {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var flying: js.UndefOr[scala.Boolean] = js.undefined
  var safe: js.UndefOr[scala.Boolean] = js.undefined
}

object IMapPanOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    flying: js.UndefOr[scala.Boolean] = js.undefined,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    timingFunction: java.lang.String = null,
    useMapMargin: js.UndefOr[scala.Boolean] = js.undefined
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

