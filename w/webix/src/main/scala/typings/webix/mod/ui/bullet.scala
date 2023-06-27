package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.bullet")
@js.native
open class bullet ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_bullet: WebixCallback = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  @JSName("config")
  var config_bullet: bulletConfig = js.native
  
  def getValue(bullet_value: Double): Unit = js.native
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(new_value: Double): Unit = js.native
}
