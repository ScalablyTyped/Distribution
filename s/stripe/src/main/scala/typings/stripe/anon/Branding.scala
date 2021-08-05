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
  
  inline def apply(): Branding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Branding]
  }
  
  extension [Self <: Branding](x: Self) {
    
    inline def setBranding(value: Icon): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    inline def setCard_payments(value: Declineon): Self = StObject.set(x, "card_payments", value.asInstanceOf[js.Any])
    
    inline def setCard_paymentsUndefined: Self = StObject.set(x, "card_payments", js.undefined)
    
    inline def setDashboard(value: Displayname): Self = StObject.set(x, "dashboard", value.asInstanceOf[js.Any])
    
    inline def setDashboardUndefined: Self = StObject.set(x, "dashboard", js.undefined)
    
    inline def setPayments(value: Statementdescriptor): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPayouts(value: Debitnegativebalances): Self = StObject.set(x, "payouts", value.asInstanceOf[js.Any])
    
    inline def setPayoutsUndefined: Self = StObject.set(x, "payouts", js.undefined)
  }
}
