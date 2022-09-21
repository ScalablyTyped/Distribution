package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceCreateParams extends StObject {
  
  val PaymentSettings: TypeofPaymentSettingsPaymentMethodOptions
  
  val RenderingOptions: Any
}
object TypeofInvoiceCreateParams {
  
  inline def apply(PaymentSettings: TypeofPaymentSettingsPaymentMethodOptions, RenderingOptions: Any): TypeofInvoiceCreateParams = {
    val __obj = js.Dynamic.literal(PaymentSettings = PaymentSettings.asInstanceOf[js.Any], RenderingOptions = RenderingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceCreateParams]
  }
  
  extension [Self <: TypeofInvoiceCreateParams](x: Self) {
    
    inline def setPaymentSettings(value: TypeofPaymentSettingsPaymentMethodOptions): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setRenderingOptions(value: Any): Self = StObject.set(x, "RenderingOptions", value.asInstanceOf[js.Any])
  }
}
