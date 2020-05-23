package typings.yandexMaps.mod

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
    duration: js.UndefOr[Double] = js.undefined,
    useMapMargin: js.UndefOr[Boolean] = js.undefined
  ): IMapZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapZoomOptions]
  }
}

