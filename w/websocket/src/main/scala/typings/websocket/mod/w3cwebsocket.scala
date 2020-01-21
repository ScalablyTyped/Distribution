package typings.websocket.mod

import typings.node.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Error
import typings.websocket.websocketStrings.arraybuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket", "w3cwebsocket")
@js.native
class w3cwebsocket protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, protocols: String) = this()
  def this(url: String, protocols: js.Array[String]) = this()
  def this(url: String, protocols: String, origin: String) = this()
  def this(url: String, protocols: js.Array[String], origin: String) = this()
  def this(url: String, protocols: String, origin: String, headers: OutgoingHttpHeaders) = this()
  def this(url: String, protocols: js.Array[String], origin: String, headers: OutgoingHttpHeaders) = this()
  def this(
    url: String,
    protocols: String,
    origin: String,
    headers: OutgoingHttpHeaders,
    requestOptions: js.Object
  ) = this()
  def this(
    url: String,
    protocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders,
    requestOptions: js.Object
  ) = this()
  def this(
    url: String,
    protocols: String,
    origin: String,
    headers: OutgoingHttpHeaders,
    requestOptions: js.Object,
    IClientConfig: IClientConfig
  ) = this()
  def this(
    url: String,
    protocols: js.Array[String],
    origin: String,
    headers: OutgoingHttpHeaders,
    requestOptions: js.Object,
    IClientConfig: IClientConfig
  ) = this()
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
  var _binaryType: arraybuffer = js.native
  var _bufferedAmount: Double = js.native
  var _client: client = js.native
  var _connection: js.UndefOr[connection] = js.native
  var _extensions: js.Array[IExtension] = js.native
  var _protocol: js.UndefOr[String] = js.native
  var _readyState: Double = js.native
  var _url: String = js.native
  var binaryType: arraybuffer = js.native
  var bufferedAmount: Double = js.native
  var extensions: js.Array[IExtension] = js.native
  var protocol: js.UndefOr[String] = js.native
  var readyState: Double = js.native
  var url: String = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def onclose(event: ICloseEvent): Unit = js.native
  def onerror(error: Error): Unit = js.native
  def onmessage(message: IMessageEvent): Unit = js.native
  def onopen(): Unit = js.native
  def send(data: Buffer): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: IStringified): Unit = js.native
}

/* static members */
@JSImport("websocket", "w3cwebsocket")
@js.native
object w3cwebsocket extends js.Object {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
}

