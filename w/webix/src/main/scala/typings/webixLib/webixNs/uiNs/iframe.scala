package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.iframe")
@js.native
class iframe () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_iframe: iframeConfig = js.native
  def attachEvent(`type`: iframeEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: iframeEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getIframe(): stdLib.HTMLElement = js.native
  def getWindow(): stdLib.HTMLElement = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def load(value: java.lang.String): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

