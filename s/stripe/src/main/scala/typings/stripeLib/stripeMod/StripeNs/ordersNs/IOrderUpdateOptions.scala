package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOrderUpdateOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
               */
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The shipping method to select for fulfilling this order. If specified, must be one of the ids of a shipping method in the
               * shipping_methods array. If specified, will overwrite the existing selected shipping method, updating items as necessary.
               */
  var selected_shipping_method: js.UndefOr[java.lang.String] = js.undefined
  var status: OrderStatus
}

