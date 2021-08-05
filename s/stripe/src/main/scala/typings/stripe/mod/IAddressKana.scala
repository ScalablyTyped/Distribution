package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddressKana extends StObject {
  
  /**
    * City or ward.
    * This can be unset by updating the value to null and then saving.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * Two-letter country code (ISO 3166-1 alpha-2).
    * This can be unset by updating the value to null and then saving.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * Block or building number.
    * This can be unset by updating the value to null and then saving.
    */
  var line1: js.UndefOr[String] = js.undefined
  
  /**
    * Building details.
    * This can be unset by updating the value to null and then saving.
    */
  var line2: js.UndefOr[String] = js.undefined
  
  /**
    * Postal code.
    * This can be unset by updating the value to null and then saving.
    */
  var postal_code: js.UndefOr[String] = js.undefined
  
  /**
    * Prefecture.
    * This can be unset by updating the value to null and then saving.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Town or cho-me.
    * This can be unset by updating the value to null and then saving.
    */
  var town: js.UndefOr[String] = js.undefined
}
object IAddressKana {
  
  inline def apply(): IAddressKana = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddressKana]
  }
  
  extension [Self <: IAddressKana](x: Self) {
    
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
    
    inline def setTown(value: String): Self = StObject.set(x, "town", value.asInstanceOf[js.Any])
    
    inline def setTownUndefined: Self = StObject.set(x, "town", js.undefined)
  }
}
