package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

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
  var reason: TextDocumentSaveReason
}

object TextDocumentWillSaveEvent {
  @scala.inline
  def apply(document: TextDocument, reason: TextDocumentSaveReason): TextDocumentWillSaveEvent = {
    val __obj = js.Dynamic.literal(document = document, reason = reason)
  
    __obj.asInstanceOf[TextDocumentWillSaveEvent]
  }
}

