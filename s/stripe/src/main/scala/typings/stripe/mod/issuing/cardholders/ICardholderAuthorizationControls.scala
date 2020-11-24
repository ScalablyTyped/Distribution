package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderAuthorizationControls extends js.Object {
  
  /**
    * Array of strings containing categories of authorizations permitted on this card.
    */
  var allowed_categories: js.Array[String] = js.native
  
  /**
    * Array of strings containing categories of authorizations to always decline on this card.
    */
  var blocked_categories: js.Array[String] = js.native
  
  /**
    * Limit the spending with rules based on time intervals and categories.
    */
  var spending_limits: js.Array[ISpendingLimit] = js.native
  
  /**
    * Currency for the amounts within spending_limits. Locked to the currency of the card.
    */
  var spending_limits_currency: String = js.native
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
  
  @scala.inline
  implicit class ICardholderAuthorizationControlsOps[Self <: ICardholderAuthorizationControls] (val x: Self) extends AnyVal {
    
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
    def setAllowed_categoriesVarargs(value: String*): Self = this.set("allowed_categories", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_categories(value: js.Array[String]): Self = this.set("allowed_categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked_categoriesVarargs(value: String*): Self = this.set("blocked_categories", js.Array(value :_*))
    
    @scala.inline
    def setBlocked_categories(value: js.Array[String]): Self = this.set("blocked_categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpending_limitsVarargs(value: ISpendingLimit*): Self = this.set("spending_limits", js.Array(value :_*))
    
    @scala.inline
    def setSpending_limits(value: js.Array[ISpendingLimit]): Self = this.set("spending_limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpending_limits_currency(value: String): Self = this.set("spending_limits_currency", value.asInstanceOf[js.Any])
  }
}
