package typings.stripe.mod.creditNotes

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.invoices.IInvoice
import typings.stripe.mod.refunds.IRefund
import typings.stripe.stripeStrings.credit_note
import typings.stripe.stripeStrings.issued
import typings.stripe.stripeStrings.post_payment
import typings.stripe.stripeStrings.pre_payment
import typings.stripe.stripeStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Credit notes are documents that decrease the amount owed on a specified invoice.
  * Credit notes are the only way to adjust the amount of an invoice once it's been finalized
  * (other than voiding and recreating the invoice from scratch).
  */
@js.native
trait ICreditNote extends IResourceObject {
  
  /**
    * The integer amount in cents representing the total amount of the credit note.
    */
  var amount: Double = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  
  /**
    * ID of the customer. [Expandable]
    */
  var customer: String | ICustomer = js.native
  
  /**
    * Customer balance transaction related to this credit note. [Expandable]
    */
  var customer_balance_transaction: String | IBalanceTransaction = js.native
  
  /**
    * ID of the invoice. [Expandable]
    */
  var invoice: String | IInvoice = js.native
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  
  /**
    * Customer-facing text that appears on the credit note PDF.
    */
  var memo: String | Null = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  
  /**
    * A unique number that identifies this particular credit note.
    * It appears on the PDF of the credit note and its associated invoice.
    */
  var number: String = js.native
  
  /**
    * Value is "credit_note"
    */
  @JSName("object")
  var object_ICreditNote: credit_note = js.native
  
  /**
    * The link to download the PDF of the credit note.
    */
  var pdf: String = js.native
  
  /**
    * Reason for issuing this credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
    */
  var reason: CreditNoteReason | Null = js.native
  
  /**
    * Refund related to this credit note. [Expandable]
    */
  var refund: String | Null | IRefund = js.native
  
  /**
    * Status of this credit note, one of issued or void.
    */
  var status: issued | void = js.native
  
  /**
    * Type of this credit note, one of post_payment or pre_payment.
    * A pre_payment credit note means it was issued when the invoice was open.
    * A post_payment credit note means it was issued when the invoice was paid.
    */
  var `type`: post_payment | pre_payment = js.native
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
    `type`: post_payment | pre_payment
  ): ICreditNote = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], customer_balance_transaction = customer_balance_transaction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreditNote]
  }
  
  @scala.inline
  implicit class ICreditNoteOps[Self <: ICreditNote] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String | ICustomer): Self = this.set("customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_balance_transaction(value: String | IBalanceTransaction): Self = this.set("customer_balance_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoice(value: String | IInvoice): Self = this.set("invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: credit_note): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdf(value: String): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: issued | void): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: post_payment | pre_payment): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemo(value: String): Self = this.set("memo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoNull: Self = this.set("memo", null)
    
    @scala.inline
    def setReason(value: CreditNoteReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = this.set("reason", null)
    
    @scala.inline
    def setRefund(value: String | IRefund): Self = this.set("refund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundNull: Self = this.set("refund", null)
  }
}
