package typings.titanium.Titanium.Network

import typings.titanium.AcceptDict
import typings.titanium.AcceptedCallbackArgs
import typings.titanium.ConnectedCallbackArgs
import typings.titanium.ErrorCallbackArgs
import typings.titanium.ReadCallbackArgs
import typings.titanium.Titanium.Buffer
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.WriteCallbackArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Socket module, used for creating sockets.
		 */
@JSGlobal("Titanium.Network.Socket")
@js.native
object Socket extends js.Object {
  /**
  			 * TCP socket that implements the `Titanium.IOStream` interface.
  			 */
  @js.native
  trait TCP extends Proxy {
    /**
    				 * The host to connect to or listen on.
    				 */
    var host: String = js.native
    /**
    				 * Max number of pending incoming connections to be allowed when the socket is in the [LISTENING](Titanium.Network.Socket.LISTENING) state.
    				 */
    var listenQueueSize: Double = js.native
    /**
    				 * The port to connect to or listen on.
    				 */
    var port: Double = js.native
    /**
    				 * Current state of the socket.
    				 */
    val state: Double = js.native
    /**
    				 * Timeout, in milliseconds, for `connect` and all `write` operations.
    				 */
    var timeout: Double = js.native
    /**
    				 * Tells a [LISTENING](Titanium.Network.Socket.LISTENING) socket to accept a connection request at the top of a listener's request queue when one becomes available.
    				 */
    def accept(options: AcceptDict): Unit = js.native
    /**
    				 * Callback to be fired when a listener accepts a connection.
    				 */
    def accepted(param0: AcceptedCallbackArgs): js.Any = js.native
    /**
    				 * Closes a socket.
    				 */
    def close(): Unit = js.native
    /**
    				 * Attempts to connect the socket to its host/port.
    				 */
    def connect(): Unit = js.native
    /**
    				 * Callback to be fired when the socket enters the "connected" state.
    				 */
    def connected(param0: ConnectedCallbackArgs): js.Any = js.native
    /**
    				 * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
    				 */
    def error(param0: ErrorCallbackArgs): js.Any = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.accepted> property.
    				 */
    def getAccepted(): js.Function1[/* param0 */ AcceptedCallbackArgs, _] = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.connected> property.
    				 */
    def getConnected(): js.Function1[/* param0 */ ConnectedCallbackArgs, _] = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.error> property.
    				 */
    def getError(): js.Function1[/* param0 */ ErrorCallbackArgs, _] = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.host> property.
    				 */
    def getHost(): String = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
    				 */
    def getListenQueueSize(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.port> property.
    				 */
    def getPort(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.state> property.
    				 */
    def getState(): Double = js.native
    /**
    				 * Gets the value of the <Titanium.Network.Socket.TCP.timeout> property.
    				 */
    def getTimeout(): Double = js.native
    /**
    				 * Indicates whether this stream is readable.
    				 */
    def isReadable(): Boolean = js.native
    /**
    				 * Indicates whether this stream is writable.
    				 */
    def isWritable(): Boolean = js.native
    /**
    				 * Attempts to start listening on the socket's host/port.
    				 */
    def listen(): Unit = js.native
    /**
    				 * Reads data from this stream into a buffer.
    				 */
    def read(buffer: Buffer): Double = js.native
    def read(buffer: Buffer, offset: Double): Double = js.native
    def read(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def read(
      buffer: Buffer,
      offset: Double,
      length: Double,
      resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, _]
    ): Double = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.accepted> property.
    				 */
    def setAccepted(accepted: js.Function1[/* param0 */ AcceptedCallbackArgs, _]): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.connected> property.
    				 */
    def setConnected(connected: js.Function1[/* param0 */ ConnectedCallbackArgs, _]): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.error> property.
    				 */
    def setError(error: js.Function1[/* param0 */ ErrorCallbackArgs, _]): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.host> property.
    				 */
    def setHost(host: String): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
    				 */
    def setListenQueueSize(listenQueueSize: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.port> property.
    				 */
    def setPort(port: Double): Unit = js.native
    /**
    				 * Sets the value of the <Titanium.Network.Socket.TCP.timeout> property.
    				 */
    def setTimeout(timeout: Double): Unit = js.native
    /**
    				 * Writes data from a buffer to this stream.
    				 */
    def write(buffer: Buffer): Double = js.native
    def write(buffer: Buffer, offset: Double): Double = js.native
    def write(buffer: Buffer, offset: Double, length: Double): Double = js.native
    def write(
      buffer: Buffer,
      offset: Double,
      length: Double,
      resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, _]
    ): Double = js.native
  }
  
  /**
  			 * State value representing a closed socket.
  			 */
  val CLOSED: Double = js.native
  /**
  			 * State value representing a connected socket.
  			 */
  val CONNECTED: Double = js.native
  /**
  			 * State value indicating an error has occurred on the socket.
  			 */
  val ERROR: Double = js.native
  /**
  			 * State value representing an initialized socket.
  			 */
  val INITIALIZED: Double = js.native
  /**
  			 * State value representing a socket that is listening for connections.
  			 */
  val LISTENING: Double = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: String = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: Boolean = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  			 * Returns a new TCP socket object.
  			 */
  def createTCP(): TCP = js.native
  def createTCP(params: js.Any): TCP = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Network.Socket.apiName> property.
  			 */
  def getApiName(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Network.Socket.bubbleParent> property.
  			 */
  def getBubbleParent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.Socket.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Network.Socket.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

