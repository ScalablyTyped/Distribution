package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRangeParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object FoldingRangeParams {
  @scala.inline
  def apply(
    textDocument: TextDocumentIdentifier,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): FoldingRangeParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRangeParams]
  }
}

