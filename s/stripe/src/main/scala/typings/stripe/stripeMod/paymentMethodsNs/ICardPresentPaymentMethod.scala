package typings.stripe.stripeMod.paymentMethodsNs

import typings.stripe.Anon_Address
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.customersNs.ICustomer
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
    billing_details: Anon_Address = null,
    customer: String | ICustomer = null
  ): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
}

