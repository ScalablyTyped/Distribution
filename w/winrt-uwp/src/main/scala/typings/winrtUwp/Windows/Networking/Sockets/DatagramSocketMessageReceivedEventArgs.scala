package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a MessageReceived event on a DatagramSocket . */
@js.native
trait DatagramSocketMessageReceivedEventArgs extends js.Object {
  /** Gets the local IP address associated with a DatagramSocket when a message was received. */
  var localAddress: HostName = js.native
  /** Gets the IP address of the remote sender of the datagram on the DatagramSocket when a message is received. */
  var remoteAddress: HostName = js.native
  /** Gets the UDP port number of the remote sender of the datagram received on the DatagramSocket . */
  var remotePort: String = js.native
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    * @return A DataReader object to read incoming data received from the remote network destination on a DatagramSocket object.
    */
  def getDataReader(): DataReader = js.native
  /**
    * Gets an IInputStream object that represents a sequential stream of bytes to be read as a message from the remote network destination on a DatagramSocket object.
    * @return An IInputStream object that represents a sequential stream of bytes to be read as a message.
    */
  def getDataStream(): IInputStream = js.native
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
  @scala.inline
  implicit class DatagramSocketMessageReceivedEventArgsOps[Self <: DatagramSocketMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDataReader(value: () => DataReader): Self = this.set("getDataReader", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDataStream(value: () => IInputStream): Self = this.set("getDataStream", js.Any.fromFunction0(value))
    @scala.inline
    def setLocalAddress(value: HostName): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteAddress(value: HostName): Self = this.set("remoteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemotePort(value: String): Self = this.set("remotePort", value.asInstanceOf[js.Any])
  }
  
}

