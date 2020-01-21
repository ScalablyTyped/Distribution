package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentWillSaveEvent extends js.Object {
  /**
    * The document that will be saved
    */
  var document: TextDocument
  /**
    * The reason why save was triggered.
    */
  var reason: `1` | `2` | `3`
}

object TextDocumentWillSaveEvent {
  @scala.inline
  def apply(document: TextDocument, reason: `1` | `2` | `3`): TextDocumentWillSaveEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextDocumentWillSaveEvent]
  }
}

