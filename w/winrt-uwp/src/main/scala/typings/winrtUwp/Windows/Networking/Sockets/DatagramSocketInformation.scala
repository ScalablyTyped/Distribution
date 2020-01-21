package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket information on a DatagramSocket object. */
@JSGlobal("Windows.Networking.Sockets.DatagramSocketInformation")
@js.native
abstract class DatagramSocketInformation () extends js.Object {
  /** The local IP address associated with a DatagramSocket object. */
  var localAddress: HostName = js.native
  /** The local service name or UDP port number associated with a DatagramSocket . */
  var localPort: String = js.native
  /** The IP address of the remote network destination associated with a DatagramSocket object. */
  var remoteAddress: HostName = js.native
  /** The UDP port number of the remote network destination associated with a DatagramSocket object. */
  var remotePort: String = js.native
}

