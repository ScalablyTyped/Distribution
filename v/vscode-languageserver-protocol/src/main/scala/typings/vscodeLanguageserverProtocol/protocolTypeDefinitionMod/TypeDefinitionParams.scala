package typings.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDefinitionParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams

object TypeDefinitionParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): TypeDefinitionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionParams]
  }
}

