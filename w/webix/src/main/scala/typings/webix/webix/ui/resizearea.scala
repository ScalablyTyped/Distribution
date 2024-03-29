package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait resizearea extends StObject {
  
  def attachEvent(`type`: resizeareaEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: resizeareaEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  var config: resizeareaConfig = js.native
  
  def define(property: String): Unit = js.native
  def define(property: String, value: Any): Unit = js.native
  def define(property: obj): Unit = js.native
  def define(property: obj, value: Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  var name: String = js.native
  
  def unblockEvent(): Unit = js.native
}
