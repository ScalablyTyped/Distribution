package typings.stripe.stripeMod.balanceNs

import typings.stripe.stripeMod.IObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBalance extends IObject {
  /**
    * Funds that are available to be paid out automatically by Stripe or explicitly
    * via the transfers API. The available balance for each currency and payment
    * type can be found in the source_types property.
    */
  var available: js.Array[ISourceType]
  var livemode: Boolean
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
    livemode: Boolean,
    `object`: String,
    pending: js.Array[ISourceType]
  ): IBalance = {
    val __obj = js.Dynamic.literal(available = available, livemode = livemode, pending = pending)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IBalance]
  }
}

