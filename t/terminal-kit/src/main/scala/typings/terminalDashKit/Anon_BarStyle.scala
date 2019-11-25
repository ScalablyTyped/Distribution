package typings.terminalDashKit

import typings.terminalDashKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarStyle extends js.Object {
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  var innerSize: js.UndefOr[Double] = js.undefined
}

object Anon_BarStyle {
  @scala.inline
  def apply(barStyle: CTerminal = null, innerSize: Int | Double = null): Anon_BarStyle = {
    val __obj = js.Dynamic.literal()
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BarStyle]
  }
}

