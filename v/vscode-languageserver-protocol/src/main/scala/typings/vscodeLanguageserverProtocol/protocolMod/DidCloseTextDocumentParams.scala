package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidCloseTextDocumentParams extends js.Object {
  /**
    * The document that was closed.
    */
  var textDocument: TextDocumentIdentifier
}

object DidCloseTextDocumentParams {
  @scala.inline
  def apply(textDocument: TextDocumentIdentifier): DidCloseTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidCloseTextDocumentParams]
  }
}

