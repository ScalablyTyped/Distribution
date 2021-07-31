package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddress extends StObject {
  
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: String
  
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State/Province/County
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object IAddress {
  
  @scala.inline
  def apply(line1: String): IAddress = {
    val __obj = js.Dynamic.literal(line1 = line1.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddress]
  }
  
  @scala.inline
  implicit class IAddressMutableBuilder[Self <: IAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityNull: Self = StObject.set(x, "city", null)
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNull: Self = StObject.set(x, "country", null)
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2Null: Self = StObject.set(x, "line2", null)
    
    @scala.inline
    def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    @scala.inline
    def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostal_codeNull: Self = StObject.set(x, "postal_code", null)
    
    @scala.inline
    def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
