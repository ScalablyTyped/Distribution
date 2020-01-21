package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WillSaveTextDocumentParams extends js.Object {
  /**
    * The 'TextDocumentSaveReason'.
    */
  var reason: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentSaveReason */ js.Any
  /**
    * The document that will be saved.
    */
  var textDocument: TextDocumentIdentifier
}

object WillSaveTextDocumentParams {
  @scala.inline
  def apply(
    reason: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextDocumentSaveReason */ js.Any,
    textDocument: TextDocumentIdentifier
  ): WillSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WillSaveTextDocumentParams]
  }
}

