package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.CodeActionContext
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * Context carrying additional information.
    */
  var context: CodeActionContext
  /**
    * The range for which the command was invoked.
    */
  var range: Range
  /**
    * The document in which the command was invoked.
    */
  var textDocument: TextDocumentIdentifier
}

object CodeActionParams {
  @scala.inline
  def apply(
    context: CodeActionContext,
    range: Range,
    textDocument: TextDocumentIdentifier,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): CodeActionParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionParams]
  }
}

