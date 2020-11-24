package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverClientCapabilities extends js.Object {
  
  /**
    * Client supports the follow content formats for the content
    * property. The order describes the preferred format of the client.
    */
  var contentFormat: js.UndefOr[js.Array[MarkupKind]] = js.native
  
  /**
    * Whether hover supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
}
object HoverClientCapabilities {
  
  @scala.inline
  def apply(): HoverClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverClientCapabilities]
  }
  
  @scala.inline
  implicit class HoverClientCapabilitiesOps[Self <: HoverClientCapabilities] (val x: Self) extends AnyVal {
    
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
    def setContentFormatVarargs(value: MarkupKind*): Self = this.set("contentFormat", js.Array(value :_*))
    
    @scala.inline
    def setContentFormat(value: js.Array[MarkupKind]): Self = this.set("contentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFormat: Self = this.set("contentFormat", js.undefined)
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = this.set("dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRegistration: Self = this.set("dynamicRegistration", js.undefined)
  }
}
