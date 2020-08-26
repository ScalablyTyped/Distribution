package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DocumentLinkParamsOps[Self <: DocumentLinkParams] (val x: Self) extends AnyVal {
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
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

