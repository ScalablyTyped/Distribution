package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleCardSetupOptionsWithoutElementsOptions extends HandleCardPaymentOptions {
  
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[String] = js.native
}
object HandleCardSetupOptionsWithoutElementsOptions {
  
  @scala.inline
  def apply(): HandleCardSetupOptionsWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardSetupOptionsWithoutElementsOptions]
  }
  
  @scala.inline
  implicit class HandleCardSetupOptionsWithoutElementsOptionsMutableBuilder[Self <: HandleCardSetupOptionsWithoutElementsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
