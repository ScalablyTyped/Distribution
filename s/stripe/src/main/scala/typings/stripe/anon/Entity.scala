package typings.stripe.anon

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends js.Object {
  
  /**
    * Entity which the authorization control acts on. One of account, card, or cardholder.
    */
  var entity: account | cardholder | card = js.native
  
  /**
    * Name of the authorization control. One of allowed_categories, blocked_categories, max_amount, max_approvals, or spending_limits.
    */
  var name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits = js.native
}
object Entity {
  
  @scala.inline
  def apply(
    entity: account | cardholder | card,
    name: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits
  ): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityOps[Self <: Entity] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: account | cardholder | card): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: allowed_categories | blocked_categories | max_amount | max_approvals | spending_limits): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
