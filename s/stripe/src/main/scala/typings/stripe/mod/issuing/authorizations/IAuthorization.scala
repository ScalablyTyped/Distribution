package typings.stripe.mod.issuing.authorizations

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.issuing.cardholders.ICardholder
import typings.stripe.mod.issuing.cards.IIssuingCard
import typings.stripe.mod.issuing.transactions.ITransaction
import typings.stripe.stripeStrings.issuingDotauthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When an issued card is used to make a purchase, an Issuing Authorization object is created. Authorizations must be approved for the purchase to be completed successfully.
  */
@js.native
trait IAuthorization extends IResourceObject {
  /**
    * Whether the authorization has been approved.
    */
  var approved: Boolean = js.native
  /**
    * How the card details were provided. One of chip, contactless, keyed_in, online, or swipe.
    */
  var authorization_method: AuthorizationMethod = js.native
  /**
    * The amount that has been authorized. This will be 0 when the object is created, and increase after it has been approved.
    */
  var authorized_amount: Double = js.native
  /**
    * The currency that was presented to the cardholder for the authorization. Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var authorized_currency: String = js.native
  var balance_transactions: js.Array[IBalanceTransaction] = js.native
  /**
    * Show child attributes
    */
  var card: IIssuingCard = js.native
  /**
    * The cardholder to whom this authorization belongs.
    */
  var cardholder: String | ICardholder = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * The amount the authorization is expected to be in held_currency. When Stripe holds funds from you, this is the amount reserved for the authorization. This will be 0 when the object is created, and increase after it has been approved. For multi-currency transactions, held_amount can be used to determine the expected exchange rate.
    */
  var held_amount: Double = js.native
  /**
    * The currency of the held amount. This will always be the card currency.
    */
  var held_currency: String = js.native
  var is_held_amount_controllable: Boolean = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  var merchant_data: MerchantData = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IAuthorization: issuingDotauthorization = js.native
  /**
    * The amount the user is requesting to be authorized. This field will only be non-zero during an issuing.authorization.request webhook.
    */
  var pending_authorized_amount: Double = js.native
  /**
    * The additional amount Stripe will hold if the authorization is approved. This field will only be non-zero during an issuing.authorization.request webhook.
    */
  var pending_held_amount: Double = js.native
  /**
    * Show child attributes
    */
  var request_history: js.Array[RequestHistory] = js.native
  /**
    * One of closed, pending, or reversed.
    */
  var status: AuthorizationStatus = js.native
  /**
    * Show child attributes
    */
  var transactions: js.Array[ITransaction] = js.native
  /**
    * Show child attributes
    */
  var verification_data: VerificationData = js.native
  /**
    * What, if any, digital wallet was used for this authorization. One of apple_pay, google_pay, or samsung_pay.
    */
  var wallet_provider: WalletProvider = js.native
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
    `object`: issuingDotauthorization,
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
  @scala.inline
  implicit class IAuthorizationOps[Self <: IAuthorization] (val x: Self) extends AnyVal {
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
    def setApproved(value: Boolean): Self = this.set("approved", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorization_method(value: AuthorizationMethod): Self = this.set("authorization_method", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorized_amount(value: Double): Self = this.set("authorized_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorized_currency(value: String): Self = this.set("authorized_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance_transactionsVarargs(value: IBalanceTransaction*): Self = this.set("balance_transactions", js.Array(value :_*))
    @scala.inline
    def setBalance_transactions(value: js.Array[IBalanceTransaction]): Self = this.set("balance_transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCard(value: IIssuingCard): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardholder(value: String | ICardholder): Self = this.set("cardholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeld_amount(value: Double): Self = this.set("held_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeld_currency(value: String): Self = this.set("held_currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_held_amount_controllable(value: Boolean): Self = this.set("is_held_amount_controllable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMerchant_data(value: MerchantData): Self = this.set("merchant_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: issuingDotauthorization): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending_authorized_amount(value: Double): Self = this.set("pending_authorized_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending_held_amount(value: Double): Self = this.set("pending_held_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_historyVarargs(value: RequestHistory*): Self = this.set("request_history", js.Array(value :_*))
    @scala.inline
    def setRequest_history(value: js.Array[RequestHistory]): Self = this.set("request_history", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: AuthorizationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionsVarargs(value: ITransaction*): Self = this.set("transactions", js.Array(value :_*))
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification_data(value: VerificationData): Self = this.set("verification_data", value.asInstanceOf[js.Any])
    @scala.inline
    def setWallet_provider(value: WalletProvider): Self = this.set("wallet_provider", value.asInstanceOf[js.Any])
  }
  
}

