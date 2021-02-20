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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOutcome extends StObject {
  
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
  implicit class IOutcomeMutableBuilder[Self <: IOutcome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetwork_status(value: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval): Self = StObject.set(x, "network_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNull: Self = StObject.set(x, "reason", null)
    
    @scala.inline
    def setRisk_level(value: String): Self = StObject.set(x, "risk_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRisk_levelNull: Self = StObject.set(x, "risk_level", null)
    
    @scala.inline
    def setRisk_levelUndefined: Self = StObject.set(x, "risk_level", js.undefined)
    
    @scala.inline
    def setRisk_score(value: Double): Self = StObject.set(x, "risk_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRisk_scoreNull: Self = StObject.set(x, "risk_score", null)
    
    @scala.inline
    def setRisk_scoreUndefined: Self = StObject.set(x, "risk_score", js.undefined)
    
    @scala.inline
    def setRule(value: String | js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNull: Self = StObject.set(x, "rule", null)
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    @scala.inline
    def setSeller_message(value: String): Self = StObject.set(x, "seller_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: authorized | manual_review | issuer_declined | blocked | invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
