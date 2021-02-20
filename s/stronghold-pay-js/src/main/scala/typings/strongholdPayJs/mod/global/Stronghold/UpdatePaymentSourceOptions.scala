package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePaymentSourceOptions extends Options {
  
  var onSuccess: js.UndefOr[UpdatePaymentSourceOnSuccess] = js.native
  
  var paymentSourceId: String = js.native
}
object UpdatePaymentSourceOptions {
  
  @scala.inline
  def apply(paymentSourceId: String): UpdatePaymentSourceOptions = {
    val __obj = js.Dynamic.literal(paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePaymentSourceOptions]
  }
  
  @scala.inline
  implicit class UpdatePaymentSourceOptionsMutableBuilder[Self <: UpdatePaymentSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSuccess(value: /* paymentSource */ PaymentSource => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    @scala.inline
    def setPaymentSourceId(value: String): Self = StObject.set(x, "paymentSourceId", value.asInstanceOf[js.Any])
  }
}
