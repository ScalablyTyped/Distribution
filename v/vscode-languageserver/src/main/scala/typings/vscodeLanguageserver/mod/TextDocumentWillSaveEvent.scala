package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentWillSaveEvent[T] extends js.Object {
  /**
    * The document that will be saved
    */
  var document: T = js.native
  /**
    * The reason why save was triggered.
    */
  var reason: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason = js.native
}

object TextDocumentWillSaveEvent {
  @scala.inline
  def apply[T](document: T, reason: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason): TextDocumentWillSaveEvent[T] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentWillSaveEvent[T]]
  }
  @scala.inline
  implicit class TextDocumentWillSaveEventOps[Self <: TextDocumentWillSaveEvent[_], T] (val x: Self with TextDocumentWillSaveEvent[T]) extends AnyVal {
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
    def setDocument(value: T): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentSaveReason): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

