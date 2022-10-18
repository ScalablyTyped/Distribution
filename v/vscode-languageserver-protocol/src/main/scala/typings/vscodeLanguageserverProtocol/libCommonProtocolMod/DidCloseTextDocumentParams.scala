package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidCloseTextDocumentParams extends StObject {
  
  /**
    * The document that was closed.
    */
  var textDocument: TextDocumentIdentifier
}
object DidCloseTextDocumentParams {
  
  inline def apply(textDocument: TextDocumentIdentifier): DidCloseTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidCloseTextDocumentParams]
  }
  
  extension [Self <: DidCloseTextDocumentParams](x: Self) {
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
