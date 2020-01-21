package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a PIN lock state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange")
@js.native
abstract class MobileBroadbandPinLockStateChange () extends js.Object {
  /** Gets the device identifier associated with a PIN lock state change. */
  var deviceId: String = js.native
  /** Gets a value representing the new PIN lock state after a PIN lock state change. */
  var pinLockState: MobileBroadbandPinLockState = js.native
  /** Gets a value representing the type of PIN involved in a PIN lock state change. */
  var pinType: MobileBroadbandPinType = js.native
}

