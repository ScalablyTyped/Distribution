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

