package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSessionCreateParams extends StObject {
  
  val AfterExpiration: Any
  
  val ConsentCollection: Any
  
  val CustomerUpdate: Any
  
  val LineItem: TypeofLineItem
  
  val PaymentIntentData: Any
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionAcssDebit
  
  val ShippingAddressCollection: Any
  
  val ShippingOption: TypeofShippingOption
  
  val SubscriptionData: Any
}
object TypeofSessionCreateParams {
  
  inline def apply(
    AfterExpiration: Any,
    ConsentCollection: Any,
    CustomerUpdate: Any,
    LineItem: TypeofLineItem,
    PaymentIntentData: Any,
    PaymentMethodOptions: TypeofPaymentMethodOptionAcssDebit,
    ShippingAddressCollection: Any,
    ShippingOption: TypeofShippingOption,
    SubscriptionData: Any
  ): TypeofSessionCreateParams = {
    val __obj = js.Dynamic.literal(AfterExpiration = AfterExpiration.asInstanceOf[js.Any], ConsentCollection = ConsentCollection.asInstanceOf[js.Any], CustomerUpdate = CustomerUpdate.asInstanceOf[js.Any], LineItem = LineItem.asInstanceOf[js.Any], PaymentIntentData = PaymentIntentData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any], ShippingOption = ShippingOption.asInstanceOf[js.Any], SubscriptionData = SubscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSessionCreateParams]
  }
  
  extension [Self <: TypeofSessionCreateParams](x: Self) {
    
    inline def setAfterExpiration(value: Any): Self = StObject.set(x, "AfterExpiration", value.asInstanceOf[js.Any])
    
    inline def setConsentCollection(value: Any): Self = StObject.set(x, "ConsentCollection", value.asInstanceOf[js.Any])
    
    inline def setCustomerUpdate(value: Any): Self = StObject.set(x, "CustomerUpdate", value.asInstanceOf[js.Any])
    
    inline def setLineItem(value: TypeofLineItem): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
    
    inline def setPaymentIntentData(value: Any): Self = StObject.set(x, "PaymentIntentData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionAcssDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
    
    inline def setShippingOption(value: TypeofShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionData(value: Any): Self = StObject.set(x, "SubscriptionData", value.asInstanceOf[js.Any])
  }
}
