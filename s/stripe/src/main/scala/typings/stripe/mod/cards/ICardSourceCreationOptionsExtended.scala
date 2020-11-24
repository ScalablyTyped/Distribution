package typings.stripe.mod.cards

import typings.stripe.stripeStrings.card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardSourceCreationOptionsExtended extends ICardSourceCreationOptions {
  
  /**
    * Required when adding a card to an account (not applicable to a
    * customers or recipients). The card (which must be a debit card) can be
    * used as a transfer destination for funds in this currency. Currently, the
    * only supported currency for debit card transfers is usd.
    *
    * Managed accounts only.
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * Only applicable on accounts (not customers or recipients). If you set
    * this to true (or if this is the first external account being added in this
    * currency) this card will become the default external account for its
    * currency.
    *
    * Managed accounts only.
    */
  var default_for_currency: js.UndefOr[Boolean] = js.native
}
object ICardSourceCreationOptionsExtended {
  
  @scala.inline
  def apply(exp_month: Double, exp_year: Double, number: String, `object`: card): ICardSourceCreationOptionsExtended = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardSourceCreationOptionsExtended]
  }
  
  @scala.inline
  implicit class ICardSourceCreationOptionsExtendedOps[Self <: ICardSourceCreationOptionsExtended] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDefault_for_currency(value: Boolean): Self = this.set("default_for_currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_for_currency: Self = this.set("default_for_currency", js.undefined)
  }
}
