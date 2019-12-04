package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait tooltip extends js.Object {
  @JSName("$height")
  var $height: Double = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  @JSName("$view")
  var $view: HTMLElement = js.native
  @JSName("$width")
  var $width: Double = js.native
  var config: tooltipConfig = js.native
  var name: String = js.native
  var `type`: StringDictionary[js.Any] = js.native
  @JSName("$getSize")
  def $getSize(): js.Array[_] = js.native
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  @JSName("$skin")
  def $skin(args: js.Any*): js.Any = js.native
  def adjust(): Unit = js.native
  def attachEvent(`type`: tooltipEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: tooltipEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def customize(obj: js.Any): Unit = js.native
  def define(property: String, value: js.Any): Unit = js.native
  def destructor(): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getChildViews(): js.Array[_] = js.native
  def getFormView(): baseview = js.native
  def getNode(): js.Any = js.native
  def getParentView(): js.Any = js.native
  def getTopParentView(): baseview = js.native
  def hasEvent(name: String): Boolean = js.native
  def hide(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def queryView(config: js.Any): js.Any = js.native
  def queryView(config: js.Any, mode: String): js.Any = js.native
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  def resize(): Unit = js.native
  def show(data: js.Any, position: js.Any): Unit = js.native
  def unblockEvent(): Unit = js.native
}

