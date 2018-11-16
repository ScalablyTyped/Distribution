package typings
package websocketDashAsyncLib.websocketDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketClient extends js.Object {
  var _closeEvent: stdLib.CloseEvent | scala.Null = js.native
  var _receiveCallbacksQueue: js.Array[websocketDashAsyncLib.Anon_Reject] = js.native
  var _receiveDataQueue: js.Array[_] = js.native
  var _socket: stdLib.WebSocket = js.native
  /**
       * Resets the receive arrays and close events, called in the constructor
       */
  /* private */ def _reset(): scala.Unit = js.native
  /**
       * Sets up the event listeners, which do the bulk of the work.
       */
  /* private */ def _setupListenersOnConnect(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Sets up a WebSocket connection to specified url. Resolves when the
       * connection is established. Can be called again to reconnect to any url.
       */
  def connect(url: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Sets up a WebSocket connection to specified url. Resolves when the
       * connection is established. Can be called again to reconnect to any url.
       */
  def connect(url: java.lang.String, protocols: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Whether a connection is currently open.
       * @returns true if the connection is open.
       */
  def connected(): scala.Boolean = js.native
  /**
       * The number of messages available to receive.
       * @returns The number of queued messages that can be retrieved with {@link #receive}
       */
  def dataAvailable(): scala.Double = js.native
  /**
       * Initiates the close handshake if there is an active connection.
       * Returns a promise that will never reject.
       * The promise resolves once the WebSocket connection is closed.
       */
  def disconnect(): stdLib.Promise[stdLib.CloseEvent | scala.Null] = js.native
  /**
       * Initiates the close handshake if there is an active connection.
       * Returns a promise that will never reject.
       * The promise resolves once the WebSocket connection is closed.
       */
  def disconnect(code: scala.Double): stdLib.Promise[stdLib.CloseEvent | scala.Null] = js.native
  /**
       * Initiates the close handshake if there is an active connection.
       * Returns a promise that will never reject.
       * The promise resolves once the WebSocket connection is closed.
       */
  def disconnect(code: scala.Double, reason: java.lang.String): stdLib.Promise[stdLib.CloseEvent | scala.Null] = js.native
  /**
       * Asynchronously receive data from the websocket.
       * Resolves immediately if there is buffered, unreceived data.
       * Otherwise, resolves with the next rececived message,
       * or rejects if disconnected.
       * @returns A promise that resolves with the data received.
       */
  def receive(): stdLib.Promise[_] = js.native
  /**
       * Send data through the websocket.
       * Must be connected. See {@link #connected}.
       */
  def send(data: js.Any): scala.Unit = js.native
}

