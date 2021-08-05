package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitResolutionPickOneAction
  extends StObject
     with GitResolution {
  
  var action: GitResolutionWhichAction
}
object GitResolutionPickOneAction {
  
  inline def apply(action: GitResolutionWhichAction): GitResolutionPickOneAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionPickOneAction]
  }
  
  extension [Self <: GitResolutionPickOneAction](x: Self) {
    
    inline def setAction(value: GitResolutionWhichAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
