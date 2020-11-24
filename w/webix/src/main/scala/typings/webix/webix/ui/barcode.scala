package typings.webix.webix.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait barcode extends baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("config")
  var config_barcode: barcodeConfig = js.native
  
  def getValue(): String = js.native
  
  def render(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  var types: js.Array[_] = js.native
}
