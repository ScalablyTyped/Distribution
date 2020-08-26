package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The completion context. This is only available it the client specifies
    * to send this using the client capability `textDocument.completion.contextSupport === true`
    */
  var context: js.UndefOr[CompletionContext] = js.native
}

object CompletionParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): CompletionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionParams]
  }
  @scala.inline
  implicit class CompletionParamsOps[Self <: CompletionParams] (val x: Self) extends AnyVal {
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
    def setContext(value: CompletionContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

