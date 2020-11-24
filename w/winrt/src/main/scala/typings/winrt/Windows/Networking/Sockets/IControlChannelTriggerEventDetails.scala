package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControlChannelTriggerEventDetails extends js.Object {
  
  var controlChannelTrigger: ControlChannelTrigger = js.native
}
object IControlChannelTriggerEventDetails {
  
  @scala.inline
  def apply(controlChannelTrigger: ControlChannelTrigger): IControlChannelTriggerEventDetails = {
    val __obj = js.Dynamic.literal(controlChannelTrigger = controlChannelTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlChannelTriggerEventDetails]
  }
  
  @scala.inline
  implicit class IControlChannelTriggerEventDetailsOps[Self <: IControlChannelTriggerEventDetails] (val x: Self) extends AnyVal {
    
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
    def setControlChannelTrigger(value: ControlChannelTrigger): Self = this.set("controlChannelTrigger", value.asInstanceOf[js.Any])
  }
}
