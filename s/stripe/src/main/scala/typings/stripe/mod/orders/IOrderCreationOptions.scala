package typings.stripe.mod.orders

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IShippingInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
    */
  var coupon: js.UndefOr[String] = js.undefined
  /**
    * 3-letter ISO code representing the currency in which the order should be made. Stripe will validate that all entries in items match
    * the currency specified here.
    */
  var currency: String
  /**
    * The ID of an existing customer to use for this order. If provided, the customer email and shipping address will be used to create
    * the order. Subsequently, the customer will also be charged to pay the order. If email or shipping are also provided, they will
    * override the values retrieved from the customer object.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * The email address of the customer placing the order.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * List of items constituting the order.
    */
  var items: js.UndefOr[js.Array[IOrderItemCreationHash]] = js.undefined
  /**
    * Shipping address for the order. Required if any of the SKUs are for products that have shippable set to true.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
}

object IOrderCreationOptions {
  @scala.inline
  def apply(
    currency: String,
    coupon: String = null,
    customer: String = null,
    email: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    items: js.Array[IOrderItemCreationHash] = null,
    metadata: IOptionsMetadata = null,
    shipping: IShippingInformation = null
  ): IOrderCreationOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    if (coupon != null) __obj.updateDynamic("coupon")(coupon.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderCreationOptions]
  }
}

