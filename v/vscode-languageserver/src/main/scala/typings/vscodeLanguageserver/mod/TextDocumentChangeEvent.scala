package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentChangeEvent[T] extends js.Object {
  /**
    * The document that has changed.
    */
  var document: T
}

object TextDocumentChangeEvent {
  @scala.inline
  def apply[T](document: T): TextDocumentChangeEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent[T]]
  }
}

