package typings.tabris.mod

import typings.tabris.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("tabris", "XMLHttpRequest")
@js.native
class XMLHttpRequest ()
  extends StObject
     with typings.tabris.XMLHttpRequest {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
}
/* was `typeof XMLHttpRequest` */
object XMLHttpRequest {
  
  @JSImport("tabris", "XMLHttpRequest.DONE")
  @js.native
  val DONE: Double = js.native
  
  @JSImport("tabris", "XMLHttpRequest.HEADERS_RECEIVED")
  @js.native
  val HEADERS_RECEIVED: Double = js.native
  
  @JSImport("tabris", "XMLHttpRequest.LOADING")
  @js.native
  val LOADING: Double = js.native
  
  @JSImport("tabris", "XMLHttpRequest.OPENED")
  @js.native
  val OPENED: Double = js.native
  
  @JSImport("tabris", "XMLHttpRequest.UNSENT")
  @js.native
  val UNSENT: Double = js.native
}
