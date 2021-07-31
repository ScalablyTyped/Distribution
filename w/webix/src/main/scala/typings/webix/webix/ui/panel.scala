package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait panel
  extends StObject
     with baseview {
  
  @JSName("$resizeEnd")
  def $resizeEnd(pos: Double): Unit = js.native
  
  @JSName("$resizeMove")
  def $resizeMove(pos: Double): Unit = js.native
  
  def attachEvent(`type`: panelEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: panelEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_panel: panelConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
