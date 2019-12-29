package typings.stripe.stripeMod.issuing.transactions

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.balance.IBalanceTransaction
import typings.stripe.stripeMod.issuing.authorizations.IAuthorization
import typings.stripe.stripeMod.issuing.authorizations.MerchantData
import typings.stripe.stripeMod.issuing.cardholders.ICardholder
import typings.stripe.stripeMod.issuing.cards.IIssuingCard
import typings.stripe.stripeMod.issuing.disputes.IIssuingDispute
import typings.stripe.stripeStrings.issuingDottransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any use of an issued card that results in funds entering or leaving your Stripe account, such as a completed purchase or refund, is represented by an Issuing Transaction object.
  */
trait ITransaction extends IResourceObject {
  var amount: Double
  /**
    * The Authorization object that led to this transaction.
    */
  var authorization: String | IAuthorization
  var balance_transaction: String | IBalanceTransaction
  /**
    * The card used to make this transaction.
    */
  var card: String | IIssuingCard
  /**
    * The cardholder to whom this transaction belongs.
    */
  var cardholder: String | ICardholder
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  var dispute: String | IIssuingDispute
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  var merchant_amount: Double
  var merchant_currency: String
  /**
    * More information about the user involved in the transaction.
    */
  var merchant_data: MerchantData
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_ITransaction: issuingDottransaction
  /**
    * One of capture, refund, cash_withdrawal, refund_reversal, dispute, or dispute_loss.
    */
  var `type`: TransactionType
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
}

