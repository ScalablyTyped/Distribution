package typings
package stripeLib.stripeMod.creditNotesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreditNoteCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  var amount: scala.Double
  /**
    * The amount to credit the customer’s balance.
    * It will be automatically applied to their next invoice.
    */
  var credit_amount: js.UndefOr[scala.Double] = js.undefined
  var invoice: java.lang.String
  /**
    * The credit note’s memo appears on the credit note PDF. This can be unset by updating the value to nil and then saving.
    */
  var memo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory.
    */
  var reason: js.UndefOr[CreditNoteReason] = js.undefined
  /**
    * ID of an existing refund to link this credit note to.
    */
  var refund: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The amount to refund. If set, a refund will be created for the charge associated with the invoice.
    */
  var refund_amount: js.UndefOr[scala.Double] = js.undefined
}

object ICreditNoteCreationOptions {
  @scala.inline
  def apply(
    amount: scala.Double,
    invoice: java.lang.String,
    credit_amount: scala.Int | scala.Double = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    memo: java.lang.String = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    reason: CreditNoteReason = null,
    refund: java.lang.String = null,
    refund_amount: scala.Int | scala.Double = null
  ): ICreditNoteCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, invoice = invoice)
    if (credit_amount != null) __obj.updateDynamic("credit_amount")(credit_amount.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (refund != null) __obj.updateDynamic("refund")(refund)
    if (refund_amount != null) __obj.updateDynamic("refund_amount")(refund_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNoteCreationOptions]
  }
}

