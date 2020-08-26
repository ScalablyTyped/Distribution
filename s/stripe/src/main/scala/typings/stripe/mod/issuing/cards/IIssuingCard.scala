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
@js.native
trait IIssuingCard extends IResourceObject {
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var authorization_controls: ICardAuthorizationControls = js.native
  /**
    * The brand of the card.
    */
  var brand: String = js.native
  /**
    * The Cardholder object to which the card belongs.
    */
  var cardholder: ICardholder = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String = js.native
  /**
    * The expiration month of the card.
    */
  var exp_month: Double = js.native
  /**
    * The expiration year of the card.
    */
  var exp_year: Double = js.native
  /**
    * The last 4 digits of the card number.
    */
  var last4: String = js.native
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  /**
    * The name of the cardholder, printed on the card.
    */
  var name: String = js.native
  /**
    * Value is "issuing.card"
    */
  @JSName("object")
  var object_IIssuingCard: issuingDotcard = js.native
  /**
    * Metadata about the PIN on the card.
    */
  var pin: IIssuingCardPin = js.native
  /**
    * The card this card replaces, if any.
    */
  var replacement_for: String | IIssuingCard = js.native
  /**
    * Why the card that this card replaces (if any) needed to be replaced. One of damage, expiration, loss, or theft.
    */
  var replacement_reason: IssuingCardReplacementReason = js.native
  /**
    * Where and how the card will be shipped.
    */
  var shipping: IIssuingCardShippingDetails = js.native
  /**
    * One of active, inactive, canceled, lost, or stolen.
    */
  var status: IssuingCardStatus = js.native
  /**
    * One of virtual or physical.
    */
  var `type`: IssuingCardType = js.native
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
  @scala.inline
  implicit class IIssuingCardOps[Self <: IIssuingCard] (val x: Self) extends AnyVal {
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
    def setAuthorization_controls(value: ICardAuthorizationControls): Self = this.set("authorization_controls", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardholder(value: ICardholder): Self = this.set("cardholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp_month(value: Double): Self = this.set("exp_month", value.asInstanceOf[js.Any])
    @scala.inline
    def setExp_year(value: Double): Self = this.set("exp_year", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: issuingDotcard): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPin(value: IIssuingCardPin): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement_for(value: String | IIssuingCard): Self = this.set("replacement_for", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement_reason(value: IssuingCardReplacementReason): Self = this.set("replacement_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setShipping(value: IIssuingCardShippingDetails): Self = this.set("shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: IssuingCardStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: IssuingCardType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

