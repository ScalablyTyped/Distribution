package typings.stripeV3.anon

import typings.stripeV3.stripe.elements.PaymentRequestButtonStyleOptions
import typings.stripeV3.stripe.elements.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  var base: js.UndefOr[Style] = js.undefined
  
  var complete: js.UndefOr[Style] = js.undefined
  
  var empty: js.UndefOr[Style] = js.undefined
  
  var invalid: js.UndefOr[Style] = js.undefined
  
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyleOptions] = js.undefined
}
object Complete {
  
  inline def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  
  extension [Self <: Complete](x: Self) {
    
    inline def setBase(value: Style): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setComplete(value: Style): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setEmpty(value: Style): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setInvalid(value: Style): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setPaymentRequestButton(value: PaymentRequestButtonStyleOptions): Self = StObject.set(x, "paymentRequestButton", value.asInstanceOf[js.Any])
    
    inline def setPaymentRequestButtonUndefined: Self = StObject.set(x, "paymentRequestButton", js.undefined)
  }
}
