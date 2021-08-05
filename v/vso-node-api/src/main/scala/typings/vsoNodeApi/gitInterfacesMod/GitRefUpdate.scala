package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRefUpdate extends StObject {
  
  var isLocked: Boolean
  
  var name: String
  
  var newObjectId: String
  
  var oldObjectId: String
  
  var repositoryId: String
}
object GitRefUpdate {
  
  inline def apply(isLocked: Boolean, name: String, newObjectId: String, oldObjectId: String, repositoryId: String): GitRefUpdate = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newObjectId = newObjectId.asInstanceOf[js.Any], oldObjectId = oldObjectId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRefUpdate]
  }
  
  extension [Self <: GitRefUpdate](x: Self) {
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewObjectId(value: String): Self = StObject.set(x, "newObjectId", value.asInstanceOf[js.Any])
    
    inline def setOldObjectId(value: String): Self = StObject.set(x, "oldObjectId", value.asInstanceOf[js.Any])
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}
