package typings.winrtDashUwp.Windows.Networking.Sockets

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.closed
import typings.winrtDashUwp.winrtDashUwpStrings.messagereceived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports network communication that allows reading and writing whole messages using a WebSocket. */
@JSGlobal("Windows.Networking.Sockets.MessageWebSocket")
@js.native
/** Creates a new MessageWebSocket object. */
class MessageWebSocket () extends js.Object {
  /** Gets socket control data on a MessageWebSocket object. */
  var control: MessageWebSocketControl = js.native
  /** Gets socket information on a MessageWebSocket object. */
  var information: MessageWebSocketInformation = js.native
  /** Occurs when a close frame is received on the MessageWebSocket object as part of the close handshake. */
  @JSName("onclosed")
  var onclosed_Original: TypedEventHandler[IWebSocket, WebSocketClosedEventArgs] = js.native
  /** An event that indicates that a message was received on the MessageWebSocket object. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: TypedEventHandler[MessageWebSocket, MessageWebSocketMessageReceivedEventArgs] = js.native
  /** Gets the output stream to write to the remote network destination on a MessageWebSocket object. */
  var outputStream: IOutputStream = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(`type`: closed, listener: TypedEventHandler[IWebSocket, WebSocketClosedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[MessageWebSocket, MessageWebSocketMessageReceivedEventArgs]
  ): Unit = js.native
  /** Closes the MessageWebSocket object and sends an empty close frame to the server. */
  def close(): Unit = js.native
  /**
    * Closes the MessageWebSocket object and indicates a reason for the closure.
    * @param code Status code indicating the reason for closure.
    * @param reason Optional UTF-8-encoded data with additional information about the closure.
    */
  def close(code: Double, reason: String): Unit = js.native
  /**
    * Starts an asynchronous operation to connect to a remote network destination on a MessageWebSocket object.
    * @param uri An absolute Uri for the server to connect to.
    * @return An asynchronous connect operation on a MessageWebSocket object.
    */
  def connectAsync(uri: Uri): IPromiseWithIAsyncAction = js.native
  /** Occurs when a close frame is received on the MessageWebSocket object as part of the close handshake. */
  def onclosed(ev: WebSocketClosedEventArgs with WinRTEvent[IWebSocket]): Unit = js.native
  /** An event that indicates that a message was received on the MessageWebSocket object. */
  def onmessagereceived(ev: MessageWebSocketMessageReceivedEventArgs with WinRTEvent[MessageWebSocket]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(`type`: closed, listener: TypedEventHandler[IWebSocket, WebSocketClosedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: messagereceived,
    listener: TypedEventHandler[MessageWebSocket, MessageWebSocketMessageReceivedEventArgs]
  ): Unit = js.native
  /**
    * Adds an HTTP request header to the HTTP request message used in the WebSocket protocol handshake by the MessageWebSocket object.
    * @param headerName The name of the request header.
    * @param headerValue The value of the request header.
    */
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

