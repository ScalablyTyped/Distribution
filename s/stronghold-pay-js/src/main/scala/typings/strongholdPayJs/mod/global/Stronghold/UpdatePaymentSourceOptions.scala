package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePaymentSourceOptions
  extends StObject
     with Options {
  
  var onSuccess: js.UndefOr[UpdatePaymentSourceOnSuccess] = js.undefined
  
  var paymentSourceId: String
}
object UpdatePaymentSourceOptions {
  
  inline def apply(paymentSourceId: String): UpdatePaymentSourceOptions = {
    val __obj = js.Dynamic.literal(paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePaymentSourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePaymentSourceOptions] (val x: Self) extends AnyVal {
    
    inline def setOnSuccess(value: /* paymentSource */ PaymentSource => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setPaymentSourceId(value: String): Self = StObject.set(x, "paymentSourceId", value.asInstanceOf[js.Any])
  }
}
