package typings.terminalKit.anon

import typings.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var flashDelay: js.UndefOr[Double] = js.undefined
  var flashStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
}

object Delay {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    flashDelay: js.UndefOr[Double] = js.undefined,
    flashStyle: CTerminal = null,
    style: CTerminal = null
  ): Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flashDelay)) __obj.updateDynamic("flashDelay")(flashDelay.get.asInstanceOf[js.Any])
    if (flashStyle != null) __obj.updateDynamic("flashStyle")(flashStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

