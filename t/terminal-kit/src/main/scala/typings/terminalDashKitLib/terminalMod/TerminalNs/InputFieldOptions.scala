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

