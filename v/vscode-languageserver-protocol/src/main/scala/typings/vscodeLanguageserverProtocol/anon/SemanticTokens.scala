package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokens extends StObject {
  
  /**
    * Capabilities specific to the `textDocument/semanticTokens`
    *
    * @since 3.16.0 - Proposed state
    */
  var semanticTokens: js.UndefOr[TokenModifiers] = js.native
}
object SemanticTokens {
  
  @scala.inline
  def apply(): SemanticTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokens]
  }
  
  @scala.inline
  implicit class SemanticTokensMutableBuilder[Self <: SemanticTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSemanticTokens(value: TokenModifiers): Self = StObject.set(x, "semanticTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticTokensUndefined: Self = StObject.set(x, "semanticTokens", js.undefined)
  }
}
