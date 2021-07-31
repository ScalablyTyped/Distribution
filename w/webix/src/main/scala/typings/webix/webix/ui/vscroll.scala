package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait vscroll extends StObject {
  
  def activeArea(node: HTMLElement): Unit = js.native
  
  def attachEvent(`type`: vscrollEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: vscrollEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  var config: vscrollConfig = js.native
  
  def define(property: String, value: js.Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getScroll(): Double = js.native
  
  def getSize(): Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  var name: String = js.native
  
  def reset(): Unit = js.native
  
  def scrollTo(pos: Double): Unit = js.native
  
  def sizeTo(size: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
