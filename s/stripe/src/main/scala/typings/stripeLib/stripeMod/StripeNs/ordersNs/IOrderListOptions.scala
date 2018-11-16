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
  var status_transitions: js.UndefOr[stripeLib.Anon_Paid] = js.undefined
}

