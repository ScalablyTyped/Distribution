package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DidOpenTextDocumentParams extends StObject {
  
  /**
    * The document that was opened.
    */
  var textDocument: TextDocumentItem
}
object DidOpenTextDocumentParams {
  
  inline def apply(textDocument: TextDocumentItem): DidOpenTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidOpenTextDocumentParams]
  }
  
  extension [Self <: DidOpenTextDocumentParams](x: Self) {
    
    inline def setTextDocument(value: TextDocumentItem): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
