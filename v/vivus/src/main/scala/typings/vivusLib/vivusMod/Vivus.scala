package typings
package vivusLib.vivusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vivus extends js.Object {
  /**
    * Reset the SVG but make the instance out of order.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Completely draws the SVG at its final state.
    */
  def finish(): this.type = js.native
  /**
    * Get the status of the animation between start, progress, end.
    */
  def getStatus(): vivusLib.vivusLibStrings.start | vivusLib.vivusLibStrings.progress | vivusLib.vivusLibStrings.end = js.native
  /**
    * Plays the animation with the speed given in parameter.
    * A speed of `1` is the normal speed.
    * This value can be negative to go reverse, between 0 and 1 to play slowly, or greater than 1 to go faster.
    * Callback executed after the animation is finished (optional).
    *
    * (default: `1`)
    */
  def play(): this.type = js.native
  def play(speed: scala.Double): this.type = js.native
  def play(speed: scala.Double, callback: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Reinitialises the SVG to the original undrawn state.
    */
  def reset(): this.type = js.native
  /**
    * Set the progress of the animation.
    * Progress must be a `number` between `0` and `1`.
    */
  def setFrameProgress(progress: scala.Double): this.type = js.native
  /**
    * Stops the animation.
    */
  def stop(): this.type = js.native
}

