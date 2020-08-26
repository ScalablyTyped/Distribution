package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams

object DefinitionParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): DefinitionParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionParams]
  }
}

