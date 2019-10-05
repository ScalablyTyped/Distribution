package typings.vsoDashNodeDashApi

import typings.node.NodeJS.ReadableStream
import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.gitApiMod.IGitApi
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JsonPatchDocument
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.WebApiCreateTagRequestData
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.WebApiTagDefinition
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.AssociatedWorkItem
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.Attachment
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.Comment
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAnnotatedTag
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncRefOperationParameters
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitBlobRef
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitBranchStats
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitCherryPick
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitCommit
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitCommitChanges
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitCommitRef
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflict
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitConflictUpdateResult
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitDeletedRepository
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitForkSyncRequest
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitForkSyncRequestParameters
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitImportRequest
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitItem
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitItemRequestData
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequest
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestCommentThread
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestIteration
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestIterationChanges
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestQuery
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestSearchCriteria
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPullRequestStatus
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPush
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitPushSearchCriteria
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitQueryBranchStatsCriteria
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitQueryCommitsCriteria
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRef
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefFavorite
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdate
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRefUpdateResult
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRepository
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRepositoryCreateOptions
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRepositoryRef
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitRevert
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitStatus
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitSuggestion
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitTreeRef
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitVersionDescriptor
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.IdentityRefWithVote
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.ShareNotificationContext
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.VersionControlRecursionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/GitApi", JSImport.Namespace)
@js.native
object gitApiMod extends js.Object {
  @js.native
  class GitApi protected () extends IGitApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IGitApi extends ClientApiBase {
    def createAnnotatedTag(tagObject: GitAnnotatedTag, project: String, repositoryId: String): js.Promise[GitAnnotatedTag] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: String,
      repositoryId: String,
      pullRequestId: Double
    ): js.Promise[Attachment] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: String,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Attachment] = js.native
    def createCherryPick(cherryPickToCreate: GitAsyncRefOperationParameters, project: String, repositoryId: String): js.Promise[GitCherryPick] = js.native
    def createComment(comment: Comment, repositoryId: String, pullRequestId: Double, threadId: Double): js.Promise[Comment] = js.native
    def createComment(comment: Comment, repositoryId: String, pullRequestId: Double, threadId: Double, project: String): js.Promise[Comment] = js.native
    def createCommitStatus(gitCommitStatusToCreate: GitStatus, commitId: String, repositoryId: String): js.Promise[GitStatus] = js.native
    def createCommitStatus(gitCommitStatusToCreate: GitStatus, commitId: String, repositoryId: String, project: String): js.Promise[GitStatus] = js.native
    def createFavorite(favorite: GitRefFavorite, project: String): js.Promise[GitRefFavorite] = js.native
    def createForkSyncRequest(syncParams: GitForkSyncRequestParameters, repositoryNameOrId: String): js.Promise[GitForkSyncRequest] = js.native
    def createForkSyncRequest(syncParams: GitForkSyncRequestParameters, repositoryNameOrId: String, project: String): js.Promise[GitForkSyncRequest] = js.native
    def createForkSyncRequest(
      syncParams: GitForkSyncRequestParameters,
      repositoryNameOrId: String,
      project: String,
      includeLinks: Boolean
    ): js.Promise[GitForkSyncRequest] = js.native
    def createImportRequest(importRequest: GitImportRequest, project: String, repositoryId: String): js.Promise[GitImportRequest] = js.native
    def createLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Unit] = js.native
    def createLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Unit] = js.native
    def createPullRequest(gitPullRequestToCreate: GitPullRequest, repositoryId: String): js.Promise[GitPullRequest] = js.native
    def createPullRequest(gitPullRequestToCreate: GitPullRequest, repositoryId: String, project: String): js.Promise[GitPullRequest] = js.native
    def createPullRequest(
      gitPullRequestToCreate: GitPullRequest,
      repositoryId: String,
      project: String,
      supportsIterations: Boolean
    ): js.Promise[GitPullRequest] = js.native
    def createPullRequestIterationStatus(status: GitPullRequestStatus, repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[GitPullRequestStatus] = js.native
    def createPullRequestIterationStatus(
      status: GitPullRequestStatus,
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String
    ): js.Promise[GitPullRequestStatus] = js.native
    def createPullRequestLabel(label: WebApiCreateTagRequestData, repositoryId: String, pullRequestId: Double): js.Promise[WebApiTagDefinition] = js.native
    def createPullRequestLabel(label: WebApiCreateTagRequestData, repositoryId: String, pullRequestId: Double, project: String): js.Promise[WebApiTagDefinition] = js.native
    def createPullRequestLabel(
      label: WebApiCreateTagRequestData,
      repositoryId: String,
      pullRequestId: Double,
      project: String,
      projectId: String
    ): js.Promise[WebApiTagDefinition] = js.native
    def createPullRequestReviewer(reviewer: IdentityRefWithVote, repositoryId: String, pullRequestId: Double, reviewerId: String): js.Promise[IdentityRefWithVote] = js.native
    def createPullRequestReviewer(
      reviewer: IdentityRefWithVote,
      repositoryId: String,
      pullRequestId: Double,
      reviewerId: String,
      project: String
    ): js.Promise[IdentityRefWithVote] = js.native
    def createPullRequestReviewers(reviewers: js.Array[IdentityRef], repositoryId: String, pullRequestId: Double): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    def createPullRequestReviewers(reviewers: js.Array[IdentityRef], repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    def createPullRequestStatus(status: GitPullRequestStatus, repositoryId: String, pullRequestId: Double): js.Promise[GitPullRequestStatus] = js.native
    def createPullRequestStatus(status: GitPullRequestStatus, repositoryId: String, pullRequestId: Double, project: String): js.Promise[GitPullRequestStatus] = js.native
    def createPush(push: GitPush, repositoryId: String): js.Promise[GitPush] = js.native
    def createPush(push: GitPush, repositoryId: String, project: String): js.Promise[GitPush] = js.native
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions): js.Promise[GitRepository] = js.native
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions, project: String): js.Promise[GitRepository] = js.native
    def createRepository(gitRepositoryToCreate: GitRepositoryCreateOptions, project: String, sourceRef: String): js.Promise[GitRepository] = js.native
    def createRevert(revertToCreate: GitAsyncRefOperationParameters, project: String, repositoryId: String): js.Promise[GitRevert] = js.native
    def createThread(commentThread: GitPullRequestCommentThread, repositoryId: String, pullRequestId: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def createThread(
      commentThread: GitPullRequestCommentThread,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def deleteAttachment(fileName: String, repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def deleteAttachment(fileName: String, repositoryId: String, pullRequestId: Double, project: String): js.Promise[Unit] = js.native
    def deleteComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Unit] = js.native
    def deleteComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Unit] = js.native
    def deleteLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Unit] = js.native
    def deleteLike(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Unit] = js.native
    def deletePullRequestIterationStatus(repositoryId: String, pullRequestId: Double, iterationId: Double, statusId: Double): js.Promise[Unit] = js.native
    def deletePullRequestIterationStatus(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      statusId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    def deletePullRequestLabels(repositoryId: String, pullRequestId: Double, labelIdOrName: String): js.Promise[Unit] = js.native
    def deletePullRequestLabels(repositoryId: String, pullRequestId: Double, labelIdOrName: String, project: String): js.Promise[Unit] = js.native
    def deletePullRequestLabels(
      repositoryId: String,
      pullRequestId: Double,
      labelIdOrName: String,
      project: String,
      projectId: String
    ): js.Promise[Unit] = js.native
    def deletePullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String): js.Promise[Unit] = js.native
    def deletePullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String, project: String): js.Promise[Unit] = js.native
    def deletePullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double): js.Promise[Unit] = js.native
    def deletePullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double, project: String): js.Promise[Unit] = js.native
    def deleteRefFavorite(project: String, favoriteId: Double): js.Promise[Unit] = js.native
    def deleteRepository(repositoryId: String): js.Promise[Unit] = js.native
    def deleteRepository(repositoryId: String, project: String): js.Promise[Unit] = js.native
    def getAnnotatedTag(project: String, repositoryId: String, objectId: String): js.Promise[GitAnnotatedTag] = js.native
    def getAttachmentContent(fileName: String, repositoryId: String, pullRequestId: Double): js.Promise[ReadableStream] = js.native
    def getAttachmentContent(fileName: String, repositoryId: String, pullRequestId: Double, project: String): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(fileName: String, repositoryId: String, pullRequestId: Double): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(fileName: String, repositoryId: String, pullRequestId: Double, project: String): js.Promise[ReadableStream] = js.native
    def getAttachments(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[Attachment]] = js.native
    def getAttachments(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[Attachment]] = js.native
    def getBlob(repositoryId: String, sha1: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String, download: Boolean): js.Promise[GitBlobRef] = js.native
    def getBlob(repositoryId: String, sha1: String, project: String, download: Boolean, fileName: String): js.Promise[GitBlobRef] = js.native
    def getBlobContent(repositoryId: String, sha1: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String, download: Boolean): js.Promise[ReadableStream] = js.native
    def getBlobContent(repositoryId: String, sha1: String, project: String, download: Boolean, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String, download: Boolean): js.Promise[ReadableStream] = js.native
    def getBlobZip(repositoryId: String, sha1: String, project: String, download: Boolean, fileName: String): js.Promise[ReadableStream] = js.native
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String): js.Promise[ReadableStream] = js.native
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String, project: String): js.Promise[ReadableStream] = js.native
    def getBlobsZip(blobIds: js.Array[String], repositoryId: String, project: String, filename: String): js.Promise[ReadableStream] = js.native
    def getBranch(repositoryId: String, name: String): js.Promise[GitBranchStats] = js.native
    def getBranch(repositoryId: String, name: String, project: String): js.Promise[GitBranchStats] = js.native
    def getBranch(repositoryId: String, name: String, project: String, baseVersionDescriptor: GitVersionDescriptor): js.Promise[GitBranchStats] = js.native
    def getBranchStatsBatch(searchCriteria: GitQueryBranchStatsCriteria, repositoryId: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranchStatsBatch(searchCriteria: GitQueryBranchStatsCriteria, repositoryId: String, project: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranches(repositoryId: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranches(repositoryId: String, project: String): js.Promise[js.Array[GitBranchStats]] = js.native
    def getBranches(repositoryId: String, project: String, baseVersionDescriptor: GitVersionDescriptor): js.Promise[js.Array[GitBranchStats]] = js.native
    def getChanges(commitId: String, repositoryId: String): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String, top: Double): js.Promise[GitCommitChanges] = js.native
    def getChanges(commitId: String, repositoryId: String, project: String, top: Double, skip: Double): js.Promise[GitCommitChanges] = js.native
    def getCherryPick(project: String, cherryPickId: Double, repositoryId: String): js.Promise[GitCherryPick] = js.native
    def getCherryPickForRefName(project: String, repositoryId: String, refName: String): js.Promise[GitCherryPick] = js.native
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCherryPickRelationships(repositoryNameOrId: String, commitId: String, project: String, includeLinks: Boolean): js.Promise[js.Array[GitCommitRef]] = js.native
    def getComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Comment] = js.native
    def getComment(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[Comment] = js.native
    def getComments(repositoryId: String, pullRequestId: Double, threadId: Double): js.Promise[js.Array[Comment]] = js.native
    def getComments(repositoryId: String, pullRequestId: Double, threadId: Double, project: String): js.Promise[js.Array[Comment]] = js.native
    def getCommit(commitId: String, repositoryId: String): js.Promise[GitCommit] = js.native
    def getCommit(commitId: String, repositoryId: String, project: String): js.Promise[GitCommit] = js.native
    def getCommit(commitId: String, repositoryId: String, project: String, changeCount: Double): js.Promise[GitCommit] = js.native
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(repositoryId: String, searchCriteria: GitQueryCommitsCriteria, project: String, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommits(
      repositoryId: String,
      searchCriteria: GitQueryCommitsCriteria,
      project: String,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(searchCriteria: GitQueryCommitsCriteria, repositoryId: String, project: String, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getCommitsBatch(
      searchCriteria: GitQueryCommitsCriteria,
      repositoryId: String,
      project: String,
      skip: Double,
      top: Double,
      includeStatuses: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getDeletedRepositories(project: String): js.Promise[js.Array[GitDeletedRepository]] = js.native
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double): js.Promise[GitForkSyncRequest] = js.native
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double, project: String): js.Promise[GitForkSyncRequest] = js.native
    def getForkSyncRequest(repositoryNameOrId: String, forkSyncOperationId: Double, project: String, includeLinks: Boolean): js.Promise[GitForkSyncRequest] = js.native
    def getForkSyncRequests(repositoryNameOrId: String): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String, includeAbandoned: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForkSyncRequests(repositoryNameOrId: String, project: String, includeAbandoned: Boolean, includeLinks: Boolean): js.Promise[js.Array[GitForkSyncRequest]] = js.native
    def getForks(repositoryNameOrId: String, collectionId: String): js.Promise[js.Array[GitRepositoryRef]] = js.native
    def getForks(repositoryNameOrId: String, collectionId: String, project: String): js.Promise[js.Array[GitRepositoryRef]] = js.native
    def getForks(repositoryNameOrId: String, collectionId: String, project: String, includeLinks: Boolean): js.Promise[js.Array[GitRepositoryRef]] = js.native
    def getImportRequest(project: String, repositoryId: String, importRequestId: Double): js.Promise[GitImportRequest] = js.native
    def getItem(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[GitItem] = js.native
    def getItemContent(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    def getItemText(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    def getItemZip(
      repositoryId: String,
      path: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[ReadableStream] = js.native
    def getItems(
      repositoryId: String,
      project: js.UndefOr[String],
      scopePath: js.UndefOr[String],
      recursionLevel: js.UndefOr[VersionControlRecursionType],
      includeContentMetadata: js.UndefOr[Boolean],
      latestProcessedChange: js.UndefOr[Boolean],
      download: js.UndefOr[Boolean],
      includeLinks: js.UndefOr[Boolean],
      versionDescriptor: js.UndefOr[GitVersionDescriptor]
    ): js.Promise[js.Array[GitItem]] = js.native
    def getItemsBatch(requestData: GitItemRequestData, repositoryId: String): js.Promise[js.Array[js.Array[GitItem]]] = js.native
    def getItemsBatch(requestData: GitItemRequestData, repositoryId: String, project: String): js.Promise[js.Array[js.Array[GitItem]]] = js.native
    def getLikes(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[js.Array[IdentityRef]] = js.native
    def getLikes(repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double, project: String): js.Promise[js.Array[IdentityRef]] = js.native
    def getMergeBases(repositoryNameOrId: String, commitId: String, otherCommitId: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(repositoryNameOrId: String, commitId: String, otherCommitId: String, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: String,
      otherCollectionId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getMergeBases(
      repositoryNameOrId: String,
      commitId: String,
      otherCommitId: String,
      project: String,
      otherCollectionId: String,
      otherRepositoryId: String
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequest(
      repositoryId: String,
      pullRequestId: Double,
      project: js.UndefOr[String],
      maxCommentLength: js.UndefOr[Double],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      includeCommits: js.UndefOr[Boolean],
      includeWorkItemRefs: js.UndefOr[Boolean]
    ): js.Promise[GitPullRequest] = js.native
    def getPullRequestById(pullRequestId: Double): js.Promise[GitPullRequest] = js.native
    def getPullRequestCommits(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequestCommits(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequestConflict(repositoryId: String, pullRequestId: Double, conflictId: Double): js.Promise[GitConflict] = js.native
    def getPullRequestConflict(repositoryId: String, pullRequestId: Double, conflictId: Double, project: String): js.Promise[GitConflict] = js.native
    def getPullRequestConflicts(
      repositoryId: String,
      pullRequestId: Double,
      project: js.UndefOr[String],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double],
      includeObsolete: js.UndefOr[Boolean],
      excludeResolved: js.UndefOr[Boolean],
      onlyResolved: js.UndefOr[Boolean]
    ): js.Promise[js.Array[GitConflict]] = js.native
    def getPullRequestIteration(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[GitPullRequestIteration] = js.native
    def getPullRequestIteration(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[GitPullRequestIteration] = js.native
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String, top: Double): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Double,
      skip: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationChanges(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String,
      top: Double,
      skip: Double,
      compareTo: Double
    ): js.Promise[GitPullRequestIterationChanges] = js.native
    def getPullRequestIterationCommits(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequestIterationCommits(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPullRequestIterationStatus(repositoryId: String, pullRequestId: Double, iterationId: Double, statusId: Double): js.Promise[GitPullRequestStatus] = js.native
    def getPullRequestIterationStatus(
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      statusId: Double,
      project: String
    ): js.Promise[GitPullRequestStatus] = js.native
    def getPullRequestIterationStatuses(repositoryId: String, pullRequestId: Double, iterationId: Double): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    def getPullRequestIterationStatuses(repositoryId: String, pullRequestId: Double, iterationId: Double, project: String): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    def getPullRequestIterations(repositoryId: String, pullRequestId: Double, project: String, includeCommits: Boolean): js.Promise[js.Array[GitPullRequestIteration]] = js.native
    def getPullRequestLabel(repositoryId: String, pullRequestId: Double, labelIdOrName: String): js.Promise[WebApiTagDefinition] = js.native
    def getPullRequestLabel(repositoryId: String, pullRequestId: Double, labelIdOrName: String, project: String): js.Promise[WebApiTagDefinition] = js.native
    def getPullRequestLabel(
      repositoryId: String,
      pullRequestId: Double,
      labelIdOrName: String,
      project: String,
      projectId: String
    ): js.Promise[WebApiTagDefinition] = js.native
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    def getPullRequestLabels(repositoryId: String, pullRequestId: Double, project: String, projectId: String): js.Promise[js.Array[WebApiTagDefinition]] = js.native
    def getPullRequestProperties(repositoryId: String, pullRequestId: Double): js.Promise[_] = js.native
    def getPullRequestProperties(repositoryId: String, pullRequestId: Double, project: String): js.Promise[_] = js.native
    def getPullRequestQuery(queries: GitPullRequestQuery, repositoryId: String): js.Promise[GitPullRequestQuery] = js.native
    def getPullRequestQuery(queries: GitPullRequestQuery, repositoryId: String, project: String): js.Promise[GitPullRequestQuery] = js.native
    def getPullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String): js.Promise[IdentityRefWithVote] = js.native
    def getPullRequestReviewer(repositoryId: String, pullRequestId: Double, reviewerId: String, project: String): js.Promise[IdentityRefWithVote] = js.native
    def getPullRequestReviewers(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    def getPullRequestReviewers(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[IdentityRefWithVote]] = js.native
    def getPullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double): js.Promise[GitPullRequestStatus] = js.native
    def getPullRequestStatus(repositoryId: String, pullRequestId: Double, statusId: Double, project: String): js.Promise[GitPullRequestStatus] = js.native
    def getPullRequestStatuses(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    def getPullRequestStatuses(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitPullRequestStatus]] = js.native
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double, project: String): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(repositoryId: String, pullRequestId: Double, threadId: Double, project: String, iteration: Double): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestThread(
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: String,
      iteration: Double,
      baseIteration: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def getPullRequestWorkItems(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getPullRequestWorkItems(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[AssociatedWorkItem]] = js.native
    def getPullRequests(repositoryId: String, searchCriteria: GitPullRequestSearchCriteria): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(repositoryId: String, searchCriteria: GitPullRequestSearchCriteria, project: String): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequests(
      repositoryId: String,
      searchCriteria: GitPullRequestSearchCriteria,
      project: String,
      maxCommentLength: Double,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(project: String, searchCriteria: GitPullRequestSearchCriteria): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(project: String, searchCriteria: GitPullRequestSearchCriteria, maxCommentLength: Double): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Double,
      skip: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPullRequestsByProject(
      project: String,
      searchCriteria: GitPullRequestSearchCriteria,
      maxCommentLength: Double,
      skip: Double,
      top: Double
    ): js.Promise[js.Array[GitPullRequest]] = js.native
    def getPush(repositoryId: String, pushId: Double): js.Promise[GitPush] = js.native
    def getPush(repositoryId: String, pushId: Double, project: String): js.Promise[GitPush] = js.native
    def getPush(repositoryId: String, pushId: Double, project: String, includeCommits: Double): js.Promise[GitPush] = js.native
    def getPush(
      repositoryId: String,
      pushId: Double,
      project: String,
      includeCommits: Double,
      includeRefUpdates: Boolean
    ): js.Promise[GitPush] = js.native
    def getPushCommits(repositoryId: String, pushId: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String, top: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(repositoryId: String, pushId: Double, project: String, top: Double, skip: Double): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushCommits(
      repositoryId: String,
      pushId: Double,
      project: String,
      top: Double,
      skip: Double,
      includeLinks: Boolean
    ): js.Promise[js.Array[GitCommitRef]] = js.native
    def getPushes(repositoryId: String): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String, skip: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(repositoryId: String, project: String, skip: Double, top: Double): js.Promise[js.Array[GitPush]] = js.native
    def getPushes(
      repositoryId: String,
      project: String,
      skip: Double,
      top: Double,
      searchCriteria: GitPushSearchCriteria
    ): js.Promise[js.Array[GitPush]] = js.native
    def getRefFavorite(project: String, favoriteId: Double): js.Promise[GitRefFavorite] = js.native
    def getRefFavorites(project: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    def getRefFavorites(project: String, repositoryId: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    def getRefFavorites(project: String, repositoryId: String, identityId: String): js.Promise[js.Array[GitRefFavorite]] = js.native
    def getRefs(repositoryId: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String, filter: String): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(repositoryId: String, project: String, filter: String, includeLinks: Boolean): js.Promise[js.Array[GitRef]] = js.native
    def getRefs(
      repositoryId: String,
      project: String,
      filter: String,
      includeLinks: Boolean,
      latestStatusesOnly: Boolean
    ): js.Promise[js.Array[GitRef]] = js.native
    def getRepositories(): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean, includeAllUrls: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepositories(project: String, includeLinks: Boolean, includeAllUrls: Boolean, includeHidden: Boolean): js.Promise[js.Array[GitRepository]] = js.native
    def getRepository(repositoryId: String): js.Promise[GitRepository] = js.native
    def getRepository(repositoryId: String, project: String): js.Promise[GitRepository] = js.native
    def getRepository(repositoryId: String, project: String, includeParent: Boolean): js.Promise[GitRepository] = js.native
    def getRevert(project: String, revertId: Double, repositoryId: String): js.Promise[GitRevert] = js.native
    def getRevertForRefName(project: String, repositoryId: String, refName: String): js.Promise[GitRevert] = js.native
    def getStatuses(commitId: String, repositoryId: String): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String, top: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(commitId: String, repositoryId: String, project: String, top: Double, skip: Double): js.Promise[js.Array[GitStatus]] = js.native
    def getStatuses(
      commitId: String,
      repositoryId: String,
      project: String,
      top: Double,
      skip: Double,
      latestOnly: Boolean
    ): js.Promise[js.Array[GitStatus]] = js.native
    def getSuggestions(repositoryId: String): js.Promise[js.Array[GitSuggestion]] = js.native
    def getSuggestions(repositoryId: String, project: String): js.Promise[js.Array[GitSuggestion]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double, project: String): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(repositoryId: String, pullRequestId: Double, project: String, iteration: Double): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getThreads(
      repositoryId: String,
      pullRequestId: Double,
      project: String,
      iteration: Double,
      baseIteration: Double
    ): js.Promise[js.Array[GitPullRequestCommentThread]] = js.native
    def getTree(repositoryId: String, sha1: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String, projectId: String): js.Promise[GitTreeRef] = js.native
    def getTree(repositoryId: String, sha1: String, project: String, projectId: String, recursive: Boolean): js.Promise[GitTreeRef] = js.native
    def getTree(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: String,
      recursive: Boolean,
      fileName: String
    ): js.Promise[GitTreeRef] = js.native
    def getTreeZip(repositoryId: String, sha1: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String, projectId: String): js.Promise[ReadableStream] = js.native
    def getTreeZip(repositoryId: String, sha1: String, project: String, projectId: String, recursive: Boolean): js.Promise[ReadableStream] = js.native
    def getTreeZip(
      repositoryId: String,
      sha1: String,
      project: String,
      projectId: String,
      recursive: Boolean,
      fileName: String
    ): js.Promise[ReadableStream] = js.native
    def queryImportRequests(project: String, repositoryId: String): js.Promise[js.Array[GitImportRequest]] = js.native
    def queryImportRequests(project: String, repositoryId: String, includeAbandoned: Boolean): js.Promise[js.Array[GitImportRequest]] = js.native
    def sharePullRequest(userMessage: ShareNotificationContext, repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def sharePullRequest(
      userMessage: ShareNotificationContext,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    def updateComment(comment: Comment, repositoryId: String, pullRequestId: Double, threadId: Double, commentId: Double): js.Promise[Comment] = js.native
    def updateComment(
      comment: Comment,
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      commentId: Double,
      project: String
    ): js.Promise[Comment] = js.native
    def updateImportRequest(
      importRequestToUpdate: GitImportRequest,
      project: String,
      repositoryId: String,
      importRequestId: Double
    ): js.Promise[GitImportRequest] = js.native
    def updatePullRequest(gitPullRequestToUpdate: GitPullRequest, repositoryId: String, pullRequestId: Double): js.Promise[GitPullRequest] = js.native
    def updatePullRequest(
      gitPullRequestToUpdate: GitPullRequest,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[GitPullRequest] = js.native
    def updatePullRequestConflict(conflict: GitConflict, repositoryId: String, pullRequestId: Double, conflictId: Double): js.Promise[GitConflict] = js.native
    def updatePullRequestConflict(
      conflict: GitConflict,
      repositoryId: String,
      pullRequestId: Double,
      conflictId: Double,
      project: String
    ): js.Promise[GitConflict] = js.native
    def updatePullRequestConflicts(conflictUpdates: js.Array[GitConflict], repositoryId: String, pullRequestId: Double): js.Promise[js.Array[GitConflictUpdateResult]] = js.native
    def updatePullRequestConflicts(
      conflictUpdates: js.Array[GitConflict],
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[js.Array[GitConflictUpdateResult]] = js.native
    def updatePullRequestIterationStatuses(
      customHeaders: js.Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double
    ): js.Promise[Unit] = js.native
    def updatePullRequestIterationStatuses(
      customHeaders: js.Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      iterationId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    def updatePullRequestProperties(
      customHeaders: js.Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double
    ): js.Promise[_] = js.native
    def updatePullRequestProperties(
      customHeaders: js.Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[_] = js.native
    def updatePullRequestReviewers(patchVotes: js.Array[IdentityRefWithVote], repositoryId: String, pullRequestId: Double): js.Promise[Unit] = js.native
    def updatePullRequestReviewers(
      patchVotes: js.Array[IdentityRefWithVote],
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    def updatePullRequestStatuses(
      customHeaders: js.Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double
    ): js.Promise[Unit] = js.native
    def updatePullRequestStatuses(
      customHeaders: js.Any,
      patchDocument: JsonPatchDocument,
      repositoryId: String,
      pullRequestId: Double,
      project: String
    ): js.Promise[Unit] = js.native
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String): js.Promise[GitRef] = js.native
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String, project: String): js.Promise[GitRef] = js.native
    def updateRef(newRefInfo: GitRefUpdate, repositoryId: String, filter: String, project: String, projectId: String): js.Promise[GitRef] = js.native
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String, project: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    def updateRefs(refUpdates: js.Array[GitRefUpdate], repositoryId: String, project: String, projectId: String): js.Promise[js.Array[GitRefUpdateResult]] = js.native
    def updateRepository(newRepositoryInfo: GitRepository, repositoryId: String): js.Promise[GitRepository] = js.native
    def updateRepository(newRepositoryInfo: GitRepository, repositoryId: String, project: String): js.Promise[GitRepository] = js.native
    def updateThread(
      commentThread: GitPullRequestCommentThread,
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double
    ): js.Promise[GitPullRequestCommentThread] = js.native
    def updateThread(
      commentThread: GitPullRequestCommentThread,
      repositoryId: String,
      pullRequestId: Double,
      threadId: Double,
      project: String
    ): js.Promise[GitPullRequestCommentThread] = js.native
  }
  
  /* static members */
  @js.native
  object GitApi extends js.Object {
    val RESOURCE_AREA_ID: String = js.native
  }
  
}

