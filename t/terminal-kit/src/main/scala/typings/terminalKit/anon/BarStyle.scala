package typings.terminalKit.anon

import typings.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarStyle extends js.Object {
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  var innerSize: js.UndefOr[Double] = js.undefined
}

object BarStyle {
  @scala.inline
  def apply(barStyle: CTerminal = null, innerSize: js.UndefOr[Double] = js.undefined): BarStyle = {
    val __obj = js.Dynamic.literal()
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(innerSize)) __obj.updateDynamic("innerSize")(innerSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarStyle]
  }
}

