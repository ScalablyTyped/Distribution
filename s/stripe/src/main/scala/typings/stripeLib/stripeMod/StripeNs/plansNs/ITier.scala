package typings
package stripeLib.stripeMod.StripeNs.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITier extends js.Object {
  /**
    * Per unit price for units relevant to the tier.
    */
  var amount: scala.Double
  /**
    * Up to and including to this quantity will be contained in the tier.
    */
  var up_to: scala.Double
}

