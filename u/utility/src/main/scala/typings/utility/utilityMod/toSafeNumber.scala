package typings.utility.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "toSafeNumber")
@js.native
object toSafeNumber extends js.Object {
  /**
    * Convert string to Number if string in safe Number scope.
    *
    * @param {String} s number format string.
    * @return {Number|String} success will return Number, otherise return the original string.
    */
  def apply(s: String): Double | String = js.native
  def apply(s: Double): Double | String = js.native
}

