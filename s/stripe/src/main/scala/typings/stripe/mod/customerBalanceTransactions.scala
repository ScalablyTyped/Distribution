package typings.stripe.mod

import typings.stripe.stripeStrings.customer_balance_transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerBalanceTransactions {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.adjustment
    - typings.stripe.stripeStrings.applied_to_invoice
    - typings.stripe.stripeStrings.credit_note
    - typings.stripe.stripeStrings.initial
    - typings.stripe.stripeStrings.invoice_too_large
    - typings.stripe.stripeStrings.invoice_too_small
    - typings.stripe.stripeStrings.unspent_receiver_credit
  */
  trait CustomerBalanceTransactionType extends StObject
  object CustomerBalanceTransactionType {
    
    @scala.inline
    def adjustment: typings.stripe.stripeStrings.adjustment = "adjustment".asInstanceOf[typings.stripe.stripeStrings.adjustment]
    
    @scala.inline
    def applied_to_invoice: typings.stripe.stripeStrings.applied_to_invoice = "applied_to_invoice".asInstanceOf[typings.stripe.stripeStrings.applied_to_invoice]
    
    @scala.inline
    def credit_note: typings.stripe.stripeStrings.credit_note = "credit_note".asInstanceOf[typings.stripe.stripeStrings.credit_note]
    
    @scala.inline
    def initial: typings.stripe.stripeStrings.initial = "initial".asInstanceOf[typings.stripe.stripeStrings.initial]
    
    @scala.inline
    def invoice_too_large: typings.stripe.stripeStrings.invoice_too_large = "invoice_too_large".asInstanceOf[typings.stripe.stripeStrings.invoice_too_large]
    
    @scala.inline
    def invoice_too_small: typings.stripe.stripeStrings.invoice_too_small = "invoice_too_small".asInstanceOf[typings.stripe.stripeStrings.invoice_too_small]
    
    @scala.inline
    def unspent_receiver_credit: typings.stripe.stripeStrings.unspent_receiver_credit = "unspent_receiver_credit".asInstanceOf[typings.stripe.stripeStrings.unspent_receiver_credit]
  }
  
  @js.native
  trait ICustomerBalanceTransaction extends IResourceObject {
    
    /**
      * The amount of the transaction. A negative value is a credit for the customer’s balance, and a positive
      * value is a debit to the customer’s balance.
      */
    var amount: Double = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * The ID of the credit note (if any) related to the transaction. [Expandable]
      */
    var credit_note: String | Null = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String = js.native
    
    /**
      * The ID of the customer the transaction belongs to. [Expandable]
      */
    var customer: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: String | Null = js.native
    
    /**
      * The customer’s balance after the transaction was applied. A negative value decreases the amount due
      * on the customer’s next invoice. A positive value increases the amount due on the customer’s next invoice.
      */
    var ending_balance: Double = js.native
    
    /**
      * The ID of the invoice (if any) related to the transaction. [Expandable]
      */
    var invoice: String | Null = js.native
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
      * information about the object in a structured format.
      */
    var metadata: IMetadata | Null = js.native
    
    /**
      * Value is "customer_balance_transaction"
      */
    @JSName("object")
    var object_ICustomerBalanceTransaction: customer_balance_transaction = js.native
    
    /**
      * Transaction type. See the Customer Balance page to learn more about transaction types.
      */
    var `type`: CustomerBalanceTransactionType = js.native
  }
  object ICustomerBalanceTransaction {
    
    @scala.inline
    def apply(
      amount: Double,
      created: Double,
      currency: String,
      customer: String,
      ending_balance: Double,
      id: String,
      livemode: Boolean,
      `object`: customer_balance_transaction,
      `type`: CustomerBalanceTransactionType
    ): ICustomerBalanceTransaction = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], ending_balance = ending_balance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomerBalanceTransaction]
    }
    
    @scala.inline
    implicit class ICustomerBalanceTransactionMutableBuilder[Self <: ICustomerBalanceTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredit_note(value: String): Self = StObject.set(x, "credit_note", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredit_noteNull: Self = StObject.set(x, "credit_note", null)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setEnding_balance(value: Double): Self = StObject.set(x, "ending_balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoiceNull: Self = StObject.set(x, "invoice", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataNull: Self = StObject.set(x, "metadata", null)
      
      @scala.inline
      def setObject(value: customer_balance_transaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CustomerBalanceTransactionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICustomerBalanceTransactionCreationOptions extends StObject {
    
    /**
      * The integer amount in cents to apply to the customer’s balance. Pass a negative amount to credit the
      * customer’s balance, and pass in a positive amount to debit the customer’s balance.
      */
    var amount: Double = js.native
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency. If the customer’s currency
      * is set, this value must match it. If the customer’s currency is not set, it will be updated to this value.
      */
    var currency: String = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
      * information about the object in a structured format.
      */
    var metadata: js.UndefOr[IMetadata] = js.native
  }
  object ICustomerBalanceTransactionCreationOptions {
    
    @scala.inline
    def apply(amount: Double, currency: String): ICustomerBalanceTransactionCreationOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomerBalanceTransactionCreationOptions]
    }
    
    @scala.inline
    implicit class ICustomerBalanceTransactionCreationOptionsMutableBuilder[Self <: ICustomerBalanceTransactionCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait ICustomerBalanceTransactionUpdateOptions extends StObject {
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional
      * information about the object in a structured format.
      */
    var metadata: js.UndefOr[IMetadata] = js.native
  }
  object ICustomerBalanceTransactionUpdateOptions {
    
    @scala.inline
    def apply(): ICustomerBalanceTransactionUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomerBalanceTransactionUpdateOptions]
    }
    
    @scala.inline
    implicit class ICustomerBalanceTransactionUpdateOptionsMutableBuilder[Self <: ICustomerBalanceTransactionUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
