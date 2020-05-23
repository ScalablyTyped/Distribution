package typings.swipe

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeOptions extends js.Object {
  var auto: js.UndefOr[Double] = js.undefined
  var callback: js.UndefOr[js.Function2[/* index */ Double, /* elem */ HTMLElement, Unit]] = js.undefined
  var continuous: js.UndefOr[Boolean] = js.undefined
  var disableScroll: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var startSlide: js.UndefOr[Double] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  var transitionEnd: js.UndefOr[js.Function2[/* index */ Double, /* elem */ HTMLElement, Unit]] = js.undefined
}

object SwipeOptions {
  @scala.inline
  def apply(
    auto: js.UndefOr[Double] = js.undefined,
    callback: (/* index */ Double, /* elem */ HTMLElement) => Unit = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    startSlide: js.UndefOr[Double] = js.undefined,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    transitionEnd: (/* index */ Double, /* elem */ HTMLElement) => Unit = null
  ): SwipeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startSlide)) __obj.updateDynamic("startSlide")(startSlide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.get.asInstanceOf[js.Any])
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(js.Any.fromFunction2(transitionEnd))
    __obj.asInstanceOf[SwipeOptions]
  }
}

