package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLinkParams
  extends StObject
     with WorkDoneProgressParams
     with PartialResultParams {
  
  /**
    * The document to provide document links for.
    */
  var textDocument: TextDocumentIdentifier
}
object DocumentLinkParams {
  
  inline def apply(textDocument: TextDocumentIdentifier): DocumentLinkParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLinkParams]
  }
  
  extension [Self <: DocumentLinkParams](x: Self) {
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
