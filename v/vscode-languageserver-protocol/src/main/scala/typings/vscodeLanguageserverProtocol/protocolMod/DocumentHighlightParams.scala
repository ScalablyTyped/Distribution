package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHighlightParams
  extends TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams
object DocumentHighlightParams {
  
  @scala.inline
  def apply(position: Position, textDocument: TextDocumentIdentifier): DocumentHighlightParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlightParams]
  }
}
