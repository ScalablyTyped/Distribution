package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait multiview
  extends StObject
     with baseview {
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def attachEvent(`type`: multiviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: multiviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def back(step: Double): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_multiview: multiviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getActiveId(): String = js.native
  
  def getValue(): String | Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: obj): Double = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setValue(id: String): Unit = js.native
  def setValue(id: Double): Unit = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
