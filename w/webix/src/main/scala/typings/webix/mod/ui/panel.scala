package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.panel")
@js.native
open class panel ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$resizeEnd")
  def $resizeEnd(pos: obj): Unit = js.native
  
  @JSName("$resizeMove")
  def $resizeMove(pos: obj): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_panel: WebixCallback = js.native
  
  def attachEvent(`type`: panelEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: panelEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_panel: panelConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
  def unblockEvent(): Unit = js.native
}
