package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a MessageReceived event on a DatagramSocket . */
trait DatagramSocketMessageReceivedEventArgs extends js.Object {
  /** Gets the local IP address associated with a DatagramSocket when a message was received. */
  var localAddress: HostName
  /** Gets the IP address of the remote sender of the datagram on the DatagramSocket when a message is received. */
  var remoteAddress: HostName
  /** Gets the UDP port number of the remote sender of the datagram received on the DatagramSocket . */
  var remotePort: String
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    * @return A DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    */
  def getDataReader(): DataReader
  /**
    * Gets an IInputStream object that represents a sequential stream of bytes to be read as a message from the remote network destination on a DatagramSocket object.
    * @return An IInputStream object that represents a sequential stream of bytes to be read as a message.
    */
  def getDataStream(): IInputStream
}

object DatagramSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(
    getDataReader: () => DataReader,
    getDataStream: () => IInputStream,
    localAddress: HostName,
    remoteAddress: HostName,
    remotePort: String
  ): DatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), localAddress = localAddress.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatagramSocketMessageReceivedEventArgs]
  }
}

