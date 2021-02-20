package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidOpenTextDocumentParams extends StObject {
  
  /**
    * The document that was opened.
    */
  var textDocument: TextDocumentItem = js.native
}
object DidOpenTextDocumentParams {
  
  @scala.inline
  def apply(textDocument: TextDocumentItem): DidOpenTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidOpenTextDocumentParams]
  }
  
  @scala.inline
  implicit class DidOpenTextDocumentParamsMutableBuilder[Self <: DidOpenTextDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDocument(value: TextDocumentItem): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
