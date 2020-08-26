package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "random")
@js.native
object random extends js.Object {
  /**
    * Produces a random integer between the inclusive `lower` and `upper` bounds.
    *
    * @param {Number} lower The lower bound.
    * @param {Number} upper The upper bound.
    * @return {Number} Returns the random number.
    */
  def apply(): Double = js.native
  def apply(lower: js.UndefOr[scala.Nothing], upper: Double): Double = js.native
  def apply(lower: Double): Double = js.native
  def apply(lower: Double, upper: Double): Double = js.native
}

