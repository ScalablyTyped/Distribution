package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports network communication that allows reading and writing streams using a WebSocket. */
@js.native
trait StreamWebSocket extends js.Object {
  /** Gets socket control data on a StreamWebSocket object. */
  var control: StreamWebSocketControl = js.native
  /** Gets socket information on a StreamWebSocket object. */
  var information: StreamWebSocketInformation = js.native
  /** Gets the input stream to read from the remote destination on a StreamWebSocket object. */
  var inputStream: IInputStream = js.native
  /** Occurs when a close frame is received on the StreamWebSocket object as part of the close handshake. */
  @JSName("onclosed")
  var onclosed_Original: TypedEventHandler[IWebSocket, WebSocketClosedEventArgs] = js.native
  /** Gets the output stream to write to the remote network destination on a StreamWebSocket object. */
  var outputStream: IOutputStream = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(`type`: closed, listener: TypedEventHandler[IWebSocket, WebSocketClosedEventArgs]): Unit = js.native
  /** Closes the StreamWebSocket and sends an empty close frame to the server. */
  def close(): Unit = js.native
  /**
    * Closes the StreamWebSocket and indicates a reason for the closure.
    * @param code Status code indicating the reason for closure.
    * @param reason Optional UTF-8-encoded data with additional information about the closure.
    */
  def close(code: Double, reason: String): Unit = js.native
  /**
    * Starts an asynchronous operation to connect to a remote network destination on a StreamWebSocket object.
    * @param uri An absolute Uri for the server to connect to.
    * @return An asynchronous connect operation on a StreamWebSocket object.
    */
  def connectAsync(uri: Uri): IPromiseWithIAsyncAction = js.native
  /** Occurs when a close frame is received on the StreamWebSocket object as part of the close handshake. */
  def onclosed(ev: WebSocketClosedEventArgs with WinRTEvent[IWebSocket]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(`type`: closed, listener: TypedEventHandler[IWebSocket, WebSocketClosedEventArgs]): Unit = js.native
  /**
    * Adds an HTTP request header to the HTTP request message used in the WebSocket protocol handshake by the StreamWebSocket object.
    * @param headerName The name of the request header.
    * @param headerValue The value of the request header.
    */
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

