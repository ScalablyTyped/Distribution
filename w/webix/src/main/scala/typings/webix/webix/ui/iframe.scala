package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait iframe
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def attachEvent(`type`: iframeEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: iframeEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_iframe: iframeConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getIframe(): HTMLElement = js.native
  
  def getWindow(): HTMLElement = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def load(value: String): Unit = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
