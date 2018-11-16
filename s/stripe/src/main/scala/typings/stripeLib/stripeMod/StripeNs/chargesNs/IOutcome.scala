package typings
package stripeLib.stripeMod.StripeNs.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOutcome extends js.Object {
  /**
               * The value reversed_after_approval indicates the payment was blocked by Stripe after
               * bank authorization, and may temporarily appear as “pending” on a cardholder’s statement.
               */
  var network_status: stripeLib.stripeLibStrings.approved_by_network | stripeLib.stripeLibStrings.declined_by_network | stripeLib.stripeLibStrings.not_sent_to_network | stripeLib.stripeLibStrings.reversed_after_approval
  /**
               * An enumerated value providing a more detailed explanation of the outcome’s type. Charges
               * blocked by Radar’s default block rule have the value highest_risk_level. Charges placed
               * in review by Radar’s default review rule have the value elevated_risk_level. Charges
               * authorized, blocked, or placed in review by custom rules have the value rule. See
               * understanding declines for more details.
               */
  var reason: java.lang.String | scala.Null
  /**
               * Stripe’s evaluation of the riskiness of the payment. Possible values for evaluated
               * payments are normal, elevated, highest. For non-card payments, and card-based payments
               * predating the public assignment of risk levels, this field will have the value not_assessed.
               * In the event of an error in the evaluation, this field will have the value unknown.
               */
  var risk_level: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
               * The ID of the Radar rule that matched the payment, if applicable. [Expandable]
               */
  var rule: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
               * A human-readable description of the outcome type and reason, designed for you (the
               * recipient of the payment), not your customer.
               */
  var seller_message: java.lang.String
  /**
               * See [understanding declines]<https://stripe.com/docs/declines> and
               * [Radar reviews]<https://stripe.com/docs/radar/review> for details.
               */
  var `type`: stripeLib.stripeLibStrings.authorized | stripeLib.stripeLibStrings.manual_review | stripeLib.stripeLibStrings.issuer_declined | stripeLib.stripeLibStrings.blocked | stripeLib.stripeLibStrings.invalid
}

