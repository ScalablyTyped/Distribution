package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait routerRequest
  extends nodeLib.eventsMod.EventEmitter {
  var cookies: js.Array[ICookie] = js.native
  /** A reference to the original Node HTTP request object */
  var httpRequest: nodeLib.httpMod.IncomingMessage = js.native
  /**
    * If the client is a web browser, origin will be a string containing the URL
    * of the page containing the script that opened the connection.
    * If the client is not a web browser, origin may be `null` or "*".
    */
  var origin: java.lang.String = js.native
  /**
    * Client's IP. If an `X-Forwarded-For` header is present, the value will be taken
    * from that header to facilitate WebSocket servers that live behind a reverse-proxy
    */
  var remoteAddress: java.lang.String = js.native
  /** An array containing a list of extensions requested by the client */
  var requestedExtensions: js.Array[_] = js.native
  /** A string containing the path that was requested by the client */
  var resource: java.lang.String = js.native
  /** Parsed resource, including the query string parameters */
  var resourceURL: nodeLib.urlMod.Url = js.native
  /** The version of the WebSocket protocol requested by the client */
  var webSocketVersion: scala.Double = js.native
  /**
    * After inspecting the `request` properties, call this function on the
    * request object to accept the connection. If you don't have a particular subprotocol
    * you wish to speak, you may pass `null` for the `acceptedProtocol` parameter.
    *
    * @param [acceptedProtocol] case-insensitive value that was requested by the client
    */
  def accept(): connection = js.native
  def accept(acceptedProtocol: java.lang.String): connection = js.native
  def accept(acceptedProtocol: java.lang.String, allowedOrigin: java.lang.String): connection = js.native
  def accept(acceptedProtocol: java.lang.String, allowedOrigin: java.lang.String, cookies: js.Array[ICookie]): connection = js.native
  def addListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_requestAccepted(
    event: websocketLib.websocketLibStrings.requestAccepted,
    cb: js.Function1[/* connection */ connection, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_requestRejected(event: websocketLib.websocketLibStrings.requestRejected, cb: js.Function0[scala.Unit]): this.type = js.native
  // Events
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_requestAccepted(
    event: websocketLib.websocketLibStrings.requestAccepted,
    cb: js.Function1[/* connection */ connection, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_requestRejected(event: websocketLib.websocketLibStrings.requestRejected, cb: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Reject connection.
    * You may optionally pass in an HTTP Status code (such as 404) and a textual
    * description that will be sent to the client in the form of an
    * `X-WebSocket-Reject-Reason` header.
    */
  def reject(): scala.Unit = js.native
  def reject(httpStatus: scala.Double): scala.Unit = js.native
  def reject(httpStatus: scala.Double, reason: java.lang.String): scala.Unit = js.native
}

