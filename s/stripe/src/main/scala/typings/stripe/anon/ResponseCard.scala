package typings.stripe.anon

import typings.stripe.mod.Stripe.Issuing.Card
import typings.stripe.mod.Stripe.Issuing.Card.CancellationReason
import typings.stripe.mod.Stripe.Issuing.Card.ReplacementReason
import typings.stripe.mod.Stripe.Issuing.Card.Shipping
import typings.stripe.mod.Stripe.Issuing.Card.SpendingControls
import typings.stripe.mod.Stripe.Issuing.Card.Status
import typings.stripe.mod.Stripe.Issuing.Card.Wallets
import typings.stripe.mod.Stripe.Issuing.Cardholder
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.issuingDotcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Issuing.Card> */
trait ResponseCard extends StObject {
  
  /**
    * The brand of the card.
    */
  var brand: String
  
  /**
    * The reason why the card was canceled.
    */
  var cancellation_reason: CancellationReason | Null
  
  /**
    * An Issuing `Cardholder` object represents an individual or business entity who is [issued](https://stripe.com/docs/issuing) cards.
    *
    * Related guide: [How to create a Cardholder](https://stripe.com/docs/issuing/cards#create-cardholder)
    */
  var cardholder: Cardholder
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Supported currencies are `usd` in the US, `eur` in the EU, and `gbp` in the UK.
    */
  var currency: String
  
  /**
    * The card's CVC. For security reasons, this is only available for virtual cards, and will be omitted unless you explicitly request it with [the `expand` parameter](https://stripe.com/docs/api/expanding_objects). Additionally, it's only available via the ["Retrieve a card" endpoint](https://stripe.com/docs/api/issuing/cards/retrieve), not via "List all cards" or any other endpoint.
    */
  var cvc: js.UndefOr[String] = js.undefined
  
  /**
    * The expiration month of the card.
    */
  var exp_month: Double
  
  /**
    * The expiration year of the card.
    */
  var exp_year: Double
  
  /**
    * The financial account this card is attached to.
    */
  var financial_account: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * The last 4 digits of the card number.
    */
  var last4: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * The full unredacted card number. For security reasons, this is only available for virtual cards, and will be omitted unless you explicitly request it with [the `expand` parameter](https://stripe.com/docs/api/expanding_objects). Additionally, it's only available via the ["Retrieve a card" endpoint](https://stripe.com/docs/api/issuing/cards/retrieve), not via "List all cards" or any other endpoint.
    */
  var number: js.UndefOr[String] = js.undefined
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: issuingDotcard
  
  /**
    * The latest card that replaces this card, if any.
    */
  var replaced_by: String | Card | Null
  
  /**
    * The card this card replaces, if any.
    */
  var replacement_for: String | Card | Null
  
  /**
    * The reason why the previous card needed to be replaced.
    */
  var replacement_reason: ReplacementReason | Null
  
  /**
    * Where and how the card will be shipped.
    */
  var shipping: Shipping | Null
  
  var spending_controls: SpendingControls
  
  /**
    * Whether authorizations can be approved on this card. May be blocked from activating cards depending on past-due Cardholder requirements. Defaults to `inactive`.
    */
  var status: Status
  
  /**
    * The type of the card.
    */
  var `type`: typings.stripe.mod.Stripe.Issuing.Card.Type
  
  /**
    * Information relating to digital wallets (like Apple Pay and Google Pay).
    */
  var wallets: Wallets | Null
}
object ResponseCard {
  
  inline def apply(
    brand: String,
    cardholder: Cardholder,
    created: Double,
    currency: String,
    exp_month: Double,
    exp_year: Double,
    id: String,
    last4: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    spending_controls: SpendingControls,
    status: Status,
    `type`: typings.stripe.mod.Stripe.Issuing.Card.Type
  ): ResponseCard = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spending_controls = spending_controls.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], cancellation_reason = null, replaced_by = null, replacement_for = null, replacement_reason = null, shipping = null, wallets = null)
    __obj.updateDynamic("object")("issuing.card")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCard] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setCancellation_reason(value: CancellationReason): Self = StObject.set(x, "cancellation_reason", value.asInstanceOf[js.Any])
    
    inline def setCancellation_reasonNull: Self = StObject.set(x, "cancellation_reason", null)
    
    inline def setCardholder(value: Cardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setCvcUndefined: Self = StObject.set(x, "cvc", js.undefined)
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setFinancial_account(value: String): Self = StObject.set(x, "financial_account", value.asInstanceOf[js.Any])
    
    inline def setFinancial_accountNull: Self = StObject.set(x, "financial_account", null)
    
    inline def setFinancial_accountUndefined: Self = StObject.set(x, "financial_account", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setObject(value: issuingDotcard): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReplaced_by(value: String | Card): Self = StObject.set(x, "replaced_by", value.asInstanceOf[js.Any])
    
    inline def setReplaced_byNull: Self = StObject.set(x, "replaced_by", null)
    
    inline def setReplacement_for(value: String | Card): Self = StObject.set(x, "replacement_for", value.asInstanceOf[js.Any])
    
    inline def setReplacement_forNull: Self = StObject.set(x, "replacement_for", null)
    
    inline def setReplacement_reason(value: ReplacementReason): Self = StObject.set(x, "replacement_reason", value.asInstanceOf[js.Any])
    
    inline def setReplacement_reasonNull: Self = StObject.set(x, "replacement_reason", null)
    
    inline def setShipping(value: Shipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingNull: Self = StObject.set(x, "shipping", null)
    
    inline def setSpending_controls(value: SpendingControls): Self = StObject.set(x, "spending_controls", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Issuing.Card.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWallets(value: Wallets): Self = StObject.set(x, "wallets", value.asInstanceOf[js.Any])
    
    inline def setWalletsNull: Self = StObject.set(x, "wallets", null)
  }
}
