package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPushEventData extends js.Object {
  
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
  implicit class GitPushEventDataOps[Self <: GitPushEventData] (val x: Self) extends AnyVal {
    
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
    def setAfterId(value: String): Self = this.set("afterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeId(value: String): Self = this.set("beforeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: GitCommit*): Self = this.set("commits", js.Array(value :_*))
    
    @scala.inline
    def setCommits(value: js.Array[GitCommit]): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: GitRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
}
