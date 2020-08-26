package typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionRangeParams
  extends WorkDoneProgressParams
     with PartialResultParams {
  /**
    * The positions inside the text document.
    */
  var positions: js.Array[Position] = js.native
  /**
    * The text document.
    */
  var textDocument: TextDocumentIdentifier = js.native
}

object SelectionRangeParams {
  @scala.inline
  def apply(positions: js.Array[Position], textDocument: TextDocumentIdentifier): SelectionRangeParams = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRangeParams]
  }
  @scala.inline
  implicit class SelectionRangeParamsOps[Self <: SelectionRangeParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPositionsVarargs(value: Position*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[Position]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextDocument(value: TextDocumentIdentifier): Self = this.set("textDocument", value.asInstanceOf[js.Any])
  }
  
}

