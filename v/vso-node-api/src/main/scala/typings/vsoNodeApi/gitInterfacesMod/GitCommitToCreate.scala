package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitToCreate extends js.Object {
  
  var baseRef: GitRef = js.native
  
  var comment: String = js.native
  
  var pathActions: js.Array[GitPathAction] = js.native
}
object GitCommitToCreate {
  
  @scala.inline
  def apply(baseRef: GitRef, comment: String, pathActions: js.Array[GitPathAction]): GitCommitToCreate = {
    val __obj = js.Dynamic.literal(baseRef = baseRef.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], pathActions = pathActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitToCreate]
  }
  
  @scala.inline
  implicit class GitCommitToCreateOps[Self <: GitCommitToCreate] (val x: Self) extends AnyVal {
    
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
    def setBaseRef(value: GitRef): Self = this.set("baseRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathActionsVarargs(value: GitPathAction*): Self = this.set("pathActions", js.Array(value :_*))
    
    @scala.inline
    def setPathActions(value: js.Array[GitPathAction]): Self = this.set("pathActions", value.asInstanceOf[js.Any])
  }
}
