package typings.yandexDashMaps.yandexDashMapsMod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollZoomOptions extends js.Object {
  var maximumDelta: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object IScrollZoomOptions {
  @scala.inline
  def apply(maximumDelta: Int | Double = null, speed: Int | Double = null): IScrollZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumDelta != null) __obj.updateDynamic("maximumDelta")(maximumDelta.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollZoomOptions]
  }
}

