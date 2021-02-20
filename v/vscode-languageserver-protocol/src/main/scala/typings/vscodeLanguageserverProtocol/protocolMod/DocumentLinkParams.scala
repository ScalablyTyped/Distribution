package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLinkParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The document to provide document links for.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object DocumentLinkParams {
  
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DocumentLinkParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLinkParams]
  }
  
  @scala.inline
  implicit class DocumentLinkParamsMutableBuilder[Self <: DocumentLinkParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
