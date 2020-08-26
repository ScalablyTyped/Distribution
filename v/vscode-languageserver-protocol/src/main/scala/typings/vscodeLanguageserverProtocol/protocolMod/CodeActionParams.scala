package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.CodeActionContext
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * Context carrying additional information.
    */
  var context: CodeActionContext = js.native
  /**
    * The range for which the command was invoked.
    */
  var range: Range = js.native
  /**
    * The document in which the command was invoked.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object CodeActionParams {
  @scala.inline
  def apply(context: CodeActionContext, range: Range, textDocument: TextDocumentIdentifier): CodeActionParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionParams]
  }
  @scala.inline
  implicit class CodeActionParamsOps[Self <: CodeActionParams] (val x: Self) extends AnyVal {
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
    def setContext(value: CodeActionContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

