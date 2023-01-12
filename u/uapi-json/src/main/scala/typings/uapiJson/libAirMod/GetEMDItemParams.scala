package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEMDItemParams extends StObject {
  
  var emdNumber: String
  
  var pnr: String
}
object GetEMDItemParams {
  
  inline def apply(emdNumber: String, pnr: String): GetEMDItemParams = {
    val __obj = js.Dynamic.literal(emdNumber = emdNumber.asInstanceOf[js.Any], pnr = pnr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEMDItemParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEMDItemParams] (val x: Self) extends AnyVal {
    
    inline def setEmdNumber(value: String): Self = StObject.set(x, "emdNumber", value.asInstanceOf[js.Any])
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
