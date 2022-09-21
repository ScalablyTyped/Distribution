package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPushEventData extends StObject {
  
  var afterId: String
  
  var beforeId: String
  
  var branch: String
  
  var commits: js.Array[GitCommit]
  
  var repository: GitRepository
}
object GitPushEventData {
  
  inline def apply(
    afterId: String,
    beforeId: String,
    branch: String,
    commits: js.Array[GitCommit],
    repository: GitRepository
  ): GitPushEventData = {
    val __obj = js.Dynamic.literal(afterId = afterId.asInstanceOf[js.Any], beforeId = beforeId.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushEventData]
  }
  
  extension [Self <: GitPushEventData](x: Self) {
    
    inline def setAfterId(value: String): Self = StObject.set(x, "afterId", value.asInstanceOf[js.Any])
    
    inline def setBeforeId(value: String): Self = StObject.set(x, "beforeId", value.asInstanceOf[js.Any])
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setCommits(value: js.Array[GitCommit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsVarargs(value: GitCommit*): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
