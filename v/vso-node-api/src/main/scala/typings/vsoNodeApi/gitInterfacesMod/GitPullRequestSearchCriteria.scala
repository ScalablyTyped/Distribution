package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestSearchCriteria extends js.Object {
  /**
    * If set, search for pull requests that were created by this identity.
    */
  var creatorId: String
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  /**
    * If set, search for pull requests whose target branch is in this repository.
    */
  var repositoryId: String
  /**
    * If set, search for pull requests that have this identity as a reviewer.
    */
  var reviewerId: String
  /**
    * If set, search for pull requests from this branch.
    */
  var sourceRefName: String
  /**
    * If set, search for pull requests whose source branch is in this repository.
    */
  var sourceRepositoryId: String
  /**
    * If set, search for pull requests that are in this state.
    */
  var status: PullRequestStatus
  /**
    * If set, search for pull requests into this branch.
    */
  var targetRefName: String
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
}

