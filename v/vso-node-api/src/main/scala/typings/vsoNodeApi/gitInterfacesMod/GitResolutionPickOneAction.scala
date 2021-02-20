package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitResolutionPickOneAction extends GitResolution {
  
  var action: GitResolutionWhichAction = js.native
}
object GitResolutionPickOneAction {
  
  @scala.inline
  def apply(action: GitResolutionWhichAction): GitResolutionPickOneAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionPickOneAction]
  }
  
  @scala.inline
  implicit class GitResolutionPickOneActionMutableBuilder[Self <: GitResolutionPickOneAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: GitResolutionWhichAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
