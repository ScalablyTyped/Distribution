package typings.tabris

import typings.tabris.tabrisStrings.close
import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocket
  extends StObject
     with EventTarget {
  
  val CLOSED: Double = js.native
  
  val CLOSING: Double = js.native
  
  val CONNECTING: Double = js.native
  
  val OPEN: Double = js.native
  
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var binaryType: String = js.native
  
  val bufferedAmount: Double = js.native
  
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def close(code: Unit, reason: String): Unit = js.native
  
  val extensions: String = js.native
  
  def onclose(ev: CloseEvent): Any = js.native
  
  def onerror(ev: Event): Any = js.native
  
  def onmessage(ev: MessageEvent): Any = js.native
  
  def onopen(ev: Event): Any = js.native
  
  val protocol: String = js.native
  
  val readyState: Double = js.native
  
  def send(data: Any): Unit = js.native
  
  val url: String = js.native
}
