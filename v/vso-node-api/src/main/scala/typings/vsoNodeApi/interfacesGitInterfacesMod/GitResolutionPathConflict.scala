package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitResolutionPathConflict
  extends StObject
     with GitResolution {
  
  var action: GitResolutionPathConflictAction
  
  var renamePath: String
}
object GitResolutionPathConflict {
  
  inline def apply(action: GitResolutionPathConflictAction, renamePath: String): GitResolutionPathConflict = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], renamePath = renamePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionPathConflict]
  }
  
  extension [Self <: GitResolutionPathConflict](x: Self) {
    
    inline def setAction(value: GitResolutionPathConflictAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRenamePath(value: String): Self = StObject.set(x, "renamePath", value.asInstanceOf[js.Any])
  }
}
