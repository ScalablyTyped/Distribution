package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

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
  var onclosed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IWebSocket, WebSocketClosedEventArgs] = js.native
  /** An event that indicates that a message was received on the MessageWebSocket object. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MessageWebSocket, MessageWebSocketMessageReceivedEventArgs] = js.native
  /** Gets the output stream to write to the remote network destination on a MessageWebSocket object. */
  var outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IWebSocket, WebSocketClosedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MessageWebSocket, MessageWebSocketMessageReceivedEventArgs]
  ): scala.Unit = js.native
  /** Closes the MessageWebSocket object and sends an empty close frame to the server. */
  def close(): scala.Unit = js.native
  /**
    * Closes the MessageWebSocket object and indicates a reason for the closure.
    * @param code Status code indicating the reason for closure.
    * @param reason Optional UTF-8-encoded data with additional information about the closure.
    */
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  /**
    * Starts an asynchronous operation to connect to a remote network destination on a MessageWebSocket object.
    * @param uri An absolute Uri for the server to connect to.
    * @return An asynchronous connect operation on a MessageWebSocket object.
    */
  def connectAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when a close frame is received on the MessageWebSocket object as part of the close handshake. */
  def onclosed(ev: WebSocketClosedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[IWebSocket]): scala.Unit = js.native
  /** An event that indicates that a message was received on the MessageWebSocket object. */
  def onmessagereceived(
    ev: MessageWebSocketMessageReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MessageWebSocket]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.closed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IWebSocket, WebSocketClosedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MessageWebSocket, MessageWebSocketMessageReceivedEventArgs]
  ): scala.Unit = js.native
  /**
    * Adds an HTTP request header to the HTTP request message used in the WebSocket protocol handshake by the MessageWebSocket object.
    * @param headerName The name of the request header.
    * @param headerValue The value of the request header.
    */
  def setRequestHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
}

