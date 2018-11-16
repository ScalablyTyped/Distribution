package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies a peer. */
@JSGlobal("Windows.Networking.Proximity.PeerInformation")
@js.native
abstract class PeerInformation () extends js.Object {
  /** Gets the device data included during device discovery. */
  var discoveryData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the display name of the peer. */
  var displayName: java.lang.String = js.native
  /** Gets the hostname or IP address of the peer. */
  var hostName: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** Gets the app id for the peer app. */
  var id: java.lang.String = js.native
  /** Gets the service name or TCP port number of the peer. */
  var serviceName: java.lang.String = js.native
}

