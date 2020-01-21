package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripe.BillingDetails
import typings.stripeV3.stripe.Metadata
import typings.stripeV3.stripeV3Strings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethod extends js.Object {
  /**
    * Billing information associated with the PaymentMethod that may be
    * used or required by particular types of payment methods.
    */
  var billing_details: BillingDetails
  /**
    * If this is a card PaymentMethod, this hash contains details about the card.
    */
  var card: js.UndefOr[PaymentMethodCard] = js.undefined
  /**
    * If this is an card_present PaymentMethod, this hash contains details
    * about the Card Present payment method.
    */
  var card_present: js.UndefOr[js.Any] = js.undefined
  /**
    * Time at which the object was created. Measured in seconds since the
    * Unix epoch.
    */
  var created: Double
  /**
    * The ID of the Customer to which this PaymentMethod is saved.
    * This will not be set when the PaymentMethod has not been saved to a Customer.
    */
  var customer: String | Null
  /**
    * The unique identifier for the object
    */
  var id: String
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean
  var metadata: Metadata
  /**
    * Value is "payment_method"
    */
  var `object`: payment_method
  /**
    * The type of the PaymentMethod. An additional hash is included on the
    * PaymentMethod with a name matching this value. It contains additional
    * information specific to the PaymentMethod type.
    */
  var `type`: String
}

object PaymentMethod {
  @scala.inline
  def apply(
    billing_details: BillingDetails,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    `object`: payment_method,
    `type`: String,
    card: PaymentMethodCard = null,
    card_present: js.Any = null,
    customer: String = null
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (card_present != null) __obj.updateDynamic("card_present")(card_present.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
}

