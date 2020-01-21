package typings.stripe.mod.issuing.cards

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.issuing.cardholders.ICardholder
import typings.stripe.stripeStrings.issuingDotcard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * You can create physical or virtual cards that are issued to cardholders.
  */
trait IIssuingCard extends IResourceObject {
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
    `object`: issuingDotcard,
    pin: IIssuingCardPin,
    replacement_for: String | IIssuingCard,
    replacement_reason: IssuingCardReplacementReason,
    shipping: IIssuingCardShippingDetails,
    status: IssuingCardStatus,
    `type`: IssuingCardType
  ): IIssuingCard = {
    val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], replacement_for = replacement_for.asInstanceOf[js.Any], replacement_reason = replacement_reason.asInstanceOf[js.Any], shipping = shipping.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCard]
  }
}

