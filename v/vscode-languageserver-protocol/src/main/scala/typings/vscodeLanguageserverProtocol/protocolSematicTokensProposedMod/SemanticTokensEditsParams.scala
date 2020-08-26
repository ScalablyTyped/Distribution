package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokensEditsParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The previous result id.
    */
  var previousResultId: String = js.native
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object SemanticTokensEditsParams {
  @scala.inline
  def apply(previousResultId: String, textDocument: TextDocumentIdentifier): SemanticTokensEditsParams = {
    val __obj = js.Dynamic.literal(previousResultId = previousResultId.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsParams]
  }
  @scala.inline
  implicit class SemanticTokensEditsParamsOps[Self <: SemanticTokensEditsParams] (val x: Self) extends AnyVal {
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
    def setPreviousResultId(value: String): Self = this.set("previousResultId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

