package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttachmentChange extends js.Object {
  var Attachment: js.Any
  var Change: js.Any
  var ChangeList: js.Any
  var Comment: js.Any
  var CommentThread: js.Any
  var CommentThreadStatus: Anon_EnumValuesAnonActive
  var CommentType: Anon_EnumValuesAnonCodeChange
  var GitAnnotatedTag: js.Any
  var GitAsyncOperationStatus: Anon_EnumValuesAnonAbandonedCompleted
  var GitAsyncRefOperation: js.Any
  var GitAsyncRefOperationDetail: js.Any
  var GitAsyncRefOperationFailureStatus: Anon_EnumValuesAnonAsyncOperationNotFound
  var GitAsyncRefOperationParameters: js.Any
  var GitAsyncRefOperationSource: js.Any
  var GitBaseVersionDescriptor: js.Any
  var GitBranchStats: js.Any
  var GitChange: js.Any
  var GitCherryPick: js.Any
  var GitCommit: js.Any
  var GitCommitChanges: js.Any
  var GitCommitDiffs: js.Any
  var GitCommitRef: js.Any
  var GitCommitToCreate: js.Any
  var GitConflict: js.Any
  var GitConflictAddAdd: js.Any
  var GitConflictAddRename: js.Any
  var GitConflictDeleteEdit: js.Any
  var GitConflictDeleteRename: js.Any
  var GitConflictDirectoryFile: js.Any
  var GitConflictEditDelete: js.Any
  var GitConflictEditEdit: js.Any
  var GitConflictFileDirectory: js.Any
  var GitConflictRename1to2: js.Any
  var GitConflictRename2to1: js.Any
  var GitConflictRenameAdd: js.Any
  var GitConflictRenameDelete: js.Any
  var GitConflictRenameRename: js.Any
  var GitConflictType: Anon_EnumValuesAnonAddAdd
  var GitConflictUpdateResult: js.Any
  var GitConflictUpdateStatus: Anon_EnumValuesAnonBadRequest
  var GitDeletedRepository: js.Any
  var GitForkRef: js.Any
  var GitForkSyncRequest: js.Any
  var GitHistoryMode: Anon_EnumValuesAnonFirstParent
  var GitImportFailedEvent: js.Any
  var GitImportRequest: js.Any
  var GitImportSucceededEvent: js.Any
  var GitItem: js.Any
  var GitItemDescriptor: js.Any
  var GitItemRequestData: js.Any
  var GitLastChangeTreeItems: js.Any
  var GitObject: js.Any
  var GitObjectType: Anon_EnumValuesAnonBad
  var GitPathAction: js.Any
  var GitPathActions: Anon_EnumValuesAnonAddDelete
  var GitPathToItemsCollection: js.Any
  var GitPullRequest: js.Any
  var GitPullRequestChange: js.Any
  var GitPullRequestCommentThread: js.Any
  var GitPullRequestIteration: js.Any
  var GitPullRequestIterationChanges: js.Any
  var GitPullRequestQuery: js.Any
  var GitPullRequestQueryInput: js.Any
  var GitPullRequestQueryType: Anon_EnumValuesAnonCommit
  var GitPullRequestReviewFileType: Anon_EnumValuesAnonAttachment
  var GitPullRequestSearchCriteria: js.Any
  var GitPullRequestStatus: js.Any
  var GitPush: js.Any
  var GitPushEventData: js.Any
  var GitPushRef: js.Any
  var GitPushSearchCriteria: js.Any
  var GitQueryBranchStatsCriteria: js.Any
  var GitQueryCommitsCriteria: js.Any
  var GitQueryRefsCriteria: js.Any
  var GitRef: js.Any
  var GitRefFavorite: js.Any
  var GitRefSearchType: Anon_EnumValuesAnonContains
  var GitRefUpdateMode: Anon_EnumValuesAnonAllOrNone
  var GitRefUpdateResult: js.Any
  var GitRefUpdateStatus: Anon_EnumValuesAnonCreateBranchPermissionRequired
  var GitRepository: js.Any
  var GitRepositoryCreateOptions: js.Any
  var GitRepositoryRef: js.Any
  var GitResolutionError: Anon_EnumValuesAnonInvalidPath
  var GitResolutionMergeContent: js.Any
  var GitResolutionMergeType: Anon_EnumValuesAnonAutoMerged
  var GitResolutionPathConflict: js.Any
  var GitResolutionPathConflictAction: Anon_EnumValuesAnonKeepSourceDeleteTarget
  var GitResolutionPickOneAction: js.Any
  var GitResolutionRename1to2: js.Any
  var GitResolutionRename1to2Action: Anon_EnumValuesAnonKeepBothFiles
  var GitResolutionStatus: Anon_EnumValuesAnonPartiallyResolved
  var GitResolutionWhichAction: Anon_EnumValuesAnonPickSourceAction
  var GitRevert: js.Any
  var GitStatus: js.Any
  var GitStatusState: Anon_EnumValuesAnonErrorFailed
  var GitTargetVersionDescriptor: js.Any
  var GitTreeDiff: js.Any
  var GitTreeDiffEntry: js.Any
  var GitTreeDiffResponse: js.Any
  var GitTreeEntryRef: js.Any
  var GitTreeRef: js.Any
  var GitUserDate: js.Any
  var GitVersionDescriptor: js.Any
  var GitVersionOptions: Anon_EnumValuesAnonFirstParentNone
  var GitVersionType: Anon_EnumValuesAnonBranch
  var HistoryEntry: js.Any
  var IncludedGitCommit: js.Any
  var ItemContent: js.Any
  var ItemContentType: Anon_EnumValuesAnonBase64Encoded
  var ItemDetailsOptions: js.Any
  var IterationReason: Anon_EnumValuesAnonCreateForcePush
  var PullRequestAsyncStatus: Anon_EnumValuesAnonConflicts
  var PullRequestMergeFailureType: Anon_EnumValuesAnonCaseSensitive
  var PullRequestStatus: Anon_EnumValuesAnonAbandonedActive
  var RefFavoriteType: Anon_EnumValuesAnonFolder
  var SupportedIde: js.Any
  var SupportedIdeType: Anon_EnumValuesAnonAndroidStudio
  var TfvcBranch: js.Any
  var TfvcBranchRef: js.Any
  var TfvcChange: js.Any
  var TfvcChangeset: js.Any
  var TfvcChangesetRef: js.Any
  var TfvcCheckinEventData: js.Any
  var TfvcHistoryEntry: js.Any
  var TfvcItem: js.Any
  var TfvcItemDescriptor: js.Any
  var TfvcItemRequestData: js.Any
  var TfvcLabel: js.Any
  var TfvcLabelRef: js.Any
  var TfvcShelveset: js.Any
  var TfvcShelvesetRef: js.Any
  var TfvcVersionDescriptor: js.Any
  var TfvcVersionOption: Anon_EnumValuesAnonNonePrevious
  var TfvcVersionType: Anon_EnumValuesAnonChange
  var UpdateRefsRequest: js.Any
  var VersionControlChangeType: Anon_EnumValuesAnonAddAll
  var VersionControlProjectInfo: js.Any
  var VersionControlRecursionType: Anon_EnumValuesAnonFull
}

object Anon_AttachmentChange {
  @scala.inline
  def apply(
    Attachment: js.Any,
    Change: js.Any,
    ChangeList: js.Any,
    Comment: js.Any,
    CommentThread: js.Any,
    CommentThreadStatus: Anon_EnumValuesAnonActive,
    CommentType: Anon_EnumValuesAnonCodeChange,
    GitAnnotatedTag: js.Any,
    GitAsyncOperationStatus: Anon_EnumValuesAnonAbandonedCompleted,
    GitAsyncRefOperation: js.Any,
    GitAsyncRefOperationDetail: js.Any,
    GitAsyncRefOperationFailureStatus: Anon_EnumValuesAnonAsyncOperationNotFound,
    GitAsyncRefOperationParameters: js.Any,
    GitAsyncRefOperationSource: js.Any,
    GitBaseVersionDescriptor: js.Any,
    GitBranchStats: js.Any,
    GitChange: js.Any,
    GitCherryPick: js.Any,
    GitCommit: js.Any,
    GitCommitChanges: js.Any,
    GitCommitDiffs: js.Any,
    GitCommitRef: js.Any,
    GitCommitToCreate: js.Any,
    GitConflict: js.Any,
    GitConflictAddAdd: js.Any,
    GitConflictAddRename: js.Any,
    GitConflictDeleteEdit: js.Any,
    GitConflictDeleteRename: js.Any,
    GitConflictDirectoryFile: js.Any,
    GitConflictEditDelete: js.Any,
    GitConflictEditEdit: js.Any,
    GitConflictFileDirectory: js.Any,
    GitConflictRename1to2: js.Any,
    GitConflictRename2to1: js.Any,
    GitConflictRenameAdd: js.Any,
    GitConflictRenameDelete: js.Any,
    GitConflictRenameRename: js.Any,
    GitConflictType: Anon_EnumValuesAnonAddAdd,
    GitConflictUpdateResult: js.Any,
    GitConflictUpdateStatus: Anon_EnumValuesAnonBadRequest,
    GitDeletedRepository: js.Any,
    GitForkRef: js.Any,
    GitForkSyncRequest: js.Any,
    GitHistoryMode: Anon_EnumValuesAnonFirstParent,
    GitImportFailedEvent: js.Any,
    GitImportRequest: js.Any,
    GitImportSucceededEvent: js.Any,
    GitItem: js.Any,
    GitItemDescriptor: js.Any,
    GitItemRequestData: js.Any,
    GitLastChangeTreeItems: js.Any,
    GitObject: js.Any,
    GitObjectType: Anon_EnumValuesAnonBad,
    GitPathAction: js.Any,
    GitPathActions: Anon_EnumValuesAnonAddDelete,
    GitPathToItemsCollection: js.Any,
    GitPullRequest: js.Any,
    GitPullRequestChange: js.Any,
    GitPullRequestCommentThread: js.Any,
    GitPullRequestIteration: js.Any,
    GitPullRequestIterationChanges: js.Any,
    GitPullRequestQuery: js.Any,
    GitPullRequestQueryInput: js.Any,
    GitPullRequestQueryType: Anon_EnumValuesAnonCommit,
    GitPullRequestReviewFileType: Anon_EnumValuesAnonAttachment,
    GitPullRequestSearchCriteria: js.Any,
    GitPullRequestStatus: js.Any,
    GitPush: js.Any,
    GitPushEventData: js.Any,
    GitPushRef: js.Any,
    GitPushSearchCriteria: js.Any,
    GitQueryBranchStatsCriteria: js.Any,
    GitQueryCommitsCriteria: js.Any,
    GitQueryRefsCriteria: js.Any,
    GitRef: js.Any,
    GitRefFavorite: js.Any,
    GitRefSearchType: Anon_EnumValuesAnonContains,
    GitRefUpdateMode: Anon_EnumValuesAnonAllOrNone,
    GitRefUpdateResult: js.Any,
    GitRefUpdateStatus: Anon_EnumValuesAnonCreateBranchPermissionRequired,
    GitRepository: js.Any,
    GitRepositoryCreateOptions: js.Any,
    GitRepositoryRef: js.Any,
    GitResolutionError: Anon_EnumValuesAnonInvalidPath,
    GitResolutionMergeContent: js.Any,
    GitResolutionMergeType: Anon_EnumValuesAnonAutoMerged,
    GitResolutionPathConflict: js.Any,
    GitResolutionPathConflictAction: Anon_EnumValuesAnonKeepSourceDeleteTarget,
    GitResolutionPickOneAction: js.Any,
    GitResolutionRename1to2: js.Any,
    GitResolutionRename1to2Action: Anon_EnumValuesAnonKeepBothFiles,
    GitResolutionStatus: Anon_EnumValuesAnonPartiallyResolved,
    GitResolutionWhichAction: Anon_EnumValuesAnonPickSourceAction,
    GitRevert: js.Any,
    GitStatus: js.Any,
    GitStatusState: Anon_EnumValuesAnonErrorFailed,
    GitTargetVersionDescriptor: js.Any,
    GitTreeDiff: js.Any,
    GitTreeDiffEntry: js.Any,
    GitTreeDiffResponse: js.Any,
    GitTreeEntryRef: js.Any,
    GitTreeRef: js.Any,
    GitUserDate: js.Any,
    GitVersionDescriptor: js.Any,
    GitVersionOptions: Anon_EnumValuesAnonFirstParentNone,
    GitVersionType: Anon_EnumValuesAnonBranch,
    HistoryEntry: js.Any,
    IncludedGitCommit: js.Any,
    ItemContent: js.Any,
    ItemContentType: Anon_EnumValuesAnonBase64Encoded,
    ItemDetailsOptions: js.Any,
    IterationReason: Anon_EnumValuesAnonCreateForcePush,
    PullRequestAsyncStatus: Anon_EnumValuesAnonConflicts,
    PullRequestMergeFailureType: Anon_EnumValuesAnonCaseSensitive,
    PullRequestStatus: Anon_EnumValuesAnonAbandonedActive,
    RefFavoriteType: Anon_EnumValuesAnonFolder,
    SupportedIde: js.Any,
    SupportedIdeType: Anon_EnumValuesAnonAndroidStudio,
    TfvcBranch: js.Any,
    TfvcBranchRef: js.Any,
    TfvcChange: js.Any,
    TfvcChangeset: js.Any,
    TfvcChangesetRef: js.Any,
    TfvcCheckinEventData: js.Any,
    TfvcHistoryEntry: js.Any,
    TfvcItem: js.Any,
    TfvcItemDescriptor: js.Any,
    TfvcItemRequestData: js.Any,
    TfvcLabel: js.Any,
    TfvcLabelRef: js.Any,
    TfvcShelveset: js.Any,
    TfvcShelvesetRef: js.Any,
    TfvcVersionDescriptor: js.Any,
    TfvcVersionOption: Anon_EnumValuesAnonNonePrevious,
    TfvcVersionType: Anon_EnumValuesAnonChange,
    UpdateRefsRequest: js.Any,
    VersionControlChangeType: Anon_EnumValuesAnonAddAll,
    VersionControlProjectInfo: js.Any,
    VersionControlRecursionType: Anon_EnumValuesAnonFull
  ): Anon_AttachmentChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attachment")(Attachment)
    __obj.updateDynamic("Change")(Change)
    __obj.updateDynamic("ChangeList")(ChangeList)
    __obj.updateDynamic("Comment")(Comment)
    __obj.updateDynamic("CommentThread")(CommentThread)
    __obj.updateDynamic("CommentThreadStatus")(CommentThreadStatus)
    __obj.updateDynamic("CommentType")(CommentType)
    __obj.updateDynamic("GitAnnotatedTag")(GitAnnotatedTag)
    __obj.updateDynamic("GitAsyncOperationStatus")(GitAsyncOperationStatus)
    __obj.updateDynamic("GitAsyncRefOperation")(GitAsyncRefOperation)
    __obj.updateDynamic("GitAsyncRefOperationDetail")(GitAsyncRefOperationDetail)
    __obj.updateDynamic("GitAsyncRefOperationFailureStatus")(GitAsyncRefOperationFailureStatus)
    __obj.updateDynamic("GitAsyncRefOperationParameters")(GitAsyncRefOperationParameters)
    __obj.updateDynamic("GitAsyncRefOperationSource")(GitAsyncRefOperationSource)
    __obj.updateDynamic("GitBaseVersionDescriptor")(GitBaseVersionDescriptor)
    __obj.updateDynamic("GitBranchStats")(GitBranchStats)
    __obj.updateDynamic("GitChange")(GitChange)
    __obj.updateDynamic("GitCherryPick")(GitCherryPick)
    __obj.updateDynamic("GitCommit")(GitCommit)
    __obj.updateDynamic("GitCommitChanges")(GitCommitChanges)
    __obj.updateDynamic("GitCommitDiffs")(GitCommitDiffs)
    __obj.updateDynamic("GitCommitRef")(GitCommitRef)
    __obj.updateDynamic("GitCommitToCreate")(GitCommitToCreate)
    __obj.updateDynamic("GitConflict")(GitConflict)
    __obj.updateDynamic("GitConflictAddAdd")(GitConflictAddAdd)
    __obj.updateDynamic("GitConflictAddRename")(GitConflictAddRename)
    __obj.updateDynamic("GitConflictDeleteEdit")(GitConflictDeleteEdit)
    __obj.updateDynamic("GitConflictDeleteRename")(GitConflictDeleteRename)
    __obj.updateDynamic("GitConflictDirectoryFile")(GitConflictDirectoryFile)
    __obj.updateDynamic("GitConflictEditDelete")(GitConflictEditDelete)
    __obj.updateDynamic("GitConflictEditEdit")(GitConflictEditEdit)
    __obj.updateDynamic("GitConflictFileDirectory")(GitConflictFileDirectory)
    __obj.updateDynamic("GitConflictRename1to2")(GitConflictRename1to2)
    __obj.updateDynamic("GitConflictRename2to1")(GitConflictRename2to1)
    __obj.updateDynamic("GitConflictRenameAdd")(GitConflictRenameAdd)
    __obj.updateDynamic("GitConflictRenameDelete")(GitConflictRenameDelete)
    __obj.updateDynamic("GitConflictRenameRename")(GitConflictRenameRename)
    __obj.updateDynamic("GitConflictType")(GitConflictType)
    __obj.updateDynamic("GitConflictUpdateResult")(GitConflictUpdateResult)
    __obj.updateDynamic("GitConflictUpdateStatus")(GitConflictUpdateStatus)
    __obj.updateDynamic("GitDeletedRepository")(GitDeletedRepository)
    __obj.updateDynamic("GitForkRef")(GitForkRef)
    __obj.updateDynamic("GitForkSyncRequest")(GitForkSyncRequest)
    __obj.updateDynamic("GitHistoryMode")(GitHistoryMode)
    __obj.updateDynamic("GitImportFailedEvent")(GitImportFailedEvent)
    __obj.updateDynamic("GitImportRequest")(GitImportRequest)
    __obj.updateDynamic("GitImportSucceededEvent")(GitImportSucceededEvent)
    __obj.updateDynamic("GitItem")(GitItem)
    __obj.updateDynamic("GitItemDescriptor")(GitItemDescriptor)
    __obj.updateDynamic("GitItemRequestData")(GitItemRequestData)
    __obj.updateDynamic("GitLastChangeTreeItems")(GitLastChangeTreeItems)
    __obj.updateDynamic("GitObject")(GitObject)
    __obj.updateDynamic("GitObjectType")(GitObjectType)
    __obj.updateDynamic("GitPathAction")(GitPathAction)
    __obj.updateDynamic("GitPathActions")(GitPathActions)
    __obj.updateDynamic("GitPathToItemsCollection")(GitPathToItemsCollection)
    __obj.updateDynamic("GitPullRequest")(GitPullRequest)
    __obj.updateDynamic("GitPullRequestChange")(GitPullRequestChange)
    __obj.updateDynamic("GitPullRequestCommentThread")(GitPullRequestCommentThread)
    __obj.updateDynamic("GitPullRequestIteration")(GitPullRequestIteration)
    __obj.updateDynamic("GitPullRequestIterationChanges")(GitPullRequestIterationChanges)
    __obj.updateDynamic("GitPullRequestQuery")(GitPullRequestQuery)
    __obj.updateDynamic("GitPullRequestQueryInput")(GitPullRequestQueryInput)
    __obj.updateDynamic("GitPullRequestQueryType")(GitPullRequestQueryType)
    __obj.updateDynamic("GitPullRequestReviewFileType")(GitPullRequestReviewFileType)
    __obj.updateDynamic("GitPullRequestSearchCriteria")(GitPullRequestSearchCriteria)
    __obj.updateDynamic("GitPullRequestStatus")(GitPullRequestStatus)
    __obj.updateDynamic("GitPush")(GitPush)
    __obj.updateDynamic("GitPushEventData")(GitPushEventData)
    __obj.updateDynamic("GitPushRef")(GitPushRef)
    __obj.updateDynamic("GitPushSearchCriteria")(GitPushSearchCriteria)
    __obj.updateDynamic("GitQueryBranchStatsCriteria")(GitQueryBranchStatsCriteria)
    __obj.updateDynamic("GitQueryCommitsCriteria")(GitQueryCommitsCriteria)
    __obj.updateDynamic("GitQueryRefsCriteria")(GitQueryRefsCriteria)
    __obj.updateDynamic("GitRef")(GitRef)
    __obj.updateDynamic("GitRefFavorite")(GitRefFavorite)
    __obj.updateDynamic("GitRefSearchType")(GitRefSearchType)
    __obj.updateDynamic("GitRefUpdateMode")(GitRefUpdateMode)
    __obj.updateDynamic("GitRefUpdateResult")(GitRefUpdateResult)
    __obj.updateDynamic("GitRefUpdateStatus")(GitRefUpdateStatus)
    __obj.updateDynamic("GitRepository")(GitRepository)
    __obj.updateDynamic("GitRepositoryCreateOptions")(GitRepositoryCreateOptions)
    __obj.updateDynamic("GitRepositoryRef")(GitRepositoryRef)
    __obj.updateDynamic("GitResolutionError")(GitResolutionError)
    __obj.updateDynamic("GitResolutionMergeContent")(GitResolutionMergeContent)
    __obj.updateDynamic("GitResolutionMergeType")(GitResolutionMergeType)
    __obj.updateDynamic("GitResolutionPathConflict")(GitResolutionPathConflict)
    __obj.updateDynamic("GitResolutionPathConflictAction")(GitResolutionPathConflictAction)
    __obj.updateDynamic("GitResolutionPickOneAction")(GitResolutionPickOneAction)
    __obj.updateDynamic("GitResolutionRename1to2")(GitResolutionRename1to2)
    __obj.updateDynamic("GitResolutionRename1to2Action")(GitResolutionRename1to2Action)
    __obj.updateDynamic("GitResolutionStatus")(GitResolutionStatus)
    __obj.updateDynamic("GitResolutionWhichAction")(GitResolutionWhichAction)
    __obj.updateDynamic("GitRevert")(GitRevert)
    __obj.updateDynamic("GitStatus")(GitStatus)
    __obj.updateDynamic("GitStatusState")(GitStatusState)
    __obj.updateDynamic("GitTargetVersionDescriptor")(GitTargetVersionDescriptor)
    __obj.updateDynamic("GitTreeDiff")(GitTreeDiff)
    __obj.updateDynamic("GitTreeDiffEntry")(GitTreeDiffEntry)
    __obj.updateDynamic("GitTreeDiffResponse")(GitTreeDiffResponse)
    __obj.updateDynamic("GitTreeEntryRef")(GitTreeEntryRef)
    __obj.updateDynamic("GitTreeRef")(GitTreeRef)
    __obj.updateDynamic("GitUserDate")(GitUserDate)
    __obj.updateDynamic("GitVersionDescriptor")(GitVersionDescriptor)
    __obj.updateDynamic("GitVersionOptions")(GitVersionOptions)
    __obj.updateDynamic("GitVersionType")(GitVersionType)
    __obj.updateDynamic("HistoryEntry")(HistoryEntry)
    __obj.updateDynamic("IncludedGitCommit")(IncludedGitCommit)
    __obj.updateDynamic("ItemContent")(ItemContent)
    __obj.updateDynamic("ItemContentType")(ItemContentType)
    __obj.updateDynamic("ItemDetailsOptions")(ItemDetailsOptions)
    __obj.updateDynamic("IterationReason")(IterationReason)
    __obj.updateDynamic("PullRequestAsyncStatus")(PullRequestAsyncStatus)
    __obj.updateDynamic("PullRequestMergeFailureType")(PullRequestMergeFailureType)
    __obj.updateDynamic("PullRequestStatus")(PullRequestStatus)
    __obj.updateDynamic("RefFavoriteType")(RefFavoriteType)
    __obj.updateDynamic("SupportedIde")(SupportedIde)
    __obj.updateDynamic("SupportedIdeType")(SupportedIdeType)
    __obj.updateDynamic("TfvcBranch")(TfvcBranch)
    __obj.updateDynamic("TfvcBranchRef")(TfvcBranchRef)
    __obj.updateDynamic("TfvcChange")(TfvcChange)
    __obj.updateDynamic("TfvcChangeset")(TfvcChangeset)
    __obj.updateDynamic("TfvcChangesetRef")(TfvcChangesetRef)
    __obj.updateDynamic("TfvcCheckinEventData")(TfvcCheckinEventData)
    __obj.updateDynamic("TfvcHistoryEntry")(TfvcHistoryEntry)
    __obj.updateDynamic("TfvcItem")(TfvcItem)
    __obj.updateDynamic("TfvcItemDescriptor")(TfvcItemDescriptor)
    __obj.updateDynamic("TfvcItemRequestData")(TfvcItemRequestData)
    __obj.updateDynamic("TfvcLabel")(TfvcLabel)
    __obj.updateDynamic("TfvcLabelRef")(TfvcLabelRef)
    __obj.updateDynamic("TfvcShelveset")(TfvcShelveset)
    __obj.updateDynamic("TfvcShelvesetRef")(TfvcShelvesetRef)
    __obj.updateDynamic("TfvcVersionDescriptor")(TfvcVersionDescriptor)
    __obj.updateDynamic("TfvcVersionOption")(TfvcVersionOption)
    __obj.updateDynamic("TfvcVersionType")(TfvcVersionType)
    __obj.updateDynamic("UpdateRefsRequest")(UpdateRefsRequest)
    __obj.updateDynamic("VersionControlChangeType")(VersionControlChangeType)
    __obj.updateDynamic("VersionControlProjectInfo")(VersionControlProjectInfo)
    __obj.updateDynamic("VersionControlRecursionType")(VersionControlRecursionType)
    __obj.asInstanceOf[Anon_AttachmentChange]
  }
}

