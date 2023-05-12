package typings.stripe.anon

import typings.stripe.mod.Stripe.CreditNote
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.customer_balance_transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.CustomerBalanceTransaction> */
trait ResponseCustomerBalanceTr extends StObject {
  
  /**
    * The amount of the transaction. A negative value is a credit for the customer's balance, and a positive value is a debit to the customer's `balance`.
    */
  var amount: Double
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The ID of the credit note (if any) related to the transaction.
    */
  var credit_note: String | CreditNote | Null
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * The ID of the customer the transaction belongs to.
    */
  var customer: String | Customer
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * The customer's `balance` after the transaction was applied. A negative value decreases the amount due on the customer's next invoice. A positive value increases the amount due on the customer's next invoice.
    */
  var ending_balance: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The ID of the invoice (if any) related to the transaction.
    */
  var invoice: String | Invoice | Null
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: customer_balance_transaction
  
  /**
    * Transaction type: `adjustment`, `applied_to_invoice`, `credit_note`, `initial`, `invoice_overpaid`, `invoice_too_large`, `invoice_too_small`, `unspent_receiver_credit`, or `unapplied_from_invoice`. See the [Customer Balance page](https://stripe.com/docs/billing/customer/balance#types) to learn more about transaction types.
    */
  var `type`: typings.stripe.mod.Stripe.CustomerBalanceTransaction.Type
}
object ResponseCustomerBalanceTr {
  
  inline def apply(
    amount: Double,
    created: Double,
    currency: String,
    customer: String | Customer,
    ending_balance: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    `type`: typings.stripe.mod.Stripe.CustomerBalanceTransaction.Type
  ): ResponseCustomerBalanceTr = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], ending_balance = ending_balance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], credit_note = null, description = null, invoice = null, metadata = null)
    __obj.updateDynamic("object")("customer_balance_transaction")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCustomerBalanceTr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCustomerBalanceTr] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCredit_note(value: String | CreditNote): Self = StObject.set(x, "credit_note", value.asInstanceOf[js.Any])
    
    inline def setCredit_noteNull: Self = StObject.set(x, "credit_note", null)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnding_balance(value: Double): Self = StObject.set(x, "ending_balance", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String | Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNull: Self = StObject.set(x, "invoice", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: customer_balance_transaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.CustomerBalanceTransaction.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
