package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBookingParams extends StObject {
  
  var pnr: String
  
  var viewOnly: Boolean
}
object GetBookingParams {
  
  inline def apply(pnr: String, viewOnly: Boolean): GetBookingParams = {
    val __obj = js.Dynamic.literal(pnr = pnr.asInstanceOf[js.Any], viewOnly = viewOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBookingParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBookingParams] (val x: Self) extends AnyVal {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
    
    inline def setViewOnly(value: Boolean): Self = StObject.set(x, "viewOnly", value.asInstanceOf[js.Any])
  }
}
