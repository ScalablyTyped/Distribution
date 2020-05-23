package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies a peer. */
trait PeerInformation extends js.Object {
  /** Gets the device data included during device discovery. */
  var discoveryData: IBuffer
  /** Gets the display name of the peer. */
  var displayName: String
  /** Gets the hostname or IP address of the peer. */
  var hostName: HostName
  /** Gets the app id for the peer app. */
  var id: String
  /** Gets the service name or TCP port number of the peer. */
  var serviceName: String
}

object PeerInformation {
  @scala.inline
  def apply(discoveryData: IBuffer, displayName: String, hostName: HostName, id: String, serviceName: String): PeerInformation = {
    val __obj = js.Dynamic.literal(discoveryData = discoveryData.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInformation]
  }
}

