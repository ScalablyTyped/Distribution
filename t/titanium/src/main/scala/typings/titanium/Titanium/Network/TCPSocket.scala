package typings.titanium.Titanium.Network

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The TCPSocket instance returned from <Titanium.Network.createTCPSocket>.  This object
		 * represents a socket which either listens locally on the device for connections,
		 * or connects to a remote machine.
		 */
@js.native
trait TCPSocket extends Proxy {
  /**
  			 * the host name to connect to.  Must be <Titanium.Network.INADDR_ANY> or an identifier for the local device in order to listen
  			 */
  var hostName: String = js.native
  /**
  			 * whether or not the socket is valid
  			 */
  var isValid: Boolean = js.native
  /**
  			 * the socket's mode
  			 */
  var mode: Double = js.native
  /**
  			 * the port to connect/listen on
  			 */
  var port: Double = js.native
  /**
  			 * strip terminating null character when sending string data; default is false
  			 */
  var stripTerminator: Boolean = js.native
  /**
  			 * close the socket
  			 */
  def close(): Unit = js.native
  /**
  			 * connect the scocket to a TCP server
  			 */
  def connect(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.hostName> property.
  			 */
  def getHostName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.isValid> property.
  			 */
  def getIsValid(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.mode> property.
  			 */
  def getMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.port> property.
  			 */
  def getPort(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Network.TCPSocket.stripTerminator> property.
  			 */
  def getStripTerminator(): Boolean = js.native
  /**
  			 * set up the socket to receive connections
  			 */
  def listen(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.hostName> property.
  			 */
  def setHostName(hostName: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.isValid> property.
  			 */
  def setIsValid(isValid: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.mode> property.
  			 */
  def setMode(mode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.port> property.
  			 */
  def setPort(port: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.TCPSocket.stripTerminator> property.
  			 */
  def setStripTerminator(stripTerminator: Boolean): Unit = js.native
  /**
  			 * write data to the socket, if the mode is WRITE_MODE or READ_WRITE_MODE
  			 */
  def write(data: String, sendTo: Double): Unit = js.native
  /**
  			 * write data to the socket, if the mode is WRITE_MODE or READ_WRITE_MODE
  			 */
  def write(data: js.Any, sendTo: Double): Unit = js.native
}

