package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gage
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def attachEvent(`type`: gageEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: gageEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_gage: gageConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getValue(): Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def setValue(new_value: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
