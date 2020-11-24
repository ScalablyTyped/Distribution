package typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRangeClientCapabilities extends js.Object {
  
  /**
    * Whether implementation supports dynamic registration for selection range providers. If this is set to `true`
    * the client supports the new `SelectionRangeRegistrationOptions` return value for the corresponding server
    * capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object SelectionRangeClientCapabilities {
  
  @scala.inline
  def apply(): SelectionRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionRangeClientCapabilities]
  }
  
  @scala.inline
  implicit class SelectionRangeClientCapabilitiesOps[Self <: SelectionRangeClientCapabilities] (val x: Self) extends AnyVal {
    
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
  }
}
