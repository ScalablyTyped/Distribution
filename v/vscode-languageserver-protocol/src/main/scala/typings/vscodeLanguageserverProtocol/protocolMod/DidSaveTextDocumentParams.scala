package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidSaveTextDocumentParams extends js.Object {
  /**
    * Optional the content when saved. Depends on the includeText value
    * when the save notification was requested.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The document that was closed.
    */
  var textDocument: VersionedTextDocumentIdentifier
}

object DidSaveTextDocumentParams {
  @scala.inline
  def apply(textDocument: VersionedTextDocumentIdentifier, text: String = null): DidSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidSaveTextDocumentParams]
  }
}

