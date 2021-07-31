package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorboard
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  def attachEvent(`type`: colorboardEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: colorboardEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_colorboard: colorboardConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def moveSelection(direction: String): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def render(id: String, data: js.Any, `type`: String): Unit = js.native
  def render(id: Double, data: js.Any, `type`: String): Unit = js.native
  
  def setValue(value: String): String = js.native
  
  def unblockEvent(): Unit = js.native
}
