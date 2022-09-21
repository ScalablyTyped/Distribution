package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLoadedSuccessResponse extends StObject {
  
  /**
    * Returns the loaded client ID when the DRM client is loaded successfully.
    */
  var clientId: String
  
  /**
    * Returns the client type of DRM when the DRM client is loaded successfully.
    */
  var drmType: DrmType
  
  /**
    * Indicates the DRM client is loaded.
    * - true: the DRM client is loaded.
    * - false: the DRM client is not loaded.
    */
  var loadStatus: Boolean
}
object IsLoadedSuccessResponse {
  
  inline def apply(clientId: String, drmType: DrmType, loadStatus: Boolean): IsLoadedSuccessResponse = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], drmType = drmType.asInstanceOf[js.Any], loadStatus = loadStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLoadedSuccessResponse]
  }
  
  extension [Self <: IsLoadedSuccessResponse](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setDrmType(value: DrmType): Self = StObject.set(x, "drmType", value.asInstanceOf[js.Any])
    
    inline def setLoadStatus(value: Boolean): Self = StObject.set(x, "loadStatus", value.asInstanceOf[js.Any])
  }
}
