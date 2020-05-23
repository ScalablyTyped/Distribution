package typings.stripeV3.stripe

import typings.stripeV3.anon.Bank
import typings.stripeV3.anon.Iban
import typings.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodData extends js.Object {
  var billing_details: js.UndefOr[BillingDetails] = js.undefined
  var card: js.UndefOr[Element] = js.undefined
  var ideal: js.UndefOr[Element | Bank] = js.undefined
  var sepa_debit: js.UndefOr[Element | Iban] = js.undefined
  /**
    * Billing information associated with the PaymentMethod
    * that may be used or required by particular types of
    * payment methods.
    */
  var `type`: String
}

object PaymentMethodData {
  @scala.inline
  def apply(
    `type`: String,
    billing_details: BillingDetails = null,
    card: Element = null,
    ideal: Element | Bank = null,
    sepa_debit: Element | Iban = null
  ): PaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (ideal != null) __obj.updateDynamic("ideal")(ideal.asInstanceOf[js.Any])
    if (sepa_debit != null) __obj.updateDynamic("sepa_debit")(sepa_debit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
}

