package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WillSaveTextDocumentParams extends js.Object {
  
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: TextDocumentSaveReason = js.native
  
  /**
    * The document that will be saved.
    */
  var textDocument: TextDocumentIdentifier = js.native
}
object WillSaveTextDocumentParams {
  
  @scala.inline
  def apply(reason: TextDocumentSaveReason, textDocument: TextDocumentIdentifier): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
  
  @scala.inline
  implicit class WillSaveTextDocumentParamsOps[Self <: WillSaveTextDocumentParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReason(value: TextDocumentSaveReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
}
