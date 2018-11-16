package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.hint")
@js.native
class hint () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_hint: hintConfig = js.native
  def attachEvent(`type`: hintEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: hintEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def getCurrentStep(): scala.Double = js.native
  def getSteps(): js.Array[_] = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def resume(stepNumber: scala.Double): scala.Unit = js.native
  def setSteps(steps: js.Array[_]): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

