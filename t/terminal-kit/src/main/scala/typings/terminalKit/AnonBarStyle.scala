package typings.terminalKit

import typings.terminalKit.terminalMod.CTerminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBarStyle extends js.Object {
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  var innerSize: js.UndefOr[Double] = js.undefined
}

object AnonBarStyle {
  @scala.inline
  def apply(barStyle: CTerminal = null, innerSize: Int | Double = null): AnonBarStyle = {
    val __obj = js.Dynamic.literal()
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarStyle]
  }
}

