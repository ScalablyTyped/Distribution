package typings.stripe.stripeMod.creditNotes

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.balance.IBalanceTransaction
import typings.stripe.stripeMod.customers.ICustomer
import typings.stripe.stripeMod.invoices.IInvoice
import typings.stripe.stripeMod.refunds.IRefund
import typings.stripe.stripeStrings.credit_note
import typings.stripe.stripeStrings.issued
import typings.stripe.stripeStrings.post_payment
import typings.stripe.stripeStrings.pre_payment
import typings.stripe.stripeStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credit notes are documents that decrease the amount owed on a specified invoice.
  * Credit notes are the only way to adjust the amount of an invoice once it's been finalized
  * (other than voiding and recreating the invoice from scratch).
  */
trait ICreditNote extends IResourceObject {
  /**
    * The integer amount in cents representing the total amount of the credit note.
    */
  var amount: Double
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * ID of the customer. [Expandable]
    */
  var customer: String | ICustomer
  /**
    * Customer balance transaction related to this credit note. [Expandable]
    */
  var customer_balance_transaction: String | IBalanceTransaction
  /**
    * ID of the invoice. [Expandable]
    */
  var invoice: String | IInvoice
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Customer-facing text that appears on the credit note PDF.
    */
  var memo: String | Null
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * A unique number that identifies this particular credit note.
    * It appears on the PDF of the credit note and its associated invoice.
    */
  var number: String
  /**
    * Value is "credit_note"
    */
  @JSName("object")
  var object_ICreditNote: credit_note
  /**
    * The link to download the PDF of the credit note.
    */
  var pdf: String
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
    */
  var reason: CreditNoteReason | Null
  /**
    * Refund related to this credit note. [Expandable]
    */
  var refund: String | Null | IRefund
  /**
    * Status of this credit note, one of issued or void.
    */
  var status: issued | void
  /**
    * Type of this credit note, one of post_payment or pre_payment.
    * A pre_payment credit note means it was issued when the invoice was open.
    * A post_payment credit note means it was issued when the invoice was paid.
    */
  var `type`: post_payment | pre_payment
}

object ICreditNote {
  @scala.inline
  def apply(
    amount: Double,
    created: Double,
    currency: String,
    customer: String | ICustomer,
    customer_balance_transaction: String | IBalanceTransaction,
    id: String,
    invoice: String | IInvoice,
    livemode: Boolean,
    metadata: IMetadata,
    number: String,
    `object`: credit_note,
    pdf: String,
    status: issued | void,
    `type`: post_payment | pre_payment,
    memo: String = null,
    reason: CreditNoteReason = null,
    refund: String | IRefund = null
  ): ICreditNote = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_balance_transaction = customer_balance_transaction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (memo != null) __obj.updateDynamic("memo")(memo.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (refund != null) __obj.updateDynamic("refund")(refund.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNote]
  }
}

