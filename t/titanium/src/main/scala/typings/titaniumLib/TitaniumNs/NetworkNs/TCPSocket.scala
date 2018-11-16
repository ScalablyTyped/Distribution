package typings
package titaniumLib.TitaniumNs.NetworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The TCPSocket instance returned from <Titanium.Network.createTCPSocket>.  This object
		 * represents a socket which either listens locally on the device for connections,
		 * or connects to a remote machine.
		 */
@js.native
trait TCPSocket
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * the host name to connect to.  Must be <Titanium.Network.INADDR_ANY> or an identifier for the local device in order to listen
  			 */
  var hostName: java.lang.String = js.native
  /**
  			 * whether or not the socket is valid
  			 */
  var isValid: scala.Boolean = js.native
  /**
  			 * the socket's mode
  			 */
  var mode: scala.Double = js.native
  /**
  			 * the port to connect/listen on
  			 */
  var port: scala.Double = js.native
  /**
  			 * strip terminating null character when sending string data; default is false
  			 */
  var stripTerminator: scala.Boolean = js.native
  /**
  			 * close the socket
  			 */
  def close(): scala.Unit = js.native
  /**
  			 * connect the scocket to a TCP server
  			 */
  def connect(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.hostName> property.
  			 */
  def getHostName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.isValid> property.
  			 */
  def getIsValid(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.mode> property.
  			 */
  def getMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.port> property.
  			 */
  def getPort(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.stripTerminator> property.
  			 */
  def getStripTerminator(): scala.Boolean = js.native
  /**
  			 * set up the socket to receive connections
  			 */
  def listen(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.hostName> property.
  			 */
  def setHostName(hostName: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.isValid> property.
  			 */
  def setIsValid(isValid: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.mode> property.
  			 */
  def setMode(mode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.port> property.
  			 */
  def setPort(port: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.stripTerminator> property.
  			 */
  def setStripTerminator(stripTerminator: scala.Boolean): scala.Unit = js.native
  /**
  			 * write data to the socket, if the mode is WRITE_MODE or READ_WRITE_MODE
  			 */
  def write(data: java.lang.String, sendTo: scala.Double): scala.Unit = js.native
  /**
  			 * write data to the socket, if the mode is WRITE_MODE or READ_WRITE_MODE
  			 */
  def write(data: js.Any, sendTo: scala.Double): scala.Unit = js.native
}

