package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOrderCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
               */
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
               * 3-letter ISO code representing the currency in which the order should be made. Stripe will validate that all entries in items match
               * the currency specified here.
               */
  var currency: java.lang.String
  /**
               * The ID of an existing customer to use for this order. If provided, the customer email and shipping address will be used to create
               * the order. Subsequently, the customer will also be charged to pay the order. If email or shipping are also provided, they will
               * override the values retrieved from the customer object.
               */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The email address of the customer placing the order.
               */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
               * List of items constituting the order.
               */
  var items: js.UndefOr[js.Array[IOrderItemCreationHash]] = js.undefined
  /**
               * Shipping address for the order. Required if any of the SKUs are for products that have shippable set to true.
               */
  var shipping: js.UndefOr[stripeLib.stripeMod.StripeNs.IShippingInformation] = js.undefined
}

