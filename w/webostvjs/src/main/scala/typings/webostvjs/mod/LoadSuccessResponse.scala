package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadSuccessResponse extends StObject {
  
  /**
    * If the DRM agent loaded the DRM client successfully, return its client ID.
    */
  var clientId: String
}
object LoadSuccessResponse {
  
  inline def apply(clientId: String): LoadSuccessResponse = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSuccessResponse]
  }
  
  extension [Self <: LoadSuccessResponse](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
  }
}
