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
    auto: Int | Double = null,
    callback: (/* index */ Double, /* elem */ HTMLElement) => Unit = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    disableScroll: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    startSlide: Int | Double = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    transitionEnd: (/* index */ Double, /* elem */ HTMLElement) => Unit = null
  ): SwipeOptions = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startSlide != null) __obj.updateDynamic("startSlide")(startSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(js.Any.fromFunction2(transitionEnd))
    __obj.asInstanceOf[SwipeOptions]
  }
}

