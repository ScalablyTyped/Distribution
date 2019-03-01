package typings
package terminalDashKitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var mouse: js.UndefOr[
    terminalDashKitLib.terminalDashKitLibStrings.button | terminalDashKitLib.terminalDashKitLibStrings.drag | terminalDashKitLib.terminalDashKitLibStrings.motion
  ] = js.undefined
  var safe: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Button {
  @scala.inline
  def apply(
    mouse: terminalDashKitLib.terminalDashKitLibStrings.button | terminalDashKitLib.terminalDashKitLibStrings.drag | terminalDashKitLib.terminalDashKitLibStrings.motion = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Button = {
    val __obj = js.Dynamic.literal()
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    __obj.asInstanceOf[Anon_Button]
  }
}

