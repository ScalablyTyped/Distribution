package typings.webix.mod.ui

import typings.webix.mod.Date
import typings.webix.mod.WebixCallback
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
  def addToRange(dates: Date): Unit = js.native
  
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_daterange: daterangeConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(range: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
