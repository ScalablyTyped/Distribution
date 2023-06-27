package typings.webix.mod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.context")
@js.native
open class context ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event, pointer: String): HTMLElement = js.native
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any = js.native
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_context: WebixCallback = js.native
  
  def attachEvent(`type`: contextEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: contextEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachTo(view: obj): Unit = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_context: contextConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): obj = js.native
  
  def getContext(): obj = js.native
  
  def getHead(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setContext(context: obj): Unit = js.native
  
  def setPosition(x: Double, y: Double): Unit = js.native
  
  def show(node: Unit, position: Unit, point: String): Unit = js.native
  def show(node: Unit, position: obj): Unit = js.native
  def show(node: Unit, position: obj, point: String): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: Unit, point: String): Unit = js.native
  def show(node: HTMLElement, position: obj): Unit = js.native
  def show(node: HTMLElement, position: obj, point: String): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
