package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.slider")
@js.native
class slider () extends baseview {
  @JSName("$compareValue")
  var $compareValue_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$renderIcon")
  var $renderIcon_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$render")
  var $render_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$touchCapture")
  var $touchCapture: scala.Boolean = js.native
  @JSName("config")
  var config_slider: sliderConfig = js.native
  @JSName("on_click")
  var on_click_Original: webixLib.webixNs.WebixCallback = js.native
  var touchable: scala.Boolean = js.native
  @JSName("$compareValue")
  def $compareValue(args: js.Any*): js.Any = js.native
  @JSName("$getValue")
  def $getValue(): java.lang.String = js.native
  @JSName("$prepareValue")
  def $prepareValue(args: js.Any*): js.Any = js.native
  @JSName("$render")
  def $render(args: js.Any*): js.Any = js.native
  @JSName("$renderIcon")
  def $renderIcon(args: js.Any*): js.Any = js.native
  @JSName("$renderInput")
  def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
  @JSName("$renderInput")
  def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
  @JSName("$renderLabel")
  def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
  @JSName("$renderLabel")
  def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
  @JSName("$setValue")
  def $setValue(value: java.lang.String): scala.Unit = js.native
  def attachEvent(`type`: sliderEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: sliderEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputNode(): stdLib.HTMLElement = js.native
  def getValue(): java.lang.String = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def setBottomText(text: java.lang.String): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.webixNs.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def validate(): scala.Boolean = js.native
}

