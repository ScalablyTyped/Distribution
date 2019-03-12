package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait connection
  extends nodeLib.eventsMod.EventEmitter {
  var assembleFragments: scala.Double = js.native
  var bufferList: IBufferList = js.native
  var bytesWaitingToFlush: scala.Double = js.native
  /**
    * After the connection is closed, contains a textual description of the reason for
    * the connection closure, or `null` if the connection is still open.
    */
  var closeDescription: java.lang.String = js.native
  /**
    * After the connection is closed, contains the numeric close reason status code,
    * or `-1` if the connection is still open.
    */
  var closeReasonCode: scala.Double = js.native
  var closeTimeout: scala.Double = js.native
  var config: IConfig = js.native
  /** Whether or not the connection is still connected. Read-only */
  var connected: scala.Boolean = js.native
  var currentFrame: frame = js.native
  /** An array of extensions that were negotiated for this connection */
  var extensions: js.Array[IExtension] = js.native
  var fragmentationSize: scala.Double = js.native
  var frameHeader: nodeLib.Buffer = js.native
  var frameQueue: js.Array[frame] = js.native
  var maskBytes: nodeLib.Buffer = js.native
  var maskOutgoingPackets: scala.Boolean = js.native
  var maxReceivedMessageSize: scala.Double = js.native
  var outputPaused: scala.Boolean = js.native
  /**
    * The subprotocol that was chosen to be spoken on this connection. This field
    * will have been converted to lower case.
    */
  var protocol: java.lang.String = js.native
  /**
    * The IP address of the remote peer as a string. In the case of a server,
    * the `X-Forwarded-For` header will be respected and preferred for the purposes
    * of populating this field. If you need to get to the actual remote IP address,
    * `socket.remoteAddress` will provide it.
    */
  var remoteAddress: java.lang.String = js.native
  var socket: nodeLib.netMod.Socket = js.native
  var socketHadError: scala.Boolean = js.native
  var state: java.lang.String = js.native
  var waitingForCloseResponse: scala.Boolean = js.native
  /** The version of the WebSocket protocol requested by the client */
  var webSocketVersion: scala.Double = js.native
  def addListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(
    event: websocketLib.websocketLibStrings.close,
    cb: js.Function2[/* code */ scala.Double, /* desc */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: websocketLib.websocketLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_frame(event: websocketLib.websocketLibStrings.frame, cb: js.Function1[/* frame */ frame, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: websocketLib.websocketLibStrings.message, cb: js.Function1[/* data */ IMessage, scala.Unit]): this.type = js.native
  def clearCloseTimer(): scala.Unit = js.native
  /**
    * Close the connection. A close frame will be sent to the remote peer indicating
    * that we wish to close the connection, and we will then wait for up to
    * `config.closeTimeout` milliseconds for an acknowledgment from the remote peer
    * before terminating the underlying socket connection.
    */
  def close(): scala.Unit = js.native
  /**
    * Send a close frame to the remote peer and immediately close the socket without
    * waiting for a response. This should generally be used only in error conditions.
    */
  def drop(): scala.Unit = js.native
  def drop(reasonCode: scala.Double): scala.Unit = js.native
  def drop(reasonCode: scala.Double, description: java.lang.String): scala.Unit = js.native
  def fragmentAndSend(frame: frame): scala.Unit = js.native
  def fragmentAndSend(frame: frame, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  // Events
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(
    event: websocketLib.websocketLibStrings.close,
    cb: js.Function2[/* code */ scala.Double, /* desc */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: websocketLib.websocketLibStrings.error,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_frame(event: websocketLib.websocketLibStrings.frame, cb: js.Function1[/* frame */ frame, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: websocketLib.websocketLibStrings.message, cb: js.Function1[/* data */ IMessage, scala.Unit]): this.type = js.native
  /** Sends a ping frame. Ping frames must not exceed 125 bytes in length. */
  def ping(data: nodeLib.Buffer): scala.Unit = js.native
  def ping(data: IStringified): scala.Unit = js.native
  /**
    * Sends a pong frame. Pong frames may be sent unsolicited and such pong frames will
    * trigger no action on the receiving peer. Pong frames sent in response to a ping
    * frame must mirror the payload data of the ping frame exactly.
    * The `connection` object handles this internally for you, so there should
    * be no need to use this method to respond to pings.
    * Pong frames must not exceed 125 bytes in length.
    */
  def pong(buffer: nodeLib.Buffer): scala.Unit = js.native
  def processFrame(frame: frame): scala.Unit = js.native
  /** Auto-detect the data type and send UTF-8 or Binary message */
  def send(data: nodeLib.Buffer): scala.Unit = js.native
  def send(data: IStringified): scala.Unit = js.native
  /**
    * Immediately sends the specified Node Buffer object as a Binary WebSocket message
    * to the remote peer. If config.fragmentOutgoingMessages is true the message may be
    * sent as multiple fragments if it exceeds config.fragmentationThreshold bytes.
    */
  def sendBytes(buffer: nodeLib.Buffer): scala.Unit = js.native
  def sendCloseFrame(): scala.Unit = js.native
  def sendCloseFrame(reasonCode: scala.Double, reasonText: java.lang.String, force: scala.Boolean): scala.Unit = js.native
  /**
    * Serializes a `frame` object into binary data and immediately sends it to
    * the remote peer. This is an advanced function, requiring you to manually compose
    * your own `frame`. You should probably use sendUTF or sendBytes instead.
    */
  def sendFrame(frame: frame): scala.Unit = js.native
  def sendFrame(frame: frame, cb: js.Function1[/* msg */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def sendFrame(frame: frame, force: scala.Boolean): scala.Unit = js.native
  def sendFrame(frame: frame, force: scala.Boolean, cb: js.Function1[/* msg */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Immediately sends the specified string as a UTF-8 WebSocket message to the remote
    * peer. If `config.fragmentOutgoingMessages` is true the message may be sent as
    * multiple fragments if it exceeds `config.fragmentationThreshold` bytes.
    */
  def sendUTF(data: IStringified): scala.Unit = js.native
  def setCloseTimer(): scala.Unit = js.native
  def setGracePeriodTimer(): scala.Unit = js.native
  /** Set or reset the `keepalive` timer when data is received */
  def setKeepaliveTimer(): scala.Unit = js.native
}

