package typings.stripe.mod.issuing

import typings.std.Exclude
import typings.stripe.anon.AddressICardholderBillingAddress
import typings.stripe.anon.AddressName
import typings.stripe.anon.Day
import typings.stripe.anon.DocumentFront
import typings.stripe.anon.Pastdue
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.blocked
import typings.stripe.stripeStrings.issuingDotcardholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardholders {
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.active
    - typings.stripe.stripeStrings.inactive
    - typings.stripe.stripeStrings.blocked
  */
  trait CardholderStatus extends StObject
  object CardholderStatus {
    
    inline def active: typings.stripe.stripeStrings.active = "active".asInstanceOf[typings.stripe.stripeStrings.active]
    
    inline def blocked: typings.stripe.stripeStrings.blocked = "blocked".asInstanceOf[typings.stripe.stripeStrings.blocked]
    
    inline def inactive: typings.stripe.stripeStrings.inactive = "inactive".asInstanceOf[typings.stripe.stripeStrings.inactive]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.individual
    - typings.stripe.stripeStrings.business_entity
  */
  trait CardholderType extends StObject
  object CardholderType {
    
    inline def business_entity: typings.stripe.stripeStrings.business_entity = "business_entity".asInstanceOf[typings.stripe.stripeStrings.business_entity]
    
    inline def individual: typings.stripe.stripeStrings.individual = "individual".asInstanceOf[typings.stripe.stripeStrings.individual]
  }
  
  /**
    * An Issuing Cardholder object represents an individual or business entity who is issued cards.
    */
  trait ICardholder
    extends StObject
       with IResourceObject {
    
    var authorization_controls: ICardholderAuthorizationControls
    
    /**
      * The cardholder’s billing address.
      */
    var billing: AddressName
    
    /**
      * Additional information about a business_entity cardholder.
      */
    var company: ICardholderBusinessEntity
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * The cardholder’s email address.
      */
    var email: String
    
    /**
      * Additional information about an individual cardholder.
      */
    var individual: ICardholderIndividual
    
    /**
      * Whether or not this cardholder is the default cardholder.
      */
    var is_default: Boolean
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata
    
    /**
      * The cardholder’s name. This will be printed on cards issued to them.
      */
    var name: String
    
    /**
      * String representing the object’s type. Objects of the same type share the same value.
      */
    @JSName("object")
    var object_ICardholder: issuingDotcardholder
    
    /**
      * The cardholder’s phone number.
      */
    var phone_number: String
    
    /**
      * Information about verification requirements for the cardholder, including what information needs to be collected.
      */
    var requirements: Pastdue
    
    /**
      * One of active, inactive, or blocked.
      */
    var status: CardholderStatus
    
    /**
      * One of individual or business_entity.
      */
    var `type`: CardholderType
  }
  object ICardholder {
    
    inline def apply(
      authorization_controls: ICardholderAuthorizationControls,
      billing: AddressName,
      company: ICardholderBusinessEntity,
      created: Double,
      email: String,
      id: String,
      individual: ICardholderIndividual,
      is_default: Boolean,
      livemode: Boolean,
      metadata: IMetadata,
      name: String,
      phone_number: String,
      requirements: Pastdue,
      status: CardholderStatus,
      `type`: CardholderType
    ): ICardholder = {
      val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], is_default = is_default.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("issuing.cardholder")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardholder]
    }
    
    extension [Self <: ICardholder](x: Self) {
      
      inline def setAuthorization_controls(value: ICardholderAuthorizationControls): Self = StObject.set(x, "authorization_controls", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: AddressName): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setCompany(value: ICardholderBusinessEntity): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setIndividual(value: ICardholderIndividual): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
      
      inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: issuingDotcardholder): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setRequirements(value: Pastdue): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: CardholderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: CardholderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICardholderAuthorizationControls extends StObject {
    
    /**
      * Array of strings containing categories of authorizations permitted on this card.
      */
    var allowed_categories: js.Array[String]
    
    /**
      * Array of strings containing categories of authorizations to always decline on this card.
      */
    var blocked_categories: js.Array[String]
    
    /**
      * Limit the spending with rules based on time intervals and categories.
      */
    var spending_limits: js.Array[ISpendingLimit]
    
    /**
      * Currency for the amounts within spending_limits. Locked to the currency of the card.
      */
    var spending_limits_currency: String
  }
  object ICardholderAuthorizationControls {
    
    inline def apply(
      allowed_categories: js.Array[String],
      blocked_categories: js.Array[String],
      spending_limits: js.Array[ISpendingLimit],
      spending_limits_currency: String
    ): ICardholderAuthorizationControls = {
      val __obj = js.Dynamic.literal(allowed_categories = allowed_categories.asInstanceOf[js.Any], blocked_categories = blocked_categories.asInstanceOf[js.Any], spending_limits = spending_limits.asInstanceOf[js.Any], spending_limits_currency = spending_limits_currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardholderAuthorizationControls]
    }
    
    extension [Self <: ICardholderAuthorizationControls](x: Self) {
      
      inline def setAllowed_categories(value: js.Array[String]): Self = StObject.set(x, "allowed_categories", value.asInstanceOf[js.Any])
      
      inline def setAllowed_categoriesVarargs(value: String*): Self = StObject.set(x, "allowed_categories", js.Array(value :_*))
      
      inline def setBlocked_categories(value: js.Array[String]): Self = StObject.set(x, "blocked_categories", value.asInstanceOf[js.Any])
      
      inline def setBlocked_categoriesVarargs(value: String*): Self = StObject.set(x, "blocked_categories", js.Array(value :_*))
      
      inline def setSpending_limits(value: js.Array[ISpendingLimit]): Self = StObject.set(x, "spending_limits", value.asInstanceOf[js.Any])
      
      inline def setSpending_limitsVarargs(value: ISpendingLimit*): Self = StObject.set(x, "spending_limits", js.Array(value :_*))
      
      inline def setSpending_limits_currency(value: String): Self = StObject.set(x, "spending_limits_currency", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICardholderBillingAddress extends StObject {
    
    /**
      * City/District/Suburb/Town/Village.
      */
    var city: String
    
    /**
      * 2-letter country code.
      */
    var country: String
    
    /**
      * Address line 1 (Street address/PO Box/Company name).
      */
    var line1: String
    
    /**
      * Address line 2 (Apartment/Suite/Unit/Building).
      */
    var line2: js.UndefOr[String] = js.undefined
    
    /**
      * ZIP or postal code.
      */
    var postal_code: String
    
    /**
      * State/County/Province/Region.
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object ICardholderBillingAddress {
    
    inline def apply(city: String, country: String, line1: String, postal_code: String): ICardholderBillingAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardholderBillingAddress]
    }
    
    extension [Self <: ICardholderBillingAddress](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
      
      inline def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
      
      inline def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait ICardholderBusinessEntity extends StObject {
    
    /**
      * Whether the company’s business ID number was provided.
      */
    var tax_id_provided: js.UndefOr[Boolean] = js.undefined
  }
  object ICardholderBusinessEntity {
    
    inline def apply(): ICardholderBusinessEntity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardholderBusinessEntity]
    }
    
    extension [Self <: ICardholderBusinessEntity](x: Self) {
      
      inline def setTax_id_provided(value: Boolean): Self = StObject.set(x, "tax_id_provided", value.asInstanceOf[js.Any])
      
      inline def setTax_id_providedUndefined: Self = StObject.set(x, "tax_id_provided", js.undefined)
    }
  }
  
  trait ICardholderCreateOptions
    extends StObject
       with ICardholderUpdateOptions {
    
    /**
      * The cardholder’s billing address.
      */
    @JSName("billing")
    var billing_ICardholderCreateOptions: AddressICardholderBillingAddress
    
    /**
      * The cardholder’s name. This will be printed on cards issued to them.
      */
    var name: String
    
    /**
      * The type of cardholder. Possible values are individual or business_entity.
      */
    var `type`: CardholderType
  }
  object ICardholderCreateOptions {
    
    inline def apply(billing: AddressICardholderBillingAddress, name: String, `type`: CardholderType): ICardholderCreateOptions = {
      val __obj = js.Dynamic.literal(billing = billing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardholderCreateOptions]
    }
    
    extension [Self <: ICardholderCreateOptions](x: Self) {
      
      inline def setBilling(value: AddressICardholderBillingAddress): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: CardholderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICardholderIndividual extends StObject {
    
    /**
      * The date of birth of this cardholder.
      */
    var dob: Day
    
    /**
      * The first name of this cardholder.
      */
    var first_name: String
    
    /**
      * The last name of this cardholder.
      */
    var last_name: String
    
    /**
      * Government-issued ID document for this cardholder.
      */
    var verification: js.UndefOr[DocumentFront] = js.undefined
  }
  object ICardholderIndividual {
    
    inline def apply(dob: Day, first_name: String, last_name: String): ICardholderIndividual = {
      val __obj = js.Dynamic.literal(dob = dob.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardholderIndividual]
    }
    
    extension [Self <: ICardholderIndividual](x: Self) {
      
      inline def setDob(value: Day): Self = StObject.set(x, "dob", value.asInstanceOf[js.Any])
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setVerification(value: DocumentFront): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
  
  trait ICardholderListOptions extends StObject {
    
    /**
      * A filter on the list based on the object created field. The value can be a string with an integer Unix timestamp, or it can be a
      * dictionary with the following options:
      */
    var created: js.UndefOr[String | ICreated] = js.undefined
    
    /**
      * Only return cardholders that have the given email address.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_bar, your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
      */
    var ending_before: js.UndefOr[String] = js.undefined
    
    /**
      * Only return the default cardholder.
      */
    var is_default: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Only return cardholders that have the given phone number.
      */
    var phone_number: js.UndefOr[String] = js.undefined
    
    /**
      * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
      */
    var starting_after: js.UndefOr[String] = js.undefined
    
    /**
      * Only return cardholders that have the given status. One of active, inactive, or blocked.
      */
    var status: js.UndefOr[CardholderStatus] = js.undefined
    
    /**
      * Only return cardholders that have the given type. One of individual or business_entity.
      */
    var `type`: js.UndefOr[CardholderType] = js.undefined
  }
  object ICardholderListOptions {
    
    inline def apply(): ICardholderListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardholderListOptions]
    }
    
    extension [Self <: ICardholderListOptions](x: Self) {
      
      inline def setCreated(value: String | ICreated): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
      
      inline def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
      
      inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
      
      inline def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
      
      inline def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
      
      inline def setStatus(value: CardholderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: CardholderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ICardholderUpdateOptions extends StObject {
    
    /**
      * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
      */
    var authorization_controls: js.UndefOr[ICardholderAuthorizationControls] = js.undefined
    
    /**
      * The cardholder’s billing address.
      */
    var billing: js.UndefOr[AddressICardholderBillingAddress] = js.undefined
    
    /**
      * Additional information about a business_entity cardholder.
      */
    var company: js.UndefOr[ICardholderBusinessEntity] = js.undefined
    
    /**
      * The cardholder’s email address.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * Additional information about an individual cardholder.
      */
    var individual: js.UndefOr[ICardholderIndividual] = js.undefined
    
    /**
      * Specifies whether to set this as the default cardholder.
      */
    var is_default: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
      */
    var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
    
    /**
      * The cardholder’s phone number.
      */
    var phone_number: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether to permit authorizations on this cardholder’s cards. Possible values are active or inactive.
      */
    var status: js.UndefOr[Exclude[CardholderStatus, blocked]] = js.undefined
  }
  object ICardholderUpdateOptions {
    
    inline def apply(): ICardholderUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardholderUpdateOptions]
    }
    
    extension [Self <: ICardholderUpdateOptions](x: Self) {
      
      inline def setAuthorization_controls(value: ICardholderAuthorizationControls): Self = StObject.set(x, "authorization_controls", value.asInstanceOf[js.Any])
      
      inline def setAuthorization_controlsUndefined: Self = StObject.set(x, "authorization_controls", js.undefined)
      
      inline def setBilling(value: AddressICardholderBillingAddress): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
      
      inline def setCompany(value: ICardholderBusinessEntity): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIndividual(value: ICardholderIndividual): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
      
      inline def setIndividualUndefined: Self = StObject.set(x, "individual", js.undefined)
      
      inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
      
      inline def setIs_defaultUndefined: Self = StObject.set(x, "is_default", js.undefined)
      
      inline def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      inline def setStatus(value: Exclude[CardholderStatus, blocked]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * Limit the spending with rules based on time intervals and categories.
    */
  trait ISpendingLimit extends StObject {
    
    /**
      * Maximum amount allowed to spend per time interval.
      */
    var amount: Double
    
    /**
      * Array of strings containing categories on which to apply the spending limit. Leave this blank to limit all charges.
      */
    var categories: js.Array[String]
    
    /**
      * The time interval with which to apply this spending limit towards. Allowed values are per_authorization, daily, weekly, monthly, yearly, or all_time.
      */
    var interval: SpendingLimitInterval
  }
  object ISpendingLimit {
    
    inline def apply(amount: Double, categories: js.Array[String], interval: SpendingLimitInterval): ISpendingLimit = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpendingLimit]
    }
    
    extension [Self <: ISpendingLimit](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
      
      inline def setInterval(value: SpendingLimitInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.per_authorization
    - typings.stripe.stripeStrings.daily
    - typings.stripe.stripeStrings.weekly
    - typings.stripe.stripeStrings.monthly
    - typings.stripe.stripeStrings.yearly
    - typings.stripe.stripeStrings.all_time
  */
  trait SpendingLimitInterval extends StObject
  object SpendingLimitInterval {
    
    inline def all_time: typings.stripe.stripeStrings.all_time = "all_time".asInstanceOf[typings.stripe.stripeStrings.all_time]
    
    inline def daily: typings.stripe.stripeStrings.daily = "daily".asInstanceOf[typings.stripe.stripeStrings.daily]
    
    inline def monthly: typings.stripe.stripeStrings.monthly = "monthly".asInstanceOf[typings.stripe.stripeStrings.monthly]
    
    inline def per_authorization: typings.stripe.stripeStrings.per_authorization = "per_authorization".asInstanceOf[typings.stripe.stripeStrings.per_authorization]
    
    inline def weekly: typings.stripe.stripeStrings.weekly = "weekly".asInstanceOf[typings.stripe.stripeStrings.weekly]
    
    inline def yearly: typings.stripe.stripeStrings.yearly = "yearly".asInstanceOf[typings.stripe.stripeStrings.yearly]
  }
}
