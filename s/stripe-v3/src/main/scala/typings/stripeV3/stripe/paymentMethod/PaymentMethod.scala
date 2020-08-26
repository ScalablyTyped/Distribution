package typings.stripeV3.stripe.paymentMethod

import typings.stripeV3.stripe.BillingDetails
import typings.stripeV3.stripe.Metadata
import typings.stripeV3.stripeV3Strings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethod extends js.Object {
  /**
    * Billing information associated with the PaymentMethod that may be
    * used or required by particular types of payment methods.
    */
  var billing_details: BillingDetails = js.native
  /**
    * If this is a card PaymentMethod, this hash contains details about the card.
    */
  var card: js.UndefOr[PaymentMethodCard] = js.native
  /**
    * If this is an card_present PaymentMethod, this hash contains details
    * about the Card Present payment method.
    */
  var card_present: js.UndefOr[js.Any] = js.native
  /**
    * Time at which the object was created. Measured in seconds since the
    * Unix epoch.
    */
  var created: Double = js.native
  /**
    * The ID of the Customer to which this PaymentMethod is saved.
    * This will not be set when the PaymentMethod has not been saved to a Customer.
    */
  var customer: String | Null = js.native
  /**
    * The unique identifier for the object
    */
  var id: String = js.native
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var metadata: Metadata = js.native
  /**
    * Value is "payment_method"
    */
  var `object`: payment_method = js.native
  /**
    * The type of the PaymentMethod. An additional hash is included on the
    * PaymentMethod with a name matching this value. It contains additional
    * information specific to the PaymentMethod type.
    */
  var `type`: String = js.native
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
    `type`: String
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  @scala.inline
  implicit class PaymentMethodOps[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBilling_details(value: BillingDetails): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: payment_method): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCard(value: PaymentMethodCard): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setCard_present(value: js.Any): Self = this.set("card_present", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard_present: Self = this.set("card_present", js.undefined)
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerNull: Self = this.set("customer", null)
  }
  
}

