package typings.stripe.mod

import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.invoices.IInvoice
import typings.stripe.mod.refunds.IRefund
import typings.stripe.stripeStrings.credit_note
import typings.stripe.stripeStrings.issued
import typings.stripe.stripeStrings.post_payment
import typings.stripe.stripeStrings.pre_payment
import typings.stripe.stripeStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object creditNotes {
  
  /**
    * Reason for issuing a credit note, one of duplicate, fraudulent, order_change, or product_unsatisfactory
    */
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.duplicate
    - typings.stripe.stripeStrings.fraudulent
    - typings.stripe.stripeStrings.order_change
    - typings.stripe.stripeStrings.product_unsatisfactory
  */
  trait CreditNoteReason extends StObject
  object CreditNoteReason {
    
    @scala.inline
    def duplicate: typings.stripe.stripeStrings.duplicate = "duplicate".asInstanceOf[typings.stripe.stripeStrings.duplicate]
    
    @scala.inline
    def fraudulent: typings.stripe.stripeStrings.fraudulent = "fraudulent".asInstanceOf[typings.stripe.stripeStrings.fraudulent]
    
    @scala.inline
    def order_change: typings.stripe.stripeStrings.order_change = "order_change".asInstanceOf[typings.stripe.stripeStrings.order_change]
    
    @scala.inline
    def product_unsatisfactory: typings.stripe.stripeStrings.product_unsatisfactory = "product_unsatisfactory".asInstanceOf[typings.stripe.stripeStrings.product_unsatisfactory]
  }
  
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
    implicit class ICreditNoteMutableBuilder[Self <: ICreditNote] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_balance_transaction(value: String | IBalanceTransaction): Self = StObject.set(x, "customer_balance_transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice(value: String | IInvoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoNull: Self = StObject.set(x, "memo", null)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: credit_note): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdf(value: String): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: CreditNoteReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonNull: Self = StObject.set(x, "reason", null)
      
      @scala.inline
      def setRefund(value: String | IRefund): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefundNull: Self = StObject.set(x, "refund", null)
      
      @scala.inline
      def setStatus(value: issued | void): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: post_payment | pre_payment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class ICreditNoteCreationOptionsMutableBuilder[Self <: ICreditNoteCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredit_amount(value: Double): Self = StObject.set(x, "credit_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredit_amountUndefined: Self = StObject.set(x, "credit_amount", js.undefined)
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
      
      @scala.inline
      def setReason(value: CreditNoteReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setRefund(value: String): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
      
      @scala.inline
      def setRefund_amount(value: Double): Self = StObject.set(x, "refund_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_amountUndefined: Self = StObject.set(x, "refund_amount", js.undefined)
    }
  }
  
  @js.native
  trait ICreditNoteListOptions extends IListOptions {
    
    /**
      * ID of the invoice.
      */
    var invoice: js.UndefOr[String] = js.native
  }
  object ICreditNoteListOptions {
    
    @scala.inline
    def apply(): ICreditNoteListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICreditNoteListOptions]
    }
    
    @scala.inline
    implicit class ICreditNoteListOptionsMutableBuilder[Self <: ICreditNoteListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
    }
  }
  
  @js.native
  trait ICreditNoteUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * Credit note memo. This can be unset by updating the value to nil and then saving.
      */
    var memo: js.UndefOr[String] = js.native
  }
  object ICreditNoteUpdateOptions {
    
    @scala.inline
    def apply(): ICreditNoteUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICreditNoteUpdateOptions]
    }
    
    @scala.inline
    implicit class ICreditNoteUpdateOptionsMutableBuilder[Self <: ICreditNoteUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
    }
  }
}
