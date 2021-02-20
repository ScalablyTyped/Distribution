package typings.stripe.mod.issuing

import typings.stripe.anon.Entity
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.issuing.cardholders.ICardholder
import typings.stripe.mod.issuing.cards.IIssuingCard
import typings.stripe.mod.issuing.transactions.ITransaction
import typings.stripe.stripeStrings.`match`
import typings.stripe.stripeStrings.account_compliance_disabled
import typings.stripe.stripeStrings.account_inactive
import typings.stripe.stripeStrings.authentication_failed
import typings.stripe.stripeStrings.authorization_controls
import typings.stripe.stripeStrings.card_active
import typings.stripe.stripeStrings.card_inactive
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.failure
import typings.stripe.stripeStrings.insufficient_funds
import typings.stripe.stripeStrings.issuingDotauthorization
import typings.stripe.stripeStrings.mismatch
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.not_provided
import typings.stripe.stripeStrings.success
import typings.stripe.stripeStrings.suspected_fraud
import typings.stripe.stripeStrings.webhook_approved
import typings.stripe.stripeStrings.webhook_declined
import typings.stripe.stripeStrings.webhook_timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizations {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.chip
    - typings.stripe.stripeStrings.contactless
    - typings.stripe.stripeStrings.keyed_in
    - typings.stripe.stripeStrings.online
    - typings.stripe.stripeStrings.swipe
  */
  trait AuthorizationMethod extends StObject
  object AuthorizationMethod {
    
    @scala.inline
    def chip: typings.stripe.stripeStrings.chip = "chip".asInstanceOf[typings.stripe.stripeStrings.chip]
    
    @scala.inline
    def contactless: typings.stripe.stripeStrings.contactless = "contactless".asInstanceOf[typings.stripe.stripeStrings.contactless]
    
    @scala.inline
    def keyed_in: typings.stripe.stripeStrings.keyed_in = "keyed_in".asInstanceOf[typings.stripe.stripeStrings.keyed_in]
    
    @scala.inline
    def online: typings.stripe.stripeStrings.online = "online".asInstanceOf[typings.stripe.stripeStrings.online]
    
    @scala.inline
    def swipe: typings.stripe.stripeStrings.swipe = "swipe".asInstanceOf[typings.stripe.stripeStrings.swipe]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.closed
    - typings.stripe.stripeStrings.pending
    - typings.stripe.stripeStrings.reversed
  */
  trait AuthorizationStatus extends StObject
  object AuthorizationStatus {
    
    @scala.inline
    def closed: typings.stripe.stripeStrings.closed = "closed".asInstanceOf[typings.stripe.stripeStrings.closed]
    
    @scala.inline
    def pending: typings.stripe.stripeStrings.pending = "pending".asInstanceOf[typings.stripe.stripeStrings.pending]
    
    @scala.inline
    def reversed: typings.stripe.stripeStrings.reversed = "reversed".asInstanceOf[typings.stripe.stripeStrings.reversed]
  }
  
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
    implicit class IAuthorizationMutableBuilder[Self <: IAuthorization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorization_method(value: AuthorizationMethod): Self = StObject.set(x, "authorization_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorized_amount(value: Double): Self = StObject.set(x, "authorized_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorized_currency(value: String): Self = StObject.set(x, "authorized_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transactions(value: js.Array[IBalanceTransaction]): Self = StObject.set(x, "balance_transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transactionsVarargs(value: IBalanceTransaction*): Self = StObject.set(x, "balance_transactions", js.Array(value :_*))
      
      @scala.inline
      def setCard(value: IIssuingCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholder(value: String | ICardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeld_amount(value: Double): Self = StObject.set(x, "held_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeld_currency(value: String): Self = StObject.set(x, "held_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_held_amount_controllable(value: Boolean): Self = StObject.set(x, "is_held_amount_controllable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant_data(value: MerchantData): Self = StObject.set(x, "merchant_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: issuingDotauthorization): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_authorized_amount(value: Double): Self = StObject.set(x, "pending_authorized_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_held_amount(value: Double): Self = StObject.set(x, "pending_held_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_history(value: js.Array[RequestHistory]): Self = StObject.set(x, "request_history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_historyVarargs(value: RequestHistory*): Self = StObject.set(x, "request_history", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: AuthorizationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
      
      @scala.inline
      def setVerification_data(value: VerificationData): Self = StObject.set(x, "verification_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWallet_provider(value: WalletProvider): Self = StObject.set(x, "wallet_provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAuthorizationApproveOptions extends StObject {
    
    /**
      * If the authorization’s is_held_amount_controllable property is true, you may provide this value to control how much to hold for the authorization.
      * Must be positive (use decline to decline an authorization request).
      */
    var held_amount: js.UndefOr[Double] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
  }
  object IAuthorizationApproveOptions {
    
    @scala.inline
    def apply(): IAuthorizationApproveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAuthorizationApproveOptions]
    }
    
    @scala.inline
    implicit class IAuthorizationApproveOptionsMutableBuilder[Self <: IAuthorizationApproveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeld_amount(value: Double): Self = StObject.set(x, "held_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeld_amountUndefined: Self = StObject.set(x, "held_amount", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait IAuthorizationDeclineOptions extends StObject {
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
  }
  object IAuthorizationDeclineOptions {
    
    @scala.inline
    def apply(): IAuthorizationDeclineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAuthorizationDeclineOptions]
    }
    
    @scala.inline
    implicit class IAuthorizationDeclineOptionsMutableBuilder[Self <: IAuthorizationDeclineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait IAuthorizationListOptions extends StObject {
    
    /**
      * Only return issuing transactions that belong to the given card.
      */
    var card: js.UndefOr[String] = js.native
    
    /**
      * Only return authorizations belonging to the given cardholder.
      */
    var cardholder: js.UndefOr[String] = js.native
    
    /**
      * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
      */
    var created: js.UndefOr[String | ICreated] = js.native
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
      */
    var ending_before: js.UndefOr[String] = js.native
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
      */
    var starting_after: js.UndefOr[String] = js.native
    
    /**
      * Only return authorizations with the given status. One of pending, closed, or reversed.
      */
    var status: js.UndefOr[AuthorizationStatus] = js.native
  }
  object IAuthorizationListOptions {
    
    @scala.inline
    def apply(): IAuthorizationListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAuthorizationListOptions]
    }
    
    @scala.inline
    implicit class IAuthorizationListOptionsMutableBuilder[Self <: IAuthorizationListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setCardholder(value: String): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholderUndefined: Self = StObject.set(x, "cardholder", js.undefined)
      
      @scala.inline
      def setCreated(value: String | ICreated): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
      
      @scala.inline
      def setStatus(value: AuthorizationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait IAuthorizationUpdateOptions extends StObject {
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
  }
  object IAuthorizationUpdateOptions {
    
    @scala.inline
    def apply(): IAuthorizationUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAuthorizationUpdateOptions]
    }
    
    @scala.inline
    implicit class IAuthorizationUpdateOptionsMutableBuilder[Self <: IAuthorizationUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait MerchantData extends StObject {
    
    /**
      * A categorization of the seller’s type of business. See our merchant categories guide for a list of possible values.
      */
    var category: String = js.native
    
    /**
      * City where the seller is located
      */
    var city: String = js.native
    
    /**
      * Country where the seller is located
      */
    var country: String = js.native
    
    /**
      * Name of the seller
      */
    var name: String = js.native
    
    /**
      * Identifier assigned to the seller by the card brand
      */
    var network_id: String = js.native
    
    /**
      * Postal code where the seller is located
      */
    var postal_code: String = js.native
    
    /**
      * State where the seller is located
      */
    var state: String = js.native
    
    /**
      * The url an online purchase was made from
      */
    var url: String = js.native
  }
  object MerchantData {
    
    @scala.inline
    def apply(
      category: String,
      city: String,
      country: String,
      name: String,
      network_id: String,
      postal_code: String,
      state: String,
      url: String
    ): MerchantData = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MerchantData]
    }
    
    @scala.inline
    implicit class MerchantDataMutableBuilder[Self <: MerchantData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork_id(value: String): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestHistory extends StObject {
    
    /**
      * Whether this request was approved.
      */
    var approved: Boolean = js.native
    
    /**
      * The amount that was authorized at the time of this request
      */
    var authorized_amount: Double = js.native
    
    /**
      * The currency that was presented to the cardholder for the authorization. Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var authorized_currency: String = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * The amount Stripe held from your account to fund the authorization, if the request was approved
      */
    var held_amount: Double = js.native
    
    /**
      * The currency of the held amount
      */
    var held_currency: String = js.native
    
    /**
      * One of authentication_failed, authorization_controls, card_active, card_inactive, insufficient_funds, account_compliance_disabled, account_inactive, suspected_fraud, webhook_approved, webhook_declined, or webhook_timeout.
      */
    var reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout = js.native
    
    /**
      * When an authorization is declined due to authorization_controls, this array contains details about the authorization controls that were violated. Otherwise, it is empty.
      */
    var violated_authorization_controls: Entity = js.native
  }
  object RequestHistory {
    
    @scala.inline
    def apply(
      approved: Boolean,
      authorized_amount: Double,
      authorized_currency: String,
      created: Double,
      held_amount: Double,
      held_currency: String,
      reason: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout,
      violated_authorization_controls: Entity
    ): RequestHistory = {
      val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], authorized_amount = authorized_amount.asInstanceOf[js.Any], authorized_currency = authorized_currency.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], held_amount = held_amount.asInstanceOf[js.Any], held_currency = held_currency.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], violated_authorization_controls = violated_authorization_controls.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHistory]
    }
    
    @scala.inline
    implicit class RequestHistoryMutableBuilder[Self <: RequestHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorized_amount(value: Double): Self = StObject.set(x, "authorized_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorized_currency(value: String): Self = StObject.set(x, "authorized_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeld_amount(value: Double): Self = StObject.set(x, "held_amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeld_currency(value: String): Self = StObject.set(x, "held_currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(
        value: authentication_failed | authorization_controls | card_active | card_inactive | insufficient_funds | account_compliance_disabled | account_inactive | suspected_fraud | webhook_approved | webhook_declined | webhook_timeout
      ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViolated_authorization_controls(value: Entity): Self = StObject.set(x, "violated_authorization_controls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerificationData extends StObject {
    
    /**
      * One of match, mismatch, or not_provided.
      */
    var address_line1_check: `match` | mismatch | not_provided = js.native
    
    /**
      * One of match, mismatch, or not_provided.
      */
    var address_zip_check: `match` | mismatch | not_provided = js.native
    
    /**
      * One of exempt, failure, none, or success.
      */
    var authentication: exempt | failure | none | success = js.native
    
    /**
      * One of match, mismatch, or not_provided.
      */
    var cvc_check: `match` | mismatch | not_provided = js.native
  }
  object VerificationData {
    
    @scala.inline
    def apply(
      address_line1_check: `match` | mismatch | not_provided,
      address_zip_check: `match` | mismatch | not_provided,
      authentication: exempt | failure | none | success,
      cvc_check: `match` | mismatch | not_provided
    ): VerificationData = {
      val __obj = js.Dynamic.literal(address_line1_check = address_line1_check.asInstanceOf[js.Any], address_zip_check = address_zip_check.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationData]
    }
    
    @scala.inline
    implicit class VerificationDataMutableBuilder[Self <: VerificationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress_line1_check(value: `match` | mismatch | not_provided): Self = StObject.set(x, "address_line1_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress_zip_check(value: `match` | mismatch | not_provided): Self = StObject.set(x, "address_zip_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthentication(value: exempt | failure | none | success): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvc_check(value: `match` | mismatch | not_provided): Self = StObject.set(x, "cvc_check", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.apple_pay
    - typings.stripe.stripeStrings.google_pay
    - typings.stripe.stripeStrings.samsung_pay
  */
  trait WalletProvider extends StObject
  object WalletProvider {
    
    @scala.inline
    def apple_pay: typings.stripe.stripeStrings.apple_pay = "apple_pay".asInstanceOf[typings.stripe.stripeStrings.apple_pay]
    
    @scala.inline
    def google_pay: typings.stripe.stripeStrings.google_pay = "google_pay".asInstanceOf[typings.stripe.stripeStrings.google_pay]
    
    @scala.inline
    def samsung_pay: typings.stripe.stripeStrings.samsung_pay = "samsung_pay".asInstanceOf[typings.stripe.stripeStrings.samsung_pay]
  }
}
