package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAvailableAPIResult extends StObject {
  
  var result: String
  
  var serviceYn: String
  
  var status: String
}
object ServiceAvailableAPIResult {
  
  inline def apply(result: String, serviceYn: String, status: String): ServiceAvailableAPIResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], serviceYn = serviceYn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAvailableAPIResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceAvailableAPIResult] (val x: Self) extends AnyVal {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setServiceYn(value: String): Self = StObject.set(x, "serviceYn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
