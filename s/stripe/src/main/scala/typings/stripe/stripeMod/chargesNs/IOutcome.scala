package typings.stripe.stripeMod.chargesNs

import typings.stripe.stripeStrings.approved_by_network
import typings.stripe.stripeStrings.authorized
import typings.stripe.stripeStrings.blocked
import typings.stripe.stripeStrings.declined_by_network
import typings.stripe.stripeStrings.invalid
import typings.stripe.stripeStrings.issuer_declined
import typings.stripe.stripeStrings.manual_review
import typings.stripe.stripeStrings.not_sent_to_network
import typings.stripe.stripeStrings.reversed_after_approval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutcome extends js.Object {
  /**
    * The value reversed_after_approval indicates the payment was blocked by Stripe after
    * bank authorization, and may temporarily appear as “pending” on a cardholder’s statement.
    */
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval
  /**
    * An enumerated value providing a more detailed explanation of the outcome’s type. Charges
    * blocked by Radar’s default block rule have the value highest_risk_level. Charges placed
    * in review by Radar’s default review rule have the value elevated_risk_level. Charges
    * authorized, blocked, or placed in review by custom rules have the value rule. See
    * understanding declines for more details.
    */
  var reason: String | Null
  /**
    * Stripe’s evaluation of the riskiness of the payment. Possible values for evaluated
    * payments are normal, elevated, highest. For non-card payments, and card-based payments
    * predating the public assignment of risk levels, this field will have the value not_assessed.
    * In the event of an error in the evaluation, this field will have the value unknown.
    */
  var risk_level: js.UndefOr[String | Null] = js.undefined
  /**
    * The ID of the Radar rule that matched the payment, if applicable. [Expandable]
    */
  var rule: js.UndefOr[String | js.Array[String] | Null] = js.undefined
  /**
    * A human-readable description of the outcome type and reason, designed for you (the
    * recipient of the payment), not your customer.
    */
  var seller_message: String
  /**
    * See [understanding declines]<https://stripe.com/docs/declines> and
    * [Radar reviews]<https://stripe.com/docs/radar/review> for details.
    */
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid
}

object IOutcome {
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid,
    reason: String = null,
    risk_level: String = null,
    rule: String | js.Array[String] = null
  ): IOutcome = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], seller_message = seller_message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (risk_level != null) __obj.updateDynamic("risk_level")(risk_level)
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutcome]
  }
}

