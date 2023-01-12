package typings.tpdirect

import typings.tpdirect.anon.PaymentRequestAmountidstr
import typings.tpdirect.anon.RequestPayerEmail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestData extends StObject {
  
  var displayItems: js.Array[PaymentRequestAmount]
  
  var options: js.UndefOr[RequestPayerEmail] = js.undefined
  
  var shippingOptions: js.UndefOr[js.Array[PaymentRequestAmountidstr]] = js.undefined
  
  var supportedMethods: js.Array[String]
  
  var supportedNetworks: js.Array[AllowedNetworks]
  
  var total: PaymentRequestAmount & DeferredPaymentRequest
}
object PaymentRequestData {
  
  inline def apply(
    displayItems: js.Array[PaymentRequestAmount],
    supportedMethods: js.Array[String],
    supportedNetworks: js.Array[AllowedNetworks],
    total: PaymentRequestAmount & DeferredPaymentRequest
  ): PaymentRequestData = {
    val __obj = js.Dynamic.literal(displayItems = displayItems.asInstanceOf[js.Any], supportedMethods = supportedMethods.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentRequestData] (val x: Self) extends AnyVal {
    
    inline def setDisplayItems(value: js.Array[PaymentRequestAmount]): Self = StObject.set(x, "displayItems", value.asInstanceOf[js.Any])
    
    inline def setDisplayItemsVarargs(value: PaymentRequestAmount*): Self = StObject.set(x, "displayItems", js.Array(value*))
    
    inline def setOptions(value: RequestPayerEmail): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setShippingOptions(value: js.Array[PaymentRequestAmountidstr]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
    
    inline def setShippingOptionsVarargs(value: PaymentRequestAmountidstr*): Self = StObject.set(x, "shippingOptions", js.Array(value*))
    
    inline def setSupportedMethods(value: js.Array[String]): Self = StObject.set(x, "supportedMethods", value.asInstanceOf[js.Any])
    
    inline def setSupportedMethodsVarargs(value: String*): Self = StObject.set(x, "supportedMethods", js.Array(value*))
    
    inline def setSupportedNetworks(value: js.Array[AllowedNetworks]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworksVarargs(value: AllowedNetworks*): Self = StObject.set(x, "supportedNetworks", js.Array(value*))
    
    inline def setTotal(value: PaymentRequestAmount & DeferredPaymentRequest): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
