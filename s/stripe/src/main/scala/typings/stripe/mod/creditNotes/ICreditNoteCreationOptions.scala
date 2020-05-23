package typings.stripe.mod.creditNotes

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreditNoteCreationOptions extends IDataOptionsWithMetadata {
  var amount: Double
  /**
    * The amount to credit the customer’s balance.
    * It will be automatically applied to their next invoice.
    */
  var credit_amount: js.UndefOr[Double] = js.undefined
  var invoice: String
  /**
    * The credit note’s memo appears on the credit note PDF. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[String] = js.undefined
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory.
    */
  var reason: js.UndefOr[CreditNoteReason] = js.undefined
  /**
    * ID of an existing refund to link this credit note to.
    */
  var refund: js.UndefOr[String] = js.undefined
  /**
    * The amount to refund. If set, a refund will be created for the charge associated with the invoice.
    */
  var refund_amount: js.UndefOr[Double] = js.undefined
}

object ICreditNoteCreationOptions {
  @scala.inline
  def apply(
    amount: Double,
    invoice: String,
    credit_amount: js.UndefOr[Double] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    memo: String = null,
    metadata: IOptionsMetadata = null,
    reason: CreditNoteReason = null,
    refund: String = null,
    refund_amount: js.UndefOr[Double] = js.undefined
  ): ICreditNoteCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any])
    if (!js.isUndefined(credit_amount)) __obj.updateDynamic("credit_amount")(credit_amount.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (refund != null) __obj.updateDynamic("refund")(refund.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_amount)) __obj.updateDynamic("refund_amount")(refund_amount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNoteCreationOptions]
  }
}

