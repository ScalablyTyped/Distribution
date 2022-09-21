package typings.tabris.global.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("tabris.WebSocket")
@js.native
open class WebSocket protected ()
  extends StObject
     with typings.tabris.WebSocket {
  def this(url: String) = this()
  def this(url: String, protocols: String) = this()
  def this(url: String, protocols: js.Array[String]) = this()
}
/* was `typeof WebSocket` */
object WebSocket {
  
  @JSGlobal("tabris.WebSocket.CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  @JSGlobal("tabris.WebSocket.CLOSING")
  @js.native
  val CLOSING: Double = js.native
  
  @JSGlobal("tabris.WebSocket.CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  @JSGlobal("tabris.WebSocket.OPEN")
  @js.native
  val OPEN: Double = js.native
}
