package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.FormattingOptions
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFormattingParams extends WorkDoneProgressParams {
  /**
    * The format options
    */
  var options: FormattingOptions
  /**
    * The document to format.
    */
  var textDocument: TextDocumentIdentifier
}

object DocumentFormattingParams {
  @scala.inline
  def apply(
    options: FormattingOptions,
    textDocument: TextDocumentIdentifier,
    workDoneToken: ProgressToken = null
  ): DocumentFormattingParams = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFormattingParams]
  }
}

