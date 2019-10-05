package typings.stripe.stripeMod.paymentMethods

import typings.stripe.Anon_AddressEmail
import typings.stripe.Anon_BrandChecks
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var card: Anon_BrandChecks
  var `type`: card
}

object ICardPaymentMethod {
  @scala.inline
  def apply(
    card: Anon_BrandChecks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card,
    billing_details: Anon_AddressEmail = null,
    customer: String | ICustomer = null
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card, created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
}

