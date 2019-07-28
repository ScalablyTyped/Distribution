package typings.swipeview

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SwipeView")
@js.native
class SwipeView protected () extends js.Object {
  def this(element: String) = this()
  def this(element: String, options: SwipeViewOptions) = this()
  var currentMasterPage: Double = js.native
  var masterPages: js.Array[HTMLElement] = js.native
  @JSName("onFlip")
  var onFlip_Original: SwipeViewEvent = js.native
  @JSName("onMoveIn")
  var onMoveIn_Original: SwipeViewEvent = js.native
  @JSName("onMoveOut")
  var onMoveOut_Original: SwipeViewEvent = js.native
  @JSName("onTouchStart")
  var onTouchStart_Original: SwipeViewEvent = js.native
  var slider: HTMLElement = js.native
  var wrapper: HTMLElement = js.native
  var wrapperHeight: Double = js.native
  def destroy(): Unit = js.native
  def goToPage(p: Double): Unit = js.native
  def handleEvent(e: Event): Unit = js.native
  def next(): Unit = js.native
  def onFlip(fn: js.Function): Unit = js.native
  def onMoveIn(fn: js.Function): Unit = js.native
  def onMoveOut(fn: js.Function): Unit = js.native
  def onTouchStart(fn: js.Function): Unit = js.native
  def prev(): Unit = js.native
  def refreshSize(): Unit = js.native
  def updatePageCount(n: Double): Unit = js.native
}

