package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.scrollview")
@js.native
class scrollview ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_scrollview: WebixCallback = js.native
  
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_scrollview: scrollviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): js.Any = js.native
  
  def getScrollState(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def showView(id: String): Unit = js.native
  def showView(id: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
