package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestSearchCriteria extends js.Object {
  /**
    * If set, search for pull requests that were created by this identity.
    */
  var creatorId: java.lang.String
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: scala.Boolean
  /**
    * If set, search for pull requests whose target branch is in this repository.
    */
  var repositoryId: java.lang.String
  /**
    * If set, search for pull requests that have this identity as a reviewer.
    */
  var reviewerId: java.lang.String
  /**
    * If set, search for pull requests from this branch.
    */
  var sourceRefName: java.lang.String
  /**
    * If set, search for pull requests whose source branch is in this repository.
    */
  var sourceRepositoryId: java.lang.String
  /**
    * If set, search for pull requests that are in this state.
    */
  var status: PullRequestStatus
  /**
    * If set, search for pull requests into this branch.
    */
  var targetRefName: java.lang.String
}

object GitPullRequestSearchCriteria {
  @scala.inline
  def apply(
    creatorId: java.lang.String,
    includeLinks: scala.Boolean,
    repositoryId: java.lang.String,
    reviewerId: java.lang.String,
    sourceRefName: java.lang.String,
    sourceRepositoryId: java.lang.String,
    status: PullRequestStatus,
    targetRefName: java.lang.String
  ): GitPullRequestSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creatorId")(creatorId)
    __obj.updateDynamic("includeLinks")(includeLinks)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.updateDynamic("reviewerId")(reviewerId)
    __obj.updateDynamic("sourceRefName")(sourceRefName)
    __obj.updateDynamic("sourceRepositoryId")(sourceRepositoryId)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("targetRefName")(targetRefName)
    __obj.asInstanceOf[GitPullRequestSearchCriteria]
  }
}

