package typings.websocket.mod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.Url
import typings.std.Error
import typings.websocket.websocketStrings.connect
import typings.websocket.websocketStrings.connectFailed
import typings.websocket.websocketStrings.httpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("websocket", "client")
@js.native
class client () extends EventEmitter {
  def this(ClientConfig: IClientConfig) = this()
  
  /**
    * Will cancel an in-progress connection request before either the `connect` event or the `connectFailed` event has been emitted.
    * If the `connect` or `connectFailed` event has already been emitted, calling `abort()` will do nothing.
    */
  def abort(): Unit = js.native
  
  @JSName("addListener")
  def addListener_connect(event: connect, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connectFailed(event: connectFailed, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_httpResponse(
    event: httpResponse,
    cb: js.Function2[/* response */ IncomingMessage, /* client */ this.type, Unit]
  ): this.type = js.native
  
  def connect(requestUrl: String): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, requestedProtocols: js.UndefOr[scala.Nothing], origin: String): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: String,
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: String,
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, requestedProtocols: String): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: String,
    origin: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: String,
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: String,
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, requestedProtocols: String, origin: String): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: String,
    origin: String,
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, requestedProtocols: String, origin: String, headers: OutgoingHttpHeaders): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: String,
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, requestedProtocols: js.Array[String]): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.Array[String],
    origin: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.Array[String],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.Array[String],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: String, requestedProtocols: js.Array[String], origin: String): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.Array[String],
    origin: String,
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: String,
    requestedProtocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  /**
    * Establish a connection. The remote server will select the best subprotocol that
    * it supports and send that back when establishing the connection.
    *
    * @param requestUrl should be a standard websocket url
    * @param [requestedProtocols] list of subprotocols supported by the client.
    *     The remote server will select the best subprotocol that it supports and send that back when establishing the connection.
    * @param [origin] Used in user-agent scenarios to identify the page containing
    *     any scripting content that caused the connection to be requested.
    * @param [headers] additional arbitrary HTTP request headers to send along with the request.
    *     This may be used to pass things like access tokens, etc. so that the server can verify authentication/authorization
    *     before deciding to accept and open the full WebSocket connection.
    * @param [extraRequestOptions] additional configuration options to be passed to `http.request` or `https.request`.
    *     This can be used to pass a custom `agent` to enable `client` usage from behind an HTTP or HTTPS proxy server
    *     using {@link https://github.com/koichik/node-tunnel|koichik/node-tunnel} or similar.
    * @example client.connect('ws://www.mygreatapp.com:1234/websocketapp/')
    */
  def connect(requestUrl: Url): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, requestedProtocols: js.UndefOr[scala.Nothing], origin: String): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: String,
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: String,
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.UndefOr[scala.Nothing],
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, requestedProtocols: String): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: String,
    origin: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: String,
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: String,
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, requestedProtocols: String, origin: String): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: String,
    origin: String,
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, requestedProtocols: String, origin: String, headers: OutgoingHttpHeaders): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: String,
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, requestedProtocols: js.Array[String]): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.Array[String],
    origin: js.UndefOr[scala.Nothing],
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.Array[String],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.Array[String],
    origin: js.UndefOr[scala.Nothing],
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(requestUrl: Url, requestedProtocols: js.Array[String], origin: String): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.Array[String],
    origin: String,
    headers: js.UndefOr[scala.Nothing],
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders
  ): Unit = js.native
  def connect(
    requestUrl: Url,
    requestedProtocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders,
    extraRequestOptions: RequestOptions
  ): Unit = js.native
  
  // Events
  @JSName("on")
  def on_connect(event: connect, cb: js.Function1[/* connection */ connection, Unit]): this.type = js.native
  @JSName("on")
  def on_connectFailed(event: connectFailed, cb: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_httpResponse(
    event: httpResponse,
    cb: js.Function2[/* response */ IncomingMessage, /* client */ this.type, Unit]
  ): this.type = js.native
}
