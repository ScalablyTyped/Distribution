package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentProviderFeature[T] extends js.Object {
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(textDocument: typings.vscode.mod.TextDocument): T
}

object TextDocumentProviderFeature {
  @scala.inline
  def apply[T](getProvider: typings.vscode.mod.TextDocument => T): TextDocumentProviderFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentProviderFeature[T]]
  }
}

