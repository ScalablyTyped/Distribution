package typings.wallop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wallop extends js.Object {
  /**
    * Advances to the slide with the given index.
    */
  def goTo(index: Double): Wallop = js.native
  /**
    * Advances to next slide.
    */
  def next(): Wallop = js.native
  /**
    * Unbinds method from custom event.
    */
  def off(eventName: String, callback: js.Function0[Unit]): Wallop = js.native
  /**
    * Bind method to custom event.
    */
  def on(eventName: String, callback: js.Function0[Unit]): Wallop = js.native
  /**
    * Returns to previous slide.
    */
  def previous(): Wallop = js.native
  /**
    * Resets current Wallop instance to defaults.
    */
  def reset(): Wallop = js.native
}

object Wallop {
  @scala.inline
  def apply(
    goTo: Double => Wallop,
    next: () => Wallop,
    off: (String, js.Function0[Unit]) => Wallop,
    on: (String, js.Function0[Unit]) => Wallop,
    previous: () => Wallop,
    reset: () => Wallop
  ): Wallop = {
    val __obj = js.Dynamic.literal(goTo = js.Any.fromFunction1(goTo), next = js.Any.fromFunction0(next), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), previous = js.Any.fromFunction0(previous), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Wallop]
  }
  @scala.inline
  implicit class WallopOps[Self <: Wallop] (val x: Self) extends AnyVal {
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
    def setGoTo(value: Double => Wallop): Self = this.set("goTo", js.Any.fromFunction1(value))
    @scala.inline
    def setNext(value: () => Wallop): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setOff(value: (String, js.Function0[Unit]) => Wallop): Self = this.set("off", js.Any.fromFunction2(value))
    @scala.inline
    def setOn(value: (String, js.Function0[Unit]) => Wallop): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setPrevious(value: () => Wallop): Self = this.set("previous", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Wallop): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

