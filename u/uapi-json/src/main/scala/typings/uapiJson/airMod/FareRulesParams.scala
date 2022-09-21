package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FareRulesParams extends StObject {
  
  var long: Boolean
  
  var passengers: BookPassengers
  
  var requestId: String
  
  var segments: js.Array[Segment]
}
object FareRulesParams {
  
  inline def apply(long: Boolean, passengers: BookPassengers, requestId: String, segments: js.Array[Segment]): FareRulesParams = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], passengers = passengers.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[FareRulesParams]
  }
  
  extension [Self <: FareRulesParams](x: Self) {
    
    inline def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setPassengers(value: BookPassengers): Self = StObject.set(x, "passengers", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
