package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameParams extends WorkDoneProgressParams {
  /**
    * The new name of the symbol. If the given name is not valid the
    * request must return a [ResponseError](#ResponseError) with an
    * appropriate message set.
    */
  var newName: String
  /**
    * The position at which this request was sent.
    */
  var position: Position
  /**
    * The document to rename.
    */
  var textDocument: TextDocumentIdentifier
}

object RenameParams {
  @scala.inline
  def apply(
    newName: String,
    position: Position,
    textDocument: TextDocumentIdentifier,
    workDoneToken: ProgressToken = null
  ): RenameParams = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameParams]
  }
}

