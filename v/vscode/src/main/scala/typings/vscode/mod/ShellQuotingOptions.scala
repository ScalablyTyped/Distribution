package typings.vscode.mod

import typings.vscode.anon.CharsToEscape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellQuotingOptions extends js.Object {
  /**
    * The character used to do character escaping. If a string is provided only spaces
    * are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
    * in `charsToEscape` are escaped using the `escapeChar`.
    */
  var escape: js.UndefOr[String | CharsToEscape] = js.native
  /**
    * The character used for strong quoting. The string's length must be 1.
    */
  var strong: js.UndefOr[String] = js.native
  /**
    * The character used for weak quoting. The string's length must be 1.
    */
  var weak: js.UndefOr[String] = js.native
}

object ShellQuotingOptions {
  @scala.inline
  def apply(): ShellQuotingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellQuotingOptions]
  }
  @scala.inline
  implicit class ShellQuotingOptionsOps[Self <: ShellQuotingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEscape(value: String | CharsToEscape): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setStrong(value: String): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    @scala.inline
    def setWeak(value: String): Self = this.set("weak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
  }
  
}

