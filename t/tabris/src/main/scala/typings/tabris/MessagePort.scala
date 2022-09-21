package typings.tabris

import typings.tabris.tabrisStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePort
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def close(): Unit = js.native
  
  def onmessage(ev: MessageEvent): Any = js.native
  
  def postMessage(): Unit = js.native
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, transfer: js.Array[Any]): Unit = js.native
  def postMessage(message: Unit, transfer: js.Array[Any]): Unit = js.native
  
  def start(): Unit = js.native
}
