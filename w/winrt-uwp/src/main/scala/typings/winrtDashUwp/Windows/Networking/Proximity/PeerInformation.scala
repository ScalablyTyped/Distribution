package typings.winrtDashUwp.Windows.Networking.Proximity

import typings.winrtDashUwp.Windows.Networking.HostName
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies a peer. */
@JSGlobal("Windows.Networking.Proximity.PeerInformation")
@js.native
abstract class PeerInformation () extends js.Object {
  /** Gets the device data included during device discovery. */
  var discoveryData: IBuffer = js.native
  /** Gets the display name of the peer. */
  var displayName: String = js.native
  /** Gets the hostname or IP address of the peer. */
  var hostName: HostName = js.native
  /** Gets the app id for the peer app. */
  var id: String = js.native
  /** Gets the service name or TCP port number of the peer. */
  var serviceName: String = js.native
}

