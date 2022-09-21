package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.forminput")
@js.native
open class forminput ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_forminput: WebixCallback = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  @JSName("config")
  var config_forminput: forminputConfig = js.native
  
  def focus(): Unit = js.native
  
  def getBody(): Any = js.native
  
  def getValue(): String = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setBottomText(text: String): Unit = js.native
  
  def setValue(value: Any): Unit = js.native
}
