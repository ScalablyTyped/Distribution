package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSelector extends js.Object {
  
  var documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector = js.native
}
object DocumentSelector {
  
  @scala.inline
  def apply(documentSelector: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): DocumentSelector = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelector]
  }
  
  @scala.inline
  implicit class DocumentSelectorOps[Self <: DocumentSelector] (val x: Self) extends AnyVal {
    
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
    def setDocumentSelectorVarargs(value: (String | DocumentFilter)*): Self = this.set("documentSelector", js.Array(value :_*))
    
    @scala.inline
    def setDocumentSelector(value: typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): Self = this.set("documentSelector", value.asInstanceOf[js.Any])
  }
}
