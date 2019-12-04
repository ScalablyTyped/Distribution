package typings.webix.webixMod.ui

import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.gage")
@js.native
class gage ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_gage: WebixCallback = js.native
  @JSName("config")
  var config_gage: gageConfig = js.native
  def attachEvent(`type`: gageEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: gageEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getValue(): Double = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def setValue(new_value: Double): Unit = js.native
  def unblockEvent(): Unit = js.native
}

