package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeFormattingParams extends WorkDoneProgressParams {
  /**
    * The format options
    */
  var options: FormattingOptions
  /**
    * The range to format
    */
  var range: Range
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentRangeFormattingParams {
  @scala.inline
  def apply(
    options: FormattingOptions,
    range: Range,
    textDocument: TextDocumentIdentifier,
    workDoneToken: ProgressToken = null
  ): DocumentRangeFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRangeFormattingParams]
  }
}

