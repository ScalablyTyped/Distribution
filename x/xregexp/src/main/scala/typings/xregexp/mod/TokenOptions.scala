package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region interfaces
/**
  * The options object for adding a token to XRegExp.
  */
@js.native
trait TokenOptions extends js.Object {
  /**
    * Single-character flag that triggers the token. This also registers the
    * flag, which prevents XRegExp from throwing an 'unknown flag' error when the flag is used.
    */
  var flag: js.UndefOr[TokenFlag] = js.native
  /**
    * Single character that occurs at the beginning of any successful match
    * of the token (not always applicable). This doesn't change the behavior of the token unless
    * you provide an erroneous value. However, providing it can increase the token's performance
    * since the token can be skipped at any positions where this character doesn't appear.
    */
  var leadChar: js.UndefOr[String] = js.native
  /**
    * Any custom flags checked for within the token `handler` that are
    * not required to trigger the token. This registers the flags, to prevent XRegExp from
    * throwing an 'unknown flag' error when any of the flags are used.
    */
  var optionalFlags: js.UndefOr[String] = js.native
  /**
    * Whether the `handler` function's output should not be treated as
    * final, and instead be reparseable by other tokens (including the current token). Allows
    * token chaining or deferring.
    */
  var reparse: js.UndefOr[Boolean] = js.native
  /**
    * Scope where the token applies: `default`, `class`, or `all`.
    */
  var scope: js.UndefOr[TokenScopeOption] = js.native
}

object TokenOptions {
  @scala.inline
  def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  @scala.inline
  implicit class TokenOptionsOps[Self <: TokenOptions] (val x: Self) extends AnyVal {
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
    def setFlag(value: TokenFlag): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setLeadChar(value: String): Self = this.set("leadChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadChar: Self = this.set("leadChar", js.undefined)
    @scala.inline
    def setOptionalFlags(value: String): Self = this.set("optionalFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalFlags: Self = this.set("optionalFlags", js.undefined)
    @scala.inline
    def setReparse(value: Boolean): Self = this.set("reparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReparse: Self = this.set("reparse", js.undefined)
    @scala.inline
    def setScope(value: TokenScopeOption): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

