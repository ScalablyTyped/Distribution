package typings.stripe.anon

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressICardholderBillingAddress extends StObject {
  
  var address: ICardholderBillingAddress
}
object AddressICardholderBillingAddress {
  
  inline def apply(address: ICardholderBillingAddress): AddressICardholderBillingAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressICardholderBillingAddress]
  }
  
  extension [Self <: AddressICardholderBillingAddress](x: Self) {
    
    inline def setAddress(value: ICardholderBillingAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
