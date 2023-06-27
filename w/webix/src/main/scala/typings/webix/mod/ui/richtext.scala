package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.richtext")
@js.native
open class richtext ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$skin")
  var $skin_Original_richtext: WebixCallback = js.native
  
  @JSName("$$")
  var DollarDollar: obj = js.native
  
  def attachEvent(`type`: richtextEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: richtextEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_richtext: richtextConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInputNode(): HTMLElement = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  def ui(view: obj): typings.webix.webix.ui.baseview = js.native
  
  def unblockEvent(): Unit = js.native
}
