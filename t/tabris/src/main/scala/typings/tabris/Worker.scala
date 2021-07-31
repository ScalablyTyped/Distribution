package typings.tabris

import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.messageerror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worker
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(`type`: messageerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def onerror(ev: Event): js.Any = js.native
  
  def onmessage(ev: MessageEvent): js.Any = js.native
  
  def onmessageerror(ev: Event): js.Any = js.native
  
  def onopen(ev: Event): js.Any = js.native
  
  def postMessage(data: js.Any): Unit = js.native
  def postMessage(data: js.Any, transferList: js.Array[js.Any]): Unit = js.native
  
  val protocol: String = js.native
  
  val readyState: Double = js.native
  
  def terminate(): Unit = js.native
  
  val url: String = js.native
}
