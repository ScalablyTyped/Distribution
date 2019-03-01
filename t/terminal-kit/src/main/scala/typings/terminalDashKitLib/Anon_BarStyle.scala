package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarStyle extends js.Object {
  var barStyle: js.UndefOr[terminalDashKitLib.terminalMod.TerminalNs.CTerminal] = js.undefined
  var innerSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BarStyle {
  @scala.inline
  def apply(
    barStyle: terminalDashKitLib.terminalMod.TerminalNs.CTerminal = null,
    innerSize: scala.Int | scala.Double = null
  ): Anon_BarStyle = {
    val __obj = js.Dynamic.literal()
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BarStyle]
  }
}

