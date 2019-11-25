package typings.terminalDashKit

import typings.terminalDashKit.terminalDashKitStrings.button
import typings.terminalDashKit.terminalDashKitStrings.drag
import typings.terminalDashKit.terminalDashKitStrings.motion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var mouse: js.UndefOr[button | drag | motion] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
}

object Anon_Button {
  @scala.inline
  def apply(mouse: button | drag | motion = null, safe: js.UndefOr[Boolean] = js.undefined): Anon_Button = {
    val __obj = js.Dynamic.literal()
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Button]
  }
}

