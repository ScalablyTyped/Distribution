package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chat
  extends StObject
     with baseview {
  
  @JSName("$app")
  var $app: Any = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  def app(app: Any): Unit = js.native
  
  def attachEvent(`type`: chatEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: chatEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_chat: chatConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getService(service: String): Any = js.native
  
  def getState(state: Any): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
