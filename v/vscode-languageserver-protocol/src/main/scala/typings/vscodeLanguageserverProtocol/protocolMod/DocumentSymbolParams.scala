package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}
object DocumentSymbolParams {
  
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DocumentSymbolParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolParams]
  }
  
  @scala.inline
  implicit class DocumentSymbolParamsMutableBuilder[Self <: DocumentSymbolParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
