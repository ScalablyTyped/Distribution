package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.docmanager")
@js.native
open class docmanager ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$app")
  var $app: Any = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_docmanager: WebixCallback = js.native
  
  def app(app: Any): Unit = js.native
  
  def attachEvent(`type`: docmanagerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: docmanagerEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_docmanager: docmanagerConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getService(service: String): Any = js.native
  
  def getState(): Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
