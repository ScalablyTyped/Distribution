package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentLinkUpdatePa extends StObject {
  
  val AfterCompletion: Any
  
  val LineItem: Any
  
  val ShippingAddressCollection: Any
}
object TypeofPaymentLinkUpdatePa {
  
  inline def apply(AfterCompletion: Any, LineItem: Any, ShippingAddressCollection: Any): TypeofPaymentLinkUpdatePa = {
    val __obj = js.Dynamic.literal(AfterCompletion = AfterCompletion.asInstanceOf[js.Any], LineItem = LineItem.asInstanceOf[js.Any], ShippingAddressCollection = ShippingAddressCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentLinkUpdatePa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentLinkUpdatePa] (val x: Self) extends AnyVal {
    
    inline def setAfterCompletion(value: Any): Self = StObject.set(x, "AfterCompletion", value.asInstanceOf[js.Any])
    
    inline def setLineItem(value: Any): Self = StObject.set(x, "LineItem", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressCollection(value: Any): Self = StObject.set(x, "ShippingAddressCollection", value.asInstanceOf[js.Any])
  }
}
