package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.accordionitem")
@js.native
class accordionitem () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_accordionitem: accordionitemConfig = js.native
  @JSName("on_click")
  var on_click_Original: webixLib.webixNs.WebixCallback = js.native
  var on_context: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: webixLib.webixNs.WebixCallback = js.native
  def attachEvent(`type`: accordionitemEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: accordionitemEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def collapse(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def expand(): scala.Unit = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

