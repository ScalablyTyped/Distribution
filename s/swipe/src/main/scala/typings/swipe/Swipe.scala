package typings.swipe

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Swipe")
@js.native
class Swipe protected () extends js.Object {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, options: SwipeOptions) = this()
  def attachEvents(): Unit = js.native
  def getNumSlides(): Double = js.native
  def getPos(): Double = js.native
  def kill(): Unit = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def setup(): Unit = js.native
  def slide(index: Double, duration: Double): Unit = js.native
}

