package typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The positions inside the text document.
    */
  var positions: js.Array[Position]
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier
}

object SelectionRangeParams {
  @scala.inline
  def apply(
    positions: js.Array[Position],
    textDocument: TextDocumentIdentifier,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): SelectionRangeParams = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRangeParams]
  }
}

