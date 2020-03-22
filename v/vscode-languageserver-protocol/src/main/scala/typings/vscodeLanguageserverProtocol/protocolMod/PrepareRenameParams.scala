package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareRenameParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams

object PrepareRenameParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier, workDoneToken: ProgressToken = null): PrepareRenameParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareRenameParams]
  }
}

