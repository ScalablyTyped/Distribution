package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WillSaveTextDocumentParams extends StObject {
  
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: TextDocumentSaveReason
  
  /**
    * The document that will be saved.
    */
  var textDocument: TextDocumentIdentifier
}
object WillSaveTextDocumentParams {
  
  inline def apply(reason: TextDocumentSaveReason, textDocument: TextDocumentIdentifier): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WillSaveTextDocumentParams] (val x: Self) extends AnyVal {
    
    inline def setReason(value: TextDocumentSaveReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
