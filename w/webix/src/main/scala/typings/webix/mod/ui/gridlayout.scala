package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.gridlayout")
@js.native
open class gridlayout ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_gridlayout: WebixCallback = js.native
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  
  @JSName("config")
  var config_gridlayout: gridlayoutConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: obj): Double = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def moveView(id: String, view: obj): Unit = js.native
  def moveView(id: Double, view: obj): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: obj): Unit = js.native
  def restore(state: obj, factory: WebixCallback): Unit = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(serializer: WebixCallback): js.Array[Any] = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
