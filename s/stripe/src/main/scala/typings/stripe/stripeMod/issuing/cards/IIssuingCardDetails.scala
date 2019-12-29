package typings.stripe.stripeMod.issuing.cards

import typings.stripe.stripeStrings.issuingDotcard_details
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIssuingCardDetails extends js.Object {
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
  def apply(
    card: IIssuingCard,
    cvc: String,
    exp_month: Double,
    exp_year: Double,
    number: String,
    `object`: issuingDotcard_details
  ): IIssuingCardDetails = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardDetails]
  }
}

