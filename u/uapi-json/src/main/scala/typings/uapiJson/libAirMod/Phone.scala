package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var countryCode: String
  
  var location: String
  
  var number: String
}
object Phone {
  
  inline def apply(countryCode: String, location: String, number: String): Phone = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  
  extension [Self <: Phone](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
