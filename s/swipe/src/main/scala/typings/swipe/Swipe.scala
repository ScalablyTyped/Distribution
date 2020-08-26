package typings.swipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swipe extends js.Object {
  def attachEvents(): Unit = js.native
  def getNumSlides(): Double = js.native
  def getPos(): Double = js.native
  def kill(): Unit = js.native
  def next(): Unit = js.native
  def prev(): Unit = js.native
  def setup(): Unit = js.native
  def slide(index: Double, duration: Double): Unit = js.native
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
  @scala.inline
  implicit class SwipeOps[Self <: Swipe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachEvents(value: () => Unit): Self = this.set("attachEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumSlides(value: () => Double): Self = this.set("getNumSlides", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPos(value: () => Double): Self = this.set("getPos", js.Any.fromFunction0(value))
    @scala.inline
    def setKill(value: () => Unit): Self = this.set("kill", js.Any.fromFunction0(value))
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setPrev(value: () => Unit): Self = this.set("prev", js.Any.fromFunction0(value))
    @scala.inline
    def setSetup(value: () => Unit): Self = this.set("setup", js.Any.fromFunction0(value))
    @scala.inline
    def setSlide(value: (Double, Double) => Unit): Self = this.set("slide", js.Any.fromFunction2(value))
  }
  
}

