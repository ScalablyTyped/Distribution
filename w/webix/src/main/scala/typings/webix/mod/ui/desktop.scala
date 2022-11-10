package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.desktop")
@js.native
open class desktop ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$app")
  var $app: obj = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_desktop: WebixCallback = js.native
  
  def addApp(app: obj): Unit = js.native
  
  def app(app: obj): Unit = js.native
  
  def attachEvent(`type`: desktopEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: desktopEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any): Unit = js.native
  def bind(target: Any, rule: Unit, format: String): Unit = js.native
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_desktop: desktopConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getService(service: String): obj = js.native
  
  def getState(): obj = js.native
  
  def getStateData(): js.Array[Any] = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
  def setStateData(apps: js.Array[Any]): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
