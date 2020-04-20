package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentChangeEvent extends js.Object {
  /**
    * The document that has changed.
    */
  var document: TextDocument
}

object TextDocumentChangeEvent {
  @scala.inline
  def apply(document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
}

