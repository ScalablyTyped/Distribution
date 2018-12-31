package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a MessageReceived event on a DatagramSocket . */
@JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
@js.native
abstract class DatagramSocketMessageReceivedEventArgs () extends js.Object {
  /** Gets the local IP address associated with a DatagramSocket when a message was received. */
  var localAddress: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** Gets the IP address of the remote sender of the datagram on the DatagramSocket when a message is received. */
  var remoteAddress: winrtDashUwpLib.WindowsNs.NetworkingNs.HostName = js.native
  /** Gets the UDP port number of the remote sender of the datagram received on the DatagramSocket . */
  var remotePort: java.lang.String = js.native
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    * @return A DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    */
  def getDataReader(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.DataReader = js.native
  /**
    * Gets an IInputStream object that represents a sequential stream of bytes to be read as a message from the remote network destination on a DatagramSocket object.
    * @return An IInputStream object that represents a sequential stream of bytes to be read as a message.
    */
  def getDataStream(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
}

