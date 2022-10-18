package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCommitToCreate extends StObject {
  
  var baseRef: GitRef
  
  var comment: String
  
  var pathActions: js.Array[GitPathAction]
}
object GitCommitToCreate {
  
  inline def apply(baseRef: GitRef, comment: String, pathActions: js.Array[GitPathAction]): GitCommitToCreate = {
    val __obj = js.Dynamic.literal(baseRef = baseRef.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], pathActions = pathActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitToCreate]
  }
  
  extension [Self <: GitCommitToCreate](x: Self) {
    
    inline def setBaseRef(value: GitRef): Self = StObject.set(x, "baseRef", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setPathActions(value: js.Array[GitPathAction]): Self = StObject.set(x, "pathActions", value.asInstanceOf[js.Any])
    
    inline def setPathActionsVarargs(value: GitPathAction*): Self = StObject.set(x, "pathActions", js.Array(value*))
  }
}
