package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanceledFulfilled extends js.Object {
  /**
    * A filter on the list based on the object canceled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var canceled: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object fulfilled field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var fulfilled: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object paid field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var paid: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
    * A filter on the list based on the object returned field. The value can be a string with an integer Unix timestamp,
    * or it can be a dictionary with the following options:
    */
  var returned: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
}

object Anon_CanceledFulfilled {
  @scala.inline
  def apply(
    canceled: stripeLib.stripeMod.StripeNs.IDateFilter = null,
    fulfilled: stripeLib.stripeMod.StripeNs.IDateFilter = null,
    paid: stripeLib.stripeMod.StripeNs.IDateFilter = null,
    returned: stripeLib.stripeMod.StripeNs.IDateFilter = null
  ): Anon_CanceledFulfilled = {
    val __obj = js.Dynamic.literal()
    if (canceled != null) __obj.updateDynamic("canceled")(canceled.asInstanceOf[js.Any])
    if (fulfilled != null) __obj.updateDynamic("fulfilled")(fulfilled.asInstanceOf[js.Any])
    if (paid != null) __obj.updateDynamic("paid")(paid.asInstanceOf[js.Any])
    if (returned != null) __obj.updateDynamic("returned")(returned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CanceledFulfilled]
  }
}

