package typings.stripe.mod.charges

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

@js.native
trait IOutcome extends js.Object {
  /**
    * The value reversed_after_approval indicates the payment was blocked by Stripe after
    * bank authorization, and may temporarily appear as “pending” on a cardholder’s statement.
    */
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval = js.native
  /**
    * An enumerated value providing a more detailed explanation of the outcome’s type. Charges
    * blocked by Radar’s default block rule have the value highest_risk_level. Charges placed
    * in review by Radar’s default review rule have the value elevated_risk_level. Charges
    * authorized, blocked, or placed in review by custom rules have the value rule. See
    * understanding declines for more details.
    */
  var reason: String | Null = js.native
  /**
    * Stripe’s evaluation of the riskiness of the payment. Possible values for evaluated
    * payments are normal, elevated, highest. For non-card payments, and card-based payments
    * predating the public assignment of risk levels, this field will have the value not_assessed.
    * In the event of an error in the evaluation, this field will have the value unknown.
    */
  var risk_level: js.UndefOr[String | Null] = js.native
  /**
    * Stripe’s evaluation of the riskiness of the payment. Possible values for evaluated
    * payments are between 0 and 100. For non-card payments, card-based payments predating
    * the public assignment of risk scores, or in the event of an error during evaluation,
    * this field will not be present. This field is only available with Radar for Fraud Teams.
    */
  var risk_score: js.UndefOr[Double | Null] = js.native
  /**
    * The ID of the Radar rule that matched the payment, if applicable. [Expandable]
    */
  var rule: js.UndefOr[String | js.Array[String] | Null] = js.native
  /**
    * A human-readable description of the outcome type and reason, designed for you (the
    * recipient of the payment), not your customer.
    */
  var seller_message: String = js.native
  /**
    * See [understanding declines]<https://stripe.com/docs/declines> and
    * [Radar reviews]<https://stripe.com/docs/radar/review> for details.
    */
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid = js.native
}

object IOutcome {
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid
  ): IOutcome = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], seller_message = seller_message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutcome]
  }
  @scala.inline
  implicit class IOutcomeOps[Self <: IOutcome] (val x: Self) extends AnyVal {
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
    def setNetwork_status(value: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval): Self = this.set("network_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeller_message(value: String): Self = this.set("seller_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: authorized | manual_review | issuer_declined | blocked | invalid): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonNull: Self = this.set("reason", null)
    @scala.inline
    def setRisk_level(value: String): Self = this.set("risk_level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRisk_level: Self = this.set("risk_level", js.undefined)
    @scala.inline
    def setRisk_levelNull: Self = this.set("risk_level", null)
    @scala.inline
    def setRisk_score(value: Double): Self = this.set("risk_score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRisk_score: Self = this.set("risk_score", js.undefined)
    @scala.inline
    def setRisk_scoreNull: Self = this.set("risk_score", null)
    @scala.inline
    def setRuleVarargs(value: String*): Self = this.set("rule", js.Array(value :_*))
    @scala.inline
    def setRule(value: String | js.Array[String]): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setRuleNull: Self = this.set("rule", null)
  }
  
}

