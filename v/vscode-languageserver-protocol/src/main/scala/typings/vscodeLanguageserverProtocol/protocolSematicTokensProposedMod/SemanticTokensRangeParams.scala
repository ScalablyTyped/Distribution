package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensRangeParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The range the semantic tokens are requested for.
    */
  var range: Range
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object SemanticTokensRangeParams {
  @scala.inline
  def apply(
    range: Range,
    textDocument: TextDocumentIdentifier,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): SemanticTokensRangeParams = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensRangeParams]
  }
}

