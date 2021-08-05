package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplePay extends StObject {
  
  var applePay: js.UndefOr[Boolean] = js.undefined
}
object ApplePay {
  
  inline def apply(): ApplePay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePay]
  }
  
  extension [Self <: ApplePay](x: Self) {
    
    inline def setApplePay(value: Boolean): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    
    inline def setApplePayUndefined: Self = StObject.set(x, "applePay", js.undefined)
  }
}
