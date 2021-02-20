package typings.vscode.mod

import typings.vscode.anon.CharsToEscape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellQuotingOptions extends StObject {
  
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
  implicit class ShellQuotingOptionsMutableBuilder[Self <: ShellQuotingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscape(value: String | CharsToEscape): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    @scala.inline
    def setStrong(value: String): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    
    @scala.inline
    def setWeak(value: String): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
