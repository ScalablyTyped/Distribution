package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gridlayout extends baseview {
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: gridlayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
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
  
  def serialize(): js.Array[_] = js.native
  def serialize(serializer: WebixCallback): js.Array[_] = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
