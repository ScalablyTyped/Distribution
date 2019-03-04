package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * Only return orders for the given customer
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only return orders with the given IDs
    */
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Only return orders that have the given status. One of "created", "paid", "fulfilled", or "refunded".
    */
  var status: OrderStatus
  /**
    * Filter orders based on when they were "paid", "fulfilled", "canceled", or "returned"
    */
  var status_transitions: js.UndefOr[stripeLib.Anon_CanceledFulfilled] = js.undefined
}

object IOrderListOptions {
  @scala.inline
  def apply(
    status: OrderStatus,
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    customer: java.lang.String = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    ids: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null,
    status_transitions: stripeLib.Anon_CanceledFulfilled = null
  ): IOrderListOptions = {
    val __obj = js.Dynamic.literal(status = status)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    if (status_transitions != null) __obj.updateDynamic("status_transitions")(status_transitions)
    __obj.asInstanceOf[IOrderListOptions]
  }
}

