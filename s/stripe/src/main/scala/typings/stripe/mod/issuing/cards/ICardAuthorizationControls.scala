package typings.stripe.mod.issuing.cards

import typings.stripe.mod.issuing.cardholders.ICardholderAuthorizationControls
import typings.stripe.mod.issuing.cardholders.ISpendingLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spending rules that give you some control over how your cards can be used.
  * Refer to our authorizations documentation for more details.
  */
trait ICardAuthorizationControls extends ICardholderAuthorizationControls {
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
}

