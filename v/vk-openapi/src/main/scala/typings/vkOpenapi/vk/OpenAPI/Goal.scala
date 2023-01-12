package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Goal {
  
  type API = js.Function2[/* goalEvent */ GoalEvent, /* goalParams */ js.UndefOr[GoalParams], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vkOpenapi.vkOpenapiStrings.add_to_cart
    - typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist
    - typings.vkOpenapi.vkOpenapiStrings.customize_product
    - typings.vkOpenapi.vkOpenapiStrings.initiate_checkout
    - typings.vkOpenapi.vkOpenapiStrings.add_payment_info
    - typings.vkOpenapi.vkOpenapiStrings.purchase
    - typings.vkOpenapi.vkOpenapiStrings.contact
    - typings.vkOpenapi.vkOpenapiStrings.lead
    - typings.vkOpenapi.vkOpenapiStrings.schedule
    - typings.vkOpenapi.vkOpenapiStrings.complete_registration
    - typings.vkOpenapi.vkOpenapiStrings.submit_application
    - typings.vkOpenapi.vkOpenapiStrings.start_trial
    - typings.vkOpenapi.vkOpenapiStrings.subscribe
    - typings.vkOpenapi.vkOpenapiStrings.page_view
    - typings.vkOpenapi.vkOpenapiStrings.view_content
    - typings.vkOpenapi.vkOpenapiStrings.search
    - typings.vkOpenapi.vkOpenapiStrings.find_location
    - typings.vkOpenapi.vkOpenapiStrings.donate
    - typings.vkOpenapi.vkOpenapiStrings.conversion
  */
  trait GoalEvent extends StObject
  object GoalEvent {
    
    inline def add_payment_info: typings.vkOpenapi.vkOpenapiStrings.add_payment_info = "add_payment_info".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_payment_info]
    
    inline def add_to_cart: typings.vkOpenapi.vkOpenapiStrings.add_to_cart = "add_to_cart".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_to_cart]
    
    inline def add_to_wishlist: typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.add_to_wishlist]
    
    inline def complete_registration: typings.vkOpenapi.vkOpenapiStrings.complete_registration = "complete_registration".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.complete_registration]
    
    inline def contact: typings.vkOpenapi.vkOpenapiStrings.contact = "contact".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.contact]
    
    inline def conversion: typings.vkOpenapi.vkOpenapiStrings.conversion = "conversion".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.conversion]
    
    inline def customize_product: typings.vkOpenapi.vkOpenapiStrings.customize_product = "customize_product".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.customize_product]
    
    inline def donate: typings.vkOpenapi.vkOpenapiStrings.donate = "donate".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.donate]
    
    inline def find_location: typings.vkOpenapi.vkOpenapiStrings.find_location = "find_location".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.find_location]
    
    inline def initiate_checkout: typings.vkOpenapi.vkOpenapiStrings.initiate_checkout = "initiate_checkout".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.initiate_checkout]
    
    inline def lead: typings.vkOpenapi.vkOpenapiStrings.lead = "lead".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.lead]
    
    inline def page_view: typings.vkOpenapi.vkOpenapiStrings.page_view = "page_view".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.page_view]
    
    inline def purchase: typings.vkOpenapi.vkOpenapiStrings.purchase = "purchase".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.purchase]
    
    inline def schedule: typings.vkOpenapi.vkOpenapiStrings.schedule = "schedule".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.schedule]
    
    inline def search: typings.vkOpenapi.vkOpenapiStrings.search = "search".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.search]
    
    inline def start_trial: typings.vkOpenapi.vkOpenapiStrings.start_trial = "start_trial".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.start_trial]
    
    inline def submit_application: typings.vkOpenapi.vkOpenapiStrings.submit_application = "submit_application".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.submit_application]
    
    inline def subscribe: typings.vkOpenapi.vkOpenapiStrings.subscribe = "subscribe".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.subscribe]
    
    inline def view_content: typings.vkOpenapi.vkOpenapiStrings.view_content = "view_content".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.view_content]
  }
  
  trait GoalParams extends StObject {
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object GoalParams {
    
    inline def apply(): GoalParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoalParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoalParams] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
