package typings.webix.webix.ui

import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait barcode
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("config")
  var config_barcode: barcodeConfig = js.native
  
  def getValue(): String = js.native
  
  def render(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  var types: js.Array[Any] = js.native
}
