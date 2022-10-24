package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approximate extends StObject {
  
  var approximate: Boolean
  
  var city: Any
  
  var country: Any
  
  var countryCode: Any
  
  var formatted: Any
  
  var formattedStreetAddress: js.UndefOr[String | Null] = js.undefined
  
  var latLng: Lng
  
  var number: Any
  
  var postalCode: Any
  
  var state: Any
  
  var street: Any
  
  var subpremise: Any
}
object Approximate {
  
  inline def apply(
    approximate: Boolean,
    city: Any,
    country: Any,
    countryCode: Any,
    formatted: Any,
    latLng: Lng,
    number: Any,
    postalCode: Any,
    state: Any,
    street: Any,
    subpremise: Any
  ): Approximate = {
    val __obj = js.Dynamic.literal(approximate = approximate.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], latLng = latLng.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], subpremise = subpremise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approximate]
  }
  
  extension [Self <: Approximate](x: Self) {
    
    inline def setApproximate(value: Boolean): Self = StObject.set(x, "approximate", value.asInstanceOf[js.Any])
    
    inline def setCity(value: Any): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: Any): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: Any): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setFormatted(value: Any): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedStreetAddress(value: String): Self = StObject.set(x, "formattedStreetAddress", value.asInstanceOf[js.Any])
    
    inline def setFormattedStreetAddressNull: Self = StObject.set(x, "formattedStreetAddress", null)
    
    inline def setFormattedStreetAddressUndefined: Self = StObject.set(x, "formattedStreetAddress", js.undefined)
    
    inline def setLatLng(value: Lng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Any): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: Any): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStreet(value: Any): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setSubpremise(value: Any): Self = StObject.set(x, "subpremise", value.asInstanceOf[js.Any])
  }
}
