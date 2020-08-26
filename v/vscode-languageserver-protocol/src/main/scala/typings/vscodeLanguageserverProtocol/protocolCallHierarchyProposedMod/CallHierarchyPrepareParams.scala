package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallHierarchyPrepareParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams

object CallHierarchyPrepareParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): CallHierarchyPrepareParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyPrepareParams]
  }
}

