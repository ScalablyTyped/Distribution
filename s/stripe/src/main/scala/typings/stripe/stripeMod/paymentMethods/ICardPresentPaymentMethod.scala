package typings.stripe.stripeMod.paymentMethods

import typings.stripe.Anon_AddressEmail
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeStrings.card_present
import typings.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPresentPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var `type`: card_present
}

object ICardPresentPaymentMethod {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card_present,
    billing_details: Anon_AddressEmail = null,
    customer: String | ICustomer = null
  ): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
}

