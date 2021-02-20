package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitToCreate extends StObject {
  
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
  implicit class GitCommitToCreateMutableBuilder[Self <: GitCommitToCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseRef(value: GitRef): Self = StObject.set(x, "baseRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathActions(value: js.Array[GitPathAction]): Self = StObject.set(x, "pathActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathActionsVarargs(value: GitPathAction*): Self = StObject.set(x, "pathActions", js.Array(value :_*))
  }
}
