package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a radio state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioStateChange")
@js.native
abstract class MobileBroadbandRadioStateChange () extends js.Object {
  /** Gets the device ID of the device whose radio state changed. */
  var deviceId: java.lang.String = js.native
  /** Gets the new state of the radio. */
  var radioState: MobileBroadbandRadioState = js.native
}

