package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTarget extends StObject {
  
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: Unit, useCapture: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  
  def dispatchEvent(evt: Event): Boolean = js.native
  
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: Unit, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
}
