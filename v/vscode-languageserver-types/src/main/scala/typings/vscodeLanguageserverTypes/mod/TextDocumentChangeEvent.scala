package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentChangeEvent extends js.Object {
  /**
    * The document that has changed.
    */
  var document: TextDocument = js.native
}

object TextDocumentChangeEvent {
  @scala.inline
  def apply(document: TextDocument): TextDocumentChangeEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeEvent]
  }
  @scala.inline
  implicit class TextDocumentChangeEventOps[Self <: TextDocumentChangeEvent] (val x: Self) extends AnyVal {
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
    def setDocument(value: TextDocument): Self = this.set("document", value.asInstanceOf[js.Any])
  }
  
}

