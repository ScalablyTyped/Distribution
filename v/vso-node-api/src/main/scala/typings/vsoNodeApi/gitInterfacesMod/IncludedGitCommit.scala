package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludedGitCommit extends js.Object {
  
  var commitId: String = js.native
  
  var commitTime: Date = js.native
  
  var parentCommitIds: js.Array[String] = js.native
  
  var repositoryId: String = js.native
}
object IncludedGitCommit {
  
  @scala.inline
  def apply(commitId: String, commitTime: Date, parentCommitIds: js.Array[String], repositoryId: String): IncludedGitCommit = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], parentCommitIds = parentCommitIds.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedGitCommit]
  }
  
  @scala.inline
  implicit class IncludedGitCommitOps[Self <: IncludedGitCommit] (val x: Self) extends AnyVal {
    
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
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTime(value: Date): Self = this.set("commitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommitIdsVarargs(value: String*): Self = this.set("parentCommitIds", js.Array(value :_*))
    
    @scala.inline
    def setParentCommitIds(value: js.Array[String]): Self = this.set("parentCommitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
  }
}
