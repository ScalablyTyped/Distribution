package typings
package stripeLib.stripeMod.StripeNs.balanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalance
  extends stripeLib.stripeMod.StripeNs.IObject {
  /**
    * Funds that are available to be paid out automatically by Stripe or explicitly
    * via the transfers API. The available balance for each currency and payment
    * type can be found in the source_types property.
    */
  var available: js.Array[ISourceType]
  var livemode: scala.Boolean
  /**
    * Funds that are not available in the balance yet, due to the 7-day rolling pay
    * cycle. The pending balance for each currency and payment type can be
    * found in the source_types property
    */
  var pending: js.Array[ISourceType]
}

object IBalance {
  @scala.inline
  def apply(
    available: js.Array[ISourceType],
    livemode: scala.Boolean,
    `object`: java.lang.String,
    pending: js.Array[ISourceType]
  ): IBalance = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[IBalance]
  }
}

