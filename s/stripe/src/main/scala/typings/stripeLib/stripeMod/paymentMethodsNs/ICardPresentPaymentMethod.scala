package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPresentPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var `type`: stripeLib.stripeLibStrings.card_present
}

object ICardPresentPaymentMethod {
  @scala.inline
  def apply(
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    `object`: stripeLib.stripeLibStrings.payment_method,
    `type`: stripeLib.stripeLibStrings.card_present,
    billing_details: stripeLib.Anon_Address = null,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer = null
  ): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
}

