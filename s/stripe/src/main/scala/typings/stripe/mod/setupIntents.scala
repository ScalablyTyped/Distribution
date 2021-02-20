package typings.stripe.mod

import typings.stripe.anon.Requestthreedsecure
import typings.stripe.anon.Returnurl
import typings.stripe.mod.accounts.IAccountCreationOptions
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.cards.ICardHash
import typings.stripe.mod.customers.ICustomer
import typings.stripe.mod.paymentIntents.PaymentIntentPaymentMethodType
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.processing
import typings.stripe.stripeStrings.redirect_to_url
import typings.stripe.stripeStrings.requires_action
import typings.stripe.stripeStrings.requires_confirmation
import typings.stripe.stripeStrings.requires_payment_method
import typings.stripe.stripeStrings.setup_intent
import typings.stripe.stripeStrings.succeeded
import typings.stripe.stripeStrings.use_stripe_sdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupIntents {
  
  @js.native
  trait ISetupIntent extends IResourceObject {
    
    /**
      * ID of the Connect application that created the SetupIntent. [Expandable]
      */
    var application: js.UndefOr[String | IApplication | Null] = js.native
    
    /**
      * Reason for cancellation of this SetupIntent, one of `abandoned`, `requested_by_customer`, or `duplicate`.
      */
    var cancelation_reason: SetupIntentCancelationReason | Null = js.native
    
    /**
      * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
      *
      * The client secret can be used to complete payment setup from your frontend. It should not
      * be stored, logged, embedded in URLs, or exposed to anyone other than the customer. Make
      * sure that you have TLS enabled on any page that includes the client secret.
      */
    var client_secret: String = js.native
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double = js.native
    
    /**
      * ID of the Customer this SetupIntent is for if one exists. [Expandable]
      */
    var customer: String | ICustomer | Null = js.native
    
    /**
      * An arbitrary string attached to the object.
      *
      * If present, payment methods used with this SetupIntent can only be attached to
      * this Customer, and payment methods attached to other Customers cannot be used with
      * this SetupIntent.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The error encountered in the previous SetupIntent confirmation.
      */
    var last_setup_error: IStripeError | Null = js.native
    
    var livemode: Boolean = js.native
    
    var metadata: IMetadata = js.native
    
    /**
      * If present, this property tells you what actions you need to take in order for your customer to continue payment setup.
      */
    var next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl = js.native
    
    /**
      * Value is "setup_intent".
      */
    @JSName("object")
    var object_ISetupIntent: setup_intent = js.native
    
    /**
      * The account (if any) for which the setup is intended. [Expandable]
      */
    var on_behalf_of: js.UndefOr[String | Null] = js.native
    
    /**
      * ID of the payment method used in this SetupIntent. [Expandable]
      */
    var payment_method: js.UndefOr[String | Null] = js.native
    
    /**
      * Payment-method-specific configuration for this SetupIntent.
      */
    var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
    
    /**
      * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
      */
    var payment_method_types: js.Array[SetupIntentPaymentMethodType] = js.native
    
    /**
      * The several states the SetupIntent goes through until it it either canceled or succeeds.
      */
    var status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded = js.native
    
    /**
      * Indicates how the payment method is intended to be used in the future.
      *
      * Use `on_session` if you intend to only reuse the payment method when the customer is in
      * your checkout flow. Use `off_session` if your customer may or may not be in your checkout
      * flow. If not provided, this value defaults to `off_session`.
      */
    var usage: SetupIntentUsageType = js.native
  }
  object ISetupIntent {
    
    @scala.inline
    def apply(
      client_secret: String,
      created: Double,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      next_action: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl,
      `object`: setup_intent,
      payment_method_types: js.Array[SetupIntentPaymentMethodType],
      status: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded,
      usage: SetupIntentUsageType
    ): ISetupIntent = {
      val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISetupIntent]
    }
    
    @scala.inline
    implicit class ISetupIntentMutableBuilder[Self <: ISetupIntent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: String | IApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationNull: Self = StObject.set(x, "application", null)
      
      @scala.inline
      def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
      
      @scala.inline
      def setCancelation_reason(value: SetupIntentCancelationReason): Self = StObject.set(x, "cancelation_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelation_reasonNull: Self = StObject.set(x, "cancelation_reason", null)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer(value: String | ICustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNull: Self = StObject.set(x, "customer", null)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLast_setup_error(value: IStripeError): Self = StObject.set(x, "last_setup_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_setup_errorNull: Self = StObject.set(x, "last_setup_error", null)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_action(value: ISetupIntentNextActionUseStripeSdk | ISetupIntentNextActionRedirectToUrl): Self = StObject.set(x, "next_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: setup_intent): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
      
      @scala.inline
      def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodNull: Self = StObject.set(x, "payment_method", null)
      
      @scala.inline
      def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
      
      @scala.inline
      def setPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_optionsUndefined: Self = StObject.set(x, "payment_method_options", js.undefined)
      
      @scala.inline
      def setPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_typesVarargs(value: SetupIntentPaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
      
      @scala.inline
      def setStatus(
        value: requires_payment_method | requires_confirmation | requires_action | processing | canceled | succeeded
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: SetupIntentUsageType): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISetupIntentConfirmOptions extends StObject {
    
    /**
      * The client secret of this SetupIntent. Used for client-side confirmation using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
      */
    var client_secret: js.UndefOr[String] = js.native
    
    /**
      * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
      * to attach to this SetupIntent.
      */
    var payment_method: js.UndefOr[String] = js.native
    
    /**
      * Payment-method-specific configuration for this SetupIntent.
      */
    var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
    
    /**
      * The URL to redirect your customer back to after they authenticate on the payment method’s
      * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
      * supply an application URI scheme. This parameter is only used for cards and other
      * redirect-based payment methods.
      */
    var return_url: js.UndefOr[String] = js.native
  }
  object ISetupIntentConfirmOptions {
    
    @scala.inline
    def apply(): ISetupIntentConfirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentConfirmOptions]
    }
    
    @scala.inline
    implicit class ISetupIntentConfirmOptionsMutableBuilder[Self <: ISetupIntentConfirmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
      
      @scala.inline
      def setPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_optionsUndefined: Self = StObject.set(x, "payment_method_options", js.undefined)
      
      @scala.inline
      def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    }
  }
  
  @js.native
  trait ISetupIntentCreationOptions extends StObject {
    
    /**
      * Set to `true` to attempt to confirm this SetupIntent immediately. This parameter defaults
      * to `false`. If the payment method attached is a card, a return_url may be provided in case
      * additional authentication is required.
      */
    var confirm: js.UndefOr[Boolean] = js.native
    
    /**
      * ID of the Customer this SetupIntent belongs to, if one exists.
      *
      * If present, payment methods used with this SetupIntent can only be attached to this
      * Customer, and payment methods attached to other Customers cannot be used with this
      * SetupIntent.
      */
    var customer: js.UndefOr[String] = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      * This can be unset by updating the value to `null` and then saving.
      */
    var description: js.UndefOr[String | Null] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing
      * additional information about the object in a structured format.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
    
    /**
      * The Stripe account ID for which this SetupIntent is created.
      */
    var on_behalf_of: js.UndefOr[String] = js.native
    
    /**
      * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
      * to attach to this SetupIntent.
      */
    var payment_method: js.UndefOr[String] = js.native
    
    /**
      * Payment-method-specific configuration for this SetupIntent.
      */
    var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.native
    
    /**
      * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
      */
    var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.native
    
    /**
      * The URL to redirect your customer back to after they authenticate or cancel their payment on
      * the payment method’s app or site. If you’d prefer to redirect to a mobile application, you
      * can alternatively supply an application URI scheme. This parameter can only be used with
      * `confirm=true`.
      */
    var return_url: js.UndefOr[String] = js.native
    
    /**
      * Indicates how the payment method is intended to be used in the future.
      *
      * Use `on_session` if you intend to only reuse the payment method when the customer is in your checkout flow. Use `off_session` if your customer may or may not be in your checkout flow. If not provided, this value defaults to `off_session`.
      */
    var usage: js.UndefOr[SetupIntentUsageType] = js.native
  }
  object ISetupIntentCreationOptions {
    
    @scala.inline
    def apply(): ISetupIntentCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentCreationOptions]
    }
    
    @scala.inline
    implicit class ISetupIntentCreationOptionsMutableBuilder[Self <: ISetupIntentCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
      
      @scala.inline
      def setPayment_method_options(value: ISetupIntentPaymentMethodOptions): Self = StObject.set(x, "payment_method_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_optionsUndefined: Self = StObject.set(x, "payment_method_options", js.undefined)
      
      @scala.inline
      def setPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_typesUndefined: Self = StObject.set(x, "payment_method_types", js.undefined)
      
      @scala.inline
      def setPayment_method_typesVarargs(value: SetupIntentPaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
      
      @scala.inline
      def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
      
      @scala.inline
      def setUsage(value: SetupIntentUsageType): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  @js.native
  trait ISetupIntentListOptions extends IListOptionsCreated {
    
    /**
      * Only return SetupIntents for the customer specified by this customer ID.
      */
    var customer: js.UndefOr[String] = js.native
    
    /**
      * Only return SetupIntents associated with the specified payment method.
      */
    var payment_method: js.UndefOr[String] = js.native
  }
  object ISetupIntentListOptions {
    
    @scala.inline
    def apply(): ISetupIntentListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentListOptions]
    }
    
    @scala.inline
    implicit class ISetupIntentListOptionsMutableBuilder[Self <: ISetupIntentListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    }
  }
  
  @js.native
  trait ISetupIntentNextActionRedirectToUrl extends StObject {
    
    /**
      * Contains instructions for authenticating a payment by redirecting your customer to another page or application.
      */
    var redirect_to_url: Returnurl = js.native
    
    var `type`: redirect_to_url = js.native
  }
  object ISetupIntentNextActionRedirectToUrl {
    
    @scala.inline
    def apply(redirect_to_url: Returnurl, `type`: redirect_to_url): ISetupIntentNextActionRedirectToUrl = {
      val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISetupIntentNextActionRedirectToUrl]
    }
    
    @scala.inline
    implicit class ISetupIntentNextActionRedirectToUrlMutableBuilder[Self <: ISetupIntentNextActionRedirectToUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirect_to_url(value: Returnurl): Self = StObject.set(x, "redirect_to_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: redirect_to_url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISetupIntentNextActionUseStripeSdk extends StObject {
    
    var `type`: use_stripe_sdk = js.native
    
    /**
      * When confirming a SetupIntent with js, js depends on the contents of this object to invoke authentication flows. The shape of the contents is subject to change and is only intended to be used by js.
      */
    var use_stripe_sdk: js.Any = js.native
  }
  object ISetupIntentNextActionUseStripeSdk {
    
    @scala.inline
    def apply(`type`: use_stripe_sdk, use_stripe_sdk: js.Any): ISetupIntentNextActionUseStripeSdk = {
      val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISetupIntentNextActionUseStripeSdk]
    }
    
    @scala.inline
    implicit class ISetupIntentNextActionUseStripeSdkMutableBuilder[Self <: ISetupIntentNextActionUseStripeSdk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: use_stripe_sdk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_stripe_sdk(value: js.Any): Self = StObject.set(x, "use_stripe_sdk", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISetupIntentPaymentMethodOptions extends StObject {
    
    /**
      * Configuration for any card payments attempted on this SetupIntent.
      */
    var card: js.UndefOr[Requestthreedsecure] = js.native
  }
  object ISetupIntentPaymentMethodOptions {
    
    @scala.inline
    def apply(): ISetupIntentPaymentMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentPaymentMethodOptions]
    }
    
    @scala.inline
    implicit class ISetupIntentPaymentMethodOptionsMutableBuilder[Self <: ISetupIntentPaymentMethodOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: Requestthreedsecure): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    }
  }
  
  @js.native
  trait ISetupIntentRetrieveOptions extends StObject {
    
    /**
      * The client secret of the SetupIntent. Required if a publishable key is used to retrieve
      * the SetupIntent. REQUIRED IF USING PUBLISHABLE KEY
      */
    var client_secret: js.UndefOr[String] = js.native
  }
  object ISetupIntentRetrieveOptions {
    
    @scala.inline
    def apply(): ISetupIntentRetrieveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentRetrieveOptions]
    }
    
    @scala.inline
    implicit class ISetupIntentRetrieveOptionsMutableBuilder[Self <: ISetupIntentRetrieveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    }
  }
  
  @js.native
  trait ISetupIntentSessionSubset extends StObject {
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: js.UndefOr[IMetadata] = js.native
    
    /**
      * The Stripe account for which the setup is intended.
      */
    var on_behalf_of: js.UndefOr[String] = js.native
  }
  object ISetupIntentSessionSubset {
    
    @scala.inline
    def apply(): ISetupIntentSessionSubset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentSessionSubset]
    }
    
    @scala.inline
    implicit class ISetupIntentSessionSubsetMutableBuilder[Self <: ISetupIntentSessionSubset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
    }
  }
  
  @js.native
  trait ISetupIntentTransferData extends StObject {
    
    /**
      * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
      */
    var destination: String | typings.stripe.mod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions = js.native
  }
  object ISetupIntentTransferData {
    
    @scala.inline
    def apply(
      destination: String | typings.stripe.mod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions
    ): ISetupIntentTransferData = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISetupIntentTransferData]
    }
    
    @scala.inline
    implicit class ISetupIntentTransferDataMutableBuilder[Self <: ISetupIntentTransferData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: String | typings.stripe.mod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISetupIntentUpdateOptions extends StObject {
    
    /**
      * ID of the customer this SetupIntent is for if one exists.
      */
    var customer: js.UndefOr[String] = js.native
    
    /**
      * An arbitrary string attached to the object. Often useful for displaying to users.
      * This can be unset by updating the value to `null` and then saving.
      */
    var description: js.UndefOr[String | Null] = js.native
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing
      * additional information about the object in a structured format.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.native
    
    /**
      * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
      * to attach to this SetupIntent.
      */
    var payment_method: js.UndefOr[String] = js.native
    
    /**
      * The list of payment method types (e.g. card) that this SetupIntent is allowed to use.
      */
    var payment_method_types: js.UndefOr[js.Array[SetupIntentPaymentMethodType]] = js.native
  }
  object ISetupIntentUpdateOptions {
    
    @scala.inline
    def apply(): ISetupIntentUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISetupIntentUpdateOptions]
    }
    
    @scala.inline
    implicit class ISetupIntentUpdateOptionsMutableBuilder[Self <: ISetupIntentUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
      
      @scala.inline
      def setPayment_method_types(value: js.Array[SetupIntentPaymentMethodType]): Self = StObject.set(x, "payment_method_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_method_typesUndefined: Self = StObject.set(x, "payment_method_types", js.undefined)
      
      @scala.inline
      def setPayment_method_typesVarargs(value: SetupIntentPaymentMethodType*): Self = StObject.set(x, "payment_method_types", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.abandoned
    - typings.stripe.stripeStrings.requested_by_customer
    - typings.stripe.stripeStrings.duplicate
  */
  trait SetupIntentCancelationReason extends StObject
  object SetupIntentCancelationReason {
    
    @scala.inline
    def abandoned: typings.stripe.stripeStrings.abandoned = "abandoned".asInstanceOf[typings.stripe.stripeStrings.abandoned]
    
    @scala.inline
    def duplicate: typings.stripe.stripeStrings.duplicate = "duplicate".asInstanceOf[typings.stripe.stripeStrings.duplicate]
    
    @scala.inline
    def requested_by_customer: typings.stripe.stripeStrings.requested_by_customer = "requested_by_customer".asInstanceOf[typings.stripe.stripeStrings.requested_by_customer]
  }
  
  /** Payment methods supported by Payment Intents. This is a subsetset of all Payment Method types. See https://stripe.com/docs/api/payment_methods/create#create_payment_method-type */
  type SetupIntentPaymentMethodType = PaymentIntentPaymentMethodType
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.on_session
    - typings.stripe.stripeStrings.off_session
  */
  trait SetupIntentUsageType extends StObject
  object SetupIntentUsageType {
    
    @scala.inline
    def off_session: typings.stripe.stripeStrings.off_session = "off_session".asInstanceOf[typings.stripe.stripeStrings.off_session]
    
    @scala.inline
    def on_session: typings.stripe.stripeStrings.on_session = "on_session".asInstanceOf[typings.stripe.stripeStrings.on_session]
  }
}
