package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlChannelTriggerResetEventDetails extends js.Object {
  var hardwareSlotReset: scala.Boolean
  var resetReason: ControlChannelTriggerResetReason
  var softwareSlotReset: scala.Boolean
}

object IControlChannelTriggerResetEventDetails {
  @scala.inline
  def apply(
    hardwareSlotReset: scala.Boolean,
    resetReason: ControlChannelTriggerResetReason,
    softwareSlotReset: scala.Boolean
  ): IControlChannelTriggerResetEventDetails = {
    val __obj = js.Dynamic.literal(hardwareSlotReset = hardwareSlotReset, resetReason = resetReason, softwareSlotReset = softwareSlotReset)
  
    __obj.asInstanceOf[IControlChannelTriggerResetEventDetails]
  }
}

