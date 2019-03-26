package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocket extends EventTarget {
  val CLOSED: scala.Double = js.native
  val CLOSING: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
  var binaryType: java.lang.String = js.native
  val bufferedAmount: scala.Double = js.native
  val extensions: java.lang.String = js.native
  val protocol: java.lang.String = js.native
  val readyState: scala.Double = js.native
  val url: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: tabrisLib.tabrisLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: tabrisLib.tabrisLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: tabrisLib.tabrisLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: tabrisLib.tabrisLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: tabrisLib.tabrisLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: tabrisLib.tabrisLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: tabrisLib.tabrisLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: tabrisLib.tabrisLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  def onclose(`this`: WebSocket, ev: CloseEvent): js.Any = js.native
  def onerror(`this`: WebSocket, ev: Event): js.Any = js.native
  def onmessage(`this`: WebSocket, ev: MessageEvent): js.Any = js.native
  def onopen(`this`: WebSocket, ev: Event): js.Any = js.native
  def send(data: js.Any): scala.Unit = js.native
}

@JSGlobal("WebSocket")
@js.native
class WebSocketCls protected () extends WebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
}

@JSGlobal("WebSocket")
@js.native
object WebSocket
  extends org.scalablytyped.runtime.Instantiable2[
      /* url */ java.lang.String, 
      (/* protocols */ js.Array[java.lang.String]) | (/* protocols */ java.lang.String), 
      WebSocket
    ]
     with org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, WebSocket] {
  val CLOSED: scala.Double = js.native
  val CLOSING: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
}

