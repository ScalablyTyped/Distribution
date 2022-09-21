package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceCountryAvailabilityAPIResult extends StObject {
  
  var CPResult: String
  
  var CPStatus: String
  
  var CountryAvailability: Countries
}
object GetServiceCountryAvailabilityAPIResult {
  
  inline def apply(CPResult: String, CPStatus: String, CountryAvailability: Countries): GetServiceCountryAvailabilityAPIResult = {
    val __obj = js.Dynamic.literal(CPResult = CPResult.asInstanceOf[js.Any], CPStatus = CPStatus.asInstanceOf[js.Any], CountryAvailability = CountryAvailability.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceCountryAvailabilityAPIResult]
  }
  
  extension [Self <: GetServiceCountryAvailabilityAPIResult](x: Self) {
    
    inline def setCPResult(value: String): Self = StObject.set(x, "CPResult", value.asInstanceOf[js.Any])
    
    inline def setCPStatus(value: String): Self = StObject.set(x, "CPStatus", value.asInstanceOf[js.Any])
    
    inline def setCountryAvailability(value: Countries): Self = StObject.set(x, "CountryAvailability", value.asInstanceOf[js.Any])
  }
}
