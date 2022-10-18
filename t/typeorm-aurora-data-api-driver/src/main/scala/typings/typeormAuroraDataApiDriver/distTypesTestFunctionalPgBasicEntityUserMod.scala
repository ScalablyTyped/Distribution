package typings.typeormAuroraDataApiDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestFunctionalPgBasicEntityUserMod {
  
  @JSImport("typeorm-aurora-data-api-driver/dist/types/test/functional/pg/basic/entity/User", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with User {
    
    /* CompleteClass */
    var createdAt: js.Date = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var updatedAt: js.Date = js.native
  }
  
  trait User extends StObject {
    
    var createdAt: js.Date
    
    var id: String
    
    var name: String
    
    var updatedAt: js.Date
  }
  object User {
    
    inline def apply(createdAt: js.Date, id: String, name: String, updatedAt: js.Date): User = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
}
