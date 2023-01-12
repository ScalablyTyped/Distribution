package typings.stripeV3.stripe

import typings.stripeV3.anon.Billingdetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleCardSetupOptions extends StObject {
  
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details.
    */
  var payment_method_data: js.UndefOr[Billingdetails] = js.undefined
}
object HandleCardSetupOptions {
  
  inline def apply(): HandleCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleCardSetupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandleCardSetupOptions] (val x: Self) extends AnyVal {
    
    inline def setPayment_method_data(value: Billingdetails): Self = StObject.set(x, "payment_method_data", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_dataUndefined: Self = StObject.set(x, "payment_method_data", js.undefined)
  }
}
