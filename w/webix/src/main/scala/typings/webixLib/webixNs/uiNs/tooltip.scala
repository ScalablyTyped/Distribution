package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait tooltip extends js.Object {
  @JSName("$height")
  var $height: scala.Double = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$view")
  var $view: stdLib.HTMLElement = js.native
  @JSName("$width")
  var $width: scala.Double = js.native
  var config: tooltipConfig = js.native
  var name: java.lang.String = js.native
  var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("$getSize")
  def $getSize(): js.Array[_] = js.native
  @JSName("$setSize")
  def $setSize(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  @JSName("$skin")
  def $skin(args: js.Any*): js.Any = js.native
  def adjust(): scala.Unit = js.native
  def attachEvent(`type`: tooltipEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: tooltipEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def customize(obj: js.Any): scala.Unit = js.native
  def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def destructor(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def getChildViews(): js.Array[_] = js.native
  def getFormView(): baseview = js.native
  def getNode(): js.Any = js.native
  def getParentView(): js.Any = js.native
  def getTopParentView(): baseview = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def hide(): scala.Unit = js.native
  def isEnabled(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def queryView(config: js.Any): js.Any = js.native
  def queryView(config: js.Any, mode: java.lang.String): js.Any = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def show(data: js.Any, position: js.Any): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

