package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Email
import typings.stripe.mod.IMetadata
import typings.stripe.mod.customers.ICustomer
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
    billing_details: Email = null,
    customer: String | ICustomer = null
  ): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
}

