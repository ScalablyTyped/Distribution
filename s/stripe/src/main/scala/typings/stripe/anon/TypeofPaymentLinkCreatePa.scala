package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentLinkCreatePa extends StObject {
  
  val AfterCompletion: Any
  
  val ConsentCollection: Any
  
  val LineItem: Any
  
  val PaymentIntentData: Any
  
  val ShippingAddressCollection: Any
}
object TypeofPaymentLinkCreatePa {
  
  inline def apply(
    AfterCompletion: Any,
    ConsentCollection: Any,
    LineItem: Any,
    PaymentIntentData: Any,
    ShippingAddressCollection: Any
  ): TypeofPaymentLinkCreatePa = {
    val __obj = js.Dynamic.literal(AfterCompletion = AfterCompletion.asInstanceOf[js.Any], ConsentCollection = ConsentCollection.asInstanceOf[js.Any], LineItem = LineItem.asInstanceOf[js.Any], PaymentIntentData = PaymentIntentData.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentLinkCreatePa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentLinkCreatePa] (val x: Self) extends AnyVal {
    
    inline def setAfterCompletion(value: Any): Self = StObject.set(x, "AfterCompletion", value.asInstanceOf[js.Any])
    
    inline def setConsentCollection(value: Any): Self = StObject.set(x, "ConsentCollection", value.asInstanceOf[js.Any])
    
    inline def setLineItem(value: Any): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
    
    inline def setPaymentIntentData(value: Any): Self = StObject.set(x, "PaymentIntentData", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
  }
}
