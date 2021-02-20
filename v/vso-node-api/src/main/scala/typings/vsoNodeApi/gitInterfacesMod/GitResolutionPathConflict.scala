package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitResolutionPathConflict extends GitResolution {
  
  var action: GitResolutionPathConflictAction = js.native
  
  var renamePath: String = js.native
}
object GitResolutionPathConflict {
  
  @scala.inline
  def apply(action: GitResolutionPathConflictAction, renamePath: String): GitResolutionPathConflict = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], renamePath = renamePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionPathConflict]
  }
  
  @scala.inline
  implicit class GitResolutionPathConflictMutableBuilder[Self <: GitResolutionPathConflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: GitResolutionPathConflictAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenamePath(value: String): Self = StObject.set(x, "renamePath", value.asInstanceOf[js.Any])
  }
}
