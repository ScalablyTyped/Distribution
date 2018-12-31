package typings
package stripeLib.stripeMod.StripeNs.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
    * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
    */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
    * be affected.
    */
  var product: js.UndefOr[java.lang.String] = js.undefined
}

