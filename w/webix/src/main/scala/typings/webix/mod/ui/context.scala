package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.context")
@js.native
class context ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_context: WebixCallback = js.native
  
  def attachEvent(`type`: contextEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: contextEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachTo(view: js.Any): Unit = js.native
  
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_context: contextConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): js.Any = js.native
  
  def getContext(): js.Any = js.native
  
  def getHead(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setContext(context: js.Any): Unit = js.native
  
  def setPosition(x: Double, y: Double): Unit = js.native
  
  def show(node: Unit, position: js.Any): Unit = js.native
  def show(node: Unit, position: js.Any, point: String): Unit = js.native
  def show(node: Unit, position: Unit, point: String): Unit = js.native
  def show(node: HTMLElement): Unit = js.native
  def show(node: HTMLElement, position: js.Any): Unit = js.native
  def show(node: HTMLElement, position: js.Any, point: String): Unit = js.native
  def show(node: HTMLElement, position: Unit, point: String): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
