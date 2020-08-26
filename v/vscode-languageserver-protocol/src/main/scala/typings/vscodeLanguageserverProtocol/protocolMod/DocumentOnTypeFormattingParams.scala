package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOnTypeFormattingParams extends js.Object {
  /**
    * The character that has been typed.
    */
  var ch: String = js.native
  /**
    * The format options.
    */
  var options: FormattingOptions = js.native
  /**
    * The position at which this request was send.
    */
  var position: Position = js.native
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object DocumentOnTypeFormattingParams {
  @scala.inline
  def apply(ch: String, options: FormattingOptions, position: Position, textDocument: TextDocumentIdentifier): DocumentOnTypeFormattingParams = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingParams]
  }
  @scala.inline
  implicit class DocumentOnTypeFormattingParamsOps[Self <: DocumentOnTypeFormattingParams] (val x: Self) extends AnyVal {
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
    def setCh(value: String): Self = this.set("ch", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: FormattingOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

