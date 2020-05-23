package typings.stripe.mod.orders

import typings.stripe.anon.Canceled
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.charges.ICharge
import typings.stripe.mod.customers.ICustomer
import typings.stripe.stripeStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrder extends IResourceObject {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount for the order.
    */
  var amount: Double
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal
    * currency) representing the total amount returned for the order thus far.
    */
  var amount_returned: Double
  /**
    * ID of the Connect Application that created the order.
    */
  var application: String
  var application_fee: Double
  /**
    * The ID of the payment used to pay for the order. Present if the order status is paid, fulfilled, or refunded. [Expandable]
    */
  var charge: String | ICharge
  var created: Double
  /**
    * 3-letter ISO code representing the currency in which the order was made.
    */
  var currency: String
  /**
    * The customer used for the order. [Expandable]
    */
  var customer: String | ICustomer
  /**
    * The email address of the customer placing the order.
    */
  var email: String
  var external_coupon_code: String
  /**
    * List of items constituting the order.
    */
  var items: js.Array[IOrderItem]
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is "order"
    */
  @JSName("object")
  var object_IOrder: order
  /**
    * The shipping method that is currently selected for this order, if any. If present, it is equal to one of the ids of shipping methods
    * in the shipping_methods array. At order creation time, if there are multiple shipping methods, Stripe will automatically selected
    * the first method.
    */
  var selected_shipping_method: String
  /**
    * The shipping address for the order. Present if the order is for goods to be shipped.
    */
  var shipping: IShippingInformation
  /**
    * A list of supported shipping methods for this order. The desired shipping method can be specified either by updating the order, or
    * when paying it.
    */
  var shipping_methods: js.Array[IShippingMethod]
  var status: OrderStatus
  /**
    * The timestamps at which the order status was updated
    */
  var status_transitions: Canceled
  var updated: Double
}

object IOrder {
  @scala.inline
  def apply(
    amount: Double,
    amount_returned: Double,
    application: String,
    application_fee: Double,
    charge: String | ICharge,
    created: Double,
    currency: String,
    customer: String | ICustomer,
    email: String,
    external_coupon_code: String,
    id: String,
    items: js.Array[IOrderItem],
    livemode: Boolean,
    metadata: IMetadata,
    `object`: order,
    selected_shipping_method: String,
    shipping: IShippingInformation,
    shipping_methods: js.Array[IShippingMethod],
    status: OrderStatus,
    status_transitions: Canceled,
    updated: Double
  ): IOrder = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_coupon_code = external_coupon_code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], selected_shipping_method = selected_shipping_method.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], shipping_methods = shipping_methods.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_transitions = status_transitions.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrder]
  }
}

