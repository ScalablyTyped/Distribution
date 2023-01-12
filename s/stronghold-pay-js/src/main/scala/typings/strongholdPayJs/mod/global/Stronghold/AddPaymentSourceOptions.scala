package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPaymentSourceOptions
  extends StObject
     with Options {
  
  def onSuccess(paymentSource: PaymentSource): Unit
  @JSName("onSuccess")
  var onSuccess_Original: AddPaymentSourceOnSuccess
}
object AddPaymentSourceOptions {
  
  inline def apply(onSuccess: /* paymentSource */ PaymentSource => Unit): AddPaymentSourceOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[AddPaymentSourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddPaymentSourceOptions] (val x: Self) extends AnyVal {
    
    inline def setOnSuccess(value: /* paymentSource */ PaymentSource => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
  }
}
