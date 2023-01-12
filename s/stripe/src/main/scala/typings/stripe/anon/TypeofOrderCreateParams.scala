package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOrderCreateParams extends StObject {
  
  val LineItem: TypeofLineItemPriceData
  
  val Payment: TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay
  
  val ShippingCost: TypeofShippingCost
  
  val TaxDetails: TypeofTaxDetails
}
object TypeofOrderCreateParams {
  
  inline def apply(
    LineItem: TypeofLineItemPriceData,
    Payment: TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay,
    ShippingCost: TypeofShippingCost,
    TaxDetails: TypeofTaxDetails
  ): TypeofOrderCreateParams = {
    val __obj = js.Dynamic.literal(LineItem = LineItem.asInstanceOf[js.Any], Payment = Payment.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any], TaxDetails = TaxDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOrderCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofOrderCreateParams] (val x: Self) extends AnyVal {
    
    inline def setLineItem(value: TypeofLineItemPriceData): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
    
    inline def setPayment(value: TypeofPaymentSettingsTypeofSettingsPaymentMethodOptionsTypeofPaymentMethodOptionAlipay): Self = StObject.set(x, "Payment", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: TypeofShippingCost): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
    
    inline def setTaxDetails(value: TypeofTaxDetails): Self = StObject.set(x, "TaxDetails", value.asInstanceOf[js.Any])
  }
}
