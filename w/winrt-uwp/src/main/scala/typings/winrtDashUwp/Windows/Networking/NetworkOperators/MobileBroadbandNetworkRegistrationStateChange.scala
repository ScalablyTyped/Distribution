package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about one network registration state change. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChange")
@js.native
abstract class MobileBroadbandNetworkRegistrationStateChange () extends js.Object {
  /** Gets the unique identifier of the device associated with a network registration state change. */
  var deviceId: String = js.native
  /** Gets an object which contains details about the network associated with this network state change. */
  var network: MobileBroadbandNetwork = js.native
}

