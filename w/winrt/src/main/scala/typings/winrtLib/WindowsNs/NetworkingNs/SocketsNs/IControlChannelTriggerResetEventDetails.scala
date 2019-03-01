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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hardwareSlotReset")(hardwareSlotReset)
    __obj.updateDynamic("resetReason")(resetReason)
    __obj.updateDynamic("softwareSlotReset")(softwareSlotReset)
    __obj.asInstanceOf[IControlChannelTriggerResetEventDetails]
  }
}

