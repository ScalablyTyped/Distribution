package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapPositionOptions extends IMapZoomOptions {
  var timingFunction: js.UndefOr[String] = js.undefined
}

object IMapPositionOptions {
  @scala.inline
  def apply(
    checkZoomRange: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    timingFunction: String = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined
  ): IMapPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    __obj.asInstanceOf[IMapPositionOptions]
  }
}

