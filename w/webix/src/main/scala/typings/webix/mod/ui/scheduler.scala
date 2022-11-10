package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.scheduler")
@js.native
open class scheduler ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$app")
  var $app: obj = js.native
  
  @JSName("$exportView")
  var $exportView: Any = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_scheduler: WebixCallback = js.native
  
  def app(app: obj): Unit = js.native
  
  def attachEvent(`type`: schedulerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: schedulerEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any): Unit = js.native
  def bind(target: Any, rule: Unit, format: String): Unit = js.native
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearAll(): Unit = js.native
  
  @JSName("config")
  var config_scheduler: schedulerConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getService(service: String): obj = js.native
  
  def getState(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
  def unblockEvent(): Unit = js.native
}
