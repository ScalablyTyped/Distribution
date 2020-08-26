package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentsConfiguration[T] extends js.Object {
  def create(uri: String, languageId: String, version: Double, content: String): T = js.native
  def update(document: T, changes: js.Array[TextDocumentContentChangeEvent], version: Double): T = js.native
}

object TextDocumentsConfiguration {
  @scala.inline
  def apply[T](
    create: (String, String, Double, String) => T,
    update: (T, js.Array[TextDocumentContentChangeEvent], Double) => T
  ): TextDocumentsConfiguration[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction4(create), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[TextDocumentsConfiguration[T]]
  }
  @scala.inline
  implicit class TextDocumentsConfigurationOps[Self <: TextDocumentsConfiguration[_], T] (val x: Self with TextDocumentsConfiguration[T]) extends AnyVal {
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
    def setCreate(value: (String, String, Double, String) => T): Self = this.set("create", js.Any.fromFunction4(value))
    @scala.inline
    def setUpdate(value: (T, js.Array[TextDocumentContentChangeEvent], Double) => T): Self = this.set("update", js.Any.fromFunction3(value))
  }
  
}

