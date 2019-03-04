package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrder
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount for the order.
    */
  var amount: scala.Double
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount returned for the order thus far.
    */
  var amount_returned: scala.Double
  /**
    * ID of the Connect Application that created the order.
    */
  var application: java.lang.String
  var application_fee: scala.Double
  /**
    * The ID of the payment used to pay for the order. Present if the order status is paid, fulfilled, or refunded. [Expandable]
    */
  var charge: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge
  var created: scala.Double
  /**
    * 3-letter ISO code representing the currency in which the order was made.
    */
  var currency: java.lang.String
  /**
    * The customer used for the order. [Expandable]
    */
  var customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer
  /**
    * The email address of the customer placing the order.
    */
  var email: java.lang.String
  var external_coupon_code: java.lang.String
  /**
    * List of items constituting the order.
    */
  var items: js.Array[IOrderItem]
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is "order"
    */
  @JSName("object")
  var object_IOrder: stripeLib.stripeLibStrings.order
  /**
    * The shipping method that is currently selected for this order, if any. If present, it is equal to one of the ids of shipping methods
    * in the shipping_methods array. At order creation time, if there are multiple shipping methods, Stripe will automatically selected
    * the first method.
    */
  var selected_shipping_method: java.lang.String
  /**
    * The shipping address for the order. Present if the order is for goods to be shipped.
    */
  var shipping: stripeLib.stripeMod.StripeNs.IShippingInformation
  /**
    * A list of supported shipping methods for this order. The desired shipping method can be specified either by updating the order, or
    * when paying it.
    */
  var shipping_methods: js.Array[IShippingMethod]
  var status: OrderStatus
  /**
    * The timestamps at which the order status was updated
    */
  var status_transitions: stripeLib.Anon_Canceled
  var updated: scala.Double
}

object IOrder {
  @scala.inline
  def apply(
    amount: scala.Double,
    amount_returned: scala.Double,
    application: java.lang.String,
    application_fee: scala.Double,
    charge: java.lang.String | stripeLib.stripeMod.StripeNs.chargesNs.ICharge,
    created: scala.Double,
    currency: java.lang.String,
    customer: java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer,
    email: java.lang.String,
    external_coupon_code: java.lang.String,
    id: java.lang.String,
    items: js.Array[IOrderItem],
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.order,
    selected_shipping_method: java.lang.String,
    shipping: stripeLib.stripeMod.StripeNs.IShippingInformation,
    shipping_methods: js.Array[IShippingMethod],
    status: OrderStatus,
    status_transitions: stripeLib.Anon_Canceled,
    updated: scala.Double
  ): IOrder = {
    val __obj = js.Dynamic.literal(amount = amount, amount_returned = amount_returned, application = application, application_fee = application_fee, charge = charge.asInstanceOf[js.Any], created = created, currency = currency, customer = customer.asInstanceOf[js.Any], email = email, external_coupon_code = external_coupon_code, id = id, items = items, livemode = livemode, metadata = metadata, selected_shipping_method = selected_shipping_method, shipping = shipping, shipping_methods = shipping_methods, status = status, status_transitions = status_transitions, updated = updated)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IOrder]
  }
}

