package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddressKanji extends StObject {
  
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
object IAddressKanji {
  
  @scala.inline
  def apply(): IAddressKanji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddressKanji]
  }
  
  @scala.inline
  implicit class IAddressKanjiMutableBuilder[Self <: IAddressKanji] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTown(value: String): Self = StObject.set(x, "town", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTownUndefined: Self = StObject.set(x, "town", js.undefined)
  }
}
