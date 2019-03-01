package typings
package stripeLib.stripeMod.StripeNs.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeriod extends js.Object {
  /**
    * The period end date
    */
  var end: scala.Double
  /**
    * The period start date
    */
  var start: scala.Double
}

object IPeriod {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): IPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[IPeriod]
  }
}

