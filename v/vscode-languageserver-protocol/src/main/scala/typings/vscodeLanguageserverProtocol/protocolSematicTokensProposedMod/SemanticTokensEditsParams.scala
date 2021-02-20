package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensEditsParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The previous result id.
    */
  var previousResultId: String = js.native
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object SemanticTokensEditsParams {
  
  @scala.inline
  def apply(previousResultId: String, textDocument: TextDocumentIdentifier): SemanticTokensEditsParams = {
    val __obj = js.Dynamic.literal(previousResultId = previousResultId.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsParams]
  }
  
  @scala.inline
  implicit class SemanticTokensEditsParamsMutableBuilder[Self <: SemanticTokensEditsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousResultId(value: String): Self = StObject.set(x, "previousResultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
