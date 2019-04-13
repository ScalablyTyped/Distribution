package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeListOptions
  extends stripeLib.stripeMod.IListOptionsCreated {
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

object IChargeListOptions {
  @scala.inline
  def apply(
    created: java.lang.String | stripeLib.stripeMod.IDateFilter = null,
    customer: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    source: stripeLib.Anon_AlipayaccountAll = null,
    starting_after: java.lang.String = null
  ): IChargeListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IChargeListOptions]
  }
}

