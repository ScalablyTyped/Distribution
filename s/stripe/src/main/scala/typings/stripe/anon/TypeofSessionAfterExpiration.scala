package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSessionAfterExpiration extends StObject {
  
  val AfterExpiration: Any
  
  val AutomaticTax: Any
  
  val Consent: Any
  
  val ConsentCollection: Any
  
  val CustomField: TypeofCustomField
  
  val CustomText: Any
  
  val CustomerDetails: TypeofCustomerDetails
  
  val InvoiceCreation: TypeofInvoiceCreationInvoiceData
  
  val PaymentMethodOptions: TypeofPaymentMethodOptionAcssDebit
  
  val ShippingAddressCollection: Any
  
  val ShippingCost: TypeofShippingCost
  
  val TotalDetails: TypeofTotalDetails
}
object TypeofSessionAfterExpiration {
  
  inline def apply(
    AfterExpiration: Any,
    AutomaticTax: Any,
    Consent: Any,
    ConsentCollection: Any,
    CustomField: TypeofCustomField,
    CustomText: Any,
    CustomerDetails: TypeofCustomerDetails,
    InvoiceCreation: TypeofInvoiceCreationInvoiceData,
    PaymentMethodOptions: TypeofPaymentMethodOptionAcssDebit,
    ShippingAddressCollection: Any,
    ShippingCost: TypeofShippingCost,
    TotalDetails: TypeofTotalDetails
  ): TypeofSessionAfterExpiration = {
    val __obj = js.Dynamic.literal(AfterExpiration = AfterExpiration.asInstanceOf[js.Any], AutomaticTax = AutomaticTax.asInstanceOf[js.Any], Consent = Consent.asInstanceOf[js.Any], ConsentCollection = ConsentCollection.asInstanceOf[js.Any], CustomField = CustomField.asInstanceOf[js.Any], CustomText = CustomText.asInstanceOf[js.Any], CustomerDetails = CustomerDetails.asInstanceOf[js.Any], InvoiceCreation = InvoiceCreation.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any], TotalDetails = TotalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSessionAfterExpiration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSessionAfterExpiration] (val x: Self) extends AnyVal {
    
    inline def setAfterExpiration(value: Any): Self = StObject.set(x, "AfterExpiration", value.asInstanceOf[js.Any])
    
    inline def setAutomaticTax(value: Any): Self = StObject.set(x, "AutomaticTax", value.asInstanceOf[js.Any])
    
    inline def setConsent(value: Any): Self = StObject.set(x, "Consent", value.asInstanceOf[js.Any])
    
    inline def setConsentCollection(value: Any): Self = StObject.set(x, "ConsentCollection", value.asInstanceOf[js.Any])
    
    inline def setCustomField(value: TypeofCustomField): Self = StObject.set(x, "CustomField", value.asInstanceOf[js.Any])
    
    inline def setCustomText(value: Any): Self = StObject.set(x, "CustomText", value.asInstanceOf[js.Any])
    
    inline def setCustomerDetails(value: TypeofCustomerDetails): Self = StObject.set(x, "CustomerDetails", value.asInstanceOf[js.Any])
    
    inline def setInvoiceCreation(value: TypeofInvoiceCreationInvoiceData): Self = StObject.set(x, "InvoiceCreation", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOptionAcssDebit): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: TypeofShippingCost): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
