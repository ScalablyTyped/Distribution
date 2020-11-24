package typings.vscodeLanguageserverProtocol.protocolImplementationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImplementationClientCapabilities extends js.Object {
  
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `ImplementationRegistrationOptions` return value
    * for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The client supports additional metadata in the form of definition links.
    *
    * Since 3.14.0
    */
  var linkSupport: js.UndefOr[Boolean] = js.native
}
object ImplementationClientCapabilities {
  
  @scala.inline
  def apply(): ImplementationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImplementationClientCapabilities]
  }
  
  @scala.inline
  implicit class ImplementationClientCapabilitiesOps[Self <: ImplementationClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
    
    @scala.inline
    def setLinkSupport(value: Boolean): Self = this.set("linkSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkSupport: Self = this.set("linkSupport", js.undefined)
  }
}
