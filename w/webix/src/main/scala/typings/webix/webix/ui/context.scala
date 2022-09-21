package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait context
  extends StObject
     with baseview {
  
  @JSName("$dragCreate")
  def $dragCreate(args: Any*): Any = js.native
  @JSName("$dragCreate")
  var $dragCreate_Original: WebixCallback = js.native
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any = js.native
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  def attachEvent(`type`: contextEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: contextEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachTo(view: Any): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_context: contextConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): Any = js.native
  
  def getContext(): Any = js.native
  
  def getHead(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setContext(context: Any): Unit = js.native
  
  def setPosition(x: Double, y: Double): Unit = js.native
  
  def show(node: Unit, position: Any): Unit = js.native
  def show(node: Unit, position: Any, point: String): Unit = js.native
  def show(node: Unit, position: Unit, point: String): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: Any): Unit = js.native
  def show(node: HTMLElement, position: Any, point: String): Unit = js.native
  def show(node: HTMLElement, position: Unit, point: String): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
