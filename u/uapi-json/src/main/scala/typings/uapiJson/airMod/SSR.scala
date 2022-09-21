package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSR extends StObject {
  
  var carrier: js.UndefOr[String] = js.undefined
  
  var freeText: String
  
  var status: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object SSR {
  
  inline def apply(freeText: String, `type`: String): SSR = {
    val __obj = js.Dynamic.literal(freeText = freeText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSR]
  }
  
  extension [Self <: SSR](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setFreeText(value: String): Self = StObject.set(x, "freeText", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
