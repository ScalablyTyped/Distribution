package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePort extends EventTarget {
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
  def close(): scala.Unit = js.native
  def onmessage(`this`: MessagePort, ev: MessageEvent): js.Any = js.native
  def postMessage(): scala.Unit = js.native
  def postMessage(message: js.Any): scala.Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[_]): scala.Unit = js.native
  def start(): scala.Unit = js.native
}

@JSGlobal("MessagePort")
@js.native
class MessagePortCls () extends MessagePort

@JSGlobal("MessagePort")
@js.native
object MessagePort
  extends org.scalablytyped.runtime.Instantiable0[MessagePort]

