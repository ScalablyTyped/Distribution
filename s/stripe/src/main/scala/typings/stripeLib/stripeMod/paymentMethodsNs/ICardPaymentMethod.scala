package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var card: stripeLib.Anon_BrandChecks
  var `type`: stripeLib.stripeLibStrings.card
}

object ICardPaymentMethod {
  @scala.inline
  def apply(
    card: stripeLib.Anon_BrandChecks,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.payment_method,
    `type`: stripeLib.stripeLibStrings.card,
    billing_details: stripeLib.Anon_Address = null,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer = null
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card, created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
}

