package typings
package wallopLib.wallopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wallop extends js.Object {
  /**
    * Advances to the slide with the given index.
    */
  def goTo(index: scala.Double): Wallop
  /**
    * Advances to next slide.
    */
  def next(): Wallop
  /**
    * Unbinds method from custom event.
    */
  def off(eventName: java.lang.String, callback: js.Function0[scala.Unit]): Wallop
  /**
    * Bind method to custom event.
    */
  def on(eventName: java.lang.String, callback: js.Function0[scala.Unit]): Wallop
  /**
    * Returns to previous slide.
    */
  def previous(): Wallop
  /**
    * Resets current Wallop instance to defaults.
    */
  def reset(): Wallop
}

object Wallop {
  @scala.inline
  def apply(
    goTo: js.Function1[scala.Double, Wallop],
    next: js.Function0[Wallop],
    off: js.Function2[java.lang.String, js.Function0[scala.Unit], Wallop],
    on: js.Function2[java.lang.String, js.Function0[scala.Unit], Wallop],
    previous: js.Function0[Wallop],
    reset: js.Function0[Wallop]
  ): Wallop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("goTo")(goTo)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Wallop]
  }
}

