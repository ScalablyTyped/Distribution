package typings
package stripeLib.stripeMod.StripeNs.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomerListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * A filter on the list based on the customer’s email field. The value must be a string.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
}

object ICustomerListOptions {
  @scala.inline
  def apply(
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    email: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): ICustomerListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[ICustomerListOptions]
  }
}

