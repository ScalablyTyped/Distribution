package typings
package stripeLib.stripeMod.StripeNs.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformUsage extends js.Object {
  /**
    * Divide usage by this number.
    */
  var divide_by: scala.Double
  /**
    * After division, either round the result `up` or `down`.
    */
  var round: stripeLib.stripeLibStrings.up | stripeLib.stripeLibStrings.down
}

object ITransformUsage {
  @scala.inline
  def apply(divide_by: scala.Double, round: stripeLib.stripeLibStrings.up | stripeLib.stripeLibStrings.down): ITransformUsage = {
    val __obj = js.Dynamic.literal(divide_by = divide_by, round = round.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITransformUsage]
  }
}

