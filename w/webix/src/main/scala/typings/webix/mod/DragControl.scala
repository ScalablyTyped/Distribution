package typings.webix.mod

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragControl extends StObject {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): HTMLElement = js.native
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement, event: Event): Unit = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit = js.native
  
  def addDrag(node: String, ctrl: Any): Unit = js.native
  def addDrag(node: Double, ctrl: Any): Unit = js.native
  def addDrag(node: HTMLElement, ctrl: Any): Unit = js.native
  
  def addDrop(node: String, ctrl: Any): Unit = js.native
  def addDrop(node: String, ctrl: Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: Double, ctrl: Any): Unit = js.native
  def addDrop(node: Double, ctrl: Any, master_mode: Boolean): Unit = js.native
  def addDrop(node: HTMLElement, ctrl: Any): Unit = js.native
  def addDrop(node: HTMLElement, ctrl: Any, master_mode: Boolean): Unit = js.native
  
  def createDrag(event: Event): Unit = js.native
  
  def destroyDrag(): Unit = js.native
  
  def getContext(): Any = js.native
  
  def getMaster(target: Any): Any = js.native
  
  def getNode(): HTMLElement = js.native
  
  var left: Double = js.native
  
  def sendSignal(signal: String): Unit = js.native
  
  var top: Double = js.native
  
  def unlink(id: Any): Unit = js.native
}
object DragControl {
  
  inline def apply: DragControl = ^.asInstanceOf[js.Dynamic].selectDynamic("DragControl").asInstanceOf[DragControl]
}
