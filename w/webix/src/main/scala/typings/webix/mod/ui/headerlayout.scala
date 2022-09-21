package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.headerlayout")
@js.native
open class headerlayout ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_headerlayout: WebixCallback = js.native
  
  def addView(view: Any): String | Double = js.native
  def addView(view: Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: headerlayoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: headerlayoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_headerlayout: headerlayoutConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: Any): Double = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def restore(state: Any): Unit = js.native
  def restore(state: Any, factory: WebixCallback): Unit = js.native
  
  def serialize(): Any = js.native
  def serialize(serializer: WebixCallback): Any = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
