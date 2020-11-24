package typings.swipeview

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeView extends js.Object {
  
  var currentMasterPage: Double = js.native
  
  def destroy(): Unit = js.native
  
  def goToPage(p: Double): Unit = js.native
  
  def handleEvent(e: Event): Unit = js.native
  
  var masterPages: js.Array[HTMLElement] = js.native
  
  def next(): Unit = js.native
  
  def onFlip(fn: js.Function): Unit = js.native
  @JSName("onFlip")
  var onFlip_Original: SwipeViewEvent = js.native
  
  def onMoveIn(fn: js.Function): Unit = js.native
  @JSName("onMoveIn")
  var onMoveIn_Original: SwipeViewEvent = js.native
  
  def onMoveOut(fn: js.Function): Unit = js.native
  @JSName("onMoveOut")
  var onMoveOut_Original: SwipeViewEvent = js.native
  
  def onTouchStart(fn: js.Function): Unit = js.native
  @JSName("onTouchStart")
  var onTouchStart_Original: SwipeViewEvent = js.native
  
  def prev(): Unit = js.native
  
  def refreshSize(): Unit = js.native
  
  var slider: HTMLElement = js.native
  
  def updatePageCount(n: Double): Unit = js.native
  
  var wrapper: HTMLElement = js.native
  
  var wrapperHeight: Double = js.native
}
