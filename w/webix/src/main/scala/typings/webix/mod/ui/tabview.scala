package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.tabview")
@js.native
open class tabview ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_tabview: WebixCallback = js.native
  
  def addView(obj: obj): Unit = js.native
  
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_tabview: tabviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getMultiview(): obj = js.native
  
  def getTabbar(): obj = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, config: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
