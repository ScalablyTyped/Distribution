package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapPositionOptions extends IMapZoomOptions {
  var timingFunction: js.UndefOr[java.lang.String] = js.undefined
}

object IMapPositionOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    timingFunction: java.lang.String = null,
    useMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  ): IMapPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    __obj.asInstanceOf[IMapPositionOptions]
  }
}

