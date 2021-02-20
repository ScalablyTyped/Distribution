package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidCloseTextDocumentParams extends StObject {
  
  /**
    * The document that was closed.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object DidCloseTextDocumentParams {
  
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DidCloseTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidCloseTextDocumentParams]
  }
  
  @scala.inline
  implicit class DidCloseTextDocumentParamsMutableBuilder[Self <: DidCloseTextDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
  }
}
