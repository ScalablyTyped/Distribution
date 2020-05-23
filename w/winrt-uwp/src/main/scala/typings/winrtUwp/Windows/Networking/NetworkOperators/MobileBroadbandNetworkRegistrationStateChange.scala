package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about one network registration state change. */
trait MobileBroadbandNetworkRegistrationStateChange extends js.Object {
  /** Gets the unique identifier of the device associated with a network registration state change. */
  var deviceId: String
  /** Gets an object which contains details about the network associated with this network state change. */
  var network: MobileBroadbandNetwork
}

object MobileBroadbandNetworkRegistrationStateChange {
  @scala.inline
  def apply(deviceId: String, network: MobileBroadbandNetwork): MobileBroadbandNetworkRegistrationStateChange = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChange]
  }
}

