package typings.stripe.mod.orders

import typings.stripe.AnonFulfilled
import typings.stripe.mod.IDateFilter
import typings.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderListOptions extends IListOptionsCreated {
  /**
    * Only return orders for the given customer
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * Only return orders with the given IDs
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only return orders that have the given status. One of "created", "paid", "fulfilled", or "refunded".
    */
  var status: OrderStatus
  /**
    * Filter orders based on when they were "paid", "fulfilled", "canceled", or "returned"
    */
  var status_transitions: js.UndefOr[AnonFulfilled] = js.undefined
}

object IOrderListOptions {
  @scala.inline
  def apply(
    status: OrderStatus,
    created: String | IDateFilter = null,
    customer: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    ids: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null,
    status_transitions: AnonFulfilled = null
  ): IOrderListOptions = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    if (status_transitions != null) __obj.updateDynamic("status_transitions")(status_transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderListOptions]
  }
}

