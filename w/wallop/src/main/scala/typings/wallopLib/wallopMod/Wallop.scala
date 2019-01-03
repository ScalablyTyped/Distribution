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

