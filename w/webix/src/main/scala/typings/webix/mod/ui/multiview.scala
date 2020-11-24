package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.multiview")
@js.native
class multiview ()
  extends typings.webix.webix.ui.baseview {
  
  @JSName("$skin")
  var $skin_Original_multiview: WebixCallback = js.native
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def attachEvent(`type`: multiviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: multiviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def back(step: Double): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  
  @JSName("config")
  var config_multiview: multiviewConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getActiveId(): String = js.native
  
  def getValue(): String | Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def index(obj: js.Any): Double = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def reconstruct(): Unit = js.native
  
  def removeView(id: js.Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setValue(id: String): Unit = js.native
  def setValue(id: Double): Unit = js.native
  
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
