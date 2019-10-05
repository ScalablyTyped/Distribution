package typings.utility.utilityMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "timestamp")
@js.native
object timestamp extends js.Object {
  /**
    * Get Unix's timestamp in seconds.
    * @return {Number}
    */
  def apply(): Double | Date = js.native
  def apply(t: String): Double | Date = js.native
  def apply(t: Double): Double | Date = js.native
}

