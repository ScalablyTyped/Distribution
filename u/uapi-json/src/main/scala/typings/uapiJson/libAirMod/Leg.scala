package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leg extends StObject {
  
  var departureDate: String
  
  var from: String
  
  var to: String
}
object Leg {
  
  inline def apply(departureDate: String, from: String, to: String): Leg = {
    val __obj = js.Dynamic.literal(departureDate = departureDate.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Leg] (val x: Self) extends AnyVal {
    
    inline def setDepartureDate(value: String): Self = StObject.set(x, "departureDate", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
