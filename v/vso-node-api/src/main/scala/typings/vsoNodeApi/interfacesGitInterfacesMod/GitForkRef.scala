package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitForkRef
  extends StObject
     with GitRef {
  
  /**
    * The repository ID of the fork.
    */
  var repository: GitRepository
}
object GitForkRef {
  
  inline def apply(
    _links: Any,
    isLocked: Boolean,
    isLockedBy: IdentityRef,
    name: String,
    objectId: String,
    peeledObjectId: String,
    repository: GitRepository,
    statuses: js.Array[GitStatus],
    url: String
  ): GitForkRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isLockedBy = isLockedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], peeledObjectId = peeledObjectId.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkRef]
  }
  
  extension [Self <: GitForkRef](x: Self) {
    
    inline def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
