package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardholderAuthorizationControls extends js.Object {
  /**
    * Array of strings containing categories of authorizations permitted on this card.
    */
  var allowed_categories: js.Array[String]
  /**
    * Array of strings containing categories of authorizations to always decline on this card.
    */
  var blocked_categories: js.Array[String]
  /**
    * Limit the spending with rules based on time intervals and categories.
    */
  var spending_limits: js.Array[ISpendingLimit]
  /**
    * Currency for the amounts within spending_limits. Locked to the currency of the card.
    */
  var spending_limits_currency: String
}

object ICardholderAuthorizationControls {
  @scala.inline
  def apply(
    allowed_categories: js.Array[String],
    blocked_categories: js.Array[String],
    spending_limits: js.Array[ISpendingLimit],
    spending_limits_currency: String
  ): ICardholderAuthorizationControls = {
    val __obj = js.Dynamic.literal(allowed_categories = allowed_categories.asInstanceOf[js.Any], blocked_categories = blocked_categories.asInstanceOf[js.Any], spending_limits = spending_limits.asInstanceOf[js.Any], spending_limits_currency = spending_limits_currency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICardholderAuthorizationControls]
  }
}

