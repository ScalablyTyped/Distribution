package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait filemanager
  extends StObject
     with baseview {
  
  @JSName("$app")
  var $app: obj = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def app(app: obj): Unit = js.native
  
  def attachEvent(`type`: filemanagerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: filemanagerEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any): Unit = js.native
  def bind(target: Any, rule: Unit, format: String): Unit = js.native
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_filemanager: filemanagerConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getService(service: String): obj = js.native
  
  def getState(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
