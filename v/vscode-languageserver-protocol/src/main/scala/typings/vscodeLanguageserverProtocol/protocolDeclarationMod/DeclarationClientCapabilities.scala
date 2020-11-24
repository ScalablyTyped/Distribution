package typings.vscodeLanguageserverProtocol.protocolDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationClientCapabilities extends js.Object {
  
  /**
    * Whether declaration supports dynamic registration. If this is set to `true`
    * the client supports the new `DeclarationRegistrationOptions` return value
    * for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The client supports additional metadata in the form of declaration links.
    */
  var linkSupport: js.UndefOr[Boolean] = js.native
}
object DeclarationClientCapabilities {
  
  @scala.inline
  def apply(): DeclarationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationClientCapabilities]
  }
  
  @scala.inline
  implicit class DeclarationClientCapabilitiesOps[Self <: DeclarationClientCapabilities] (val x: Self) extends AnyVal {
    
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
