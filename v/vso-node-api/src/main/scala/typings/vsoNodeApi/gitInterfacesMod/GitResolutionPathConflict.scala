package typings.vsoNodeApi.gitInterfacesMod

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
  implicit class GitResolutionPathConflictOps[Self <: GitResolutionPathConflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: GitResolutionPathConflictAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenamePath(value: String): Self = this.set("renamePath", value.asInstanceOf[js.Any])
  }
}
