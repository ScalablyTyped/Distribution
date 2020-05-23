package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentsConfiguration[T] extends js.Object {
  def create(uri: String, languageId: String, version: Double, content: String): T
  def update(document: T, changes: js.Array[TextDocumentContentChangeEvent], version: Double): T
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
}

