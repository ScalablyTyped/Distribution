package typings.vscodeLanguageserverProtocol.protocolDeclarationMod

import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams

object DeclarationParams {
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): DeclarationParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationParams]
  }
}

