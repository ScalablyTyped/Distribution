package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * Only return charges for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A filter on the list based on the source of the charge. The value can be a
    * dictionary with the following options:
    */
  var source: js.UndefOr[stripeLib.Anon_AlipayaccountAll] = js.undefined
}

