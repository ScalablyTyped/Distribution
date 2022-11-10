package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait tooltip extends StObject {
  
  @JSName("$getSize")
  def $getSize(): js.Array[Any] = js.native
  
  @JSName("$height")
  var $height: Double = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$setNode")
  var $setNode: Any = js.native
  
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  
  @JSName("$skin")
  def $skin(args: Any*): Any = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  
  @JSName("$view")
  var $view: HTMLElement = js.native
  
  @JSName("$width")
  var $width: Double = js.native
  
  def adjust(): Unit = js.native
  
  def attachEvent(`type`: tooltipEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: tooltipEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  var config: tooltipConfig = js.native
  
  def customize(obj: obj): Unit = js.native
  
  def define(property: String, value: Any): Unit = js.native
  
  def destructor(): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getChildViews(): js.Array[Any] = js.native
  
  def getFormView(): typings.webix.webix.ui.baseview = js.native
  
  def getNode(): obj = js.native
  
  def getParentView(): obj = js.native
  
  def getTopParentView(): typings.webix.webix.ui.baseview = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def hide(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  var name: String = js.native
  
  def queryView(config: String): obj | js.Array[Any] = js.native
  def queryView(config: String, mode: String): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  def queryView(config: obj): obj | js.Array[Any] = js.native
  def queryView(config: obj, mode: String): obj | js.Array[Any] = js.native
  
  def render(): Unit = js.native
  def render(id: String): Unit = js.native
  def render(id: String, data: Unit, `type`: String): Unit = js.native
  def render(id: String, data: obj): Unit = js.native
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double): Unit = js.native
  def render(id: Double, data: Unit, `type`: String): Unit = js.native
  def render(id: Double, data: obj): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  def render(id: Unit, data: Unit, `type`: String): Unit = js.native
  def render(id: Unit, data: obj): Unit = js.native
  def render(id: Unit, data: obj, `type`: String): Unit = js.native
  
  def resize(): Unit = js.native
  
  def show(data: obj, position: obj): Unit = js.native
  
  var `type`: obj = js.native
  
  def unblockEvent(): Unit = js.native
}
