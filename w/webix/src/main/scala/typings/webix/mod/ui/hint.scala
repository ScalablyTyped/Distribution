package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.hint")
@js.native
class hint ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_hint: WebixCallback = js.native
  @JSName("config")
  var config_hint: hintConfig = js.native
  def attachEvent(`type`: hintEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: hintEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def end(): Unit = js.native
  def getCurrentStep(): Double = js.native
  def getSteps(): js.Array[_] = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def resume(): Unit = js.native
  def resume(stepNumber: Double): Unit = js.native
  def setSteps(steps: js.Array[_]): Unit = js.native
  def start(): Unit = js.native
  def unblockEvent(): Unit = js.native
}

