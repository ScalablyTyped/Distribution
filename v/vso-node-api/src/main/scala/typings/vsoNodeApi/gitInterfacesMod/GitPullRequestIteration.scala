package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestIteration extends js.Object {
  
  /**
    * A collection of related REST reference links.
    */
  var _links: js.Any = js.native
  
  /**
    * Author of the pull request iteration.
    */
  var author: IdentityRef = js.native
  
  /**
    * Changes included with the pull request iteration.
    */
  var changeList: js.Array[GitPullRequestChange] = js.native
  
  /**
    * The commits included with the pull request iteration.
    */
  var commits: js.Array[GitCommitRef] = js.native
  
  /**
    * The first common Git commit of the source and target refs.
    */
  var commonRefCommit: GitCommitRef = js.native
  
  /**
    * The creation date of the pull request iteration.
    */
  var createdDate: Date = js.native
  
  /**
    * Description of the pull request iteration.
    */
  var description: String = js.native
  
  /**
    * Indicates if the Commits property contains a truncated list of commits in this pull request iteration.
    */
  var hasMoreCommits: Boolean = js.native
  
  /**
    * ID of the pull request iteration. Iterations are created as a result of creating and pushing updates to a pull request.
    */
  var id: Double = js.native
  
  /**
    * The Git push information associated with this pull request iteration.
    */
  var push: GitPushRef = js.native
  
  /**
    * The reason for which the pull request iteration was created.
    */
  var reason: IterationReason = js.native
  
  /**
    * The source Git commit of this iteration.
    */
  var sourceRefCommit: GitCommitRef = js.native
  
  /**
    * The target Git commit of this iteration.
    */
  var targetRefCommit: GitCommitRef = js.native
  
  /**
    * The updated date of the pull request iteration.
    */
  var updatedDate: Date = js.native
}
object GitPullRequestIteration {
  
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    changeList: js.Array[GitPullRequestChange],
    commits: js.Array[GitCommitRef],
    commonRefCommit: GitCommitRef,
    createdDate: Date,
    description: String,
    hasMoreCommits: Boolean,
    id: Double,
    push: GitPushRef,
    reason: IterationReason,
    sourceRefCommit: GitCommitRef,
    targetRefCommit: GitCommitRef,
    updatedDate: Date
  ): GitPullRequestIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeList = changeList.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commonRefCommit = commonRefCommit.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasMoreCommits = hasMoreCommits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceRefCommit = sourceRefCommit.asInstanceOf[js.Any], targetRefCommit = targetRefCommit.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestIteration]
  }
  
  @scala.inline
  implicit class GitPullRequestIterationOps[Self <: GitPullRequestIteration] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: IdentityRef): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeListVarargs(value: GitPullRequestChange*): Self = this.set("changeList", js.Array(value :_*))
    
    @scala.inline
    def setChangeList(value: js.Array[GitPullRequestChange]): Self = this.set("changeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: GitCommitRef*): Self = this.set("commits", js.Array(value :_*))
    
    @scala.inline
    def setCommits(value: js.Array[GitCommitRef]): Self = this.set("commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonRefCommit(value: GitCommitRef): Self = this.set("commonRefCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreCommits(value: Boolean): Self = this.set("hasMoreCommits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: GitPushRef): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: IterationReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRefCommit(value: GitCommitRef): Self = this.set("sourceRefCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRefCommit(value: GitCommitRef): Self = this.set("targetRefCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
  }
}
