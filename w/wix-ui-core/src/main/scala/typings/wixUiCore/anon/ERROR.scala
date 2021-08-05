package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ERROR extends StObject {
  
  var ERROR: String
  
  var OK: String
  
  var ZERO_RESULTS: String
}
object ERROR {
  
  inline def apply(ERROR: String, OK: String, ZERO_RESULTS: String): ERROR = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], OK = OK.asInstanceOf[js.Any], ZERO_RESULTS = ZERO_RESULTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
  
  extension [Self <: ERROR](x: Self) {
    
    inline def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    inline def setZERO_RESULTS(value: String): Self = StObject.set(x, "ZERO_RESULTS", value.asInstanceOf[js.Any])
  }
}
