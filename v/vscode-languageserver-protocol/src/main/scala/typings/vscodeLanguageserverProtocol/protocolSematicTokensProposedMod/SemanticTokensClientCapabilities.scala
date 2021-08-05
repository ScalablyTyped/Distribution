package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensClientCapabilities extends StObject {
  
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[typings.vscodeLanguageserverProtocol.anon.SemanticTokens] = js.undefined
}
object SemanticTokensClientCapabilities {
  
  inline def apply(): SemanticTokensClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokensClientCapabilities]
  }
  
  extension [Self <: SemanticTokensClientCapabilities](x: Self) {
    
    inline def setTextDocument(value: typings.vscodeLanguageserverProtocol.anon.SemanticTokens): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    inline def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
  }
}
