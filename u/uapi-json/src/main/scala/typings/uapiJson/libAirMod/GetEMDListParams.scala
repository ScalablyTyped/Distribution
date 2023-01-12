package typings.uapiJson.libAirMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEMDListParams] (val x: Self) extends AnyVal {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
  }
}
