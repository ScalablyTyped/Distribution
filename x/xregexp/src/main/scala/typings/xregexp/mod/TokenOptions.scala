package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region interfaces
/**
  * The options object for adding a token to XRegExp.
  */
trait TokenOptions extends StObject {
  
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
  
  inline def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenOptions] (val x: Self) extends AnyVal {
    
    inline def setFlag(value: TokenFlag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setLeadChar(value: String): Self = StObject.set(x, "leadChar", value.asInstanceOf[js.Any])
    
    inline def setLeadCharUndefined: Self = StObject.set(x, "leadChar", js.undefined)
    
    inline def setOptionalFlags(value: String): Self = StObject.set(x, "optionalFlags", value.asInstanceOf[js.Any])
    
    inline def setOptionalFlagsUndefined: Self = StObject.set(x, "optionalFlags", js.undefined)
    
    inline def setReparse(value: Boolean): Self = StObject.set(x, "reparse", value.asInstanceOf[js.Any])
    
    inline def setReparseUndefined: Self = StObject.set(x, "reparse", js.undefined)
    
    inline def setScope(value: TokenScopeOption): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
