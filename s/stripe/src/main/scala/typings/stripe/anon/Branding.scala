package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branding extends StObject {
  
  /**
    * Settings used to apply the account’s branding to email receipts, invoices,
    * Checkout, and other products.
    */
  var branding: js.UndefOr[Icon] = js.undefined
  
  /**
    * Settings specific to card charging on the account.
    */
  var card_payments: js.UndefOr[Declineon] = js.undefined
  
  /**
    * Settings used to configure the account within the Stripe dashboard.
    */
  var dashboard: js.UndefOr[Displayname] = js.undefined
  
  /**
    * Settings that apply across payment methods for charging on the account.
    */
  var payments: js.UndefOr[Statementdescriptor] = js.undefined
  
  /**
    * Settings specific to the account’s payouts.
    */
  var payouts: js.UndefOr[Debitnegativebalances] = js.undefined
}
object Branding {
  
  @scala.inline
  def apply(): Branding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Branding]
  }
  
  @scala.inline
  implicit class BrandingMutableBuilder[Self <: Branding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranding(value: Icon): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    @scala.inline
    def setCard_payments(value: Declineon): Self = StObject.set(x, "card_payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard_paymentsUndefined: Self = StObject.set(x, "card_payments", js.undefined)
    
    @scala.inline
    def setDashboard(value: Displayname): Self = StObject.set(x, "dashboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashboardUndefined: Self = StObject.set(x, "dashboard", js.undefined)
    
    @scala.inline
    def setPayments(value: Statementdescriptor): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    @scala.inline
    def setPayouts(value: Debitnegativebalances): Self = StObject.set(x, "payouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayoutsUndefined: Self = StObject.set(x, "payouts", js.undefined)
  }
}
