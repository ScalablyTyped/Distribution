package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDblClickZoomOptions
  extends yandexDashMapsLib.ymapsNs.IMapMarginOptions {
  var centering: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
}

object IDblClickZoomOptions {
  @scala.inline
  def apply(
    centering: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    useMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  ): IDblClickZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centering)) __obj.updateDynamic("centering")(centering)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    __obj.asInstanceOf[IDblClickZoomOptions]
  }
}

