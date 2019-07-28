package typings.websocket.websocketMod

import typings.node.Buffer
import typings.std.Error
import typings.websocket.websocketStrings.arraybuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait w3cwebsocket extends js.Object {
  var CLOSED: Double = js.native
  var CLOSING: Double = js.native
  var CONNECTING: Double = js.native
  var OPEN: Double = js.native
  var binaryType: arraybuffer = js.native
  var bufferedAmount: Double = js.native
  var extensions: js.Array[IExtension] = js.native
  var protocol: js.UndefOr[String] = js.native
  var readyState: Double = js.native
  var url: String = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def onclose(): Unit = js.native
  def onerror(error: Error): Unit = js.native
  def onmessage(message: js.Any): Unit = js.native
  def onopen(): Unit = js.native
  def send(data: Buffer): Unit = js.native
  def send(data: IStringified): Unit = js.native
}

