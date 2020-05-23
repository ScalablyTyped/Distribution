package typings.webix.webix.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bullet extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_bullet: bulletConfig = js.native
  def getValue(bullet_value: Double): Unit = js.native
  def refresh(): Unit = js.native
  def setValue(new_value: Double): Unit = js.native
}

