package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.coreInterfacesMod.WebApiTagDefinition
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import typings.vsoNodeApi.vssinterfacesMod.ResourceRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPullRequest extends StObject {
  
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  
  /**
    * A string which uniquely identifies this pull request. To generate an artifact ID for a pull request, use this template: ```vstfs:///Git/PullRequestId/{projectId}/{repositoryId}/{pullRequestId}```
    */
  var artifactId: String = js.native
  
  /**
    * If set, auto-complete is enabled for this pull request and this is the identity that enabled it.
    */
  var autoCompleteSetBy: IdentityRef = js.native
  
  /**
    * The user who closed the pull request.
    */
  var closedBy: IdentityRef = js.native
  
  /**
    * The date when the pull request was closed (completed, abandoned, or merged externally).
    */
  var closedDate: Date = js.native
  
  /**
    * The code review ID of the pull request. Used internally.
    */
  var codeReviewId: Double = js.native
  
  /**
    * The commits contained in the pull request.
    */
  var commits: js.Array[GitCommitRef] = js.native
  
  /**
    * Options which affect how the pull request will be merged when it is completed.
    */
  var completionOptions: GitPullRequestCompletionOptions = js.native
  
  /**
    * The most recent date at which the pull request entered the queue to be completed. Used internally.
    */
  var completionQueueTime: Date = js.native
  
  /**
    * The identity of the user who created the pull request.
    */
  var createdBy: IdentityRef = js.native
  
  /**
    * The date when the pull request was created.
    */
  var creationDate: Date = js.native
  
  /**
    * The description of the pull request.
    */
  var description: String = js.native
  
  /**
    * If this is a PR from a fork this will contain information about its source.
    */
  var forkSource: GitForkRef = js.native
  
  /**
    * The labels associated with the pull request.
    */
  var labels: js.Array[WebApiTagDefinition] = js.native
  
  /**
    * The commit of the most recent pull request merge. If empty, the most recent merge is in progress or was unsuccessful.
    */
  var lastMergeCommit: GitCommitRef = js.native
  
  /**
    * The commit at the head of the source branch at the time of the last pull request merge.
    */
  var lastMergeSourceCommit: GitCommitRef = js.native
  
  /**
    * The commit at the head of the target branch at the time of the last pull request merge.
    */
  var lastMergeTargetCommit: GitCommitRef = js.native
  
  /**
    * If set, pull request merge failed for this reason.
    */
  var mergeFailureMessage: String = js.native
  
  /**
    * The type of failure (if any) of the pull request merge.
    */
  var mergeFailureType: PullRequestMergeFailureType = js.native
  
  /**
    * The ID of the job used to run the pull request merge. Used internally.
    */
  var mergeId: String = js.native
  
  /**
    * Options used when the pull request merge runs. These are separate from completion options since completion happens only once and a new merge will run every time the source branch of the pull request changes.
    */
  var mergeOptions: GitPullRequestMergeOptions = js.native
  
  /**
    * The current status of the pull request merge.
    */
  var mergeStatus: PullRequestAsyncStatus = js.native
  
  /**
    * The ID of the pull request.
    */
  var pullRequestId: Double = js.native
  
  /**
    * Used internally.
    */
  var remoteUrl: String = js.native
  
  /**
    * The repository containing the target branch of the pull request.
    */
  var repository: GitRepository = js.native
  
  /**
    * A list of reviewers on the pull request along with the state of their votes.
    */
  var reviewers: js.Array[IdentityRefWithVote] = js.native
  
  /**
    * The name of the source branch of the pull request.
    */
  var sourceRefName: String = js.native
  
  /**
    * The status of the pull request.
    */
  var status: PullRequestStatus = js.native
  
  /**
    * If true, this pull request supports multiple iterations. Iteration support means individual pushes to the source branch of the pull request can be reviewed and comments left in one iteration will be tracked across future iterations.
    */
  var supportsIterations: Boolean = js.native
  
  /**
    * The name of the target branch of the pull request.
    */
  var targetRefName: String = js.native
  
  /**
    * The title of the pull request.
    */
  var title: String = js.native
  
  /**
    * Used internally.
    */
  var url: String = js.native
  
  /**
    * Any work item references associated with this pull request.
    */
  var workItemRefs: js.Array[ResourceRef] = js.native
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
  
  @scala.inline
  implicit class GitPullRequestMutableBuilder[Self <: GitPullRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteSetBy(value: IdentityRef): Self = StObject.set(x, "autoCompleteSetBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedBy(value: IdentityRef): Self = StObject.set(x, "closedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedDate(value: Date): Self = StObject.set(x, "closedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeReviewId(value: Double): Self = StObject.set(x, "codeReviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: GitCommitRef*): Self = StObject.set(x, "commits", js.Array(value :_*))
    
    @scala.inline
    def setCompletionOptions(value: GitPullRequestCompletionOptions): Self = StObject.set(x, "completionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionQueueTime(value: Date): Self = StObject.set(x, "completionQueueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForkSource(value: GitForkRef): Self = StObject.set(x, "forkSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[WebApiTagDefinition]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: WebApiTagDefinition*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLastMergeCommit(value: GitCommitRef): Self = StObject.set(x, "lastMergeCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMergeSourceCommit(value: GitCommitRef): Self = StObject.set(x, "lastMergeSourceCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMergeTargetCommit(value: GitCommitRef): Self = StObject.set(x, "lastMergeTargetCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFailureMessage(value: String): Self = StObject.set(x, "mergeFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeFailureType(value: PullRequestMergeFailureType): Self = StObject.set(x, "mergeFailureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeId(value: String): Self = StObject.set(x, "mergeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOptions(value: GitPullRequestMergeOptions): Self = StObject.set(x, "mergeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeStatus(value: PullRequestAsyncStatus): Self = StObject.set(x, "mergeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUrl(value: String): Self = StObject.set(x, "remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewers(value: js.Array[IdentityRefWithVote]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewersVarargs(value: IdentityRefWithVote*): Self = StObject.set(x, "reviewers", js.Array(value :_*))
    
    @scala.inline
    def setSourceRefName(value: String): Self = StObject.set(x, "sourceRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PullRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsIterations(value: Boolean): Self = StObject.set(x, "supportsIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRefName(value: String): Self = StObject.set(x, "targetRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemRefs(value: js.Array[ResourceRef]): Self = StObject.set(x, "workItemRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemRefsVarargs(value: ResourceRef*): Self = StObject.set(x, "workItemRefs", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
