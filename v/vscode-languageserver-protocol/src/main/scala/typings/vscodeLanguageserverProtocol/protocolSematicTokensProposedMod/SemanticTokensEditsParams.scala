package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensEditsParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The previous result id.
    */
  var previousResultId: String
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object SemanticTokensEditsParams {
  @scala.inline
  def apply(
    previousResultId: String,
    textDocument: TextDocumentIdentifier,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): SemanticTokensEditsParams = {
    val __obj = js.Dynamic.literal(previousResultId = previousResultId.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensEditsParams]
  }
}

