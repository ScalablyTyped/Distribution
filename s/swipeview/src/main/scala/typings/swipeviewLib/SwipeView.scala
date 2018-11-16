package typings
package swipeviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SwipeView")
@js.native
class SwipeView protected () extends js.Object {
  def this(element: java.lang.String) = this()
  def this(element: java.lang.String, options: SwipeViewOptions) = this()
  var currentMasterPage: scala.Double = js.native
  var masterPages: js.Array[stdLib.HTMLElement] = js.native
  @JSName("onFlip")
  var onFlip_Original: SwipeViewEvent = js.native
  @JSName("onMoveIn")
  var onMoveIn_Original: SwipeViewEvent = js.native
  @JSName("onMoveOut")
  var onMoveOut_Original: SwipeViewEvent = js.native
  @JSName("onTouchStart")
  var onTouchStart_Original: SwipeViewEvent = js.native
  var slider: stdLib.HTMLElement = js.native
  var wrapper: stdLib.HTMLElement = js.native
  var wrapperHeight: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def goToPage(p: scala.Double): scala.Unit = js.native
  def handleEvent(e: stdLib.Event): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def onFlip(fn: js.Function): scala.Unit = js.native
  def onMoveIn(fn: js.Function): scala.Unit = js.native
  def onMoveOut(fn: js.Function): scala.Unit = js.native
  def onTouchStart(fn: js.Function): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def refreshSize(): scala.Unit = js.native
  def updatePageCount(n: scala.Double): scala.Unit = js.native
}

