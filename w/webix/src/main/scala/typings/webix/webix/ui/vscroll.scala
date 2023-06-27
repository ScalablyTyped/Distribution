package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait vscroll extends StObject {
  
  @JSName("$skin")
  def $skin(args: Any*): Any = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  
  def activeArea(node: HTMLElement): Unit = js.native
  
  def attachEvent(`type`: vscrollEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: vscrollEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  var config: vscrollConfig = js.native
  
  def define(property: String): Unit = js.native
  def define(property: String, value: Any): Unit = js.native
  def define(property: obj): Unit = js.native
  def define(property: obj, value: Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getScroll(): Double = js.native
  
  def getSize(): Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  var name: String = js.native
  
  def reset(): Unit = js.native
  
  def scrollTo(pos: Double): Unit = js.native
  
  def sizeTo(size: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
