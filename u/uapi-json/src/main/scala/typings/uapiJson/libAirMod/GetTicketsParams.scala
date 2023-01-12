package typings.uapiJson.libAirMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTicketsParams] (val x: Self) extends AnyVal {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
