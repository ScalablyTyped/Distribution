package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellQuotingOptions extends js.Object {
  /**
  		 * The character used to do character escaping. If a string is provided only spaces
  		 * are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
  		 * in `charsToEscape` are escaped using the `escapeChar`.
  		 */
  var escape: js.UndefOr[java.lang.String | vscodeLib.Anon_CharsToEscape] = js.undefined
  /**
  		 * The character used for strong quoting. The string's length must be 1.
  		 */
  var strong: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The character used for weak quoting. The string's length must be 1.
  		 */
  var weak: js.UndefOr[java.lang.String] = js.undefined
}

object ShellQuotingOptions {
  @scala.inline
  def apply(
    escape: java.lang.String | vscodeLib.Anon_CharsToEscape = null,
    strong: java.lang.String = null,
    weak: java.lang.String = null
  ): ShellQuotingOptions = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong)
    if (weak != null) __obj.updateDynamic("weak")(weak)
    __obj.asInstanceOf[ShellQuotingOptions]
  }
}

