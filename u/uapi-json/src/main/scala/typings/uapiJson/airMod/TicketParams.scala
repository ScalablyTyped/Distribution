package typings.uapiJson.airMod

import typings.uapiJson.anon.Type
import typings.uapiJson.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TicketParams extends StObject {
  
  var commission: Type
  
  var fop: `0`
  
  var pnr: String
}
object TicketParams {
  
  inline def apply(commission: Type, fop: `0`, pnr: String): TicketParams = {
    val __obj = js.Dynamic.literal(commission = commission.asInstanceOf[js.Any], fop = fop.asInstanceOf[js.Any], pnr = pnr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TicketParams]
  }
  
  extension [Self <: TicketParams](x: Self) {
    
    inline def setCommission(value: Type): Self = StObject.set(x, "commission", value.asInstanceOf[js.Any])
    
    inline def setFop(value: `0`): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
