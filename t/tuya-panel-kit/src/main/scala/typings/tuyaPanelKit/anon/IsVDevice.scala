package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsVDevice extends js.Object {
  
  var isVDevice: Boolean = js.native
}
object IsVDevice {
  
  @scala.inline
  def apply(isVDevice: Boolean): IsVDevice = {
    val __obj = js.Dynamic.literal(isVDevice = isVDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVDevice]
  }
  
  @scala.inline
  implicit class IsVDeviceOps[Self <: IsVDevice] (val x: Self) extends AnyVal {
    
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
    def setIsVDevice(value: Boolean): Self = this.set("isVDevice", value.asInstanceOf[js.Any])
  }
}
