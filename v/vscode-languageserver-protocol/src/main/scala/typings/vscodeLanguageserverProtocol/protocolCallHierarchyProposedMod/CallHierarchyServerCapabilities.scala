package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyServerCapabilities extends js.Object {
  
  /**
    * The server provides Call Hierarchy support.
    */
  var callHierarchyProvider: js.UndefOr[
    Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions with StaticRegistrationOptions)
  ] = js.native
}
object CallHierarchyServerCapabilities {
  
  @scala.inline
  def apply(): CallHierarchyServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallHierarchyServerCapabilities]
  }
  
  @scala.inline
  implicit class CallHierarchyServerCapabilitiesOps[Self <: CallHierarchyServerCapabilities] (val x: Self) extends AnyVal {
    
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
    def setCallHierarchyProvider(
      value: Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions with StaticRegistrationOptions)
    ): Self = this.set("callHierarchyProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallHierarchyProvider: Self = this.set("callHierarchyProvider", js.undefined)
  }
}
