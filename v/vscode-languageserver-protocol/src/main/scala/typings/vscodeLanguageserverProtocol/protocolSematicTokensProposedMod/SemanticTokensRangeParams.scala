package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SemanticTokensRangeParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The range the semantic tokens are requested for.
    */
  var range: Range = js.native
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object SemanticTokensRangeParams {
  @scala.inline
  def apply(range: Range, textDocument: TextDocumentIdentifier): SemanticTokensRangeParams = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensRangeParams]
  }
  @scala.inline
  implicit class SemanticTokensRangeParamsOps[Self <: SemanticTokensRangeParams] (val x: Self) extends AnyVal {
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
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

