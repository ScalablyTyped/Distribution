package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.datasuggest")
@js.native
class datasuggest () extends baseview {
  @JSName("$enterKey")
  var $enterKey_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_datasuggest: datasuggestConfig = js.native
  @JSName("$enterKey")
  def $enterKey(args: js.Any*): js.Any = js.native
  def attachEvent(`type`: datasuggestEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: datasuggestEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getBody(): js.Any = js.native
  def getHead(): js.Any = js.native
  def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
  def getItemText(id: java.lang.String): java.lang.String = js.native
  def getItemText(id: scala.Double): java.lang.String = js.native
  def getList(): baseview = js.native
  def getMasterValue(): js.Any = js.native
  def getSuggestion(): java.lang.String = js.native
  def getValue(): java.lang.String | scala.Double = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def setMasterValue(value: js.Any): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def setValue(value: scala.Double): scala.Unit = js.native
  def show(node: stdLib.HTMLElement): scala.Unit = js.native
  def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
  def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

