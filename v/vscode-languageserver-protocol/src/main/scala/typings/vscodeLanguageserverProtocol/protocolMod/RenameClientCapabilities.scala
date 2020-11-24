package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameClientCapabilities extends js.Object {
  
  /**
    * Whether rename supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * Client supports testing for validity of rename operations
    * before execution.
    *
    * @since version 3.12.0
    */
  var prepareSupport: js.UndefOr[Boolean] = js.native
}
object RenameClientCapabilities {
  
  @scala.inline
  def apply(): RenameClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameClientCapabilities]
  }
  
  @scala.inline
  implicit class RenameClientCapabilitiesOps[Self <: RenameClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setPrepareSupport(value: Boolean): Self = this.set("prepareSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepareSupport: Self = this.set("prepareSupport", js.undefined)
  }
}
