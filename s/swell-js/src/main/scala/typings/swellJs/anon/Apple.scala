package typings.swellJs.anon

import typings.swellJs.typesPaymentMod.InputPaymentElementApple
import typings.swellJs.typesPaymentMod.InputPaymentElementCard
import typings.swellJs.typesPaymentMod.InputPaymentElementGoogle
import typings.swellJs.typesPaymentMod.InputPaymentElementIdeal
import typings.swellJs.typesPaymentMod.InputPaymentElementPaypal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apple extends StObject {
  
  var apple: js.UndefOr[InputPaymentElementApple] = js.undefined
  
  var card: js.UndefOr[InputPaymentElementCard] = js.undefined
  
  var google: js.UndefOr[InputPaymentElementGoogle] = js.undefined
  
  var ideal: js.UndefOr[InputPaymentElementIdeal] = js.undefined
  
  var paypal: js.UndefOr[InputPaymentElementPaypal] = js.undefined
}
object Apple {
  
  inline def apply(): Apple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apple]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Apple] (val x: Self) extends AnyVal {
    
    inline def setApple(value: InputPaymentElementApple): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
    
    inline def setAppleUndefined: Self = StObject.set(x, "apple", js.undefined)
    
    inline def setCard(value: InputPaymentElementCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setGoogle(value: InputPaymentElementGoogle): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    
    inline def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
    
    inline def setIdeal(value: InputPaymentElementIdeal): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setPaypal(value: InputPaymentElementPaypal): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
  }
}
