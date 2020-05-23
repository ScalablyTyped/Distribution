package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a radio state change notification. */
trait MobileBroadbandRadioStateChange extends js.Object {
  /** Gets the device ID of the device whose radio state changed. */
  var deviceId: String
  /** Gets the new state of the radio. */
  var radioState: MobileBroadbandRadioState
}

object MobileBroadbandRadioStateChange {
  @scala.inline
  def apply(deviceId: String, radioState: MobileBroadbandRadioState): MobileBroadbandRadioStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], radioState = radioState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandRadioStateChange]
  }
}

