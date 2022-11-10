package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait timeboard
  extends StObject
     with baseview {
  
  @JSName("$getValue")
  def $getValue(): String | obj = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  def attachEvent(`type`: timeboardEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: timeboardEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_timeboard: timeboardConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(): String | obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, config: Any): Unit = js.native
  def setValue(value: obj): Unit = js.native
  def setValue(value: obj, config: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
