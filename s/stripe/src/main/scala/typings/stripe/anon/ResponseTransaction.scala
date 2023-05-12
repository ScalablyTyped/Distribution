package typings.stripe.anon

import typings.stripe.mod.Stripe.BalanceTransaction
import typings.stripe.mod.Stripe.Issuing.Authorization
import typings.stripe.mod.Stripe.Issuing.Card
import typings.stripe.mod.Stripe.Issuing.Cardholder
import typings.stripe.mod.Stripe.Issuing.Dispute
import typings.stripe.mod.Stripe.Issuing.Transaction.AmountDetails
import typings.stripe.mod.Stripe.Issuing.Transaction.MerchantData
import typings.stripe.mod.Stripe.Issuing.Transaction.PurchaseDetails
import typings.stripe.mod.Stripe.Issuing.Transaction.Treasury
import typings.stripe.mod.Stripe.Issuing.Transaction.Wallet
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.issuingDottransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Issuing.Transaction> */
trait ResponseTransaction extends StObject {
  
  /**
    * The transaction amount, which will be reflected in your balance. This amount is in your currency and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var amount: Double
  
  /**
    * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
    */
  var amount_details: AmountDetails | Null
  
  /**
    * The `Authorization` object that led to this transaction.
    */
  var authorization: String | Authorization | Null
  
  /**
    * ID of the [balance transaction](https://stripe.com/docs/api/balance_transactions) associated with this transaction.
    */
  var balance_transaction: String | BalanceTransaction | Null
  
  /**
    * The card used to make this transaction.
    */
  var card: String | Card
  
  /**
    * The cardholder to whom this transaction belongs.
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
    * If you've disputed the transaction, the ID of the dispute.
    */
  var dispute: String | Dispute | Null
  
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
    * The amount that the merchant will receive, denominated in `merchant_currency` and in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal). It will be different from `amount` if the merchant is taking payment in a different currency.
    */
  var merchant_amount: Double
  
  /**
    * The currency with which the merchant is taking payment.
    */
  var merchant_currency: String
  
  var merchant_data: MerchantData
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: issuingDottransaction
  
  /**
    * Additional purchase information that is optionally provided by the merchant.
    */
  var purchase_details: PurchaseDetails | Null
  
  /**
    * [Treasury](https://stripe.com/docs/api/treasury) details related to this transaction if it was created on a [FinancialAccount](/docs/api/treasury/financial_accounts
    */
  var treasury: js.UndefOr[Treasury | Null] = js.undefined
  
  /**
    * The nature of the transaction.
    */
  var `type`: typings.stripe.mod.Stripe.Issuing.Transaction.Type
  
  /**
    * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`.
    */
  var wallet: Wallet | Null
}
object ResponseTransaction {
  
  inline def apply(
    amount: Double,
    card: String | Card,
    created: Double,
    currency: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    merchant_amount: Double,
    merchant_currency: String,
    merchant_data: MerchantData,
    metadata: Metadata,
    `type`: typings.stripe.mod.Stripe.Issuing.Transaction.Type
  ): ResponseTransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], merchant_amount = merchant_amount.asInstanceOf[js.Any], merchant_currency = merchant_currency.asInstanceOf[js.Any], merchant_data = merchant_data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], amount_details = null, authorization = null, balance_transaction = null, cardholder = null, dispute = null, purchase_details = null, wallet = null)
    __obj.updateDynamic("object")("issuing.transaction")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseTransaction] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_details(value: AmountDetails): Self = StObject.set(x, "amount_details", value.asInstanceOf[js.Any])
    
    inline def setAmount_detailsNull: Self = StObject.set(x, "amount_details", null)
    
    inline def setAuthorization(value: String | Authorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationNull: Self = StObject.set(x, "authorization", null)
    
    inline def setBalance_transaction(value: String | BalanceTransaction): Self = StObject.set(x, "balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setBalance_transactionNull: Self = StObject.set(x, "balance_transaction", null)
    
    inline def setCard(value: String | Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardholder(value: String | Cardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
    
    inline def setCardholderNull: Self = StObject.set(x, "cardholder", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDispute(value: String | Dispute): Self = StObject.set(x, "dispute", value.asInstanceOf[js.Any])
    
    inline def setDisputeNull: Self = StObject.set(x, "dispute", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMerchant_amount(value: Double): Self = StObject.set(x, "merchant_amount", value.asInstanceOf[js.Any])
    
    inline def setMerchant_currency(value: String): Self = StObject.set(x, "merchant_currency", value.asInstanceOf[js.Any])
    
    inline def setMerchant_data(value: MerchantData): Self = StObject.set(x, "merchant_data", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: issuingDottransaction): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPurchase_details(value: PurchaseDetails): Self = StObject.set(x, "purchase_details", value.asInstanceOf[js.Any])
    
    inline def setPurchase_detailsNull: Self = StObject.set(x, "purchase_details", null)
    
    inline def setTreasury(value: Treasury): Self = StObject.set(x, "treasury", value.asInstanceOf[js.Any])
    
    inline def setTreasuryNull: Self = StObject.set(x, "treasury", null)
    
    inline def setTreasuryUndefined: Self = StObject.set(x, "treasury", js.undefined)
    
    inline def setType(value: typings.stripe.mod.Stripe.Issuing.Transaction.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWallet(value: Wallet): Self = StObject.set(x, "wallet", value.asInstanceOf[js.Any])
    
    inline def setWalletNull: Self = StObject.set(x, "wallet", null)
  }
}
