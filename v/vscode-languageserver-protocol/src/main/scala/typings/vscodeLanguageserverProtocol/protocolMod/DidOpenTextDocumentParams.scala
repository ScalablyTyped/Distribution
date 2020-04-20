package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidOpenTextDocumentParams extends js.Object {
  /**
    * The document that was opened.
    */
  var textDocument: TextDocumentItem
}

object DidOpenTextDocumentParams {
  @scala.inline
  def apply(textDocument: TextDocumentItem): DidOpenTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidOpenTextDocumentParams]
  }
}

