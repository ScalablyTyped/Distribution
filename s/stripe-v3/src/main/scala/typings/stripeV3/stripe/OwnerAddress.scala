package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerAddress extends StObject {
  
  var city: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var line1: js.UndefOr[String] = js.undefined
  
  var line2: js.UndefOr[String] = js.undefined
  
  var postal_code: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object OwnerAddress {
  
  @scala.inline
  def apply(): OwnerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerAddress]
  }
  
  @scala.inline
  implicit class OwnerAddressMutableBuilder[Self <: OwnerAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1Undefined: Self = StObject.set(x, "line1", js.undefined)
    
    @scala.inline
    def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    @scala.inline
    def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
