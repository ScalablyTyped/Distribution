package typings.yandexMaps.mod

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
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    flying: js.UndefOr[Boolean] = js.undefined,
    safe: js.UndefOr[Boolean] = js.undefined,
    timingFunction: String = null,
    useMapMargin: js.UndefOr[Boolean] = js.undefined
  ): IMapPanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flying)) __obj.updateDynamic("flying")(flying.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapPanOptions]
  }
}

