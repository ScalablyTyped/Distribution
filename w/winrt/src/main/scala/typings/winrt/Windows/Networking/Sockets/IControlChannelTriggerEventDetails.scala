package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlChannelTriggerEventDetails extends js.Object {
  var controlChannelTrigger: ControlChannelTrigger
}

object IControlChannelTriggerEventDetails {
  @scala.inline
  def apply(controlChannelTrigger: ControlChannelTrigger): IControlChannelTriggerEventDetails = {
    val __obj = js.Dynamic.literal(controlChannelTrigger = controlChannelTrigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IControlChannelTriggerEventDetails]
  }
}

