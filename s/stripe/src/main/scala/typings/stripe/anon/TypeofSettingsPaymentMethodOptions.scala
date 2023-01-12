package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSettingsPaymentMethodOptions extends StObject {
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionAfterpayClearpay
}
object TypeofSettingsPaymentMethodOptions {
  
  inline def apply(PaymentMethodOptions: TypeofPaymentMethodOptionAfterpayClearpay): TypeofSettingsPaymentMethodOptions = {
    val __obj = js.Dynamic.literal(PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSettingsPaymentMethodOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSettingsPaymentMethodOptions] (val x: Self) extends AnyVal {
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionAfterpayClearpay): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
  }
}
