package typings.webix.webix.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.barcode")
@js.native
class barcode () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_barcode: barcodeConfig = js.native
  var types: js.Array[_] = js.native
  def getValue(): String = js.native
  def render(): Unit = js.native
  def setValue(value: String): Unit = js.native
}

