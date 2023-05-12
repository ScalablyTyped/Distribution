package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSessionCreateParamsAfterExpiration extends StObject {
  
  val AfterExpiration: Any
  
  val ConsentCollection: Any
  
  val CustomField: TypeofCustomField
  
  val CustomText: Any
  
  val CustomerUpdate: Any
  
  val InvoiceCreation: TypeofInvoiceCreation
  
  val LineItem: TypeofLineItem
  
  val PaymentIntentData: Any
  
  val PaymentMethodOptions: TypeofPaymentMethodOption
  
  val ShippingAddressCollection: Any
  
  val ShippingOption: TypeofShippingOption
  
  val SubscriptionData: TypeofSubscriptionData
}
object TypeofSessionCreateParamsAfterExpiration {
  
  inline def apply(
    AfterExpiration: Any,
    ConsentCollection: Any,
    CustomField: TypeofCustomField,
    CustomText: Any,
    CustomerUpdate: Any,
    InvoiceCreation: TypeofInvoiceCreation,
    LineItem: TypeofLineItem,
    PaymentIntentData: Any,
    PaymentMethodOptions: TypeofPaymentMethodOption,
    ShippingAddressCollection: Any,
    ShippingOption: TypeofShippingOption,
    SubscriptionData: TypeofSubscriptionData
  ): TypeofSessionCreateParamsAfterExpiration = {
    val __obj = js.Dynamic.literal(AfterExpiration = AfterExpiration.asInstanceOf[js.Any], ConsentCollection = ConsentCollection.asInstanceOf[js.Any], CustomField = CustomField.asInstanceOf[js.Any], CustomText = CustomText.asInstanceOf[js.Any], CustomerUpdate = CustomerUpdate.asInstanceOf[js.Any], InvoiceCreation = InvoiceCreation.asInstanceOf[js.Any], LineItem = LineItem.asInstanceOf[js.Any], PaymentIntentData = PaymentIntentData.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any], ShippingOption = ShippingOption.asInstanceOf[js.Any], SubscriptionData = SubscriptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSessionCreateParamsAfterExpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSessionCreateParamsAfterExpiration] (val x: Self) extends AnyVal {
    
    inline def setAfterExpiration(value: Any): Self = StObject.set(x, "AfterExpiration", value.asInstanceOf[js.Any])
    
    inline def setConsentCollection(value: Any): Self = StObject.set(x, "ConsentCollection", value.asInstanceOf[js.Any])
    
    inline def setCustomField(value: TypeofCustomField): Self = StObject.set(x, "CustomField", value.asInstanceOf[js.Any])
    
    inline def setCustomText(value: Any): Self = StObject.set(x, "CustomText", value.asInstanceOf[js.Any])
    
    inline def setCustomerUpdate(value: Any): Self = StObject.set(x, "CustomerUpdate", value.asInstanceOf[js.Any])
    
    inline def setInvoiceCreation(value: TypeofInvoiceCreation): Self = StObject.set(x, "InvoiceCreation", value.asInstanceOf[js.Any])
    
    inline def setLineItem(value: TypeofLineItem): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
    
    inline def setPaymentIntentData(value: Any): Self = StObject.set(x, "PaymentIntentData", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOption): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
    
    inline def setShippingOption(value: TypeofShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionData(value: TypeofSubscriptionData): Self = StObject.set(x, "SubscriptionData", value.asInstanceOf[js.Any])
  }
}
