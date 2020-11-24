package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`1`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`2`
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentWillSaveEvent extends js.Object {
  
  /**
    * The document that will be saved
    */
  var document: TextDocument = js.native
  
  /**
    * The reason why save was triggered.
    */
  var reason: `1` | `2` | `3` = js.native
}
object TextDocumentWillSaveEvent {
  
  @scala.inline
  def apply(document: TextDocument, reason: `1` | `2` | `3`): TextDocumentWillSaveEvent = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentWillSaveEvent]
  }
  
  @scala.inline
  implicit class TextDocumentWillSaveEventOps[Self <: TextDocumentWillSaveEvent] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setReason(value: `1` | `2` | `3`): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
