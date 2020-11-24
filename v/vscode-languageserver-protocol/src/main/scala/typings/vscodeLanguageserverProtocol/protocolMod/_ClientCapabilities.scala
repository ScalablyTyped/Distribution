package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _ClientCapabilities extends js.Object {
  
  /**
    * Experimental client capabilities.
    */
  var experimental: js.UndefOr[js.Object] = js.native
  
  /**
    * Text document specific client capabilities.
    */
  var textDocument: js.UndefOr[TextDocumentClientCapabilities] = js.native
  
  /**
    * Window specific client capabilities.
    */
  var window: js.UndefOr[js.Object] = js.native
  
  /**
    * Workspace specific client capabilities.
    */
  var workspace: js.UndefOr[WorkspaceClientCapabilities] = js.native
}
object _ClientCapabilities {
  
  @scala.inline
  def apply(): _ClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ClientCapabilities]
  }
  
  @scala.inline
  implicit class _ClientCapabilitiesOps[Self <: _ClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setExperimental(value: js.Object): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setTextDocument(value: TextDocumentClientCapabilities): Self = this.set("textDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDocument: Self = this.set("textDocument", js.undefined)
    
    @scala.inline
    def setWindow(value: js.Object): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
    
    @scala.inline
    def setWorkspace(value: WorkspaceClientCapabilities): Self = this.set("workspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspace: Self = this.set("workspace", js.undefined)
  }
}
