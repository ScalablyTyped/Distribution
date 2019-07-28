package typings.stripe.stripeMod.paymentMethodsNs

import typings.stripe.Anon_Address
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.customersNs.ICustomer
import typings.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePaymentMethod extends IResourceObject {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: Null | Anon_Address
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  var created: Double
  /** The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been saved to a Customer. [Expandable] */
  var customer: String | ICustomer | Null
  /** Has the value true if the object exists in live mode or the value false if the object exists in test mode. */
  var livemode: Boolean
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: IMetadata
  @JSName("object")
  var object_IBasePaymentMethod: payment_method
}

object IBasePaymentMethod {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    billing_details: Anon_Address = null,
    customer: String | ICustomer = null
  ): IBasePaymentMethod = {
    val __obj = js.Dynamic.literal(created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePaymentMethod]
  }
}

