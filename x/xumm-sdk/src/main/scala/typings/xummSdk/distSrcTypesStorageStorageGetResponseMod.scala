package typings.xummSdk

import typings.xummSdk.anon.Name
import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import typings.xummSdk.distSrcTypesStorageStorageResponseMod.StorageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesStorageStorageGetResponseMod {
  
  trait StorageGetResponse
    extends StObject
       with StorageResponse {
    
    var data: AnyJson | Null
  }
  object StorageGetResponse {
    
    inline def apply(application: Name): StorageGetResponse = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[StorageGetResponse]
    }
    
    extension [Self <: StorageGetResponse](x: Self) {
      
      inline def setData(value: AnyJson): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
    }
  }
}
