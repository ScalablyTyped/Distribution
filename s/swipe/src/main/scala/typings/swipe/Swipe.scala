package typings.swipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Swipe extends js.Object {
  def attachEvents(): Unit
  def getNumSlides(): Double
  def getPos(): Double
  def kill(): Unit
  def next(): Unit
  def prev(): Unit
  def setup(): Unit
  def slide(index: Double, duration: Double): Unit
}

object Swipe {
  @scala.inline
  def apply(
    attachEvents: () => Unit,
    getNumSlides: () => Double,
    getPos: () => Double,
    kill: () => Unit,
    next: () => Unit,
    prev: () => Unit,
    setup: () => Unit,
    slide: (Double, Double) => Unit
  ): Swipe = {
    val __obj = js.Dynamic.literal(attachEvents = js.Any.fromFunction0(attachEvents), getNumSlides = js.Any.fromFunction0(getNumSlides), getPos = js.Any.fromFunction0(getPos), kill = js.Any.fromFunction0(kill), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), setup = js.Any.fromFunction0(setup), slide = js.Any.fromFunction2(slide))
    __obj.asInstanceOf[Swipe]
  }
}

