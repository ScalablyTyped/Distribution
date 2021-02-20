package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensClientCapabilities extends StObject {
  
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[typings.vscodeLanguageserverProtocol.anon.SemanticTokens] = js.native
}
object SemanticTokensClientCapabilities {
  
  @scala.inline
  def apply(): SemanticTokensClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticTokensClientCapabilities]
  }
  
  @scala.inline
  implicit class SemanticTokensClientCapabilitiesMutableBuilder[Self <: SemanticTokensClientCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDocument(value: typings.vscodeLanguageserverProtocol.anon.SemanticTokens): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
  }
}
