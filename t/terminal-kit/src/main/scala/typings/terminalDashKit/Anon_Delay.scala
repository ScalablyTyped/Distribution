package typings.terminalDashKit

import typings.terminalDashKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var flashDelay: js.UndefOr[Double] = js.undefined
  var flashStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    flashDelay: Int | Double = null,
    flashStyle: CTerminal = null,
    style: CTerminal = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (flashDelay != null) __obj.updateDynamic("flashDelay")(flashDelay.asInstanceOf[js.Any])
    if (flashStyle != null) __obj.updateDynamic("flashStyle")(flashStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Delay]
  }
}

