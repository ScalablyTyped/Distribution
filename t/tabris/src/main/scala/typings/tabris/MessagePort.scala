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
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def close(): Unit = js.native
  
  def onmessage(ev: MessageEvent): js.Any = js.native
  
  def postMessage(): Unit = js.native
  def postMessage(message: js.Any): Unit = js.native
  def postMessage(message: js.Any, transfer: js.Array[js.Any]): Unit = js.native
  def postMessage(message: Unit, transfer: js.Array[js.Any]): Unit = js.native
  
  def start(): Unit = js.native
}
