package typings.stripeV3.anon

import typings.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sepadebit extends js.Object {
  /**
    * The customer's billing_details. name and email are required.
    */
  var billing_details: Email
  /**
    * An iban Element.
    */
  var sepa_debit: Element | Iban
}

object Sepadebit {
  @scala.inline
  def apply(billing_details: Email, sepa_debit: Element | Iban): Sepadebit = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], sepa_debit = sepa_debit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sepadebit]
  }
}

