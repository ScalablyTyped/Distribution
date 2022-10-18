package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pricing extends StObject {
  
  var currency: String
  
  var eTicketability: Boolean
}
object Pricing {
  
  inline def apply(currency: String, eTicketability: Boolean): Pricing = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], eTicketability = eTicketability.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pricing]
  }
  
  extension [Self <: Pricing](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setETicketability(value: Boolean): Self = StObject.set(x, "eTicketability", value.asInstanceOf[js.Any])
  }
}
