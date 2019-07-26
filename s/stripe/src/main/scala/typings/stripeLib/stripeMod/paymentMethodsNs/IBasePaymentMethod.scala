package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePaymentMethod
  extends stripeLib.stripeMod.IResourceObject {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: scala.Null | stripeLib.Anon_Address
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  var created: scala.Double
  /** The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been saved to a Customer. [Expandable] */
  var customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer | scala.Null
  /** Has the value true if the object exists in live mode or the value false if the object exists in test mode. */
  var livemode: scala.Boolean
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: stripeLib.stripeMod.IMetadata
  @JSName("object")
  var object_IBasePaymentMethod: stripeLib.stripeLibStrings.payment_method
}

object IBasePaymentMethod {
  @scala.inline
  def apply(
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.payment_method,
    billing_details: stripeLib.Anon_Address = null,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer = null
  ): IBasePaymentMethod = {
    val __obj = js.Dynamic.literal(created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePaymentMethod]
  }
}

