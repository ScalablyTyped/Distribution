package typings
package swipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Swipe")
@js.native
class Swipe protected () extends js.Object {
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, options: SwipeOptions) = this()
  def attachEvents(): scala.Unit = js.native
  def getNumSlides(): scala.Double = js.native
  def getPos(): scala.Double = js.native
  def kill(): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def setup(): scala.Unit = js.native
  def slide(index: scala.Double, duration: scala.Double): scala.Unit = js.native
}

