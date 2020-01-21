package typings.stripe.mod.issuing.cards

import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an Issuing Card object.
  */
trait IIssuingCardCreateOptions extends IIssuingCardUpdateOptions {
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
  def apply(
    currency: String,
    `type`: IssuingCardType,
    auhtorization_controls: ICardAuthorizationControls = null,
    cardholder: String = null,
    metadata: IOptionsMetadata = null,
    replacement_for: String = null,
    replacement_reason: IssuingCardReplacementReason = null,
    shipping: IIssuingCardShippingAddress = null,
    status: IssuingCardStatus = null
  ): IIssuingCardCreateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (auhtorization_controls != null) __obj.updateDynamic("auhtorization_controls")(auhtorization_controls.asInstanceOf[js.Any])
    if (cardholder != null) __obj.updateDynamic("cardholder")(cardholder.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (replacement_for != null) __obj.updateDynamic("replacement_for")(replacement_for.asInstanceOf[js.Any])
    if (replacement_reason != null) __obj.updateDynamic("replacement_reason")(replacement_reason.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardCreateOptions]
  }
}

