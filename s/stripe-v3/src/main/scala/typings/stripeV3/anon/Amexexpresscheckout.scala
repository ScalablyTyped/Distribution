package typings.stripeV3.anon

import typings.stripeV3.stripeV3Strings.amex_express_checkout
import typings.stripeV3.stripeV3Strings.apple_pay
import typings.stripeV3.stripeV3Strings.google_pay
import typings.stripeV3.stripeV3Strings.masterpass
import typings.stripeV3.stripeV3Strings.samsung_pay
import typings.stripeV3.stripeV3Strings.visa_checkout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amexexpresscheckout extends StObject {
  
  var amex_express_checkout: js.UndefOr[js.Any] = js.undefined
  
  var apple_pay: js.UndefOr[js.Any] = js.undefined
  
  var dynamic_last4: js.UndefOr[js.Any] = js.undefined
  
  var google_pay: js.UndefOr[js.Any] = js.undefined
  
  var masterpass: js.UndefOr[js.Any] = js.undefined
  
  var samsung_pay: js.UndefOr[js.Any] = js.undefined
  
  var `type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout
  
  var visa_checkout: js.UndefOr[js.Any] = js.undefined
}
object Amexexpresscheckout {
  
  @scala.inline
  def apply(`type`: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout): Amexexpresscheckout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amexexpresscheckout]
  }
  
  @scala.inline
  implicit class AmexexpresscheckoutMutableBuilder[Self <: Amexexpresscheckout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmex_express_checkout(value: js.Any): Self = StObject.set(x, "amex_express_checkout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmex_express_checkoutUndefined: Self = StObject.set(x, "amex_express_checkout", js.undefined)
    
    @scala.inline
    def setApple_pay(value: js.Any): Self = StObject.set(x, "apple_pay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApple_payUndefined: Self = StObject.set(x, "apple_pay", js.undefined)
    
    @scala.inline
    def setDynamic_last4(value: js.Any): Self = StObject.set(x, "dynamic_last4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamic_last4Undefined: Self = StObject.set(x, "dynamic_last4", js.undefined)
    
    @scala.inline
    def setGoogle_pay(value: js.Any): Self = StObject.set(x, "google_pay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogle_payUndefined: Self = StObject.set(x, "google_pay", js.undefined)
    
    @scala.inline
    def setMasterpass(value: js.Any): Self = StObject.set(x, "masterpass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterpassUndefined: Self = StObject.set(x, "masterpass", js.undefined)
    
    @scala.inline
    def setSamsung_pay(value: js.Any): Self = StObject.set(x, "samsung_pay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamsung_payUndefined: Self = StObject.set(x, "samsung_pay", js.undefined)
    
    @scala.inline
    def setType(value: amex_express_checkout | apple_pay | google_pay | masterpass | samsung_pay | visa_checkout): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisa_checkout(value: js.Any): Self = StObject.set(x, "visa_checkout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisa_checkoutUndefined: Self = StObject.set(x, "visa_checkout", js.undefined)
  }
}
