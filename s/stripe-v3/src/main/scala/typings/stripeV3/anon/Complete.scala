package typings.stripeV3.anon

import typings.stripeV3.stripe.elements.PaymentRequestButtonStyleOptions
import typings.stripeV3.stripe.elements.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete extends StObject {
  
  var base: js.UndefOr[Style] = js.native
  
  var complete: js.UndefOr[Style] = js.native
  
  var empty: js.UndefOr[Style] = js.native
  
  var invalid: js.UndefOr[Style] = js.native
  
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyleOptions] = js.native
}
object Complete {
  
  @scala.inline
  def apply(): Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Complete]
  }
  
  @scala.inline
  implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Style): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setComplete(value: Style): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEmpty(value: Style): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setInvalid(value: Style): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    @scala.inline
    def setPaymentRequestButton(value: PaymentRequestButtonStyleOptions): Self = StObject.set(x, "paymentRequestButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentRequestButtonUndefined: Self = StObject.set(x, "paymentRequestButton", js.undefined)
  }
}
