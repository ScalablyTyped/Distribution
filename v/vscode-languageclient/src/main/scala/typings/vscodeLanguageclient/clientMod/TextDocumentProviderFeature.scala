package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentProviderFeature[T] extends js.Object {
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(textDocument: typings.vscode.mod.TextDocument): T = js.native
}

object TextDocumentProviderFeature {
  @scala.inline
  def apply[T](getProvider: typings.vscode.mod.TextDocument => T): TextDocumentProviderFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[TextDocumentProviderFeature[T]]
  }
  @scala.inline
  implicit class TextDocumentProviderFeatureOps[Self <: TextDocumentProviderFeature[_], T] (val x: Self with TextDocumentProviderFeature[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetProvider(value: typings.vscode.mod.TextDocument => T): Self = this.set("getProvider", js.Any.fromFunction1(value))
  }
  
}

