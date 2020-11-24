package typings.three.webXRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var XR: js.UndefOr[Constructor[typings.three.webXRMod.XR]] = js.native
  
  var XRSession: js.UndefOr[Constructor[typings.three.webXRMod.XRSession]] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setXR(value: Constructor[XR]): Self = this.set("XR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXR: Self = this.set("XR", js.undefined)
    
    @scala.inline
    def setXRSession(value: Constructor[XRSession]): Self = this.set("XRSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXRSession: Self = this.set("XRSession", js.undefined)
  }
}
