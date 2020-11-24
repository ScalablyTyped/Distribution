package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Branding extends js.Object {
  
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[Icon] = js.native
  
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[Declineon] = js.native
  
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[Displayname] = js.native
  
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[Statementdescriptor] = js.native
  
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[Debitnegativebalances] = js.native
}
object Branding {
  
  @scala.inline
  def apply(): Branding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Branding]
  }
  
  @scala.inline
  implicit class BrandingOps[Self <: Branding] (val x: Self) extends AnyVal {
    
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
    def setBranding(value: Icon): Self = this.set("branding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranding: Self = this.set("branding", js.undefined)
    
    @scala.inline
    def setCard_payments(value: Declineon): Self = this.set("card_payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard_payments: Self = this.set("card_payments", js.undefined)
    
    @scala.inline
    def setDashboard(value: Displayname): Self = this.set("dashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashboard: Self = this.set("dashboard", js.undefined)
    
    @scala.inline
    def setPayments(value: Statementdescriptor): Self = this.set("payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayments: Self = this.set("payments", js.undefined)
    
    @scala.inline
    def setPayouts(value: Debitnegativebalances): Self = this.set("payouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayouts: Self = this.set("payouts", js.undefined)
  }
}
