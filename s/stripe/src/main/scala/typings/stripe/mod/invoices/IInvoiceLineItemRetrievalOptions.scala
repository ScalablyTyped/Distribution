package typings.stripe.mod.invoices

import typings.stripe.mod.IListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInvoiceLineItemRetrievalOptions
  extends StObject
     with IListOptions {
  
  var coupon: js.UndefOr[String] = js.undefined
  
  /**
    * In the case of upcoming invoices, the customer of the upcoming invoice is required. In other cases it is ignored.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * In the case of upcoming invoices, the subscription of the upcoming invoice is optional. In other cases it is ignored.
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  var subscription_plan: js.UndefOr[String] = js.undefined
  
  var subscription_prorate: js.UndefOr[Boolean] = js.undefined
  
  var subscription_proration_date: js.UndefOr[Double] = js.undefined
  
  var subscription_quantity: js.UndefOr[Double] = js.undefined
  
  var subscription_trial_end: js.UndefOr[Double] = js.undefined
}
object IInvoiceLineItemRetrievalOptions {
  
  inline def apply(): IInvoiceLineItemRetrievalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInvoiceLineItemRetrievalOptions]
  }
  
  extension [Self <: IInvoiceLineItemRetrievalOptions](x: Self) {
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setSubscription_plan(value: String): Self = StObject.set(x, "subscription_plan", value.asInstanceOf[js.Any])
    
    inline def setSubscription_planUndefined: Self = StObject.set(x, "subscription_plan", js.undefined)
    
    inline def setSubscription_prorate(value: Boolean): Self = StObject.set(x, "subscription_prorate", value.asInstanceOf[js.Any])
    
    inline def setSubscription_prorateUndefined: Self = StObject.set(x, "subscription_prorate", js.undefined)
    
    inline def setSubscription_proration_date(value: Double): Self = StObject.set(x, "subscription_proration_date", value.asInstanceOf[js.Any])
    
    inline def setSubscription_proration_dateUndefined: Self = StObject.set(x, "subscription_proration_date", js.undefined)
    
    inline def setSubscription_quantity(value: Double): Self = StObject.set(x, "subscription_quantity", value.asInstanceOf[js.Any])
    
    inline def setSubscription_quantityUndefined: Self = StObject.set(x, "subscription_quantity", js.undefined)
    
    inline def setSubscription_trial_end(value: Double): Self = StObject.set(x, "subscription_trial_end", value.asInstanceOf[js.Any])
    
    inline def setSubscription_trial_endUndefined: Self = StObject.set(x, "subscription_trial_end", js.undefined)
  }
}
