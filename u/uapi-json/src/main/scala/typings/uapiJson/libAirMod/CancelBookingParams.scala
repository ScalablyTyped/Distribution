package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBookingParams extends StObject {
  
  var cancelTickets: Boolean
  
  var ignoreTickets: js.UndefOr[Boolean] = js.undefined
  
  var pnr: String
}
object CancelBookingParams {
  
  inline def apply(cancelTickets: Boolean, pnr: String): CancelBookingParams = {
    val __obj = js.Dynamic.literal(cancelTickets = cancelTickets.asInstanceOf[js.Any], pnr = pnr.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBookingParams]
  }
  
  extension [Self <: CancelBookingParams](x: Self) {
    
    inline def setCancelTickets(value: Boolean): Self = StObject.set(x, "cancelTickets", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTickets(value: Boolean): Self = StObject.set(x, "ignoreTickets", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTicketsUndefined: Self = StObject.set(x, "ignoreTickets", js.undefined)
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
