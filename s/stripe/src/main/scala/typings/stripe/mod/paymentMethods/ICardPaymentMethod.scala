package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Checks
import typings.stripe.anon.Email
import typings.stripe.mod.IMetadata
import typings.stripe.mod.customers.ICustomer
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var card: Checks
  var `type`: card
}

object ICardPaymentMethod {
  @scala.inline
  def apply(
    card: Checks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card,
    billing_details: Email = null,
    customer: String | ICustomer = null
  ): ICardPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], billing_details = billing_details.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPaymentMethod]
  }
}

