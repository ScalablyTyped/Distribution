package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ordersNs {
  /**
    * Current order status. One of created, paid, canceled, fulfilled, or returned. More detail in the Relay API Overview.
    */
  type OrderStatus = stripeLib.stripeLibStrings.created | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.fulfilled | stripeLib.stripeLibStrings.returned
}
