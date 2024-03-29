package typings.xummSdk

import typings.xummSdk.anon.Name
import typings.xummSdk.distSrcTypesStorageStorageResponseMod.StorageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesStorageStorageDeleteResponseMod {
  
  trait StorageDeleteResponse
    extends StObject
       with StorageResponse {
    
    var data: Null
    
    var stored: Boolean
  }
  object StorageDeleteResponse {
    
    inline def apply(application: Name, data: Null, stored: Boolean): StorageDeleteResponse = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageDeleteResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageDeleteResponse] (val x: Self) extends AnyVal {
      
      inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStored(value: Boolean): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
    }
  }
}
