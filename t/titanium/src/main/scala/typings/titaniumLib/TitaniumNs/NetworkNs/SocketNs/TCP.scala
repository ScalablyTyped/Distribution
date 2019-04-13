package typings
package titaniumLib.TitaniumNs.NetworkNs.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * TCP socket that implements the `Titanium.IOStream` interface.
			 */
@js.native
trait TCP
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The host to connect to or listen on.
  				 */
  var host: java.lang.String = js.native
  /**
  				 * Max number of pending incoming connections to be allowed when the socket is in the [LISTENING](Titanium.Network.Socket.LISTENING) state.
  				 */
  var listenQueueSize: scala.Double = js.native
  /**
  				 * The port to connect to or listen on.
  				 */
  var port: scala.Double = js.native
  /**
  				 * Current state of the socket.
  				 */
  val state: scala.Double = js.native
  /**
  				 * Timeout, in milliseconds, for `connect` and all `write` operations.
  				 */
  var timeout: scala.Double = js.native
  /**
  				 * Tells a [LISTENING](Titanium.Network.Socket.LISTENING) socket to accept a connection request at the top of a listener's request queue when one becomes available.
  				 */
  def accept(options: titaniumLib.AcceptDict): scala.Unit = js.native
  /**
  				 * Callback to be fired when a listener accepts a connection.
  				 */
  def accepted(param0: titaniumLib.AcceptedCallbackArgs): js.Any = js.native
  /**
  				 * Closes a socket.
  				 */
  def close(): scala.Unit = js.native
  /**
  				 * Attempts to connect the socket to its host/port.
  				 */
  def connect(): scala.Unit = js.native
  /**
  				 * Callback to be fired when the socket enters the "connected" state.
  				 */
  def connected(param0: titaniumLib.ConnectedCallbackArgs): js.Any = js.native
  /**
  				 * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  				 */
  def error(param0: titaniumLib.ErrorCallbackArgs): js.Any = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.accepted> property.
  				 */
  def getAccepted(): js.Function1[/* param0 */ titaniumLib.AcceptedCallbackArgs, _] = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.connected> property.
  				 */
  def getConnected(): js.Function1[/* param0 */ titaniumLib.ConnectedCallbackArgs, _] = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.error> property.
  				 */
  def getError(): js.Function1[/* param0 */ titaniumLib.ErrorCallbackArgs, _] = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.host> property.
  				 */
  def getHost(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
  				 */
  def getListenQueueSize(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.port> property.
  				 */
  def getPort(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.state> property.
  				 */
  def getState(): scala.Double = js.native
  /**
  				 * Gets the value of the <Titanium.Network.Socket.TCP.timeout> property.
  				 */
  def getTimeout(): scala.Double = js.native
  /**
  				 * Indicates whether this stream is readable.
  				 */
  def isReadable(): scala.Boolean = js.native
  /**
  				 * Indicates whether this stream is writable.
  				 */
  def isWritable(): scala.Boolean = js.native
  /**
  				 * Attempts to start listening on the socket's host/port.
  				 */
  def listen(): scala.Unit = js.native
  /**
  				 * Reads data from this stream into a buffer.
  				 */
  def read(buffer: titaniumLib.TitaniumNs.Buffer): scala.Double = js.native
  def read(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double): scala.Double = js.native
  def read(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def read(
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double,
    resultsCallback: js.Function1[/* param0 */ titaniumLib.ReadCallbackArgs, _]
  ): scala.Double = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.accepted> property.
  				 */
  def setAccepted(accepted: js.Function1[/* param0 */ titaniumLib.AcceptedCallbackArgs, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.connected> property.
  				 */
  def setConnected(connected: js.Function1[/* param0 */ titaniumLib.ConnectedCallbackArgs, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.error> property.
  				 */
  def setError(error: js.Function1[/* param0 */ titaniumLib.ErrorCallbackArgs, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.host> property.
  				 */
  def setHost(host: java.lang.String): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
  				 */
  def setListenQueueSize(listenQueueSize: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.port> property.
  				 */
  def setPort(port: scala.Double): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.Network.Socket.TCP.timeout> property.
  				 */
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
  /**
  				 * Writes data from a buffer to this stream.
  				 */
  def write(buffer: titaniumLib.TitaniumNs.Buffer): scala.Double = js.native
  def write(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double): scala.Double = js.native
  def write(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double,
    resultsCallback: js.Function1[/* param0 */ titaniumLib.WriteCallbackArgs, _]
  ): scala.Double = js.native
}

