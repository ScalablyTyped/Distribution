package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

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
  
  inline def apply(textDocument: TextDocumentIdentifier): DocumentSymbolParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolParams]
  }
  
  extension [Self <: DocumentSymbolParams](x: Self) {
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
