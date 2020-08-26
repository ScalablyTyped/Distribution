package typings.stripe.mod.issuing.transactions

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.issuing.authorizations.IAuthorization
import typings.stripe.mod.issuing.authorizations.MerchantData
import typings.stripe.mod.issuing.cardholders.ICardholder
import typings.stripe.mod.issuing.cards.IIssuingCard
import typings.stripe.mod.issuing.disputes.IIssuingDispute
import typings.stripe.stripeStrings.issuingDottransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any use of an issued card that results in funds entering or leaving your Stripe account, such as a completed purchase or refund, is represented by an Issuing Transaction object.
  */
@js.native
trait ITransaction extends IResourceObject {
  var amount: Double = js.native
  /**
    * The Authorization object that led to this transaction.
    */
  var authorization: String | IAuthorization = js.native
  var balance_transaction: String | IBalanceTransaction = js.native
  /**
    * The card used to make this transaction.
    */
  var card: String | IIssuingCard = js.native
  /**
    * The cardholder to whom this transaction belongs.
    */
  var cardholder: String | ICardholder = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  var dispute: String | IIssuingDispute = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var merchant_amount: Double = js.native
  var merchant_currency: String = js.native
  /**
    * More information about the user involved in the transaction.
    */
  var merchant_data: MerchantData = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_ITransaction: issuingDottransaction = js.native
  /**
    * One of capture, refund, cash_withdrawal, refund_reversal, dispute, or dispute_loss.
    */
  var `type`: TransactionType = js.native
}

object ITransaction {
  @scala.inline
  def apply(
    amount: Double,
    authorization: String | IAuthorization,
    balance_transaction: String | IBalanceTransaction,
    card: String | IIssuingCard,
    cardholder: String | ICardholder,
    created: Double,
    currency: String,
    dispute: String | IIssuingDispute,
    id: String,
    livemode: Boolean,
    merchant_amount: Double,
    merchant_currency: String,
    merchant_data: MerchantData,
    metadata: IMetadata,
    `object`: issuingDottransaction,
    `type`: TransactionType
  ): ITransaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], dispute = dispute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], merchant_amount = merchant_amount.asInstanceOf[js.Any], merchant_currency = merchant_currency.asInstanceOf[js.Any], merchant_data = merchant_data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransaction]
  }
  @scala.inline
  implicit class ITransactionOps[Self <: ITransaction] (val x: Self) extends AnyVal {
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
    def setAuthorization(value: String | IAuthorization): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transaction(value: String | IBalanceTransaction): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    @scala.inline
    def setCard(value: String | IIssuingCard): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardholder(value: String | ICardholder): Self = this.set("cardholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispute(value: String | IIssuingDispute): Self = this.set("dispute", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchant_amount(value: Double): Self = this.set("merchant_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchant_currency(value: String): Self = this.set("merchant_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchant_data(value: MerchantData): Self = this.set("merchant_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: issuingDottransaction): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TransactionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

