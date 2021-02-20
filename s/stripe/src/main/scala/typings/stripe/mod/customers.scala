package typings.stripe.mod

import typings.stripe.anon.Name
import typings.stripe.anon.Type
import typings.stripe.mod.bankAccounts.ISourceCreationOptions
import typings.stripe.mod.cards.ICardSourceCreationOptions
import typings.stripe.mod.cards.ICardSourceCreationOptionsExtended
import typings.stripe.mod.coupons.IDiscount
import typings.stripe.mod.customerTaxIds.ITaxId
import typings.stripe.mod.resources.CustomerCards
import typings.stripe.mod.resources.CustomerSubscriptions
import typings.stripe.mod.subscriptions.ISubscription
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.customer
import typings.stripe.stripeStrings.exempt
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.now
import typings.stripe.stripeStrings.reverse
import typings.stripe.stripeStrings.source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customers {
  
  @js.native
  trait IBankAccountSourceListOptions extends IListOptions {
    
    var `object`: bank_account = js.native
  }
  object IBankAccountSourceListOptions {
    
    @scala.inline
    def apply(`object`: bank_account): IBankAccountSourceListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBankAccountSourceListOptions]
    }
    
    @scala.inline
    implicit class IBankAccountSourceListOptionsMutableBuilder[Self <: IBankAccountSourceListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: bank_account): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICardSourceListOptions extends IListOptions {
    
    var `object`: card = js.native
  }
  object ICardSourceListOptions {
    
    @scala.inline
    def apply(`object`: card): ICardSourceListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardSourceListOptions]
    }
    
    @scala.inline
    implicit class ICardSourceListOptionsMutableBuilder[Self <: ICardSourceListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Customer objects allow you to perform recurring charges and track multiple charges that are associated
    * with the same customer. The API allows you to create, delete, and update your customers. You can
    * retrieve individual customers as well as a list of all your customers.
    */
  @js.native
  trait ICustomer extends IResourceObject {
    
    /**
      * This field has been renamed to balance and will be removed in a future API version.
      * @deprecated
      */
    var account_balance: js.UndefOr[Double] = js.native
    
    var address: IAddress | Null = js.native
    
    /**
      * Current balance, if any, being stored on the customer. If negative, the customer has credit
      * to apply to their next invoice. If positive, the customer has an amount owed that will be
      * added to their next invoice. The balance does not refer to any unpaid invoices; it solely
      * takes into account amounts that have yet to be successfully applied to any invoice. This
      * balance is only taken into account as invoices are finalized.
      */
    var balance: js.UndefOr[Double] = js.native
    
    var cards: js.UndefOr[CustomerCards] = js.native
    
    var created: Double = js.native
    
    /**
      * The currency the customer can be charged in for recurring billing purposes (subscriptions, invoices, invoice items).
      */
    var currency: String | Null = js.native
    
    /**
      * ID of the default source attached to this customer. [Expandable]
      */
    var default_source: String | IStripeSource | Null = js.native
    
    /**
      * Whether or not the latest charge for the customer's latest invoice has failed
      */
    var delinquent: Boolean = js.native
    
    var description: js.UndefOr[String] = js.native
    
    /**
      * Describes the current discount active on the customer, if there is one.
      */
    var discount: js.UndefOr[IDiscount] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    /**
      * The prefix for the customer used to generate unique invoice numbers.
      */
    var invoice_prefix: js.UndefOr[String] = js.native
    
    /**
      * Default invoice settings for this customer.
      */
    var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
    
    var livemode: Boolean = js.native
    
    var metadata: IMetadata = js.native
    
    /**
      * The customer’s full name or business name.
      */
    var name: js.UndefOr[String | Null] = js.native
    
    /**
      * Value is 'customer'
      */
    @JSName("object")
    var object_ICustomer: customer = js.native
    
    /**
      * The customer’s phone number.
      */
    var phone: js.UndefOr[String] = js.native
    
    /**
      * The customer’s preferred locales (languages), ordered by preference.
      */
    var preferred_locales: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Shipping information associated with the customer.
      */
    var shipping: IShippingInformation | Null = js.native
    
    /**
      * The customer’s payment sources, if any
      */
    var sources: js.UndefOr[IList[IStripeSource]] = js.native
    
    /**
      * The customer's current subscriptions, if any
      */
    var subscriptions: ICustomerSubscriptions = js.native
    
    /**
      * Describes the customer’s tax exemption status. One of none, exempt, or reverse.
      * When set to reverse, invoice and receipt PDFs include the text “Reverse charge”.
      */
    var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
    
    /**
      * The customer’s tax IDs.
      */
    var tax_ids: js.UndefOr[IList[ITaxId]] = js.native
    
    /**
      * @deprecated
      */
    var tax_info: js.UndefOr[js.Any] = js.native
    
    /**
      * @deprecated
      */
    var tax_info_verification: js.UndefOr[js.Any] = js.native
  }
  object ICustomer {
    
    @scala.inline
    def apply(
      created: Double,
      delinquent: Boolean,
      id: String,
      livemode: Boolean,
      metadata: IMetadata,
      `object`: customer,
      subscriptions: ICustomerSubscriptions
    ): ICustomer = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], delinquent = delinquent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomer]
    }
    
    @scala.inline
    implicit class ICustomerMutableBuilder[Self <: ICustomer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_balance(value: Double): Self = StObject.set(x, "account_balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_balanceUndefined: Self = StObject.set(x, "account_balance", js.undefined)
      
      @scala.inline
      def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressNull: Self = StObject.set(x, "address", null)
      
      @scala.inline
      def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      @scala.inline
      def setCards(value: CustomerCards): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyNull: Self = StObject.set(x, "currency", null)
      
      @scala.inline
      def setDefault_source(value: String | IStripeSource): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_sourceNull: Self = StObject.set(x, "default_source", null)
      
      @scala.inline
      def setDelinquent(value: Boolean): Self = StObject.set(x, "delinquent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDiscount(value: IDiscount): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setInvoice_prefix(value: String): Self = StObject.set(x, "invoice_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_prefixUndefined: Self = StObject.set(x, "invoice_prefix", js.undefined)
      
      @scala.inline
      def setInvoice_settings(value: ICustomerInvoiceSettings): Self = StObject.set(x, "invoice_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_settingsNull: Self = StObject.set(x, "invoice_settings", null)
      
      @scala.inline
      def setInvoice_settingsUndefined: Self = StObject.set(x, "invoice_settings", js.undefined)
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setObject(value: customer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setPreferred_locales(value: js.Array[String]): Self = StObject.set(x, "preferred_locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferred_localesUndefined: Self = StObject.set(x, "preferred_locales", js.undefined)
      
      @scala.inline
      def setPreferred_localesVarargs(value: String*): Self = StObject.set(x, "preferred_locales", js.Array(value :_*))
      
      @scala.inline
      def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingNull: Self = StObject.set(x, "shipping", null)
      
      @scala.inline
      def setSources(value: IList[IStripeSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      @scala.inline
      def setSubscriptions(value: ICustomerSubscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_exempt(value: none | exempt | reverse): Self = StObject.set(x, "tax_exempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_exemptUndefined: Self = StObject.set(x, "tax_exempt", js.undefined)
      
      @scala.inline
      def setTax_ids(value: IList[ITaxId]): Self = StObject.set(x, "tax_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_idsUndefined: Self = StObject.set(x, "tax_ids", js.undefined)
      
      @scala.inline
      def setTax_info(value: js.Any): Self = StObject.set(x, "tax_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_infoUndefined: Self = StObject.set(x, "tax_info", js.undefined)
      
      @scala.inline
      def setTax_info_verification(value: js.Any): Self = StObject.set(x, "tax_info_verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_info_verificationUndefined: Self = StObject.set(x, "tax_info_verification", js.undefined)
    }
  }
  
  @js.native
  trait ICustomerBankAccountSourceCreationOptions extends ICustomerSourceCreationOptions {
    
    @JSName("source")
    var source_ICustomerBankAccountSourceCreationOptions: ISourceCreationOptions = js.native
  }
  object ICustomerBankAccountSourceCreationOptions {
    
    @scala.inline
    def apply(source: ISourceCreationOptions): ICustomerBankAccountSourceCreationOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomerBankAccountSourceCreationOptions]
    }
    
    @scala.inline
    implicit class ICustomerBankAccountSourceCreationOptionsMutableBuilder[Self <: ICustomerBankAccountSourceCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: ISourceCreationOptions): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICustomerCardSourceCreationOptions extends ICustomerSourceCreationOptions {
    
    @JSName("source")
    var source_ICustomerCardSourceCreationOptions: ICardSourceCreationOptions = js.native
  }
  object ICustomerCardSourceCreationOptions {
    
    @scala.inline
    def apply(source: ICardSourceCreationOptions): ICustomerCardSourceCreationOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomerCardSourceCreationOptions]
    }
    
    @scala.inline
    implicit class ICustomerCardSourceCreationOptionsMutableBuilder[Self <: ICustomerCardSourceCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: ICardSourceCreationOptions): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICustomerCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * This field has been renamed to balance and will be removed in a future API version.
      * @deprecated
      */
    var account_balance: js.UndefOr[Double] = js.native
    
    var address: js.UndefOr[IAddress] = js.native
    
    /***
      * An integer amount in cents that represents the customer’s current balance, which affect the
      * customer’s future invoices. A negative amount represents a credit that decreases the amount
      * due on an invoice; a positive amount increases the amount due on an invoice.
      */
    var balance: js.UndefOr[Double] = js.native
    
    /**
      * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
      * API will not have the discount.
      */
    var coupon: js.UndefOr[String] = js.native
    
    /**
      * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
      * be unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
      * This can be unset by updating the value to null and then saving.
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * The prefix for the customer used to generate unique invoice numbers. Must be 3–12 uppercase letters or numbers.
      */
    var invoice_prefix: js.UndefOr[String] = js.native
    
    /**
      * Default invoice settings for this customer.
      */
    var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
    
    /**
      * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The ID of the PaymentMethod to attach to the customer.
      */
    var payment_method: js.UndefOr[String] = js.native
    
    /**
      * The customer’s phone number. This can be unset by updating the value to null and then saving.
      */
    var phone: js.UndefOr[String] = js.native
    
    /**
      * The identifier of the plan to subscribe the customer to. If provided, the returned customer object will have a list of subscriptions
      * that the customer is currently subscribed to. If you subscribe a customer to a plan without a free trial, the customer must have a
      * valid card as well.
      */
    var plan: js.UndefOr[String] = js.native
    
    /**
      * Customer’s preferred languages, ordered by preference. This can be unset by updating the value to null and then saving.
      */
    var preferred_locales: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The quantity you'd like to apply to the subscription you're creating (if you pass in a plan). For example, if your plan is
      * 10 cents/user/month, and your customer has 5 users, you could pass 5 as the quantity to have the customer charged 50 cents
      * (5 x 10 cents) monthly. Defaults to 1 if not set. Only applies when the plan parameter is also provided.
      */
    var quantity: js.UndefOr[Double] = js.native
    
    var shipping: js.UndefOr[IShippingInformation] = js.native
    
    /**
      * The source can either be a token, like the ones returned by our Stripe.js, or
      * a dictionary containing a user’s credit card details.
      */
    var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
    
    /**
      * The customer’s tax exemption. One of none, exempt, or reverse.
      */
    var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
    
    /**
      * The customer’s tax IDs.
      */
    var tax_id_data: js.UndefOr[js.Array[Type]] = js.native
    
    /**
      * @deprecated
      */
    var tax_info: js.UndefOr[js.Any] = js.native
    
    /**
      * A positive decimal (with at most two decimal places) between 1 and 100.
      * This represents the percentage of the subscription invoice subtotal that
      * will be calculated and added as tax to the final amount each billing period.
      * For example, a plan which charges $10/month with a tax_percent of 20.0
      * will charge $12 per invoice. Can only be used if a plan is provided.
      */
    var tax_percent: js.UndefOr[Double] = js.native
    
    /**
      * Unix timestamp representing the end of the trial period the customer will get before being charged. If set, trial_end will
      * override the default trial period of the plan the customer is being subscribed to. The special value now can be provided to
      * end the customer's trial immediately. Only applies when the plan parameter is also provided.
      */
    var trial_end: js.UndefOr[Double | now] = js.native
  }
  object ICustomerCreationOptions {
    
    @scala.inline
    def apply(): ICustomerCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomerCreationOptions]
    }
    
    @scala.inline
    implicit class ICustomerCreationOptionsMutableBuilder[Self <: ICustomerCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_balance(value: Double): Self = StObject.set(x, "account_balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_balanceUndefined: Self = StObject.set(x, "account_balance", js.undefined)
      
      @scala.inline
      def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setInvoice_prefix(value: String): Self = StObject.set(x, "invoice_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_prefixUndefined: Self = StObject.set(x, "invoice_prefix", js.undefined)
      
      @scala.inline
      def setInvoice_settings(value: ICustomerInvoiceSettings): Self = StObject.set(x, "invoice_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_settingsNull: Self = StObject.set(x, "invoice_settings", null)
      
      @scala.inline
      def setInvoice_settingsUndefined: Self = StObject.set(x, "invoice_settings", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      @scala.inline
      def setPreferred_locales(value: js.Array[String]): Self = StObject.set(x, "preferred_locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferred_localesUndefined: Self = StObject.set(x, "preferred_locales", js.undefined)
      
      @scala.inline
      def setPreferred_localesVarargs(value: String*): Self = StObject.set(x, "preferred_locales", js.Array(value :_*))
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setSource(value: String | ICardSourceCreationOptionsExtended): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTax_exempt(value: none | exempt | reverse): Self = StObject.set(x, "tax_exempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_exemptUndefined: Self = StObject.set(x, "tax_exempt", js.undefined)
      
      @scala.inline
      def setTax_id_data(value: js.Array[Type]): Self = StObject.set(x, "tax_id_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_id_dataUndefined: Self = StObject.set(x, "tax_id_data", js.undefined)
      
      @scala.inline
      def setTax_id_dataVarargs(value: Type*): Self = StObject.set(x, "tax_id_data", js.Array(value :_*))
      
      @scala.inline
      def setTax_info(value: js.Any): Self = StObject.set(x, "tax_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_infoUndefined: Self = StObject.set(x, "tax_info", js.undefined)
      
      @scala.inline
      def setTax_percent(value: Double): Self = StObject.set(x, "tax_percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_percentUndefined: Self = StObject.set(x, "tax_percent", js.undefined)
      
      @scala.inline
      def setTrial_end(value: Double | now): Self = StObject.set(x, "trial_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrial_endUndefined: Self = StObject.set(x, "trial_end", js.undefined)
    }
  }
  
  @js.native
  trait ICustomerInvoiceSettings extends StObject {
    
    /**
      * Default custom fields to be displayed on invoices for this customer.
      */
    var custom_fields: js.UndefOr[js.Array[Name]] = js.native
    
    /**
      * ID of the default payment method used for subscriptions and invoices for the customer.
      */
    var default_payment_method: js.UndefOr[String] = js.native
    
    /**
      * Default footer to be displayed on invoices for this customer.
      * This can be unset by updating the value to null and then saving.
      */
    var footer: js.UndefOr[String] = js.native
  }
  object ICustomerInvoiceSettings {
    
    @scala.inline
    def apply(): ICustomerInvoiceSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomerInvoiceSettings]
    }
    
    @scala.inline
    implicit class ICustomerInvoiceSettingsMutableBuilder[Self <: ICustomerInvoiceSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom_fields(value: js.Array[Name]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
      
      @scala.inline
      def setCustom_fieldsVarargs(value: Name*): Self = StObject.set(x, "custom_fields", js.Array(value :_*))
      
      @scala.inline
      def setDefault_payment_method(value: String): Self = StObject.set(x, "default_payment_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_payment_methodUndefined: Self = StObject.set(x, "default_payment_method", js.undefined)
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    }
  }
  
  @js.native
  trait ICustomerListOptions extends IListOptionsCreated {
    
    /**
      * A filter on the list based on the customer’s email field. The value must be a string.
      */
    var email: js.UndefOr[String] = js.native
  }
  object ICustomerListOptions {
    
    @scala.inline
    def apply(): ICustomerListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomerListOptions]
    }
    
    @scala.inline
    implicit class ICustomerListOptionsMutableBuilder[Self <: ICustomerListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    }
  }
  
  @js.native
  trait ICustomerSourceCreationOptions extends IDataOptionsWithMetadata {
    
    /**
      * When adding a card to a customer, the parameter name is source. When
      * adding to an account, the parameter name is external_account. The
      * value can either be a token, like the ones returned by our Stripe.js, or a
      * dictionary containing a user’s credit card details (with the options shown
      * below). Stripe will automatically validate the card.
      */
    var source: String | ICardSourceCreationOptions | ISourceCreationOptions = js.native
  }
  object ICustomerSourceCreationOptions {
    
    @scala.inline
    def apply(source: String | ICardSourceCreationOptions | ISourceCreationOptions): ICustomerSourceCreationOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomerSourceCreationOptions]
    }
    
    @scala.inline
    implicit class ICustomerSourceCreationOptionsMutableBuilder[Self <: ICustomerSourceCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String | ICardSourceCreationOptions | ISourceCreationOptions): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICustomerSubscriptions
    extends CustomerSubscriptions
       with IList[ISubscription]
  
  @js.native
  trait ICustomerUpdateOptions extends IDataOptionsWithMetadata {
    
    /**
      * This field has been renamed to balance and will be removed in a future API version.
      * @deprecated
      */
    var account_balance: js.UndefOr[Double] = js.native
    
    var address: js.UndefOr[IAddress] = js.native
    
    /**
      * An integer amount in cents that represents the customer’s current balance, which affect the
      * customer’s future invoices. A negative amount represents a credit that decreases the amount
      * due on an invoice; a positive amount increases the amount due on an invoice.
      */
    var balance: js.UndefOr[Double] = js.native
    
    /**
      * If you provide a coupon code, the customer will have a discount applied on all recurring charges. Charges you create through the
      * API will not have the discount.
      */
    var coupon: js.UndefOr[String] = js.native
    
    /**
      * ID of source to make the customer’s new default for invoice payments
      */
    var default_source: js.UndefOr[String] = js.native
    
    /**
      * An arbitrary string that you can attach to a customer object. It is displayed alongside the customer in the dashboard. This can
      * be unset by updating the value to null and then saving.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Customer's email address. It's displayed alongside the customer in your dashboard and can be useful for searching and tracking.
      * This can be unset by updating the value to null and then saving.
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * The prefix for the customer used to generate unique invoice numbers.
      */
    var invoice_prefix: js.UndefOr[String] = js.native
    
    /**
      * Default invoice settings for this customer.
      */
    var invoice_settings: js.UndefOr[ICustomerInvoiceSettings | Null] = js.native
    
    /**
      * The customer’s full name or business name. This can be unset by updating the value to null and then saving.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The customer’s phone number. This can be unset by updating the value to null and then saving.
      */
    var phone: js.UndefOr[String] = js.native
    
    /**
      * Customer’s preferred languages, ordered by preference. This can be unset by updating
      * the value to null and then saving.
      */
    var preferred_locales: js.UndefOr[js.Array[String] | Null] = js.native
    
    var shipping: js.UndefOr[IShippingInformation] = js.native
    
    /**
      * The source can either be a token, like the ones returned by our Stripe.js, or
      * a dictionary containing a user’s credit card details (with the options shown
      * below). Passing source will create a new source object, make it the new
      * customer default source, and delete the old customer default if one exists.
      * If you want to add additional sources instead of replacing the existing
      * default, use the card creation API. Whenever you attach a card to a
      * customer, Stripe will automatically validate the card.
      */
    var source: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.native
    
    /**
      * The customer’s tax exemption. One of none, exempt, or reverse.
      */
    var tax_exempt: js.UndefOr[none | exempt | reverse] = js.native
    
    /**
      * @deprecated
      */
    var tax_info: js.UndefOr[js.Any] = js.native
  }
  object ICustomerUpdateOptions {
    
    @scala.inline
    def apply(): ICustomerUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomerUpdateOptions]
    }
    
    @scala.inline
    implicit class ICustomerUpdateOptionsMutableBuilder[Self <: ICustomerUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount_balance(value: Double): Self = StObject.set(x, "account_balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccount_balanceUndefined: Self = StObject.set(x, "account_balance", js.undefined)
      
      @scala.inline
      def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setDefault_source(value: String): Self = StObject.set(x, "default_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_sourceUndefined: Self = StObject.set(x, "default_source", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setInvoice_prefix(value: String): Self = StObject.set(x, "invoice_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_prefixUndefined: Self = StObject.set(x, "invoice_prefix", js.undefined)
      
      @scala.inline
      def setInvoice_settings(value: ICustomerInvoiceSettings): Self = StObject.set(x, "invoice_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoice_settingsNull: Self = StObject.set(x, "invoice_settings", null)
      
      @scala.inline
      def setInvoice_settingsUndefined: Self = StObject.set(x, "invoice_settings", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setPreferred_locales(value: js.Array[String]): Self = StObject.set(x, "preferred_locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferred_localesNull: Self = StObject.set(x, "preferred_locales", null)
      
      @scala.inline
      def setPreferred_localesUndefined: Self = StObject.set(x, "preferred_locales", js.undefined)
      
      @scala.inline
      def setPreferred_localesVarargs(value: String*): Self = StObject.set(x, "preferred_locales", js.Array(value :_*))
      
      @scala.inline
      def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setSource(value: String | ICardSourceCreationOptionsExtended): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTax_exempt(value: none | exempt | reverse): Self = StObject.set(x, "tax_exempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_exemptUndefined: Self = StObject.set(x, "tax_exempt", js.undefined)
      
      @scala.inline
      def setTax_info(value: js.Any): Self = StObject.set(x, "tax_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTax_infoUndefined: Self = StObject.set(x, "tax_info", js.undefined)
    }
  }
  
  @js.native
  trait ISourceListOptions extends IListOptions {
    
    var `object`: source = js.native
  }
  object ISourceListOptions {
    
    @scala.inline
    def apply(`object`: source): ISourceListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISourceListOptions]
    }
    
    @scala.inline
    implicit class ISourceListOptionsMutableBuilder[Self <: ISourceListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: source): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
