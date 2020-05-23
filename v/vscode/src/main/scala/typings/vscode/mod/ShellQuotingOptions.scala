package typings.vscode.mod

import typings.vscode.anon.CharsToEscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellQuotingOptions extends js.Object {
  /**
    * The character used to do character escaping. If a string is provided only spaces
    * are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
    * in `charsToEscape` are escaped using the `escapeChar`.
    */
  var escape: js.UndefOr[String | CharsToEscape] = js.undefined
  /**
    * The character used for strong quoting. The string's length must be 1.
    */
  var strong: js.UndefOr[String] = js.undefined
  /**
    * The character used for weak quoting. The string's length must be 1.
    */
  var weak: js.UndefOr[String] = js.undefined
}

object ShellQuotingOptions {
  @scala.inline
  def apply(escape: String | CharsToEscape = null, strong: String = null, weak: String = null): ShellQuotingOptions = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (weak != null) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellQuotingOptions]
  }
}

