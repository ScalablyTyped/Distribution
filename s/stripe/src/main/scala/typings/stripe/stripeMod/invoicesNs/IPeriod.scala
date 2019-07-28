package typings.stripe.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeriod extends js.Object {
  /**
    * The period end date
    */
  var end: Double
  /**
    * The period start date
    */
  var start: Double
}

object IPeriod {
  @scala.inline
  def apply(end: Double, start: Double): IPeriod = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[IPeriod]
  }
}

