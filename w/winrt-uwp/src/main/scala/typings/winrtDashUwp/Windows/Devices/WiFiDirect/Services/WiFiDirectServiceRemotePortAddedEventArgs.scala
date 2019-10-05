package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Networking.EndpointPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs")
@js.native
abstract class WiFiDirectServiceRemotePortAddedEventArgs () extends js.Object {
  /** Gets the endpoint pairs associated with the new remote port. */
  var endpointPairs: IVectorView[EndpointPair] = js.native
  /** Gets the protocol used to communicate with the new remote port. */
  var protocol: WiFiDirectServiceIPProtocol = js.native
}

