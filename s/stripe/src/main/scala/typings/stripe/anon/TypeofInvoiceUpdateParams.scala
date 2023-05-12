package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInvoiceUpdateParams extends StObject {
  
  val PaymentSettings: TypeofPaymentSettings
  
  val RenderingOptions: Any
  
  val ShippingCost: TypeofShippingCostShippingRateData
}
object TypeofInvoiceUpdateParams {
  
  inline def apply(
    PaymentSettings: TypeofPaymentSettings,
    RenderingOptions: Any,
    ShippingCost: TypeofShippingCostShippingRateData
  ): TypeofInvoiceUpdateParams = {
    val __obj = js.Dynamic.literal(PaymentSettings = PaymentSettings.asInstanceOf[js.Any], RenderingOptions = RenderingOptions.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInvoiceUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInvoiceUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setPaymentSettings(value: TypeofPaymentSettings): Self = StObject.set(x, "PaymentSettings", value.asInstanceOf[js.Any])
    
    inline def setRenderingOptions(value: Any): Self = StObject.set(x, "RenderingOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: TypeofShippingCostShippingRateData): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
  }
}
