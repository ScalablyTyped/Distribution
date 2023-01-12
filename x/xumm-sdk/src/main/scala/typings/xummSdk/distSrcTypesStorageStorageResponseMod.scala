package typings.xummSdk

import typings.xummSdk.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesStorageStorageResponseMod {
  
  trait StorageResponse extends StObject {
    
    var application: Name
  }
  object StorageResponse {
    
    inline def apply(application: Name): StorageResponse = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StorageResponse] (val x: Self) extends AnyVal {
      
      inline def setApplication(value: Name): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    }
  }
}
