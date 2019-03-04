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

object IOrderCreationOptions {
  @scala.inline
  def apply(
    currency: java.lang.String,
    coupon: java.lang.String = null,
    customer: java.lang.String = null,
    email: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    items: js.Array[IOrderItemCreationHash] = null,
    metadata: stripeLib.stripeMod.StripeNs.IOptionsMetadata = null,
    shipping: stripeLib.stripeMod.StripeNs.IShippingInformation = null
  ): IOrderCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency)
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (items != null) __obj.updateDynamic("items")(items)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    __obj.asInstanceOf[IOrderCreationOptions]
  }
}

