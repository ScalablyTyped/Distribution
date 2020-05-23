package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollZoomOptions extends js.Object {
  var maximumDelta: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
}

object IScrollZoomOptions {
  @scala.inline
  def apply(maximumDelta: js.UndefOr[Double] = js.undefined, speed: js.UndefOr[Double] = js.undefined): IScrollZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximumDelta)) __obj.updateDynamic("maximumDelta")(maximumDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollZoomOptions]
  }
}

