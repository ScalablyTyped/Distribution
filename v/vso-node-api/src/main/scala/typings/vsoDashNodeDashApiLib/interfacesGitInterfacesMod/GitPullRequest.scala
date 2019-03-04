package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequest extends js.Object {
  /**
    * Links to other related objects.
    */
  var _links: js.Any
  /**
    * A string which uniquely identifies this pull request. To generate an artifact ID for a pull request, use this template: ```vstfs:///Git/PullRequestId/{projectId}/{repositoryId}/{pullRequestId}```
    */
  var artifactId: java.lang.String
  /**
    * If set, auto-complete is enabled for this pull request and this is the identity that enabled it.
    */
  var autoCompleteSetBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The user who closed the pull request.
    */
  var closedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The date when the pull request was closed (completed, abandoned, or merged externally).
    */
  var closedDate: stdLib.Date
  /**
    * The code review ID of the pull request. Used internally.
    */
  var codeReviewId: scala.Double
  /**
    * The commits contained in the pull request.
    */
  var commits: js.Array[GitCommitRef]
  /**
    * Options which affect how the pull request will be merged when it is completed.
    */
  var completionOptions: GitPullRequestCompletionOptions
  /**
    * The most recent date at which the pull request entered the queue to be completed. Used internally.
    */
  var completionQueueTime: stdLib.Date
  /**
    * The identity of the user who created the pull request.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The date when the pull request was created.
    */
  var creationDate: stdLib.Date
  /**
    * The description of the pull request.
    */
  var description: java.lang.String
  /**
    * If this is a PR from a fork this will contain information about its source.
    */
  var forkSource: GitForkRef
  /**
    * The labels associated with the pull request.
    */
  var labels: js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition]
  /**
    * The commit of the most recent pull request merge. If empty, the most recent merge is in progress or was unsuccessful.
    */
  var lastMergeCommit: GitCommitRef
  /**
    * The commit at the head of the source branch at the time of the last pull request merge.
    */
  var lastMergeSourceCommit: GitCommitRef
  /**
    * The commit at the head of the target branch at the time of the last pull request merge.
    */
  var lastMergeTargetCommit: GitCommitRef
  /**
    * If set, pull request merge failed for this reason.
    */
  var mergeFailureMessage: java.lang.String
  /**
    * The type of failure (if any) of the pull request merge.
    */
  var mergeFailureType: PullRequestMergeFailureType
  /**
    * The ID of the job used to run the pull request merge. Used internally.
    */
  var mergeId: java.lang.String
  /**
    * Options used when the pull request merge runs. These are separate from completion options since completion happens only once and a new merge will run every time the source branch of the pull request changes.
    */
  var mergeOptions: GitPullRequestMergeOptions
  /**
    * The current status of the pull request merge.
    */
  var mergeStatus: PullRequestAsyncStatus
  /**
    * The ID of the pull request.
    */
  var pullRequestId: scala.Double
  /**
    * Used internally.
    */
  var remoteUrl: java.lang.String
  /**
    * The repository containing the target branch of the pull request.
    */
  var repository: GitRepository
  /**
    * A list of reviewers on the pull request along with the state of their votes.
    */
  var reviewers: js.Array[IdentityRefWithVote]
  /**
    * The name of the source branch of the pull request.
    */
  var sourceRefName: java.lang.String
  /**
    * The status of the pull request.
    */
  var status: PullRequestStatus
  /**
    * If true, this pull request supports multiple iterations. Iteration support means individual pushes to the source branch of the pull request can be reviewed and comments left in one iteration will be tracked across future iterations.
    */
  var supportsIterations: scala.Boolean
  /**
    * The name of the target branch of the pull request.
    */
  var targetRefName: java.lang.String
  /**
    * The title of the pull request.
    */
  var title: java.lang.String
  /**
    * Used internally.
    */
  var url: java.lang.String
  /**
    * Any work item references associated with this pull request.
    */
  var workItemRefs: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]
}

object GitPullRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    artifactId: java.lang.String,
    autoCompleteSetBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    closedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    closedDate: stdLib.Date,
    codeReviewId: scala.Double,
    commits: js.Array[GitCommitRef],
    completionOptions: GitPullRequestCompletionOptions,
    completionQueueTime: stdLib.Date,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    creationDate: stdLib.Date,
    description: java.lang.String,
    forkSource: GitForkRef,
    labels: js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition],
    lastMergeCommit: GitCommitRef,
    lastMergeSourceCommit: GitCommitRef,
    lastMergeTargetCommit: GitCommitRef,
    mergeFailureMessage: java.lang.String,
    mergeFailureType: PullRequestMergeFailureType,
    mergeId: java.lang.String,
    mergeOptions: GitPullRequestMergeOptions,
    mergeStatus: PullRequestAsyncStatus,
    pullRequestId: scala.Double,
    remoteUrl: java.lang.String,
    repository: GitRepository,
    reviewers: js.Array[IdentityRefWithVote],
    sourceRefName: java.lang.String,
    status: PullRequestStatus,
    supportsIterations: scala.Boolean,
    targetRefName: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    workItemRefs: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]
  ): GitPullRequest = {
    val __obj = js.Dynamic.literal(_links = _links, artifactId = artifactId, autoCompleteSetBy = autoCompleteSetBy, closedBy = closedBy, closedDate = closedDate, codeReviewId = codeReviewId, commits = commits, completionOptions = completionOptions, completionQueueTime = completionQueueTime, createdBy = createdBy, creationDate = creationDate, description = description, forkSource = forkSource, labels = labels, lastMergeCommit = lastMergeCommit, lastMergeSourceCommit = lastMergeSourceCommit, lastMergeTargetCommit = lastMergeTargetCommit, mergeFailureMessage = mergeFailureMessage, mergeFailureType = mergeFailureType, mergeId = mergeId, mergeOptions = mergeOptions, mergeStatus = mergeStatus, pullRequestId = pullRequestId, remoteUrl = remoteUrl, repository = repository, reviewers = reviewers, sourceRefName = sourceRefName, status = status, supportsIterations = supportsIterations, targetRefName = targetRefName, title = title, url = url, workItemRefs = workItemRefs)
  
    __obj.asInstanceOf[GitPullRequest]
  }
}

