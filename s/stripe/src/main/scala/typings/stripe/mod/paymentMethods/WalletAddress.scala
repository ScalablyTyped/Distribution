package typings.stripe.mod.paymentMethods

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalletAddress extends StObject {
  
  /** City/District/Suburb/Town/Village. */
  var city: String = js.native
  
  /** 2-letter country code. */
  var country: String = js.native
  
  /** Address line 1 (Street address/PO Box/Company name). */
  var line1: String = js.native
  
  /** Address line 2 (Apartment/Suite/Unit/Building). */
  var line2: String = js.native
  
  /** ZIP or postal code. */
  var postal_code: String = js.native
  
  /** State/County/Province/Region. */
  var state: String = js.native
}
object WalletAddress {
  
  @scala.inline
  def apply(city: String, country: String, line1: String, line2: String, postal_code: String, state: String): WalletAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], postal_code = postal_code.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletAddress]
  }
  
  @scala.inline
  implicit class WalletAddressMutableBuilder[Self <: WalletAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
