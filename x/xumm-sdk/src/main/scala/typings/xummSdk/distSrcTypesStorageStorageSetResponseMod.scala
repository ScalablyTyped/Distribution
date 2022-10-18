package typings.xummSdk

import typings.xummSdk.anon.Name
import typings.xummSdk.distSrcTypesMetaAnyJsonMod.AnyJson
import typings.xummSdk.distSrcTypesStorageStorageResponseMod.StorageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesStorageStorageSetResponseMod {
  
  trait StorageSetResponse
    extends StObject
       with StorageResponse {
    
    var data: AnyJson
    
    var stored: Boolean
  }
  object StorageSetResponse {
    
    inline def apply(application: Name, data: AnyJson, stored: Boolean): StorageSetResponse = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageSetResponse]
    }
    
    extension [Self <: StorageSetResponse](x: Self) {
      
      inline def setData(value: AnyJson): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStored(value: Boolean): Self = StObject.set(x, "stored", value.asInstanceOf[js.Any])
    }
  }
}
