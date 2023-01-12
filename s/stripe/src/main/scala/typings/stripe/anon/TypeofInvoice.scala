package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoice extends StObject {
  
  val AutomaticTax: Any
  
  val CustomerTaxId: Any
  
  val LastFinalizationError: Any
  
  val PaymentSettings: TypeofPaymentSettings
  
  val ThresholdReason: Any
}
object TypeofInvoice {
  
  inline def apply(
    AutomaticTax: Any,
    CustomerTaxId: Any,
    LastFinalizationError: Any,
    PaymentSettings: TypeofPaymentSettings,
    ThresholdReason: Any
  ): TypeofInvoice = {
    val __obj = js.Dynamic.literal(AutomaticTax = AutomaticTax.asInstanceOf[js.Any], CustomerTaxId = CustomerTaxId.asInstanceOf[js.Any], LastFinalizationError = LastFinalizationError.asInstanceOf[js.Any], PaymentSettings = PaymentSettings.asInstanceOf[js.Any], ThresholdReason = ThresholdReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInvoice] (val x: Self) extends AnyVal {
    
    inline def setAutomaticTax(value: Any): Self = StObject.set(x, "AutomaticTax", value.asInstanceOf[js.Any])
    
    inline def setCustomerTaxId(value: Any): Self = StObject.set(x, "CustomerTaxId", value.asInstanceOf[js.Any])
    
    inline def setLastFinalizationError(value: Any): Self = StObject.set(x, "LastFinalizationError", value.asInstanceOf[js.Any])
    
    inline def setPaymentSettings(value: TypeofPaymentSettings): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setThresholdReason(value: Any): Self = StObject.set(x, "ThresholdReason", value.asInstanceOf[js.Any])
  }
}
