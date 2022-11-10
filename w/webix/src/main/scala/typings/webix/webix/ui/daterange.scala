package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait daterange
  extends StObject
     with baseview {
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  def addToRange(dates: String): Unit = js.native
  def addToRange(dates: js.Date): Unit = js.native
  
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: daterangeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_daterange: daterangeConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(format: String): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(range: obj): Unit = js.native
  def setValue(range: obj, config: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
