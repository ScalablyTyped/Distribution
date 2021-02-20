package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPushEventData extends StObject {
  
  var afterId: String = js.native
  
  var beforeId: String = js.native
  
  var branch: String = js.native
  
  var commits: js.Array[GitCommit] = js.native
  
  var repository: GitRepository = js.native
}
object GitPushEventData {
  
  @scala.inline
  def apply(
    afterId: String,
    beforeId: String,
    branch: String,
    commits: js.Array[GitCommit],
    repository: GitRepository
  ): GitPushEventData = {
    val __obj = js.Dynamic.literal(afterId = afterId.asInstanceOf[js.Any], beforeId = beforeId.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushEventData]
  }
  
  @scala.inline
  implicit class GitPushEventDataMutableBuilder[Self <: GitPushEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterId(value: String): Self = StObject.set(x, "afterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeId(value: String): Self = StObject.set(x, "beforeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: js.Array[GitCommit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: GitCommit*): Self = StObject.set(x, "commits", js.Array(value :_*))
    
    @scala.inline
    def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
