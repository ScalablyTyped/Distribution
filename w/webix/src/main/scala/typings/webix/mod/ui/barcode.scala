package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.barcode")
@js.native
class barcode ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$skin")
  var $skin_Original_barcode: WebixCallback = js.native
  @JSName("config")
  var config_barcode: barcodeConfig = js.native
  var types: js.Array[_] = js.native
  def getValue(): String = js.native
  def render(): Unit = js.native
  def setValue(value: String): Unit = js.native
}

