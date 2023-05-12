package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Issuing.Authorization.AmountDetails
import typings.stripe.mod.Stripe.Issuing.Authorization.AuthorizationMethod
import typings.stripe.mod.Stripe.Issuing.Authorization.MerchantData
import typings.stripe.mod.Stripe.Issuing.Authorization.NetworkData
import typings.stripe.mod.Stripe.Issuing.Authorization.PendingRequest
import typings.stripe.mod.Stripe.Issuing.Authorization.RequestHistory
import typings.stripe.mod.Stripe.Issuing.Authorization.Status
import typings.stripe.mod.Stripe.Issuing.Authorization.Treasury
import typings.stripe.mod.Stripe.Issuing.Authorization.VerificationData
import typings.stripe.mod.Stripe.Issuing.Card
import typings.stripe.mod.Stripe.Issuing.Cardholder
import typings.stripe.mod.Stripe.Issuing.Transaction
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.issuingDotauthorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Issuing.Authorization> */
trait ResponseAuthorization extends StObject {
  
  /**
    * The total amount that was authorized or rejected. This amount is in the card's currency and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var amount: Double
  
  /**
    * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var amount_details: AmountDetails | Null
  
  /**
    * Whether the authorization has been approved.
    */
  var approved: Boolean
  
  /**
    * How the card details were provided.
    */
  var authorization_method: AuthorizationMethod
  
  /**
    * List of balance transactions associated with this authorization.
    */
  var balance_transactions: js.Array[BalanceTransaction]
  
  /**
    * You can [create physical or virtual cards](https://stripe.com/docs/issuing/cards) that are issued to cardholders.
    */
  var card: Card
  
  /**
    * The cardholder to whom this authorization belongs.
    */
  var cardholder: String | Cardholder | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
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
    * The total amount that was authorized or rejected. This amount is in the `merchant_currency` and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var merchant_amount: Double
  
  /**
    * The currency that was presented to the cardholder for the authorization. Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var merchant_currency: String
  
  var merchant_data: MerchantData
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * Details about the authorization, such as identifiers, set by the card network.
    */
  var network_data: NetworkData | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: issuingDotauthorization
  
  /**
    * The pending authorization request. This field will only be non-null during an `issuing_authorization.request` webhook.
    */
  var pending_request: PendingRequest | Null
  
  /**
    * History of every time a `pending_request` authorization was approved/declined, either by you directly or by Stripe (e.g. based on your spending_controls). If the merchant changes the authorization by performing an incremental authorization, you can look at this field to see the previous requests for the authorization. This field can be helpful in determining why a given authorization was approved/declined.
    */
  var request_history: js.Array[RequestHistory]
  
  /**
    * The current status of the authorization in its lifecycle.
    */
  var status: Status
  
  /**
    * List of [transactions](https://stripe.com/docs/api/issuing/transactions) associated with this authorization.
    */
  var transactions: js.Array[Transaction]
  
  /**
    * [Treasury](https://stripe.com/docs/api/treasury) details related to this authorization if it was created on a [FinancialAccount](https://stripe.com/docs/api/treasury/financial_accounts).
    */
  var treasury: js.UndefOr[Treasury | Null] = js.undefined
  
  var verification_data: VerificationData
  
  /**
    * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`. Will populate as `null` when no digital wallet was utilized.
    */
  var wallet: String | Null
}
object ResponseAuthorization {
  
  inline def apply(
    amount: Double,
    approved: Boolean,
    authorization_method: AuthorizationMethod,
    balance_transactions: js.Array[BalanceTransaction],
    card: Card,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    merchant_amount: Double,
    merchant_currency: String,
    merchant_data: MerchantData,
    metadata: Metadata,
    request_history: js.Array[RequestHistory],
    status: Status,
    transactions: js.Array[Transaction],
    verification_data: VerificationData
  ): ResponseAuthorization = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], approved = approved.asInstanceOf[js.Any], authorization_method = authorization_method.asInstanceOf[js.Any], balance_transactions = balance_transactions.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], merchant_amount = merchant_amount.asInstanceOf[js.Any], merchant_currency = merchant_currency.asInstanceOf[js.Any], merchant_data = merchant_data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], request_history = request_history.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], verification_data = verification_data.asInstanceOf[js.Any], amount_details = null, cardholder = null, network_data = null, pending_request = null, wallet = null)
    __obj.updateDynamic("object")("issuing.authorization")
    __obj.asInstanceOf[ResponseAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseAuthorization] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_details(value: AmountDetails): Self = StObject.set(x, "amount_details", value.asInstanceOf[js.Any])
    
    inline def setAmount_detailsNull: Self = StObject.set(x, "amount_details", null)
    
    inline def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_method(value: AuthorizationMethod): Self = StObject.set(x, "authorization_method", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactions(value: js.Array[BalanceTransaction]): Self = StObject.set(x, "balance_transactions", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionsVarargs(value: BalanceTransaction*): Self = StObject.set(x, "balance_transactions", js.Array(value*))
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardholder(value: String | Cardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
    
    inline def setCardholderNull: Self = StObject.set(x, "cardholder", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMerchant_amount(value: Double): Self = StObject.set(x, "merchant_amount", value.asInstanceOf[js.Any])
    
    inline def setMerchant_currency(value: String): Self = StObject.set(x, "merchant_currency", value.asInstanceOf[js.Any])
    
    inline def setMerchant_data(value: MerchantData): Self = StObject.set(x, "merchant_data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNetwork_data(value: NetworkData): Self = StObject.set(x, "network_data", value.asInstanceOf[js.Any])
    
    inline def setNetwork_dataNull: Self = StObject.set(x, "network_data", null)
    
    inline def setObject(value: issuingDotauthorization): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPending_request(value: PendingRequest): Self = StObject.set(x, "pending_request", value.asInstanceOf[js.Any])
    
    inline def setPending_requestNull: Self = StObject.set(x, "pending_request", null)
    
    inline def setRequest_history(value: js.Array[RequestHistory]): Self = StObject.set(x, "request_history", value.asInstanceOf[js.Any])
    
    inline def setRequest_historyVarargs(value: RequestHistory*): Self = StObject.set(x, "request_history", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value*))
    
    inline def setTreasury(value: Treasury): Self = StObject.set(x, "treasury", value.asInstanceOf[js.Any])
    
    inline def setTreasuryNull: Self = StObject.set(x, "treasury", null)
    
    inline def setTreasuryUndefined: Self = StObject.set(x, "treasury", js.undefined)
    
    inline def setVerification_data(value: VerificationData): Self = StObject.set(x, "verification_data", value.asInstanceOf[js.Any])
    
    inline def setWallet(value: String): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    
    inline def setWalletNull: Self = StObject.set(x, "wallet", null)
  }
}
