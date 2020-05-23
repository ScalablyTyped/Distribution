package typings.stripe.mod.setupIntents

import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentListOptions extends IListOptionsCreated {
  /**
    * Only return SetupIntents for the customer specified by this customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * Only return SetupIntents associated with the specified payment method.
    */
  var payment_method: js.UndefOr[String] = js.undefined
}

object ISetupIntentListOptions {
  @scala.inline
  def apply(
    created: String | IDateFilter = null,
    customer: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: js.UndefOr[Double] = js.undefined,
    payment_method: String = null,
    starting_after: String = null
  ): ISetupIntentListOptions = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentListOptions]
  }
}

