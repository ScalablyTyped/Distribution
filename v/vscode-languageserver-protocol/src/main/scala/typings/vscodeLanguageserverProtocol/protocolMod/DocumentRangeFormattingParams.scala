package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentRangeFormattingParams extends WorkDoneProgressParams {
  /**
    * The format options
    */
  var options: FormattingOptions = js.native
  /**
    * The range to format
    */
  var range: Range = js.native
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object DocumentRangeFormattingParams {
  @scala.inline
  def apply(options: FormattingOptions, range: Range, textDocument: TextDocumentIdentifier): DocumentRangeFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRangeFormattingParams]
  }
  @scala.inline
  implicit class DocumentRangeFormattingParamsOps[Self <: DocumentRangeFormattingParams] (val x: Self) extends AnyVal {
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
    def setOptions(value: FormattingOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

