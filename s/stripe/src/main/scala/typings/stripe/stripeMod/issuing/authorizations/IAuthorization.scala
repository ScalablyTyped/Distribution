package typings.stripe.stripeMod.issuing.authorizations

import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.balance.IBalanceTransaction
import typings.stripe.stripeMod.issuing.cardholders.ICardholder
import typings.stripe.stripeMod.issuing.cards.IIssuingCard
import typings.stripe.stripeMod.issuing.transactions.ITransaction
import typings.stripe.stripeStrings.issuingDOTauthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When an issued card is used to make a purchase, an Issuing Authorization object is created. Authorizations must be approved for the purchase to be completed successfully.
  */
trait IAuthorization extends IResourceObject {
  /**
    * Whether the authorization has been approved.
    */
  var approved: Boolean
  /**
    * How the card details were provided. One of chip, contactless, keyed_in, online, or swipe.
    */
  var authorization_method: AuthorizationMethod
  /**
    * The amount that has been authorized. This will be 0 when the object is created, and increase after it has been approved.
    */
  var authorized_amount: Double
  /**
    * The currency that was presented to the cardholder for the authorization. Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var authorized_currency: String
  var balance_transactions: js.Array[IBalanceTransaction]
  /**
    * Show child attributes
    */
  var card: IIssuingCard
  /**
    * The cardholder to whom this authorization belongs.
    */
  var cardholder: String | ICardholder
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * The amount the authorization is expected to be in held_currency. When Stripe holds funds from you, this is the amount reserved for the authorization. This will be 0 when the object is created, and increase after it has been approved. For multi-currency transactions, held_amount can be used to determine the expected exchange rate.
    */
  var held_amount: Double
  /**
    * The currency of the held amount. This will always be the card currency.
    */
  var held_currency: String
  var is_held_amount_controllable: Boolean
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean
  var merchant_data: MerchantData
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IAuthorization: issuingDOTauthorization
  /**
    * The amount the user is requesting to be authorized. This field will only be non-zero during an issuing.authorization.request webhook.
    */
  var pending_authorized_amount: Double
  /**
    * The additional amount Stripe will hold if the authorization is approved. This field will only be non-zero during an issuing.authorization.request webhook.
    */
  var pending_held_amount: Double
  /**
    * Show child attributes
    */
  var request_history: js.Array[RequestHistory]
  /**
    * One of closed, pending, or reversed.
    */
  var status: AuthorizationStatus
  /**
    * Show child attributes
    */
  var transactions: js.Array[ITransaction]
  /**
    * Show child attributes
    */
  var verification_data: VerificationData
  /**
    * What, if any, digital wallet was used for this authorization. One of apple_pay, google_pay, or samsung_pay.
    */
  var wallet_provider: WalletProvider
}

object IAuthorization {
  @scala.inline
  def apply(
    approved: Boolean,
    authorization_method: AuthorizationMethod,
    authorized_amount: Double,
    authorized_currency: String,
    balance_transactions: js.Array[IBalanceTransaction],
    card: IIssuingCard,
    cardholder: String | ICardholder,
    created: Double,
    held_amount: Double,
    held_currency: String,
    id: String,
    is_held_amount_controllable: Boolean,
    livemode: Boolean,
    merchant_data: MerchantData,
    metadata: IMetadata,
    `object`: issuingDOTauthorization,
    pending_authorized_amount: Double,
    pending_held_amount: Double,
    request_history: js.Array[RequestHistory],
    status: AuthorizationStatus,
    transactions: js.Array[ITransaction],
    verification_data: VerificationData,
    wallet_provider: WalletProvider
  ): IAuthorization = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], authorization_method = authorization_method.asInstanceOf[js.Any], authorized_amount = authorized_amount.asInstanceOf[js.Any], authorized_currency = authorized_currency.asInstanceOf[js.Any], balance_transactions = balance_transactions.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], held_amount = held_amount.asInstanceOf[js.Any], held_currency = held_currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_held_amount_controllable = is_held_amount_controllable.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], merchant_data = merchant_data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pending_authorized_amount = pending_authorized_amount.asInstanceOf[js.Any], pending_held_amount = pending_held_amount.asInstanceOf[js.Any], request_history = request_history.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], verification_data = verification_data.asInstanceOf[js.Any], wallet_provider = wallet_provider.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorization]
  }
}

