package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
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
  var $scope: Any = js.native
  
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
  
  def customize(obj: Any): Unit = js.native
  
  def define(property: String, value: Any): Unit = js.native
  
  def destructor(): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getChildViews(): js.Array[Any] = js.native
  
  def getFormView(): typings.webix.webix.ui.baseview = js.native
  
  def getNode(): Any = js.native
  
  def getParentView(): Any = js.native
  
  def getTopParentView(): typings.webix.webix.ui.baseview = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def hide(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  var name: String = js.native
  
  def queryView(config: Any): Any = js.native
  def queryView(config: Any, mode: String): Any = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def resize(): Unit = js.native
  
  def show(data: Any, position: Any): Unit = js.native
  
  var `type`: StringDictionary[Any] = js.native
  
  def unblockEvent(): Unit = js.native
}
