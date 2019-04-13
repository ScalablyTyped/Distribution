package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var flashDelay: js.UndefOr[scala.Double] = js.undefined
  var flashStyle: js.UndefOr[terminalDashKitLib.terminalMod.CTerminal] = js.undefined
  var style: js.UndefOr[terminalDashKitLib.terminalMod.CTerminal] = js.undefined
}

object Anon_Delay {
  @scala.inline
  def apply(
    delay: scala.Int | scala.Double = null,
    flashDelay: scala.Int | scala.Double = null,
    flashStyle: terminalDashKitLib.terminalMod.CTerminal = null,
    style: terminalDashKitLib.terminalMod.CTerminal = null
  ): Anon_Delay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (flashDelay != null) __obj.updateDynamic("flashDelay")(flashDelay.asInstanceOf[js.Any])
    if (flashStyle != null) __obj.updateDynamic("flashStyle")(flashStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Delay]
  }
}

