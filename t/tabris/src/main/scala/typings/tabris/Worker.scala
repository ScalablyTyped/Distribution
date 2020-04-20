package typings.tabris

import org.scalablytyped.runtime.Instantiable1
import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.messageerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worker extends EventTarget {
  val protocol: String = js.native
  val readyState: Double = js.native
  val url: String = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(`type`: messageerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  def onerror(ev: Event): js.Any = js.native
  def onmessage(ev: MessageEvent): js.Any = js.native
  def onmessageerror(ev: Event): js.Any = js.native
  def onopen(ev: Event): js.Any = js.native
  def postMessage(data: js.Any): Unit = js.native
  def postMessage(data: js.Any, transferList: js.Array[_]): Unit = js.native
  def terminate(): Unit = js.native
}

@JSGlobal("Worker")
@js.native
object Worker extends Instantiable1[/* scriptPath */ String, Worker]

