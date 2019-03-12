package typings
package swipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeOptions extends js.Object {
  var auto: js.UndefOr[scala.Double] = js.undefined
  var callback: js.UndefOr[
    js.Function2[/* index */ scala.Double, /* elem */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var disableScroll: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var startSlide: js.UndefOr[scala.Double] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var transitionEnd: js.UndefOr[
    js.Function2[/* index */ scala.Double, /* elem */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
}

object SwipeOptions {
  @scala.inline
  def apply(
    auto: scala.Int | scala.Double = null,
    callback: (/* index */ scala.Double, /* elem */ stdLib.HTMLElement) => scala.Unit = null,
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    disableScroll: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    startSlide: scala.Int | scala.Double = null,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    transitionEnd: (/* index */ scala.Double, /* elem */ stdLib.HTMLElement) => scala.Unit = null
  ): SwipeOptions = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(disableScroll)) __obj.updateDynamic("disableScroll")(disableScroll)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startSlide != null) __obj.updateDynamic("startSlide")(startSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (transitionEnd != null) __obj.updateDynamic("transitionEnd")(js.Any.fromFunction2(transitionEnd))
    __obj.asInstanceOf[SwipeOptions]
  }
}

