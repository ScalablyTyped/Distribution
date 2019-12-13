package typings.stripe

import typings.stripe.stripeStrings.account
import typings.stripe.stripeStrings.allowed_categories
import typings.stripe.stripeStrings.blocked_categories
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.cardholder
import typings.stripe.stripeStrings.max_amount
import typings.stripe.stripeStrings.max_approvals
import typings.stripe.stripeStrings.spending_limits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Account extends js.Object {
  /**
    * Entity which the authorization control acts on. One of account, card, or cardholder.
    */
  var entity: account | cardholder | card
  /**
    * Name of the authorization control. One of allowed_categories, blocked_categories, max_amount, max_approvals, or spending_limits.
    */
  var name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
}

object Anon_Account {
  @scala.inline
  def apply(
    entity: account | cardholder | card,
    name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
  ): Anon_Account = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Account]
  }
}

