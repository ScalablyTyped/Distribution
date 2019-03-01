package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollZoomOptions extends js.Object {
  var maximumDelta: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
}

object IScrollZoomOptions {
  @scala.inline
  def apply(maximumDelta: scala.Int | scala.Double = null, speed: scala.Int | scala.Double = null): IScrollZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumDelta != null) __obj.updateDynamic("maximumDelta")(maximumDelta.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollZoomOptions]
  }
}

