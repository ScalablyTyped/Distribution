package typings.stripe.anon

import typings.stripe.mod.issuing.cardholders.ICardholderBillingAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressName extends StObject {
  
  var address: ICardholderBillingAddress
  
  var name: String
}
object AddressName {
  
  @scala.inline
  def apply(address: ICardholderBillingAddress, name: String): AddressName = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressName]
  }
  
  @scala.inline
  implicit class AddressNameMutableBuilder[Self <: AddressName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: ICardholderBillingAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
