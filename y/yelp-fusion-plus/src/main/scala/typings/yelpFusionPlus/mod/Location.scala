package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var address1: String
  
  var address2: String
  
  var address3: String
  
  var city: String
  
  var country: String
  
  var cross_streets: String
  
  var display_address: js.Array[String]
  
  var state: String
  
  var zip_code: String
}
object Location {
  
  inline def apply(
    address1: String,
    address2: String,
    address3: String,
    city: String,
    country: String,
    cross_streets: String,
    display_address: js.Array[String],
    state: String,
    zip_code: String
  ): Location = {
    val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], address3 = address3.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cross_streets = cross_streets.asInstanceOf[js.Any], display_address = display_address.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip_code = zip_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    inline def setAddress3(value: String): Self = StObject.set(x, "address3", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCross_streets(value: String): Self = StObject.set(x, "cross_streets", value.asInstanceOf[js.Any])
    
    inline def setDisplay_address(value: js.Array[String]): Self = StObject.set(x, "display_address", value.asInstanceOf[js.Any])
    
    inline def setDisplay_addressVarargs(value: String*): Self = StObject.set(x, "display_address", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setZip_code(value: String): Self = StObject.set(x, "zip_code", value.asInstanceOf[js.Any])
  }
}
