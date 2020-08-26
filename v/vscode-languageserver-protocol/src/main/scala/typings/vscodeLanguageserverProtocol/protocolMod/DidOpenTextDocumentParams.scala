package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DidOpenTextDocumentParams extends js.Object {
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
  implicit class DidOpenTextDocumentParamsOps[Self <: DidOpenTextDocumentParams] (val x: Self) extends AnyVal {
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
    def setTextDocument(value: TextDocumentItem): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

