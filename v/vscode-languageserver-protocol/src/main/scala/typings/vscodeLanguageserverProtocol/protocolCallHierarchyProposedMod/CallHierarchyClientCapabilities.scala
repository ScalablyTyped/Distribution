package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.anon.CallHierarchy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyClientCapabilities extends js.Object {
  
  /**
    * The text document client capabilities
    */
  var textDocument: js.UndefOr[CallHierarchy] = js.native
}
object CallHierarchyClientCapabilities {
  
  @scala.inline
  def apply(): CallHierarchyClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallHierarchyClientCapabilities]
  }
  
  @scala.inline
  implicit class CallHierarchyClientCapabilitiesOps[Self <: CallHierarchyClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setTextDocument(value: CallHierarchy): Self = this.set("textDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDocument: Self = this.set("textDocument", js.undefined)
  }
}
