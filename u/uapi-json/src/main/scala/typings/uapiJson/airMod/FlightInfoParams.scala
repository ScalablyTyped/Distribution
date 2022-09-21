package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlightInfoParams extends StObject {
  
  var airline: String
  
  var departure: String
  
  var flightNumber: String
}
object FlightInfoParams {
  
  inline def apply(airline: String, departure: String, flightNumber: String): FlightInfoParams = {
    val __obj = js.Dynamic.literal(airline = airline.asInstanceOf[js.Any], departure = departure.asInstanceOf[js.Any], flightNumber = flightNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlightInfoParams]
  }
  
  extension [Self <: FlightInfoParams](x: Self) {
    
    inline def setAirline(value: String): Self = StObject.set(x, "airline", value.asInstanceOf[js.Any])
    
    inline def setDeparture(value: String): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    inline def setFlightNumber(value: String): Self = StObject.set(x, "flightNumber", value.asInstanceOf[js.Any])
  }
}
