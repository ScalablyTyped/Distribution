package typings
package stripeLib.stripeMod.creditNotesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credit notes are documents that decrease the amount owed on a specified invoice.
  * Credit notes are the only way to adjust the amount of an invoice once it's been finalized
  * (other than voiding and recreating the invoice from scratch).
  */
trait ICreditNote
  extends stripeLib.stripeMod.IResourceObject {
  /**
    * The integer amount in cents representing the total amount of the credit note.
    */
  var amount: scala.Double
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: java.lang.String
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: java.lang.String
  /**
    * ID of the customer. [Expandable]
    */
  var customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer
  /**
    * Customer balance transaction related to this credit note. [Expandable]
    */
  var customer_balance_transaction: java.lang.String | stripeLib.stripeMod.balanceNs.IBalanceTransaction
  /**
    * ID of the invoice. [Expandable]
    */
  var invoice: java.lang.String | stripeLib.stripeMod.invoicesNs.IInvoice
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: scala.Boolean
  /**
    * Customer-facing text that appears on the credit note PDF.
    */
  var memo: java.lang.String | scala.Null
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: stripeLib.stripeMod.IMetadata
  /**
    * A unique number that identifies this particular credit note.
    * It appears on the PDF of the credit note and its associated invoice.
    */
  var number: java.lang.String
  /**
    * Value is "credit_note"
    */
  @JSName("object")
  var object_ICreditNote: stripeLib.stripeLibStrings.credit_note
  /**
    * The link to download the PDF of the credit note.
    */
  var pdf: java.lang.String
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
    */
  var reason: CreditNoteReason | scala.Null
  /**
    * Refund related to this credit note. [Expandable]
    */
  var refund: java.lang.String | scala.Null | stripeLib.stripeMod.refundsNs.IRefund
  /**
    * Status of this credit note, one of issued or void.
    */
  var status: stripeLib.stripeLibStrings.issued | stripeLib.stripeLibStrings.void
  /**
    * Type of this credit note, one of post_payment or pre_payment.
    * A pre_payment credit note means it was issued when the invoice was open.
    * A post_payment credit note means it was issued when the invoice was paid.
    */
  var `type`: stripeLib.stripeLibStrings.post_payment | stripeLib.stripeLibStrings.pre_payment
}

object ICreditNote {
  @scala.inline
  def apply(
    amount: scala.Double,
    created: java.lang.String,
    currency: java.lang.String,
    customer: java.lang.String | stripeLib.stripeMod.customersNs.ICustomer,
    customer_balance_transaction: java.lang.String | stripeLib.stripeMod.balanceNs.IBalanceTransaction,
    id: java.lang.String,
    invoice: java.lang.String | stripeLib.stripeMod.invoicesNs.IInvoice,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.IMetadata,
    number: java.lang.String,
    `object`: stripeLib.stripeLibStrings.credit_note,
    pdf: java.lang.String,
    status: stripeLib.stripeLibStrings.issued | stripeLib.stripeLibStrings.void,
    `type`: stripeLib.stripeLibStrings.post_payment | stripeLib.stripeLibStrings.pre_payment,
    memo: java.lang.String = null,
    reason: CreditNoteReason = null,
    refund: java.lang.String | stripeLib.stripeMod.refundsNs.IRefund = null
  ): ICreditNote = {
    val __obj = js.Dynamic.literal(amount = amount, created = created, currency = currency, customer = customer.asInstanceOf[js.Any], customer_balance_transaction = customer_balance_transaction.asInstanceOf[js.Any], id = id, invoice = invoice.asInstanceOf[js.Any], livemode = livemode, metadata = metadata, number = number, pdf = pdf, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (refund != null) __obj.updateDynamic("refund")(refund.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNote]
  }
}

