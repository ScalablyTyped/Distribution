package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallHierarchyPrepareParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams

object CallHierarchyPrepareParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier, workDoneToken: ProgressToken = null): CallHierarchyPrepareParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyPrepareParams]
  }
}

