package typings.stripe.mod.creditNotes

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreditNoteCreationOptions extends IDataOptionsWithMetadata {
  var amount: Double = js.native
  /**
    * The amount to credit the customer’s balance.
    * It will be automatically applied to their next invoice.
    */
  var credit_amount: js.UndefOr[Double] = js.native
  var invoice: String = js.native
  /**
    * The credit note’s memo appears on the credit note PDF. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[String] = js.native
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory.
    */
  var reason: js.UndefOr[CreditNoteReason] = js.native
  /**
    * ID of an existing refund to link this credit note to.
    */
  var refund: js.UndefOr[String] = js.native
  /**
    * The amount to refund. If set, a refund will be created for the charge associated with the invoice.
    */
  var refund_amount: js.UndefOr[Double] = js.native
}

object ICreditNoteCreationOptions {
  @scala.inline
  def apply(amount: Double, invoice: String): ICreditNoteCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNoteCreationOptions]
  }
  @scala.inline
  implicit class ICreditNoteCreationOptionsOps[Self <: ICreditNoteCreationOptions] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoice(value: String): Self = this.set("invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit_amount(value: Double): Self = this.set("credit_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit_amount: Self = this.set("credit_amount", js.undefined)
    @scala.inline
    def setMemo(value: String): Self = this.set("memo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemo: Self = this.set("memo", js.undefined)
    @scala.inline
    def setReason(value: CreditNoteReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRefund(value: String): Self = this.set("refund", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund: Self = this.set("refund", js.undefined)
    @scala.inline
    def setRefund_amount(value: Double): Self = this.set("refund_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_amount: Self = this.set("refund_amount", js.undefined)
  }
  
}

