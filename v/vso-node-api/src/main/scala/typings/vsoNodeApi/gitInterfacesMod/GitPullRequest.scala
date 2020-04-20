package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.WebApiTagDefinition
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import typings.vsoNodeApi.vssinterfacesMod.ResourceRef
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
  var artifactId: String
  /**
    * If set, auto-complete is enabled for this pull request and this is the identity that enabled it.
    */
  var autoCompleteSetBy: IdentityRef
  /**
    * The user who closed the pull request.
    */
  var closedBy: IdentityRef
  /**
    * The date when the pull request was closed (completed, abandoned, or merged externally).
    */
  var closedDate: Date
  /**
    * The code review ID of the pull request. Used internally.
    */
  var codeReviewId: Double
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
  var completionQueueTime: Date
  /**
    * The identity of the user who created the pull request.
    */
  var createdBy: IdentityRef
  /**
    * The date when the pull request was created.
    */
  var creationDate: Date
  /**
    * The description of the pull request.
    */
  var description: String
  /**
    * If this is a PR from a fork this will contain information about its source.
    */
  var forkSource: GitForkRef
  /**
    * The labels associated with the pull request.
    */
  var labels: js.Array[WebApiTagDefinition]
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
  var mergeFailureMessage: String
  /**
    * The type of failure (if any) of the pull request merge.
    */
  var mergeFailureType: PullRequestMergeFailureType
  /**
    * The ID of the job used to run the pull request merge. Used internally.
    */
  var mergeId: String
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
  var pullRequestId: Double
  /**
    * Used internally.
    */
  var remoteUrl: String
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
  var sourceRefName: String
  /**
    * The status of the pull request.
    */
  var status: PullRequestStatus
  /**
    * If true, this pull request supports multiple iterations. Iteration support means individual pushes to the source branch of the pull request can be reviewed and comments left in one iteration will be tracked across future iterations.
    */
  var supportsIterations: Boolean
  /**
    * The name of the target branch of the pull request.
    */
  var targetRefName: String
  /**
    * The title of the pull request.
    */
  var title: String
  /**
    * Used internally.
    */
  var url: String
  /**
    * Any work item references associated with this pull request.
    */
  var workItemRefs: js.Array[ResourceRef]
}

object GitPullRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    artifactId: String,
    autoCompleteSetBy: IdentityRef,
    closedBy: IdentityRef,
    closedDate: Date,
    codeReviewId: Double,
    commits: js.Array[GitCommitRef],
    completionOptions: GitPullRequestCompletionOptions,
    completionQueueTime: Date,
    createdBy: IdentityRef,
    creationDate: Date,
    description: String,
    forkSource: GitForkRef,
    labels: js.Array[WebApiTagDefinition],
    lastMergeCommit: GitCommitRef,
    lastMergeSourceCommit: GitCommitRef,
    lastMergeTargetCommit: GitCommitRef,
    mergeFailureMessage: String,
    mergeFailureType: PullRequestMergeFailureType,
    mergeId: String,
    mergeOptions: GitPullRequestMergeOptions,
    mergeStatus: PullRequestAsyncStatus,
    pullRequestId: Double,
    remoteUrl: String,
    repository: GitRepository,
    reviewers: js.Array[IdentityRefWithVote],
    sourceRefName: String,
    status: PullRequestStatus,
    supportsIterations: Boolean,
    targetRefName: String,
    title: String,
    url: String,
    workItemRefs: js.Array[ResourceRef]
  ): GitPullRequest = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], autoCompleteSetBy = autoCompleteSetBy.asInstanceOf[js.Any], closedBy = closedBy.asInstanceOf[js.Any], closedDate = closedDate.asInstanceOf[js.Any], codeReviewId = codeReviewId.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], completionOptions = completionOptions.asInstanceOf[js.Any], completionQueueTime = completionQueueTime.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forkSource = forkSource.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], lastMergeCommit = lastMergeCommit.asInstanceOf[js.Any], lastMergeSourceCommit = lastMergeSourceCommit.asInstanceOf[js.Any], lastMergeTargetCommit = lastMergeTargetCommit.asInstanceOf[js.Any], mergeFailureMessage = mergeFailureMessage.asInstanceOf[js.Any], mergeFailureType = mergeFailureType.asInstanceOf[js.Any], mergeId = mergeId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], mergeStatus = mergeStatus.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], sourceRefName = sourceRefName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], supportsIterations = supportsIterations.asInstanceOf[js.Any], targetRefName = targetRefName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemRefs = workItemRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequest]
  }
}

