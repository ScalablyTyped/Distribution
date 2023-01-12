package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  var airline: String
  
  var arrival: String
  
  var bookingClass: String
  
  var departure: String
  
  var fareBasisCode: String
  
  var flightNumber: String
  
  var from: String
  
  var group: Double
  
  var plane: String
  
  var serviceClass: String
  
  var to: String
}
object Segment {
  
  inline def apply(
    airline: String,
    arrival: String,
    bookingClass: String,
    departure: String,
    fareBasisCode: String,
    flightNumber: String,
    from: String,
    group: Double,
    plane: String,
    serviceClass: String,
    to: String
  ): Segment = {
    val __obj = js.Dynamic.literal(airline = airline.asInstanceOf[js.Any], arrival = arrival.asInstanceOf[js.Any], bookingClass = bookingClass.asInstanceOf[js.Any], departure = departure.asInstanceOf[js.Any], fareBasisCode = fareBasisCode.asInstanceOf[js.Any], flightNumber = flightNumber.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], serviceClass = serviceClass.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    inline def setAirline(value: String): Self = StObject.set(x, "airline", value.asInstanceOf[js.Any])
    
    inline def setArrival(value: String): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    inline def setBookingClass(value: String): Self = StObject.set(x, "bookingClass", value.asInstanceOf[js.Any])
    
    inline def setDeparture(value: String): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    inline def setFareBasisCode(value: String): Self = StObject.set(x, "fareBasisCode", value.asInstanceOf[js.Any])
    
    inline def setFlightNumber(value: String): Self = StObject.set(x, "flightNumber", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setPlane(value: String): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
    
    inline def setServiceClass(value: String): Self = StObject.set(x, "serviceClass", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
