package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region interfaces
/**
  * The options object for adding a token to XRegExp.
  */
@js.native
trait TokenOptions extends StObject {
  
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
  implicit class TokenOptionsMutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: TokenFlag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    @scala.inline
    def setLeadChar(value: String): Self = StObject.set(x, "leadChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadCharUndefined: Self = StObject.set(x, "leadChar", js.undefined)
    
    @scala.inline
    def setOptionalFlags(value: String): Self = StObject.set(x, "optionalFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFlagsUndefined: Self = StObject.set(x, "optionalFlags", js.undefined)
    
    @scala.inline
    def setReparse(value: Boolean): Self = StObject.set(x, "reparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReparseUndefined: Self = StObject.set(x, "reparse", js.undefined)
    
    @scala.inline
    def setScope(value: TokenScopeOption): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
