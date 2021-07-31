package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.gridlayout")
@js.native
class gridlayout ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_gridlayout: WebixCallback = js.native
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  
  @JSName("config")
  var config_gridlayout: gridlayoutConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: js.Any): Double = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def moveView(id: String, view: js.Any): Unit = js.native
  def moveView(id: Double, view: js.Any): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: js.Any): Unit = js.native
  def restore(state: js.Any, factory: WebixCallback): Unit = js.native
  
  def serialize(): js.Array[js.Any] = js.native
  def serialize(serializer: WebixCallback): js.Array[js.Any] = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
