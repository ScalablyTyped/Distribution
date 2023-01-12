package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSession extends StObject {
  
  val AfterExpiration: Any
  
  val AutomaticTax: Any
  
  val Consent: Any
  
  val ConsentCollection: Any
  
  val CustomerDetails: TypeofCustomerDetails
  
  val PaymentMethodOptions: TypeofPaymentMethodOption
  
  val ShippingAddressCollection: Any
  
  val ShippingCost: Any
  
  val TotalDetails: TypeofTotalDetails
}
object TypeofSession {
  
  inline def apply(
    AfterExpiration: Any,
    AutomaticTax: Any,
    Consent: Any,
    ConsentCollection: Any,
    CustomerDetails: TypeofCustomerDetails,
    PaymentMethodOptions: TypeofPaymentMethodOption,
    ShippingAddressCollection: Any,
    ShippingCost: Any,
    TotalDetails: TypeofTotalDetails
  ): TypeofSession = {
    val __obj = js.Dynamic.literal(AfterExpiration = AfterExpiration.asInstanceOf[js.Any], AutomaticTax = AutomaticTax.asInstanceOf[js.Any], Consent = Consent.asInstanceOf[js.Any], ConsentCollection = ConsentCollection.asInstanceOf[js.Any], CustomerDetails = CustomerDetails.asInstanceOf[js.Any], PaymentMethodOptions = PaymentMethodOptions.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any], ShippingCost = ShippingCost.asInstanceOf[js.Any], TotalDetails = TotalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSession] (val x: Self) extends AnyVal {
    
    inline def setAfterExpiration(value: Any): Self = StObject.set(x, "AfterExpiration", value.asInstanceOf[js.Any])
    
    inline def setAutomaticTax(value: Any): Self = StObject.set(x, "AutomaticTax", value.asInstanceOf[js.Any])
    
    inline def setConsent(value: Any): Self = StObject.set(x, "Consent", value.asInstanceOf[js.Any])
    
    inline def setConsentCollection(value: Any): Self = StObject.set(x, "ConsentCollection", value.asInstanceOf[js.Any])
    
    inline def setCustomerDetails(value: TypeofCustomerDetails): Self = StObject.set(x, "CustomerDetails", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodOptions(value: TypeofPaymentMethodOption): Self = StObject.set(x, "PaymentMethodOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
    
    inline def setShippingCost(value: Any): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
    
    inline def setTotalDetails(value: TypeofTotalDetails): Self = StObject.set(x, "TotalDetails", value.asInstanceOf[js.Any])
  }
}
