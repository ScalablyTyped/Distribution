package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookConfig extends js.Object {
  var autoComplete: js.UndefOr[js.Array[java.lang.String] | Autocompletion] = js.undefined
  var autoCompleteHint: js.UndefOr[scala.Boolean] = js.undefined
  var autoCompleteMenu: js.UndefOr[scala.Boolean | Autocompletion] = js.undefined
  var hintStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var tokenRegExp: js.UndefOr[stdLib.RegExp] = js.undefined
}

object HookConfig {
  @scala.inline
  def apply(
    autoComplete: js.Array[java.lang.String] | Autocompletion = null,
    autoCompleteHint: js.UndefOr[scala.Boolean] = js.undefined,
    autoCompleteMenu: scala.Boolean | Autocompletion = null,
    hintStyle: CTerminal = null,
    style: CTerminal = null,
    tokenRegExp: stdLib.RegExp = null
  ): HookConfig = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCompleteHint)) __obj.updateDynamic("autoCompleteHint")(autoCompleteHint)
    if (autoCompleteMenu != null) __obj.updateDynamic("autoCompleteMenu")(autoCompleteMenu.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tokenRegExp != null) __obj.updateDynamic("tokenRegExp")(tokenRegExp)
    __obj.asInstanceOf[HookConfig]
  }
}

