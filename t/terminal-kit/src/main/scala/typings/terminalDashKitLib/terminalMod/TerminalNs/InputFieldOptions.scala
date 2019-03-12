package typings
package terminalDashKitLib.terminalMod.TerminalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFieldOptions extends js.Object {
  var autoComplete: js.UndefOr[js.Array[java.lang.String] | Autocompletion] = js.undefined
  var autoCompleteHint: js.UndefOr[scala.Boolean] = js.undefined
  var autoCompleteMenu: js.UndefOr[scala.Boolean | Autocompletion] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var cursorPosition: js.UndefOr[scala.Double] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var echo: js.UndefOr[scala.Boolean] = js.undefined
  var echoChar: js.UndefOr[java.lang.String | terminalDashKitLib.terminalDashKitLibNumbers.`true`] = js.undefined
  var hintStyle: js.UndefOr[CTerminal] = js.undefined
  var history: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keyBindings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[CTerminal] = js.undefined
  var tokenHook: js.UndefOr[
    js.Function5[
      /* token */ java.lang.String, 
      /* isEndOfInput */ scala.Boolean, 
      /* previousTokens */ js.Array[java.lang.String], 
      /* term */ terminalDashKitLib.terminalMod.Terminal, 
      /* config */ HookConfig, 
      java.lang.String | CTerminal | scala.Null | scala.Unit
    ]
  ] = js.undefined
  var tokenRegExp: js.UndefOr[stdLib.RegExp] = js.undefined
  var tokenResetHook: js.UndefOr[
    js.Function2[
      /* term */ terminalDashKitLib.terminalMod.Terminal, 
      /* config */ js.UndefOr[HookConfig], 
      java.lang.String | CTerminal
    ]
  ] = js.undefined
}

object InputFieldOptions {
  @scala.inline
  def apply(
    autoComplete: js.Array[java.lang.String] | Autocompletion = null,
    autoCompleteHint: js.UndefOr[scala.Boolean] = js.undefined,
    autoCompleteMenu: scala.Boolean | Autocompletion = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    cursorPosition: scala.Int | scala.Double = null,
    default: java.lang.String = null,
    echo: js.UndefOr[scala.Boolean] = js.undefined,
    echoChar: java.lang.String | terminalDashKitLib.terminalDashKitLibNumbers.`true` = null,
    hintStyle: CTerminal = null,
    history: js.Array[java.lang.String] = null,
    keyBindings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    maxLength: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    style: CTerminal = null,
    tokenHook: (/* token */ java.lang.String, /* isEndOfInput */ scala.Boolean, /* previousTokens */ js.Array[java.lang.String], /* term */ terminalDashKitLib.terminalMod.Terminal, /* config */ HookConfig) => java.lang.String | CTerminal | scala.Null | scala.Unit = null,
    tokenRegExp: stdLib.RegExp = null,
    tokenResetHook: (/* term */ terminalDashKitLib.terminalMod.Terminal, /* config */ js.UndefOr[HookConfig]) => java.lang.String | CTerminal = null
  ): InputFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCompleteHint)) __obj.updateDynamic("autoCompleteHint")(autoCompleteHint)
    if (autoCompleteMenu != null) __obj.updateDynamic("autoCompleteMenu")(autoCompleteMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (cursorPosition != null) __obj.updateDynamic("cursorPosition")(cursorPosition.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(echo)) __obj.updateDynamic("echo")(echo)
    if (echoChar != null) __obj.updateDynamic("echoChar")(echoChar.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (history != null) __obj.updateDynamic("history")(history)
    if (keyBindings != null) __obj.updateDynamic("keyBindings")(keyBindings)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tokenHook != null) __obj.updateDynamic("tokenHook")(js.Any.fromFunction5(tokenHook))
    if (tokenRegExp != null) __obj.updateDynamic("tokenRegExp")(tokenRegExp)
    if (tokenResetHook != null) __obj.updateDynamic("tokenResetHook")(js.Any.fromFunction2(tokenResetHook))
    __obj.asInstanceOf[InputFieldOptions]
  }
}

