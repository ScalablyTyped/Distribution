package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.barcode")
@js.native
open class barcode ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_barcode: WebixCallback = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  @JSName("config")
  var config_barcode: barcodeConfig = js.native
  
  def getValue(): String = js.native
  
  def render(): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  
  var types: js.Array[Any] = js.native
}
