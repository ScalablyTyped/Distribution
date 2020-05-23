package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.EndpointPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
trait WiFiDirectServiceRemotePortAddedEventArgs extends js.Object {
  /** Gets the endpoint pairs associated with the new remote port. */
  var endpointPairs: IVectorView[EndpointPair]
  /** Gets the protocol used to communicate with the new remote port. */
  var protocol: WiFiDirectServiceIPProtocol
}

object WiFiDirectServiceRemotePortAddedEventArgs {
  @scala.inline
  def apply(endpointPairs: IVectorView[EndpointPair], protocol: WiFiDirectServiceIPProtocol): WiFiDirectServiceRemotePortAddedEventArgs = {
    val __obj = js.Dynamic.literal(endpointPairs = endpointPairs.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectServiceRemotePortAddedEventArgs]
  }
}

