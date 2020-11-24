package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequestSearchCriteria extends js.Object {
  
  /**
    * If set, search for pull requests that were created by this identity.
    */
  var creatorId: String = js.native
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean = js.native
  
  /**
    * If set, search for pull requests whose target branch is in this repository.
    */
  var repositoryId: String = js.native
  
  /**
    * If set, search for pull requests that have this identity as a reviewer.
    */
  var reviewerId: String = js.native
  
  /**
    * If set, search for pull requests from this branch.
    */
  var sourceRefName: String = js.native
  
  /**
    * If set, search for pull requests whose source branch is in this repository.
    */
  var sourceRepositoryId: String = js.native
  
  /**
    * If set, search for pull requests that are in this state.
    */
  var status: PullRequestStatus = js.native
  
  /**
    * If set, search for pull requests into this branch.
    */
  var targetRefName: String = js.native
}
object GitPullRequestSearchCriteria {
  
  @scala.inline
  def apply(
    creatorId: String,
    includeLinks: Boolean,
    repositoryId: String,
    reviewerId: String,
    sourceRefName: String,
    sourceRepositoryId: String,
    status: PullRequestStatus,
    targetRefName: String
  ): GitPullRequestSearchCriteria = {
    val __obj = js.Dynamic.literal(creatorId = creatorId.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], reviewerId = reviewerId.asInstanceOf[js.Any], sourceRefName = sourceRefName.asInstanceOf[js.Any], sourceRepositoryId = sourceRepositoryId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetRefName = targetRefName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestSearchCriteria]
  }
  
  @scala.inline
  implicit class GitPullRequestSearchCriteriaOps[Self <: GitPullRequestSearchCriteria] (val x: Self) extends AnyVal {
    
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
    def setCreatorId(value: String): Self = this.set("creatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeLinks(value: Boolean): Self = this.set("includeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewerId(value: String): Self = this.set("reviewerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRefName(value: String): Self = this.set("sourceRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepositoryId(value: String): Self = this.set("sourceRepositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PullRequestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRefName(value: String): Self = this.set("targetRefName", value.asInstanceOf[js.Any])
  }
}
