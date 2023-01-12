package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelTicketParams extends StObject {
  
  var ticketNumber: String
}
object CancelTicketParams {
  
  inline def apply(ticketNumber: String): CancelTicketParams = {
    val __obj = js.Dynamic.literal(ticketNumber = ticketNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTicketParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelTicketParams] (val x: Self) extends AnyVal {
    
    inline def setTicketNumber(value: String): Self = StObject.set(x, "ticketNumber", value.asInstanceOf[js.Any])
  }
}
