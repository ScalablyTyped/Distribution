package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object SemanticTokensParams {
  
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): SemanticTokensParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensParams]
  }
  
  @scala.inline
  implicit class SemanticTokensParamsMutableBuilder[Self <: SemanticTokensParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
