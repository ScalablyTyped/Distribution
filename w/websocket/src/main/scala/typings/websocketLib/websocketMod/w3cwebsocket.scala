package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait w3cwebsocket extends js.Object {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
  var binaryType: websocketLib.websocketLibStrings.arraybuffer = js.native
  var bufferedAmount: scala.Double = js.native
  var extensions: js.Array[IExtension] = js.native
  var protocol: js.UndefOr[java.lang.String] = js.native
  var readyState: scala.Double = js.native
  var url: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  def onclose(): scala.Unit = js.native
  def onerror(error: stdLib.Error): scala.Unit = js.native
  def onmessage(message: js.Any): scala.Unit = js.native
  def onopen(): scala.Unit = js.native
  def send(data: nodeLib.Buffer): scala.Unit = js.native
  def send(data: IStringified): scala.Unit = js.native
}

