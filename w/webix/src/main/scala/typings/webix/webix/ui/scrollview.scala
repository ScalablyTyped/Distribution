package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait scrollview
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_scrollview: scrollviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): obj = js.native
  
  def getScrollState(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def showView(id: String): Unit = js.native
  def showView(id: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
