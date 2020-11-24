package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRefUpdate extends js.Object {
  
  var isLocked: Boolean = js.native
  
  var name: String = js.native
  
  var newObjectId: String = js.native
  
  var oldObjectId: String = js.native
  
  var repositoryId: String = js.native
}
object GitRefUpdate {
  
  @scala.inline
  def apply(isLocked: Boolean, name: String, newObjectId: String, oldObjectId: String, repositoryId: String): GitRefUpdate = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newObjectId = newObjectId.asInstanceOf[js.Any], oldObjectId = oldObjectId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRefUpdate]
  }
  
  @scala.inline
  implicit class GitRefUpdateOps[Self <: GitRefUpdate] (val x: Self) extends AnyVal {
    
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
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObjectId(value: String): Self = this.set("newObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldObjectId(value: String): Self = this.set("oldObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
  }
}
