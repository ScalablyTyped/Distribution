package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams

object TypeDefinitionParams {
  @scala.inline
  def apply(
    position: Position,
    textDocument: TextDocumentIdentifier,
    partialResultToken: ProgressToken = null,
    workDoneToken: ProgressToken = null
  ): TypeDefinitionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    if (partialResultToken != null) __obj.updateDynamic("partialResultToken")(partialResultToken.asInstanceOf[js.Any])
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionParams]
  }
}

