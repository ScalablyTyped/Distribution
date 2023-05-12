package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.BankAccount
import typings.stripe.mod.Stripe.Card
import typings.stripe.mod.Stripe.DeletedBankAccount
import typings.stripe.mod.Stripe.DeletedCard
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Payout
import typings.stripe.mod.Stripe.Payout.ReconciliationStatus
import typings.stripe.stripeStrings.payout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Payout> */
trait ResponsePayout extends StObject {
  
  /**
    * Amount (in %s) to be transferred to your bank account or debit card.
    */
  var amount: Double
  
  /**
    * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank holidays.
    */
  var arrival_date: Double
  
  /**
    * Returns `true` if the payout was created by an [automated payout schedule](https://stripe.com/docs/payouts#payout-schedule), and `false` if it was [requested manually](https://stripe.com/docs/payouts#manual-payouts).
    */
  var automatic: Boolean
  
  /**
    * ID of the balance transaction that describes the impact of this payout on your account balance.
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: String | Null
  
  /**
    * ID of the bank account or card the payout was sent to.
    */
  var destination: String | BankAccount | DeletedBankAccount | Card | DeletedCard | Null
  
  /**
    * If the payout failed or was canceled, this will be the ID of the balance transaction that reversed the initial balance transaction, and puts the funds from the failed payout back in your balance.
    */
  var failure_balance_transaction: String | BalanceTransaction | Null
  
  /**
    * Error code explaining reason for payout failure if available. See [Types of payout failures](https://stripe.com/docs/api#payout_failures) for a list of failure codes.
    */
  var failure_code: String | Null
  
  /**
    * Message to user further explaining reason for payout failure if available.
    */
  var failure_message: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
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
    * The method used to send this payout, which can be `standard` or `instant`. `instant` is only supported for payouts to debit cards. (See [Instant payouts for marketplaces](https://stripe.com/blog/instant-payouts-for-marketplaces) for more information.)
    */
  var method: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: payout
  
  /**
    * If the payout reverses another, this is the ID of the original payout.
    */
  var original_payout: String | Payout | Null
  
  /**
    * If `completed`, the [Balance Transactions API](https://stripe.com/docs/api/balance_transactions/list#balance_transaction_list-payout) may be used to list all Balance Transactions that were paid out in this payout.
    */
  var reconciliation_status: ReconciliationStatus
  
  /**
    * If the payout was reversed, this is the ID of the payout that reverses this payout.
    */
  var reversed_by: String | Payout | Null
  
  /**
    * The source balance this payout came from. One of `card`, `fpx`, or `bank_account`.
    */
  var source_type: String
  
  /**
    * Extra information about a payout to be displayed on the user's bank statement.
    */
  var statement_descriptor: String | Null
  
  /**
    * Current status of the payout: `paid`, `pending`, `in_transit`, `canceled` or `failed`. A payout is `pending` until it is submitted to the bank, when it becomes `in_transit`. The status then changes to `paid` if the transaction goes through, or to `failed` or `canceled` (within 5 business days). Some failed payouts may initially show as `paid` but then change to `failed`.
    */
  var status: String
  
  /**
    * Can be `bank_account` or `card`.
    */
  var `type`: typings.stripe.mod.Stripe.Payout.Type
}
object ResponsePayout {
  
  inline def apply(
    amount: Double,
    arrival_date: Double,
    automatic: Boolean,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    method: String,
    reconciliation_status: ReconciliationStatus,
    source_type: String,
    status: String,
    `type`: typings.stripe.mod.Stripe.Payout.Type
  ): ResponsePayout = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], arrival_date = arrival_date.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reconciliation_status = reconciliation_status.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], balance_transaction = null, description = null, destination = null, failure_balance_transaction = null, failure_code = null, failure_message = null, metadata = null, original_payout = null, reversed_by = null, statement_descriptor = null)
    __obj.updateDynamic("object")("payout")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePayout] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setArrival_date(value: Double): Self = StObject.set(x, "arrival_date", value.asInstanceOf[js.Any])
    
    inline def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDestination(value: String | BankAccount | DeletedBankAccount | Card | DeletedCard): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setFailure_balance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "failure_balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setFailure_balance_transactionNull: Self = StObject.set(x, "failure_balance_transaction", null)
    
    inline def setFailure_code(value: String): Self = StObject.set(x, "failure_code", value.asInstanceOf[js.Any])
    
    inline def setFailure_codeNull: Self = StObject.set(x, "failure_code", null)
    
    inline def setFailure_message(value: String): Self = StObject.set(x, "failure_message", value.asInstanceOf[js.Any])
    
    inline def setFailure_messageNull: Self = StObject.set(x, "failure_message", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setObject(value: payout): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOriginal_payout(value: String | Payout): Self = StObject.set(x, "original_payout", value.asInstanceOf[js.Any])
    
    inline def setOriginal_payoutNull: Self = StObject.set(x, "original_payout", null)
    
    inline def setReconciliation_status(value: ReconciliationStatus): Self = StObject.set(x, "reconciliation_status", value.asInstanceOf[js.Any])
    
    inline def setReversed_by(value: String | Payout): Self = StObject.set(x, "reversed_by", value.asInstanceOf[js.Any])
    
    inline def setReversed_byNull: Self = StObject.set(x, "reversed_by", null)
    
    inline def setSource_type(value: String): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptorNull: Self = StObject.set(x, "statement_descriptor", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Payout.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
