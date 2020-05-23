package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region interfaces
/**
  * The options object for adding a token to XRegExp.
  */
trait TokenOptions extends js.Object {
  /**
    * Single-character flag that triggers the token. This also registers the
    * flag, which prevents XRegExp from throwing an 'unknown flag' error when the flag is used.
    */
  var flag: js.UndefOr[TokenFlag] = js.undefined
  /**
    * Single character that occurs at the beginning of any successful match
    * of the token (not always applicable). This doesn't change the behavior of the token unless
    * you provide an erroneous value. However, providing it can increase the token's performance
    * since the token can be skipped at any positions where this character doesn't appear.
    */
  var leadChar: js.UndefOr[String] = js.undefined
  /**
    * Any custom flags checked for within the token `handler` that are
    * not required to trigger the token. This registers the flags, to prevent XRegExp from
    * throwing an 'unknown flag' error when any of the flags are used.
    */
  var optionalFlags: js.UndefOr[String] = js.undefined
  /**
    * Whether the `handler` function's output should not be treated as
    * final, and instead be reparseable by other tokens (including the current token). Allows
    * token chaining or deferring.
    */
  var reparse: js.UndefOr[Boolean] = js.undefined
  /**
    * Scope where the token applies: `default`, `class`, or `all`.
    */
  var scope: js.UndefOr[TokenScopeOption] = js.undefined
}

object TokenOptions {
  @scala.inline
  def apply(
    flag: TokenFlag = null,
    leadChar: String = null,
    optionalFlags: String = null,
    reparse: js.UndefOr[Boolean] = js.undefined,
    scope: TokenScopeOption = null
  ): TokenOptions = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (leadChar != null) __obj.updateDynamic("leadChar")(leadChar.asInstanceOf[js.Any])
    if (optionalFlags != null) __obj.updateDynamic("optionalFlags")(optionalFlags.asInstanceOf[js.Any])
    if (!js.isUndefined(reparse)) __obj.updateDynamic("reparse")(reparse.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenOptions]
  }
}

