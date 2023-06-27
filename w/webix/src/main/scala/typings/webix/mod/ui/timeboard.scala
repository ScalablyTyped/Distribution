package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.timeboard")
@js.native
open class timeboard ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$getValue")
  def $getValue(): String | obj = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_timeboard: WebixCallback = js.native
  
  def attachEvent(`type`: timeboardEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: timeboardEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_timeboard: timeboardConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, config: Any): Unit = js.native
  def setValue(value: obj): Unit = js.native
  def setValue(value: obj, config: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
