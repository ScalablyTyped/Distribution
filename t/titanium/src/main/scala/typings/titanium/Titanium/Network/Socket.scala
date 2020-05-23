package typings.titanium.Titanium.Network

import typings.titanium.AcceptDict
import typings.titanium.AcceptedCallbackArgs
import typings.titanium.ConnectedCallbackArgs
import typings.titanium.ErrorCallbackArgs
import typings.titanium.Titanium.IOStream
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
  trait TCP extends IOStream {
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
    def accepted(param0: AcceptedCallbackArgs): Unit = js.native
    /**
      * Attempts to connect the socket to its host/port.
      */
    def connect(): Unit = js.native
    /**
      * Callback to be fired when the socket enters the "connected" state.
      */
    def connected(param0: ConnectedCallbackArgs): Unit = js.native
    /**
      * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
      */
    def error(param0: ErrorCallbackArgs): Unit = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.accepted> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.accepted> instead.
      */
    def getAccepted(): js.Function1[/* param0 */ AcceptedCallbackArgs, Unit] = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.connected> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.connected> instead.
      */
    def getConnected(): js.Function1[/* param0 */ ConnectedCallbackArgs, Unit] = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.error> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.error> instead.
      */
    def getError(): js.Function1[/* param0 */ ErrorCallbackArgs, Unit] = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.host> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.host> instead.
      */
    def getHost(): String = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.listenQueueSize> instead.
      */
    def getListenQueueSize(): Double = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.port> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.port> instead.
      */
    def getPort(): Double = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.state> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.state> instead.
      */
    def getState(): Double = js.native
    /**
      * Gets the value of the <Titanium.Network.Socket.TCP.timeout> property.
      * @deprecated Access <Titanium.Network.Socket.TCP.timeout> instead.
      */
    def getTimeout(): Double = js.native
    /**
      * Attempts to start listening on the socket's host/port.
      */
    def listen(): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.accepted> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.accepted> instead.
      */
    def setAccepted(accepted: js.Function1[/* param0 */ AcceptedCallbackArgs, Unit]): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.connected> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.connected> instead.
      */
    def setConnected(connected: js.Function1[/* param0 */ ConnectedCallbackArgs, Unit]): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.error> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.error> instead.
      */
    def setError(error: js.Function1[/* param0 */ ErrorCallbackArgs, Unit]): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.host> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.host> instead.
      */
    def setHost(host: String): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.listenQueueSize> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.listenQueueSize> instead.
      */
    def setListenQueueSize(listenQueueSize: Double): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.port> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.port> instead.
      */
    def setPort(port: Double): Unit = js.native
    /**
      * Sets the value of the <Titanium.Network.Socket.TCP.timeout> property.
      * @deprecated Set the value using <Titanium.Network.Socket.TCP.timeout> instead.
      */
    def setTimeout(timeout: Double): Unit = js.native
  }
  
}

