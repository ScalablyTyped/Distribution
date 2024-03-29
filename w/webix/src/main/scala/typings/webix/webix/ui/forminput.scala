package typings.webix.webix.ui

import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait forminput
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("config")
  var config_forminput: forminputConfig = js.native
  
  def focus(): Unit = js.native
  
  def getBody(): obj = js.native
  
  def getValue(): String = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setBottomText(text: String): Unit = js.native
  
  def setValue(value: Any): Unit = js.native
}
