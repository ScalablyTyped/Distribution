package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  /**
    * City/Suburb/Town/Village
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * 2-letter country code
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Address line 1 (Street address/PO Box/Company name)
    */
  var line1: js.UndefOr[String] = js.undefined
  
  /**
    * Address line 2 (Apartment/Suite/Unit/Building)
    */
  var line2: js.UndefOr[String] = js.undefined
  
  /**
    * Zip/Postal Code
    */
  var postal_code: js.UndefOr[String] = js.undefined
  
  /**
    * State/Province/County
    */
  var state: js.UndefOr[String] = js.undefined
}
object City {
  
  inline def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  
  extension [Self <: City](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setLine1(value: String): Self = StObject.set(x, "line1", value.asInstanceOf[js.Any])
    
    inline def setLine1Undefined: Self = StObject.set(x, "line1", js.undefined)
    
    inline def setLine2(value: String): Self = StObject.set(x, "line2", value.asInstanceOf[js.Any])
    
    inline def setLine2Undefined: Self = StObject.set(x, "line2", js.undefined)
    
    inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
    
    inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
