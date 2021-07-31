package typings.stripe.mod.issuing

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.issuing.cardholders.ICardholder
import typings.stripe.mod.issuing.cardholders.ICardholderAuthorizationControls
import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import typings.stripe.mod.issuing.cardholders.ISpendingLimit
import typings.stripe.stripeStrings.active
import typings.stripe.stripeStrings.blocked
import typings.stripe.stripeStrings.bulk
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.delivered
import typings.stripe.stripeStrings.failure
import typings.stripe.stripeStrings.individual
import typings.stripe.stripeStrings.issuingDotcard
import typings.stripe.stripeStrings.issuingDotcard_details
import typings.stripe.stripeStrings.pending
import typings.stripe.stripeStrings.returned
import typings.stripe.stripeStrings.shipped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cards {
  
  /**
    * Spending rules that give you some control over how your cards can be used.
    * Refer to our authorizations documentation for more details.
    */
  trait ICardAuthorizationControls
    extends StObject
       with ICardholderAuthorizationControls {
    
    /**
      * The currency of the card. See max_amount
      */
    var currency: String
    
    /**
      * Maximum count of approved authorizations on this card. Counts all authorizations retroactively.
      */
    var max_approvals: Double
  }
  object ICardAuthorizationControls {
    
    @scala.inline
    def apply(
      allowed_categories: js.Array[String],
      blocked_categories: js.Array[String],
      currency: String,
      max_approvals: Double,
      spending_limits: js.Array[ISpendingLimit],
      spending_limits_currency: String
    ): ICardAuthorizationControls = {
      val __obj = js.Dynamic.literal(allowed_categories = allowed_categories.asInstanceOf[js.Any], blocked_categories = blocked_categories.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], max_approvals = max_approvals.asInstanceOf[js.Any], spending_limits = spending_limits.asInstanceOf[js.Any], spending_limits_currency = spending_limits_currency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardAuthorizationControls]
    }
    
    @scala.inline
    implicit class ICardAuthorizationControlsMutableBuilder[Self <: ICardAuthorizationControls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_approvals(value: Double): Self = StObject.set(x, "max_approvals", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * You can create physical or virtual cards that are issued to cardholders.
    */
  trait IIssuingCard
    extends StObject
       with IResourceObject {
    
    /**
      * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
      */
    var authorization_controls: ICardAuthorizationControls
    
    /**
      * The brand of the card.
      */
    var brand: String
    
    /**
      * The Cardholder object to which the card belongs.
      */
    var cardholder: ICardholder
    
    /**
      * Time at which the object was created. Measured in seconds since the Unix epoch.
      */
    var created: Double
    
    /**
      * Three-letter ISO currency code, in lowercase. Must be a supported currency.
      */
    var currency: String
    
    /**
      * The expiration month of the card.
      */
    var exp_month: Double
    
    /**
      * The expiration year of the card.
      */
    var exp_year: Double
    
    /**
      * The last 4 digits of the card number.
      */
    var last4: String
    
    /**
      * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
      */
    var livemode: Boolean
    
    /**
      * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
      */
    var metadata: IMetadata
    
    /**
      * The name of the cardholder, printed on the card.
      */
    var name: String
    
    /**
      * Value is "issuing.card"
      */
    @JSName("object")
    var object_IIssuingCard: issuingDotcard
    
    /**
      * Metadata about the PIN on the card.
      */
    var pin: IIssuingCardPin
    
    /**
      * The card this card replaces, if any.
      */
    var replacement_for: String | IIssuingCard
    
    /**
      * Why the card that this card replaces (if any) needed to be replaced. One of damage, expiration, loss, or theft.
      */
    var replacement_reason: IssuingCardReplacementReason
    
    /**
      * Where and how the card will be shipped.
      */
    var shipping: IIssuingCardShippingDetails
    
    /**
      * One of active, inactive, canceled, lost, or stolen.
      */
    var status: IssuingCardStatus
    
    /**
      * One of virtual or physical.
      */
    var `type`: IssuingCardType
  }
  object IIssuingCard {
    
    @scala.inline
    def apply(
      authorization_controls: ICardAuthorizationControls,
      brand: String,
      cardholder: ICardholder,
      created: Double,
      currency: String,
      exp_month: Double,
      exp_year: Double,
      id: String,
      last4: String,
      livemode: Boolean,
      metadata: IMetadata,
      name: String,
      pin: IIssuingCardPin,
      replacement_for: String | IIssuingCard,
      replacement_reason: IssuingCardReplacementReason,
      shipping: IIssuingCardShippingDetails,
      status: IssuingCardStatus,
      `type`: IssuingCardType
    ): IIssuingCard = {
      val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], replacement_for = replacement_for.asInstanceOf[js.Any], replacement_reason = replacement_reason.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("issuing.card")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingCard]
    }
    
    @scala.inline
    implicit class IIssuingCardMutableBuilder[Self <: IIssuingCard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization_controls(value: ICardAuthorizationControls): Self = StObject.set(x, "authorization_controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholder(value: ICardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: issuingDotcard): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPin(value: IIssuingCardPin): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacement_for(value: String | IIssuingCard): Self = StObject.set(x, "replacement_for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacement_reason(value: IssuingCardReplacementReason): Self = StObject.set(x, "replacement_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping(value: IIssuingCardShippingDetails): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: IssuingCardStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IssuingCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Creates an Issuing Card object.
    */
  trait IIssuingCardCreateOptions
    extends StObject
       with IIssuingCardUpdateOptions {
    
    /**
      * The currency for the card. This currently must be usd.
      */
    var currency: String
    
    /**
      * The card this is meant to be a replacement for (if any).
      */
    var replacement_for: js.UndefOr[String] = js.undefined
    
    /**
      * If replacement_for is specified, this should indicate why that card is being replaced. One of damage, expiration, loss, or theft.
      */
    var replacement_reason: js.UndefOr[IssuingCardReplacementReason] = js.undefined
    
    /**
      * The address where the card will be shipped.
      */
    var shipping: js.UndefOr[IIssuingCardShippingAddress] = js.undefined
    
    /**
      * The type of card to issue. Possible values are physical or virtual.
      */
    var `type`: IssuingCardType
  }
  object IIssuingCardCreateOptions {
    
    @scala.inline
    def apply(currency: String, `type`: IssuingCardType): IIssuingCardCreateOptions = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingCardCreateOptions]
    }
    
    @scala.inline
    implicit class IIssuingCardCreateOptionsMutableBuilder[Self <: IIssuingCardCreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacement_for(value: String): Self = StObject.set(x, "replacement_for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacement_forUndefined: Self = StObject.set(x, "replacement_for", js.undefined)
      
      @scala.inline
      def setReplacement_reason(value: IssuingCardReplacementReason): Self = StObject.set(x, "replacement_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacement_reasonUndefined: Self = StObject.set(x, "replacement_reason", js.undefined)
      
      @scala.inline
      def setShipping(value: IIssuingCardShippingAddress): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setType(value: IssuingCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IIssuingCardDetails extends StObject {
    
    /**
      * The card object
      */
    var card: IIssuingCard
    
    /**
      * The CVC of the card.
      */
    var cvc: String
    
    /**
      * The expiration month of the card.
      */
    var exp_month: Double
    
    /**
      * The expiration year of the card.
      */
    var exp_year: Double
    
    /**
      * The card number.
      */
    var number: String
    
    /**
      * Value is "object.card"
      */
    var `object`: issuingDotcard_details
  }
  object IIssuingCardDetails {
    
    @scala.inline
    def apply(card: IIssuingCard, cvc: String, exp_month: Double, exp_year: Double, number: String): IIssuingCardDetails = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("issuing.card_details")
      __obj.asInstanceOf[IIssuingCardDetails]
    }
    
    @scala.inline
    implicit class IIssuingCardDetailsMutableBuilder[Self <: IIssuingCardDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: IIssuingCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: issuingDotcard_details): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Returns a list of Issuing Card objects. The objects are sorted in descending order by creation date,
    * with the most recently created object appearing first.
    */
  trait IIssuingCardListOptions extends StObject {
    
    /**
      * Only return cards belonging to the Cardholder with the provided ID.
      */
    var cardholder: js.UndefOr[String] = js.undefined
    
    /**
      * A filter on the list based on the object created field.
      * The value can be a string with an integer Unix timestamp, or it can be a dictionary with the following options:
      */
    var created: js.UndefOr[String | ICreated] = js.undefined
    
    /**
      * A cursor for use in pagination. ending_before is an object ID that defines your place in the list.
      * For instance, if you make a list request and receive 100 objects, starting with obj_bar,
      * your subsequent call can include ending_before=obj_bar in order to fetch the previous page of the list.
      */
    var ending_before: js.UndefOr[String] = js.undefined
    
    /**
      * Only return cards that have the given expiration month.
      */
    var exp_month: js.UndefOr[Double] = js.undefined
    
    /**
      * Only return cards that have the given expiration year.
      */
    var exp_year: js.UndefOr[Double] = js.undefined
    
    /**
      * Only return cards that have the given last four digits.
      */
    var last4: js.UndefOr[String] = js.undefined
    
    /**
      * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 10.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Only return cards that have the given name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Only return cards whose full card number matches that of this card source ID.
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * A cursor for use in pagination. starting_after is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include starting_after=obj_foo in order to fetch the next page of the list.
      */
    var starting_after: js.UndefOr[String] = js.undefined
    
    /**
      * Only return cards that have the given status. One of active, inactive, canceled, lost, or stolen.
      */
    var status: js.UndefOr[IssuingCardStatus] = js.undefined
    
    /**
      * Only return cards that have the given type. One of virtual or physical.
      */
    var `type`: js.UndefOr[IssuingCardType] = js.undefined
  }
  object IIssuingCardListOptions {
    
    @scala.inline
    def apply(): IIssuingCardListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIssuingCardListOptions]
    }
    
    @scala.inline
    implicit class IIssuingCardListOptionsMutableBuilder[Self <: IIssuingCardListOptions] (val x: Self) extends AnyVal {
      
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
      def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
      
      @scala.inline
      def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
      
      @scala.inline
      def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast4Undefined: Self = StObject.set(x, "last4", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
      
      @scala.inline
      def setStatus(value: IssuingCardStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: IssuingCardType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Metadata about the PIN on the card.
    */
  trait IIssuingCardPin extends StObject {
    
    var status: blocked | active
  }
  object IIssuingCardPin {
    
    @scala.inline
    def apply(status: blocked | active): IIssuingCardPin = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingCardPin]
    }
    
    @scala.inline
    implicit class IIssuingCardPinMutableBuilder[Self <: IIssuingCardPin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: blocked | active): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IIssuingCardShippingAddress extends StObject {
    
    /**
      * Shipping address.
      */
    var address: ICardholderBillingAddress
    
    /**
      * Recipient name.
      */
    var name: String
    
    /**
      * One of bulk or individual. Bulk shipments will be grouped and mailed together, while individual ones will not.
      */
    var `type`: js.UndefOr[bulk | individual] = js.undefined
  }
  object IIssuingCardShippingAddress {
    
    @scala.inline
    def apply(address: ICardholderBillingAddress, name: String): IIssuingCardShippingAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingCardShippingAddress]
    }
    
    @scala.inline
    implicit class IIssuingCardShippingAddressMutableBuilder[Self <: IIssuingCardShippingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: ICardholderBillingAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: bulk | individual): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IIssuingCardShippingDetails
    extends StObject
       with IIssuingCardShippingAddress {
    
    /**
      * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc.
      */
    var carrier: String
    
    /**
      * A unix timestamp representing a best estimate of when the card will be delivered.
      */
    var eta: Double
    
    /**
      * The delivery status of the card. One of pending, shipped, delivered, returned, failure, or canceled.
      */
    var status: pending | shipped | delivered | returned | failure | canceled
    
    /**
      * A tracking number for a card shipment.
      */
    var tracking_number: String
    
    /**
      * A link to the shipping carrier’s site where you can view detailed information about a card shipment.
      */
    var tracking_url: String
  }
  object IIssuingCardShippingDetails {
    
    @scala.inline
    def apply(
      address: ICardholderBillingAddress,
      carrier: String,
      eta: Double,
      name: String,
      status: pending | shipped | delivered | returned | failure | canceled,
      tracking_number: String,
      tracking_url: String
    ): IIssuingCardShippingDetails = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any], tracking_url = tracking_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIssuingCardShippingDetails]
    }
    
    @scala.inline
    implicit class IIssuingCardShippingDetailsMutableBuilder[Self <: IIssuingCardShippingDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: pending | shipped | delivered | returned | failure | canceled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracking_url(value: String): Self = StObject.set(x, "tracking_url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Updates the specified Issuing Card object by setting the values of the parameters passed. Any parameters not provided will be left unchanged.
    */
  trait IIssuingCardUpdateOptions extends StObject {
    
    /**
      * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
      */
    var auhtorization_controls: js.UndefOr[ICardAuthorizationControls] = js.undefined
    
    /**
      * The Cardholder to associate the card with.
      */
    var cardholder: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
    
    /**
      * Specifies whether to permit authorizations on this card. Possible values are active, inactive, or the terminal states: canceled, lost, stolen.
      */
    var status: js.UndefOr[IssuingCardStatus] = js.undefined
  }
  object IIssuingCardUpdateOptions {
    
    @scala.inline
    def apply(): IIssuingCardUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIssuingCardUpdateOptions]
    }
    
    @scala.inline
    implicit class IIssuingCardUpdateOptionsMutableBuilder[Self <: IIssuingCardUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuhtorization_controls(value: ICardAuthorizationControls): Self = StObject.set(x, "auhtorization_controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuhtorization_controlsUndefined: Self = StObject.set(x, "auhtorization_controls", js.undefined)
      
      @scala.inline
      def setCardholder(value: String): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholderUndefined: Self = StObject.set(x, "cardholder", js.undefined)
      
      @scala.inline
      def setMetadata(value: IOptionsMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setStatus(value: IssuingCardStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.damage
    - typings.stripe.stripeStrings.expiration
    - typings.stripe.stripeStrings.loss
    - typings.stripe.stripeStrings.theft
  */
  trait IssuingCardReplacementReason extends StObject
  object IssuingCardReplacementReason {
    
    @scala.inline
    def damage: typings.stripe.stripeStrings.damage = "damage".asInstanceOf[typings.stripe.stripeStrings.damage]
    
    @scala.inline
    def expiration: typings.stripe.stripeStrings.expiration = "expiration".asInstanceOf[typings.stripe.stripeStrings.expiration]
    
    @scala.inline
    def loss: typings.stripe.stripeStrings.loss = "loss".asInstanceOf[typings.stripe.stripeStrings.loss]
    
    @scala.inline
    def theft: typings.stripe.stripeStrings.theft = "theft".asInstanceOf[typings.stripe.stripeStrings.theft]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.active
    - typings.stripe.stripeStrings.inactive
    - typings.stripe.stripeStrings.canceled
    - typings.stripe.stripeStrings.lost
    - typings.stripe.stripeStrings.stolen
  */
  trait IssuingCardStatus extends StObject
  object IssuingCardStatus {
    
    @scala.inline
    def active: typings.stripe.stripeStrings.active = "active".asInstanceOf[typings.stripe.stripeStrings.active]
    
    @scala.inline
    def canceled: typings.stripe.stripeStrings.canceled = "canceled".asInstanceOf[typings.stripe.stripeStrings.canceled]
    
    @scala.inline
    def inactive: typings.stripe.stripeStrings.inactive = "inactive".asInstanceOf[typings.stripe.stripeStrings.inactive]
    
    @scala.inline
    def lost: typings.stripe.stripeStrings.lost = "lost".asInstanceOf[typings.stripe.stripeStrings.lost]
    
    @scala.inline
    def stolen: typings.stripe.stripeStrings.stolen = "stolen".asInstanceOf[typings.stripe.stripeStrings.stolen]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stripe.stripeStrings.virtual
    - typings.stripe.stripeStrings.physical
  */
  trait IssuingCardType extends StObject
  object IssuingCardType {
    
    @scala.inline
    def physical: typings.stripe.stripeStrings.physical = "physical".asInstanceOf[typings.stripe.stripeStrings.physical]
    
    @scala.inline
    def virtual: typings.stripe.stripeStrings.virtual = "virtual".asInstanceOf[typings.stripe.stripeStrings.virtual]
  }
}
