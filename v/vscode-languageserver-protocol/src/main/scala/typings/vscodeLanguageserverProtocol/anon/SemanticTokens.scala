package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokens extends StObject {
  
  /**
    * Capabilities specific to the `textDocument/semanticTokens`
    *
    * @since 3.16.0 - Proposed state
    */
  var semanticTokens: js.UndefOr[TokenModifiers] = js.undefined
}
object SemanticTokens {
  
  inline def apply(): SemanticTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokens]
  }
  
  extension [Self <: SemanticTokens](x: Self) {
    
    inline def setSemanticTokens(value: TokenModifiers): Self = StObject.set(x, "semanticTokens", value.asInstanceOf[js.Any])
    
    inline def setSemanticTokensUndefined: Self = StObject.set(x, "semanticTokens", js.undefined)
  }
}
