package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentWillSaveEvent[T] extends js.Object {
  /**
    * The document that will be saved
    */
  var document: T
  /**
    * The reason why save was triggered.
    */
  var reason: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason
}

object TextDocumentWillSaveEvent {
  @scala.inline
  def apply[T](document: T, reason: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason): TextDocumentWillSaveEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentWillSaveEvent[T]]
  }
}

