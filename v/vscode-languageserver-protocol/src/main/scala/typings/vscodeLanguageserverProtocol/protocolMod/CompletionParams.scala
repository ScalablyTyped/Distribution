package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The completion context. This is only available it the client specifies
    * to send this using the client capability `textDocument.completion.contextSupport === true`
    */
  var context: js.UndefOr[CompletionContext] = js.undefined
}

object CompletionParams {
  @scala.inline
  def apply(
    position: Position,
    textDocument: TextDocumentIdentifier,
    context: CompletionContext = null,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): CompletionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionParams]
  }
}

