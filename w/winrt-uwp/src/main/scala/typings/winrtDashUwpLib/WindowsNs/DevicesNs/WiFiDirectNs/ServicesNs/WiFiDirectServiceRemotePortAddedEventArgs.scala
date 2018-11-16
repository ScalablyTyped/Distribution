package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returned when a WiFiDirectServiceSession.RemotePortAdded event is raised. Your event handler should use this information to establish new socket connections to the new port. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceRemotePortAddedEventArgs")
@js.native
abstract class WiFiDirectServiceRemotePortAddedEventArgs () extends js.Object {
  /** Gets the endpoint pairs associated with the new remote port. */
  var endpointPairs: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair] = js.native
  /** Gets the protocol used to communicate with the new remote port. */
  var protocol: WiFiDirectServiceIPProtocol = js.native
}

