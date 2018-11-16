package typings
package vsoDashNodeDashApiLib.gitapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGitApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createAnnotatedTag(
    tagObject: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAnnotatedTag,
    project: java.lang.String,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAnnotatedTag] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    fileName: java.lang.String,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Attachment] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    fileName: java.lang.String,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Attachment] = js.native
  def createCherryPick(
    cherryPickToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationParameters,
    project: java.lang.String,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCherryPick] = js.native
  def createComment(
    comment: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment] = js.native
  def createComment(
    comment: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment] = js.native
  def createCommitStatus(
    gitCommitStatusToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus,
    commitId: java.lang.String,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus] = js.native
  def createCommitStatus(
    gitCommitStatusToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus,
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus] = js.native
  def createFavorite(
    favorite: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefFavorite,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefFavorite] = js.native
  def createForkSyncRequest(
    syncParams: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequestParameters,
    repositoryNameOrId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest] = js.native
  def createForkSyncRequest(
    syncParams: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequestParameters,
    repositoryNameOrId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest] = js.native
  def createForkSyncRequest(
    syncParams: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequestParameters,
    repositoryNameOrId: java.lang.String,
    project: java.lang.String,
    includeLinks: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest] = js.native
  def createImportRequest(
    importRequest: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest,
    project: java.lang.String,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest] = js.native
  def createLike(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def createLike(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def createPullRequest(
    gitPullRequestToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def createPullRequest(
    gitPullRequestToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def createPullRequest(
    gitPullRequestToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest,
    repositoryId: java.lang.String,
    project: java.lang.String,
    supportsIterations: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def createPullRequestIterationStatus(
    status: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def createPullRequestIterationStatus(
    status: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def createPullRequestLabel(
    label: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiCreateTagRequestData,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition] = js.native
  def createPullRequestLabel(
    label: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiCreateTagRequestData,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition] = js.native
  def createPullRequestLabel(
    label: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiCreateTagRequestData,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition] = js.native
  def createPullRequestReviewer(
    reviewer: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    reviewerId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote] = js.native
  def createPullRequestReviewer(
    reviewer: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    reviewerId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote] = js.native
  def createPullRequestReviewers(
    reviewers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef],
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote]] = js.native
  def createPullRequestReviewers(
    reviewers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef],
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote]] = js.native
  def createPullRequestStatus(
    status: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def createPullRequestStatus(
    status: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def createPush(push: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush, repositoryId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush] = js.native
  def createPush(
    push: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush] = js.native
  def createRepository(gitRepositoryToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepositoryCreateOptions): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def createRepository(
    gitRepositoryToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepositoryCreateOptions,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def createRepository(
    gitRepositoryToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepositoryCreateOptions,
    project: java.lang.String,
    sourceRef: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def createRevert(
    revertToCreate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncRefOperationParameters,
    project: java.lang.String,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRevert] = js.native
  def createThread(
    commentThread: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def createThread(
    commentThread: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def deleteAttachment(fileName: java.lang.String, repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteAttachment(
    fileName: java.lang.String,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteComment(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteComment(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteLike(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteLike(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestIterationStatus(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    statusId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestIterationStatus(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    statusId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestLabels(repositoryId: java.lang.String, pullRequestId: scala.Double, labelIdOrName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestLabels(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    labelIdOrName: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestLabels(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    labelIdOrName: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestReviewer(repositoryId: java.lang.String, pullRequestId: scala.Double, reviewerId: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestReviewer(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    reviewerId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestStatus(repositoryId: java.lang.String, pullRequestId: scala.Double, statusId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deletePullRequestStatus(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    statusId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteRefFavorite(project: java.lang.String, favoriteId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteRepository(repositoryId: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteRepository(repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def getAnnotatedTag(project: java.lang.String, repositoryId: java.lang.String, objectId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAnnotatedTag] = js.native
  def getAttachmentContent(fileName: java.lang.String, repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentContent(
    fileName: java.lang.String,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentZip(fileName: java.lang.String, repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentZip(
    fileName: java.lang.String,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachments(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Attachment]] = js.native
  def getAttachments(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Attachment]] = js.native
  def getBlob(repositoryId: java.lang.String, sha1: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBlobRef] = js.native
  def getBlob(repositoryId: java.lang.String, sha1: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBlobRef] = js.native
  def getBlob(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    download: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBlobRef] = js.native
  def getBlob(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    download: scala.Boolean,
    fileName: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBlobRef] = js.native
  def getBlobContent(repositoryId: java.lang.String, sha1: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobContent(repositoryId: java.lang.String, sha1: java.lang.String, project: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobContent(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    download: scala.Boolean
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobContent(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    download: scala.Boolean,
    fileName: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobZip(repositoryId: java.lang.String, sha1: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobZip(repositoryId: java.lang.String, sha1: java.lang.String, project: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobZip(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    download: scala.Boolean
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobZip(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    download: scala.Boolean,
    fileName: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobsZip(blobIds: js.Array[java.lang.String], repositoryId: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobsZip(blobIds: js.Array[java.lang.String], repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBlobsZip(
    blobIds: js.Array[java.lang.String],
    repositoryId: java.lang.String,
    project: java.lang.String,
    filename: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBranch(repositoryId: java.lang.String, name: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats] = js.native
  def getBranch(repositoryId: java.lang.String, name: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats] = js.native
  def getBranch(
    repositoryId: java.lang.String,
    name: java.lang.String,
    project: java.lang.String,
    baseVersionDescriptor: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats] = js.native
  def getBranchStatsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryBranchStatsCriteria,
    repositoryId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats]] = js.native
  def getBranchStatsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryBranchStatsCriteria,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats]] = js.native
  def getBranches(repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats]] = js.native
  def getBranches(repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats]] = js.native
  def getBranches(
    repositoryId: java.lang.String,
    project: java.lang.String,
    baseVersionDescriptor: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitBranchStats]] = js.native
  def getChanges(commitId: java.lang.String, repositoryId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitChanges] = js.native
  def getChanges(commitId: java.lang.String, repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitChanges] = js.native
  def getChanges(
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String,
    top: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitChanges] = js.native
  def getChanges(
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitChanges] = js.native
  def getCherryPick(project: java.lang.String, cherryPickId: scala.Double, repositoryId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCherryPick] = js.native
  def getCherryPickForRefName(project: java.lang.String, repositoryId: java.lang.String, refName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCherryPick] = js.native
  def getCherryPickRelationships(repositoryNameOrId: java.lang.String, commitId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCherryPickRelationships(repositoryNameOrId: java.lang.String, commitId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCherryPickRelationships(
    repositoryNameOrId: java.lang.String,
    commitId: java.lang.String,
    project: java.lang.String,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getComment(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment] = js.native
  def getComment(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment] = js.native
  def getComments(repositoryId: java.lang.String, pullRequestId: scala.Double, threadId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment]] = js.native
  def getComments(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment]] = js.native
  def getCommit(commitId: java.lang.String, repositoryId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommit] = js.native
  def getCommit(commitId: java.lang.String, repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommit] = js.native
  def getCommit(
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String,
    changeCount: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommit] = js.native
  def getCommits(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommits(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommits(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    project: java.lang.String,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommits(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommitsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    repositoryId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommitsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommitsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    repositoryId: java.lang.String,
    project: java.lang.String,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommitsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    repositoryId: java.lang.String,
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getCommitsBatch(
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitQueryCommitsCriteria,
    repositoryId: java.lang.String,
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double,
    includeStatuses: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getDeletedRepositories(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitDeletedRepository]] = js.native
  def getForkSyncRequest(repositoryNameOrId: java.lang.String, forkSyncOperationId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest] = js.native
  def getForkSyncRequest(repositoryNameOrId: java.lang.String, forkSyncOperationId: scala.Double, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest] = js.native
  def getForkSyncRequest(
    repositoryNameOrId: java.lang.String,
    forkSyncOperationId: scala.Double,
    project: java.lang.String,
    includeLinks: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest] = js.native
  def getForkSyncRequests(repositoryNameOrId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest]] = js.native
  def getForkSyncRequests(repositoryNameOrId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest]] = js.native
  def getForkSyncRequests(repositoryNameOrId: java.lang.String, project: java.lang.String, includeAbandoned: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest]] = js.native
  def getForkSyncRequests(
    repositoryNameOrId: java.lang.String,
    project: java.lang.String,
    includeAbandoned: scala.Boolean,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitForkSyncRequest]] = js.native
  def getForks(repositoryNameOrId: java.lang.String, collectionId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepositoryRef]] = js.native
  def getForks(repositoryNameOrId: java.lang.String, collectionId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepositoryRef]] = js.native
  def getForks(
    repositoryNameOrId: java.lang.String,
    collectionId: java.lang.String,
    project: java.lang.String,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepositoryRef]] = js.native
  def getImportRequest(project: java.lang.String, repositoryId: java.lang.String, importRequestId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest] = js.native
  def getItem(
    repositoryId: java.lang.String,
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType],
    includeContentMetadata: js.UndefOr[scala.Boolean],
    latestProcessedChange: js.UndefOr[scala.Boolean],
    download: js.UndefOr[scala.Boolean],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitItem] = js.native
  def getItemContent(
    repositoryId: java.lang.String,
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType],
    includeContentMetadata: js.UndefOr[scala.Boolean],
    latestProcessedChange: js.UndefOr[scala.Boolean],
    download: js.UndefOr[scala.Boolean],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor]
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemText(
    repositoryId: java.lang.String,
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType],
    includeContentMetadata: js.UndefOr[scala.Boolean],
    latestProcessedChange: js.UndefOr[scala.Boolean],
    download: js.UndefOr[scala.Boolean],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor]
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItemZip(
    repositoryId: java.lang.String,
    path: java.lang.String,
    project: js.UndefOr[java.lang.String],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType],
    includeContentMetadata: js.UndefOr[scala.Boolean],
    latestProcessedChange: js.UndefOr[scala.Boolean],
    download: js.UndefOr[scala.Boolean],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor]
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getItems(
    repositoryId: java.lang.String,
    project: js.UndefOr[java.lang.String],
    scopePath: js.UndefOr[java.lang.String],
    recursionLevel: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType],
    includeContentMetadata: js.UndefOr[scala.Boolean],
    latestProcessedChange: js.UndefOr[scala.Boolean],
    download: js.UndefOr[scala.Boolean],
    includeLinks: js.UndefOr[scala.Boolean],
    versionDescriptor: js.UndefOr[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitVersionDescriptor]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitItem]] = js.native
  def getItemsBatch(
    requestData: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitItemRequestData,
    repositoryId: java.lang.String
  ): stdLib.Promise[js.Array[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitItem]]] = js.native
  def getItemsBatch(
    requestData: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitItemRequestData,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[js.Array[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitItem]]] = js.native
  def getLikes(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getLikes(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef]] = js.native
  def getMergeBases(repositoryNameOrId: java.lang.String, commitId: java.lang.String, otherCommitId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getMergeBases(
    repositoryNameOrId: java.lang.String,
    commitId: java.lang.String,
    otherCommitId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getMergeBases(
    repositoryNameOrId: java.lang.String,
    commitId: java.lang.String,
    otherCommitId: java.lang.String,
    project: java.lang.String,
    otherCollectionId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getMergeBases(
    repositoryNameOrId: java.lang.String,
    commitId: java.lang.String,
    otherCommitId: java.lang.String,
    project: java.lang.String,
    otherCollectionId: java.lang.String,
    otherRepositoryId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPullRequest(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: js.UndefOr[java.lang.String],
    maxCommentLength: js.UndefOr[scala.Double],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    includeCommits: js.UndefOr[scala.Boolean],
    includeWorkItemRefs: js.UndefOr[scala.Boolean]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def getPullRequestById(pullRequestId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def getPullRequestCommits(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPullRequestCommits(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPullRequestConflict(repositoryId: java.lang.String, pullRequestId: scala.Double, conflictId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict] = js.native
  def getPullRequestConflict(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    conflictId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict] = js.native
  def getPullRequestConflicts(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: js.UndefOr[java.lang.String],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double],
    includeObsolete: js.UndefOr[scala.Boolean],
    excludeResolved: js.UndefOr[scala.Boolean],
    onlyResolved: js.UndefOr[scala.Boolean]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict]] = js.native
  def getPullRequestIteration(repositoryId: java.lang.String, pullRequestId: scala.Double, iterationId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIteration] = js.native
  def getPullRequestIteration(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIteration] = js.native
  def getPullRequestIterationChanges(repositoryId: java.lang.String, pullRequestId: scala.Double, iterationId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIterationChanges] = js.native
  def getPullRequestIterationChanges(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIterationChanges] = js.native
  def getPullRequestIterationChanges(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String,
    top: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIterationChanges] = js.native
  def getPullRequestIterationChanges(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIterationChanges] = js.native
  def getPullRequestIterationChanges(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double,
    compareTo: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIterationChanges] = js.native
  def getPullRequestIterationCommits(repositoryId: java.lang.String, pullRequestId: scala.Double, iterationId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPullRequestIterationCommits(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPullRequestIterationStatus(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    statusId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def getPullRequestIterationStatus(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    statusId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def getPullRequestIterationStatuses(repositoryId: java.lang.String, pullRequestId: scala.Double, iterationId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus]] = js.native
  def getPullRequestIterationStatuses(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus]] = js.native
  def getPullRequestIterations(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIteration]
  ] = js.native
  def getPullRequestIterations(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIteration]
  ] = js.native
  def getPullRequestIterations(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String,
    includeCommits: scala.Boolean
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestIteration]
  ] = js.native
  def getPullRequestLabel(repositoryId: java.lang.String, pullRequestId: scala.Double, labelIdOrName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition] = js.native
  def getPullRequestLabel(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    labelIdOrName: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition] = js.native
  def getPullRequestLabel(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    labelIdOrName: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition] = js.native
  def getPullRequestLabels(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition]] = js.native
  def getPullRequestLabels(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition]] = js.native
  def getPullRequestLabels(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.WebApiTagDefinition]] = js.native
  def getPullRequestProperties(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[_] = js.native
  def getPullRequestProperties(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[_] = js.native
  def getPullRequestQuery(
    queries: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQuery,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQuery] = js.native
  def getPullRequestQuery(
    queries: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQuery,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestQuery] = js.native
  def getPullRequestReviewer(repositoryId: java.lang.String, pullRequestId: scala.Double, reviewerId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote] = js.native
  def getPullRequestReviewer(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    reviewerId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote] = js.native
  def getPullRequestReviewers(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote]] = js.native
  def getPullRequestReviewers(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote]] = js.native
  def getPullRequestStatus(repositoryId: java.lang.String, pullRequestId: scala.Double, statusId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def getPullRequestStatus(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    statusId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus] = js.native
  def getPullRequestStatuses(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus]] = js.native
  def getPullRequestStatuses(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestStatus]] = js.native
  def getPullRequestThread(repositoryId: java.lang.String, pullRequestId: scala.Double, threadId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def getPullRequestThread(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def getPullRequestThread(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    project: java.lang.String,
    iteration: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def getPullRequestThread(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    project: java.lang.String,
    iteration: scala.Double,
    baseIteration: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def getPullRequestWorkItems(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.AssociatedWorkItem]] = js.native
  def getPullRequestWorkItems(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.AssociatedWorkItem]] = js.native
  def getPullRequests(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequests(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequests(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    project: java.lang.String,
    maxCommentLength: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequests(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    project: java.lang.String,
    maxCommentLength: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequests(
    repositoryId: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    project: java.lang.String,
    maxCommentLength: scala.Double,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequestsByProject(
    project: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequestsByProject(
    project: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    maxCommentLength: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequestsByProject(
    project: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    maxCommentLength: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPullRequestsByProject(
    project: java.lang.String,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestSearchCriteria,
    maxCommentLength: scala.Double,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest]] = js.native
  def getPush(repositoryId: java.lang.String, pushId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush] = js.native
  def getPush(repositoryId: java.lang.String, pushId: scala.Double, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush] = js.native
  def getPush(
    repositoryId: java.lang.String,
    pushId: scala.Double,
    project: java.lang.String,
    includeCommits: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush] = js.native
  def getPush(
    repositoryId: java.lang.String,
    pushId: scala.Double,
    project: java.lang.String,
    includeCommits: scala.Double,
    includeRefUpdates: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush] = js.native
  def getPushCommits(repositoryId: java.lang.String, pushId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPushCommits(repositoryId: java.lang.String, pushId: scala.Double, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPushCommits(repositoryId: java.lang.String, pushId: scala.Double, project: java.lang.String, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPushCommits(
    repositoryId: java.lang.String,
    pushId: scala.Double,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPushCommits(
    repositoryId: java.lang.String,
    pushId: scala.Double,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitCommitRef]] = js.native
  def getPushes(repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush]] = js.native
  def getPushes(repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush]] = js.native
  def getPushes(repositoryId: java.lang.String, project: java.lang.String, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush]] = js.native
  def getPushes(repositoryId: java.lang.String, project: java.lang.String, skip: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush]] = js.native
  def getPushes(
    repositoryId: java.lang.String,
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double,
    searchCriteria: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPushSearchCriteria
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPush]] = js.native
  def getRefFavorite(project: java.lang.String, favoriteId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefFavorite] = js.native
  def getRefFavorites(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefFavorite]] = js.native
  def getRefFavorites(project: java.lang.String, repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefFavorite]] = js.native
  def getRefFavorites(project: java.lang.String, repositoryId: java.lang.String, identityId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefFavorite]] = js.native
  def getRefs(repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef]] = js.native
  def getRefs(repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef]] = js.native
  def getRefs(repositoryId: java.lang.String, project: java.lang.String, filter: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef]] = js.native
  def getRefs(
    repositoryId: java.lang.String,
    project: java.lang.String,
    filter: java.lang.String,
    includeLinks: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef]] = js.native
  def getRefs(
    repositoryId: java.lang.String,
    project: java.lang.String,
    filter: java.lang.String,
    includeLinks: scala.Boolean,
    latestStatusesOnly: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef]] = js.native
  def getRepositories(): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository]] = js.native
  def getRepositories(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository]] = js.native
  def getRepositories(project: java.lang.String, includeLinks: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository]] = js.native
  def getRepositories(project: java.lang.String, includeLinks: scala.Boolean, includeAllUrls: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository]] = js.native
  def getRepositories(
    project: java.lang.String,
    includeLinks: scala.Boolean,
    includeAllUrls: scala.Boolean,
    includeHidden: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository]] = js.native
  def getRepository(repositoryId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def getRepository(repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def getRepository(repositoryId: java.lang.String, project: java.lang.String, includeParent: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def getRevert(project: java.lang.String, revertId: scala.Double, repositoryId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRevert] = js.native
  def getRevertForRefName(project: java.lang.String, repositoryId: java.lang.String, refName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRevert] = js.native
  def getStatuses(commitId: java.lang.String, repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus]] = js.native
  def getStatuses(commitId: java.lang.String, repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus]] = js.native
  def getStatuses(
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus]] = js.native
  def getStatuses(
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus]] = js.native
  def getStatuses(
    commitId: java.lang.String,
    repositoryId: java.lang.String,
    project: java.lang.String,
    top: scala.Double,
    skip: scala.Double,
    latestOnly: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitStatus]] = js.native
  def getSuggestions(repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitSuggestion]] = js.native
  def getSuggestions(repositoryId: java.lang.String, project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitSuggestion]] = js.native
  def getThreads(repositoryId: java.lang.String, pullRequestId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread]
  ] = js.native
  def getThreads(repositoryId: java.lang.String, pullRequestId: scala.Double, project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread]
  ] = js.native
  def getThreads(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String,
    iteration: scala.Double
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread]
  ] = js.native
  def getThreads(
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String,
    iteration: scala.Double,
    baseIteration: scala.Double
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread]
  ] = js.native
  def getTree(repositoryId: java.lang.String, sha1: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitTreeRef] = js.native
  def getTree(repositoryId: java.lang.String, sha1: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitTreeRef] = js.native
  def getTree(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitTreeRef] = js.native
  def getTree(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String,
    recursive: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitTreeRef] = js.native
  def getTree(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String,
    recursive: scala.Boolean,
    fileName: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitTreeRef] = js.native
  def getTreeZip(repositoryId: java.lang.String, sha1: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTreeZip(repositoryId: java.lang.String, sha1: java.lang.String, project: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTreeZip(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTreeZip(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String,
    recursive: scala.Boolean
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTreeZip(
    repositoryId: java.lang.String,
    sha1: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String,
    recursive: scala.Boolean,
    fileName: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def queryImportRequests(project: java.lang.String, repositoryId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest]] = js.native
  def queryImportRequests(project: java.lang.String, repositoryId: java.lang.String, includeAbandoned: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest]] = js.native
  def sharePullRequest(
    userMessage: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.ShareNotificationContext,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def sharePullRequest(
    userMessage: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.ShareNotificationContext,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updateComment(
    comment: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment] = js.native
  def updateComment(
    comment: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    commentId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.Comment] = js.native
  def updateImportRequest(
    importRequestToUpdate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest,
    project: java.lang.String,
    repositoryId: java.lang.String,
    importRequestId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitImportRequest] = js.native
  def updatePullRequest(
    gitPullRequestToUpdate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def updatePullRequest(
    gitPullRequestToUpdate: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequest] = js.native
  def updatePullRequestConflict(
    conflict: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    conflictId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict] = js.native
  def updatePullRequestConflict(
    conflict: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    conflictId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict] = js.native
  def updatePullRequestConflicts(
    conflictUpdates: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict],
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateResult]
  ] = js.native
  def updatePullRequestConflicts(
    conflictUpdates: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflict],
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitConflictUpdateResult]
  ] = js.native
  def updatePullRequestIterationStatuses(
    customHeaders: js.Any,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def updatePullRequestIterationStatuses(
    customHeaders: js.Any,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    iterationId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updatePullRequestProperties(
    customHeaders: js.Any,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[_] = js.native
  def updatePullRequestProperties(
    customHeaders: js.Any,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[_] = js.native
  def updatePullRequestReviewers(
    patchVotes: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote],
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def updatePullRequestReviewers(
    patchVotes: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.IdentityRefWithVote],
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updatePullRequestStatuses(
    customHeaders: js.Any,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def updatePullRequestStatuses(
    customHeaders: js.Any,
    patchDocument: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updateRef(
    newRefInfo: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdate,
    repositoryId: java.lang.String,
    filter: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef] = js.native
  def updateRef(
    newRefInfo: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdate,
    repositoryId: java.lang.String,
    filter: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef] = js.native
  def updateRef(
    newRefInfo: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdate,
    repositoryId: java.lang.String,
    filter: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRef] = js.native
  def updateRefs(
    refUpdates: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdate],
    repositoryId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateResult]] = js.native
  def updateRefs(
    refUpdates: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdate],
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateResult]] = js.native
  def updateRefs(
    refUpdates: js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdate],
    repositoryId: java.lang.String,
    project: java.lang.String,
    projectId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRefUpdateResult]] = js.native
  def updateRepository(
    newRepositoryInfo: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository,
    repositoryId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def updateRepository(
    newRepositoryInfo: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository,
    repositoryId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitRepository] = js.native
  def updateThread(
    commentThread: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
  def updateThread(
    commentThread: vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread,
    repositoryId: java.lang.String,
    pullRequestId: scala.Double,
    threadId: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitPullRequestCommentThread] = js.native
}

