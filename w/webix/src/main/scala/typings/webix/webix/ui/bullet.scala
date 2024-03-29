package typings.webix.webix.ui

import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait bullet
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("config")
  var config_bullet: bulletConfig = js.native
  
  def getValue(bullet_value: Double): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(new_value: Double): Unit = js.native
}
