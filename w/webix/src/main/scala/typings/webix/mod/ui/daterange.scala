package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.daterange")
@js.native
open class daterange ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$skin")
  var $skin_Original_daterange: WebixCallback = js.native
  
  def addToRange(dates: String): Unit = js.native
  def addToRange(dates: js.Date): Unit = js.native
  
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_daterange: daterangeConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(format: String): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(range: obj): Unit = js.native
  def setValue(range: obj, config: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
