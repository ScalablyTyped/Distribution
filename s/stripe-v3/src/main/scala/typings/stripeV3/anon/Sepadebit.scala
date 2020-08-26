package typings.stripeV3.anon

import typings.stripeV3.stripe.elements.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sepadebit extends js.Object {
  /**
    * The customer's billing_details. name and email are required.
    */
  var billing_details: Email = js.native
  /**
    * An iban Element.
    */
  var sepa_debit: Element | Iban = js.native
}

object Sepadebit {
  @scala.inline
  def apply(billing_details: Email, sepa_debit: Element | Iban): Sepadebit = {
    val __obj = js.Dynamic.literal(billing_details = billing_details.asInstanceOf[js.Any], sepa_debit = sepa_debit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sepadebit]
  }
  @scala.inline
  implicit class SepadebitOps[Self <: Sepadebit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBilling_details(value: Email): Self = this.set("billing_details", value.asInstanceOf[js.Any])
    @scala.inline
    def setSepa_debit(value: Element | Iban): Self = this.set("sepa_debit", value.asInstanceOf[js.Any])
  }
  
}

