package typings.terminalDashKit.terminalMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookConfig extends js.Object {
  var autoComplete: js.UndefOr[js.Array[String] | Autocompletion] = js.undefined
  var autoCompleteHint: js.UndefOr[Boolean] = js.undefined
  var autoCompleteMenu: js.UndefOr[Boolean | Autocompletion] = js.undefined
  var hintStyle: js.UndefOr[CTerminal] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var tokenRegExp: js.UndefOr[RegExp] = js.undefined
}

object HookConfig {
  @scala.inline
  def apply(
    autoComplete: js.Array[String] | Autocompletion = null,
    autoCompleteHint: js.UndefOr[Boolean] = js.undefined,
    autoCompleteMenu: Boolean | Autocompletion = null,
    hintStyle: CTerminal = null,
    style: CTerminal = null,
    tokenRegExp: RegExp = null
  ): HookConfig = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCompleteHint)) __obj.updateDynamic("autoCompleteHint")(autoCompleteHint.asInstanceOf[js.Any])
    if (autoCompleteMenu != null) __obj.updateDynamic("autoCompleteMenu")(autoCompleteMenu.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tokenRegExp != null) __obj.updateDynamic("tokenRegExp")(tokenRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookConfig]
  }
}

