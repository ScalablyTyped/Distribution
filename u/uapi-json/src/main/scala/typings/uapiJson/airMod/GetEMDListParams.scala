package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEMDListParams extends StObject {
  
  var pnr: String
}
object GetEMDListParams {
  
  inline def apply(pnr: String): GetEMDListParams = {
    val __obj = js.Dynamic.literal(pnr = pnr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEMDListParams]
  }
  
  extension [Self <: GetEMDListParams](x: Self) {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
