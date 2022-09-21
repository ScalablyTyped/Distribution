package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTicketsParams extends StObject {
  
  var pnr: String
}
object GetTicketsParams {
  
  inline def apply(pnr: String): GetTicketsParams = {
    val __obj = js.Dynamic.literal(pnr = pnr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTicketsParams]
  }
  
  extension [Self <: GetTicketsParams](x: Self) {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
