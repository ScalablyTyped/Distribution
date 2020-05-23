package typings.swiper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var containerClass: js.UndefOr[String] = js.undefined
  var maxRatio: js.UndefOr[Double] = js.undefined
  var minRatio: js.UndefOr[Double] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
  var zoomedSlideClass: js.UndefOr[String] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    containerClass: String = null,
    maxRatio: js.UndefOr[Double] = js.undefined,
    minRatio: js.UndefOr[Double] = js.undefined,
    toggle: js.UndefOr[Boolean] = js.undefined,
    zoomedSlideClass: String = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRatio)) __obj.updateDynamic("maxRatio")(maxRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minRatio)) __obj.updateDynamic("minRatio")(minRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.get.asInstanceOf[js.Any])
    if (zoomedSlideClass != null) __obj.updateDynamic("zoomedSlideClass")(zoomedSlideClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

