package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a PIN lock state change notification. */
trait MobileBroadbandPinLockStateChange extends js.Object {
  /** Gets the device identifier associated with a PIN lock state change. */
  var deviceId: String
  /** Gets a value representing the new PIN lock state after a PIN lock state change. */
  var pinLockState: MobileBroadbandPinLockState
  /** Gets a value representing the type of PIN involved in a PIN lock state change. */
  var pinType: MobileBroadbandPinType
}

object MobileBroadbandPinLockStateChange {
  @scala.inline
  def apply(deviceId: String, pinLockState: MobileBroadbandPinLockState, pinType: MobileBroadbandPinType): MobileBroadbandPinLockStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], pinLockState = pinLockState.asInstanceOf[js.Any], pinType = pinType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChange]
  }
}

