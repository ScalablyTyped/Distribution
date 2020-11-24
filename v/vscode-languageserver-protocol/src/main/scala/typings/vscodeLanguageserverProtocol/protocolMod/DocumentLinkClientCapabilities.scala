package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLinkClientCapabilities extends js.Object {
  
  /**
    * Whether document link supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the client support the `tooltip` property on `DocumentLink`.
    *
    * @since 3.15.0
    */
  var tooltipSupport: js.UndefOr[Boolean] = js.native
}
object DocumentLinkClientCapabilities {
  
  @scala.inline
  def apply(): DocumentLinkClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentLinkClientCapabilities]
  }
  
  @scala.inline
  implicit class DocumentLinkClientCapabilitiesOps[Self <: DocumentLinkClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setTooltipSupport(value: Boolean): Self = this.set("tooltipSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipSupport: Self = this.set("tooltipSupport", js.undefined)
  }
}
