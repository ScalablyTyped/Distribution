package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlChannelTriggerResetEventDetails extends js.Object {
  var hardwareSlotReset: Boolean
  var resetReason: ControlChannelTriggerResetReason
  var softwareSlotReset: Boolean
}

object IControlChannelTriggerResetEventDetails {
  @scala.inline
  def apply(
    hardwareSlotReset: Boolean,
    resetReason: ControlChannelTriggerResetReason,
    softwareSlotReset: Boolean
  ): IControlChannelTriggerResetEventDetails = {
    val __obj = js.Dynamic.literal(hardwareSlotReset = hardwareSlotReset, resetReason = resetReason, softwareSlotReset = softwareSlotReset)
  
    __obj.asInstanceOf[IControlChannelTriggerResetEventDetails]
  }
}

