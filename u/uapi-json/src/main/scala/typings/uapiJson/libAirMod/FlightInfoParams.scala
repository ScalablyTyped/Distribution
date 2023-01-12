package typings.uapiJson.libAirMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlightInfoParams] (val x: Self) extends AnyVal {
    
    inline def setAirline(value: String): Self = StObject.set(x, "airline", value.asInstanceOf[js.Any])
    
    inline def setDeparture(value: String): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    inline def setFlightNumber(value: String): Self = StObject.set(x, "flightNumber", value.asInstanceOf[js.Any])
  }
}
