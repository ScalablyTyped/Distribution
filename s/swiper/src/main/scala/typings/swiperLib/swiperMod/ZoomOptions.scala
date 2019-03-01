package typings
package swiperLib.swiperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  var maxRatio: js.UndefOr[scala.Double] = js.undefined
  var minRatio: js.UndefOr[scala.Double] = js.undefined
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
  var zoomedSlideClass: js.UndefOr[java.lang.String] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    containerClass: java.lang.String = null,
    maxRatio: scala.Int | scala.Double = null,
    minRatio: scala.Int | scala.Double = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined,
    zoomedSlideClass: java.lang.String = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (maxRatio != null) __obj.updateDynamic("maxRatio")(maxRatio.asInstanceOf[js.Any])
    if (minRatio != null) __obj.updateDynamic("minRatio")(minRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (zoomedSlideClass != null) __obj.updateDynamic("zoomedSlideClass")(zoomedSlideClass)
    __obj.asInstanceOf[ZoomOptions]
  }
}

