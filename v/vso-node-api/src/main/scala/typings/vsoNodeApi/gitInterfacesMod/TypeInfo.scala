package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.anon.EnumValuesActive
import typings.vsoNodeApi.anon.EnumValuesAddAdd
import typings.vsoNodeApi.anon.EnumValuesAllOrNone
import typings.vsoNodeApi.anon.EnumValuesAndroidStudio
import typings.vsoNodeApi.anon.EnumValuesAsyncOperationNotFound
import typings.vsoNodeApi.anon.EnumValuesAttachment
import typings.vsoNodeApi.anon.EnumValuesAutoMerged
import typings.vsoNodeApi.anon.EnumValuesBad
import typings.vsoNodeApi.anon.EnumValuesBadRequest
import typings.vsoNodeApi.anon.EnumValuesBase64Encoded
import typings.vsoNodeApi.anon.EnumValuesBranch
import typings.vsoNodeApi.anon.EnumValuesCaseSensitive
import typings.vsoNodeApi.anon.EnumValuesChange
import typings.vsoNodeApi.anon.EnumValuesCodeChange
import typings.vsoNodeApi.anon.EnumValuesCommit
import typings.vsoNodeApi.anon.EnumValuesConflicts
import typings.vsoNodeApi.anon.EnumValuesContains
import typings.vsoNodeApi.anon.EnumValuesCreateBranchPermissionRequired
import typings.vsoNodeApi.anon.EnumValuesEncoding
import typings.vsoNodeApi.anon.EnumValuesFirstParent
import typings.vsoNodeApi.anon.EnumValuesFolder
import typings.vsoNodeApi.anon.EnumValuesForcePush
import typings.vsoNodeApi.anon.EnumValuesFull
import typings.vsoNodeApi.anon.EnumValuesInProgress_
import typings.vsoNodeApi.anon.EnumValuesInvalidPath
import typings.vsoNodeApi.anon.EnumValuesKeepBothFiles
import typings.vsoNodeApi.anon.EnumValuesKeepSourceDeleteTarget
import typings.vsoNodeApi.anon.EnumValuesNotApplicable
import typings.vsoNodeApi.anon.EnumValuesNotSet
import typings.vsoNodeApi.anon.EnumValuesPartiallyResolved
import typings.vsoNodeApi.anon.EnumValuesPickSourceAction
import typings.vsoNodeApi.anon.EnumValuesPrevious
import typings.vsoNodeApi.anon.EnumValuesPreviousChange
import typings.vsoNodeApi.anon.EnumValuesRename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/interfaces/GitInterfaces", "TypeInfo")
@js.native
object TypeInfo extends js.Object {
  var Attachment: js.Any = js.native
  var Change: js.Any = js.native
  var ChangeList: js.Any = js.native
  var Comment: js.Any = js.native
  var CommentThread: js.Any = js.native
  var CommentThreadStatus: EnumValuesActive = js.native
  var CommentType: EnumValuesCodeChange = js.native
  var GitAnnotatedTag: js.Any = js.native
  var GitAsyncOperationStatus: EnumValuesInProgress_ = js.native
  var GitAsyncRefOperation: js.Any = js.native
  var GitAsyncRefOperationDetail: js.Any = js.native
  var GitAsyncRefOperationFailureStatus: EnumValuesAsyncOperationNotFound = js.native
  var GitAsyncRefOperationParameters: js.Any = js.native
  var GitAsyncRefOperationSource: js.Any = js.native
  var GitBaseVersionDescriptor: js.Any = js.native
  var GitBranchStats: js.Any = js.native
  var GitChange: js.Any = js.native
  var GitCherryPick: js.Any = js.native
  var GitCommit: js.Any = js.native
  var GitCommitChanges: js.Any = js.native
  var GitCommitDiffs: js.Any = js.native
  var GitCommitRef: js.Any = js.native
  var GitCommitToCreate: js.Any = js.native
  var GitConflict: js.Any = js.native
  var GitConflictAddAdd: js.Any = js.native
  var GitConflictAddRename: js.Any = js.native
  var GitConflictDeleteEdit: js.Any = js.native
  var GitConflictDeleteRename: js.Any = js.native
  var GitConflictDirectoryFile: js.Any = js.native
  var GitConflictEditDelete: js.Any = js.native
  var GitConflictEditEdit: js.Any = js.native
  var GitConflictFileDirectory: js.Any = js.native
  var GitConflictRename1to2: js.Any = js.native
  var GitConflictRename2to1: js.Any = js.native
  var GitConflictRenameAdd: js.Any = js.native
  var GitConflictRenameDelete: js.Any = js.native
  var GitConflictRenameRename: js.Any = js.native
  var GitConflictType: EnumValuesAddAdd = js.native
  var GitConflictUpdateResult: js.Any = js.native
  var GitConflictUpdateStatus: EnumValuesBadRequest = js.native
  var GitDeletedRepository: js.Any = js.native
  var GitForkRef: js.Any = js.native
  var GitForkSyncRequest: js.Any = js.native
  var GitHistoryMode: EnumValuesFirstParent = js.native
  var GitImportFailedEvent: js.Any = js.native
  var GitImportRequest: js.Any = js.native
  var GitImportSucceededEvent: js.Any = js.native
  var GitItem: js.Any = js.native
  var GitItemDescriptor: js.Any = js.native
  var GitItemRequestData: js.Any = js.native
  var GitLastChangeTreeItems: js.Any = js.native
  var GitObject: js.Any = js.native
  var GitObjectType: EnumValuesBad = js.native
  var GitPathAction: js.Any = js.native
  var GitPathActions: EnumValuesRename = js.native
  var GitPathToItemsCollection: js.Any = js.native
  var GitPullRequest: js.Any = js.native
  var GitPullRequestChange: js.Any = js.native
  var GitPullRequestCommentThread: js.Any = js.native
  var GitPullRequestIteration: js.Any = js.native
  var GitPullRequestIterationChanges: js.Any = js.native
  var GitPullRequestQuery: js.Any = js.native
  var GitPullRequestQueryInput: js.Any = js.native
  var GitPullRequestQueryType: EnumValuesCommit = js.native
  var GitPullRequestReviewFileType: EnumValuesAttachment = js.native
  var GitPullRequestSearchCriteria: js.Any = js.native
  var GitPullRequestStatus: js.Any = js.native
  var GitPush: js.Any = js.native
  var GitPushEventData: js.Any = js.native
  var GitPushRef: js.Any = js.native
  var GitPushSearchCriteria: js.Any = js.native
  var GitQueryBranchStatsCriteria: js.Any = js.native
  var GitQueryCommitsCriteria: js.Any = js.native
  var GitQueryRefsCriteria: js.Any = js.native
  var GitRef: js.Any = js.native
  var GitRefFavorite: js.Any = js.native
  var GitRefSearchType: EnumValuesContains = js.native
  var GitRefUpdateMode: EnumValuesAllOrNone = js.native
  var GitRefUpdateResult: js.Any = js.native
  var GitRefUpdateStatus: EnumValuesCreateBranchPermissionRequired = js.native
  var GitRepository: js.Any = js.native
  var GitRepositoryCreateOptions: js.Any = js.native
  var GitRepositoryRef: js.Any = js.native
  var GitResolutionError: EnumValuesInvalidPath = js.native
  var GitResolutionMergeContent: js.Any = js.native
  var GitResolutionMergeType: EnumValuesAutoMerged = js.native
  var GitResolutionPathConflict: js.Any = js.native
  var GitResolutionPathConflictAction: EnumValuesKeepSourceDeleteTarget = js.native
  var GitResolutionPickOneAction: js.Any = js.native
  var GitResolutionRename1to2: js.Any = js.native
  var GitResolutionRename1to2Action: EnumValuesKeepBothFiles = js.native
  var GitResolutionStatus: EnumValuesPartiallyResolved = js.native
  var GitResolutionWhichAction: EnumValuesPickSourceAction = js.native
  var GitRevert: js.Any = js.native
  var GitStatus: js.Any = js.native
  var GitStatusState: EnumValuesNotApplicable = js.native
  var GitTargetVersionDescriptor: js.Any = js.native
  var GitTreeDiff: js.Any = js.native
  var GitTreeDiffEntry: js.Any = js.native
  var GitTreeDiffResponse: js.Any = js.native
  var GitTreeEntryRef: js.Any = js.native
  var GitTreeRef: js.Any = js.native
  var GitUserDate: js.Any = js.native
  var GitVersionDescriptor: js.Any = js.native
  var GitVersionOptions: EnumValuesPreviousChange = js.native
  var GitVersionType: EnumValuesBranch = js.native
  var HistoryEntry: js.Any = js.native
  var IncludedGitCommit: js.Any = js.native
  var ItemContent: js.Any = js.native
  var ItemContentType: EnumValuesBase64Encoded = js.native
  var ItemDetailsOptions: js.Any = js.native
  var IterationReason: EnumValuesForcePush = js.native
  var PullRequestAsyncStatus: EnumValuesConflicts = js.native
  var PullRequestMergeFailureType: EnumValuesCaseSensitive = js.native
  var PullRequestStatus: EnumValuesNotSet = js.native
  var RefFavoriteType: EnumValuesFolder = js.native
  var SupportedIde: js.Any = js.native
  var SupportedIdeType: EnumValuesAndroidStudio = js.native
  var TfvcBranch: js.Any = js.native
  var TfvcBranchRef: js.Any = js.native
  var TfvcChange: js.Any = js.native
  var TfvcChangeset: js.Any = js.native
  var TfvcChangesetRef: js.Any = js.native
  var TfvcCheckinEventData: js.Any = js.native
  var TfvcHistoryEntry: js.Any = js.native
  var TfvcItem: js.Any = js.native
  var TfvcItemDescriptor: js.Any = js.native
  var TfvcItemRequestData: js.Any = js.native
  var TfvcLabel: js.Any = js.native
  var TfvcLabelRef: js.Any = js.native
  var TfvcShelveset: js.Any = js.native
  var TfvcShelvesetRef: js.Any = js.native
  var TfvcVersionDescriptor: js.Any = js.native
  var TfvcVersionOption: EnumValuesPrevious = js.native
  var TfvcVersionType: EnumValuesChange = js.native
  var UpdateRefsRequest: js.Any = js.native
  var VersionControlChangeType: EnumValuesEncoding = js.native
  var VersionControlProjectInfo: js.Any = js.native
  var VersionControlRecursionType: EnumValuesFull = js.native
}

