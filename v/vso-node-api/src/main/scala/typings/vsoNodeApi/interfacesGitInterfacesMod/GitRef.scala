package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRef extends StObject {
  
  var _links: Any
  
  var isLocked: Boolean
  
  var isLockedBy: IdentityRef
  
  var name: String
  
  var objectId: String
  
  var peeledObjectId: String
  
  var statuses: js.Array[GitStatus]
  
  var url: String
}
object GitRef {
  
  inline def apply(
    _links: Any,
    isLocked: Boolean,
    isLockedBy: IdentityRef,
    name: String,
    objectId: String,
    peeledObjectId: String,
    statuses: js.Array[GitStatus],
    url: String
  ): GitRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isLockedBy = isLockedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], peeledObjectId = peeledObjectId.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRef]
  }
  
  extension [Self <: GitRef](x: Self) {
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsLockedBy(value: IdentityRef): Self = StObject.set(x, "isLockedBy", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setPeeledObjectId(value: String): Self = StObject.set(x, "peeledObjectId", value.asInstanceOf[js.Any])
    
    inline def setStatuses(value: js.Array[GitStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesVarargs(value: GitStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
