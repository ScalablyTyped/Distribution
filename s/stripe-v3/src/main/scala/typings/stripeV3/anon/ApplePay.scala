package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePay extends StObject {
  
  var applePay: js.UndefOr[Boolean] = js.undefined
  
  var googlePay: js.UndefOr[Boolean] = js.undefined
}
object ApplePay {
  
  inline def apply(): ApplePay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePay] (val x: Self) extends AnyVal {
    
    inline def setApplePay(value: Boolean): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    
    inline def setApplePayUndefined: Self = StObject.set(x, "applePay", js.undefined)
    
    inline def setGooglePay(value: Boolean): Self = StObject.set(x, "googlePay", value.asInstanceOf[js.Any])
    
    inline def setGooglePayUndefined: Self = StObject.set(x, "googlePay", js.undefined)
  }
}
