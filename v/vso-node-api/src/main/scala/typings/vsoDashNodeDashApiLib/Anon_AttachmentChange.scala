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
    val __obj = js.Dynamic.literal(Attachment = Attachment, Change = Change, ChangeList = ChangeList, Comment = Comment, CommentThread = CommentThread, CommentThreadStatus = CommentThreadStatus, CommentType = CommentType, GitAnnotatedTag = GitAnnotatedTag, GitAsyncOperationStatus = GitAsyncOperationStatus, GitAsyncRefOperation = GitAsyncRefOperation, GitAsyncRefOperationDetail = GitAsyncRefOperationDetail, GitAsyncRefOperationFailureStatus = GitAsyncRefOperationFailureStatus, GitAsyncRefOperationParameters = GitAsyncRefOperationParameters, GitAsyncRefOperationSource = GitAsyncRefOperationSource, GitBaseVersionDescriptor = GitBaseVersionDescriptor, GitBranchStats = GitBranchStats, GitChange = GitChange, GitCherryPick = GitCherryPick, GitCommit = GitCommit, GitCommitChanges = GitCommitChanges, GitCommitDiffs = GitCommitDiffs, GitCommitRef = GitCommitRef, GitCommitToCreate = GitCommitToCreate, GitConflict = GitConflict, GitConflictAddAdd = GitConflictAddAdd, GitConflictAddRename = GitConflictAddRename, GitConflictDeleteEdit = GitConflictDeleteEdit, GitConflictDeleteRename = GitConflictDeleteRename, GitConflictDirectoryFile = GitConflictDirectoryFile, GitConflictEditDelete = GitConflictEditDelete, GitConflictEditEdit = GitConflictEditEdit, GitConflictFileDirectory = GitConflictFileDirectory, GitConflictRename1to2 = GitConflictRename1to2, GitConflictRename2to1 = GitConflictRename2to1, GitConflictRenameAdd = GitConflictRenameAdd, GitConflictRenameDelete = GitConflictRenameDelete, GitConflictRenameRename = GitConflictRenameRename, GitConflictType = GitConflictType, GitConflictUpdateResult = GitConflictUpdateResult, GitConflictUpdateStatus = GitConflictUpdateStatus, GitDeletedRepository = GitDeletedRepository, GitForkRef = GitForkRef, GitForkSyncRequest = GitForkSyncRequest, GitHistoryMode = GitHistoryMode, GitImportFailedEvent = GitImportFailedEvent, GitImportRequest = GitImportRequest, GitImportSucceededEvent = GitImportSucceededEvent, GitItem = GitItem, GitItemDescriptor = GitItemDescriptor, GitItemRequestData = GitItemRequestData, GitLastChangeTreeItems = GitLastChangeTreeItems, GitObject = GitObject, GitObjectType = GitObjectType, GitPathAction = GitPathAction, GitPathActions = GitPathActions, GitPathToItemsCollection = GitPathToItemsCollection, GitPullRequest = GitPullRequest, GitPullRequestChange = GitPullRequestChange, GitPullRequestCommentThread = GitPullRequestCommentThread, GitPullRequestIteration = GitPullRequestIteration, GitPullRequestIterationChanges = GitPullRequestIterationChanges, GitPullRequestQuery = GitPullRequestQuery, GitPullRequestQueryInput = GitPullRequestQueryInput, GitPullRequestQueryType = GitPullRequestQueryType, GitPullRequestReviewFileType = GitPullRequestReviewFileType, GitPullRequestSearchCriteria = GitPullRequestSearchCriteria, GitPullRequestStatus = GitPullRequestStatus, GitPush = GitPush, GitPushEventData = GitPushEventData, GitPushRef = GitPushRef, GitPushSearchCriteria = GitPushSearchCriteria, GitQueryBranchStatsCriteria = GitQueryBranchStatsCriteria, GitQueryCommitsCriteria = GitQueryCommitsCriteria, GitQueryRefsCriteria = GitQueryRefsCriteria, GitRef = GitRef, GitRefFavorite = GitRefFavorite, GitRefSearchType = GitRefSearchType, GitRefUpdateMode = GitRefUpdateMode, GitRefUpdateResult = GitRefUpdateResult, GitRefUpdateStatus = GitRefUpdateStatus, GitRepository = GitRepository, GitRepositoryCreateOptions = GitRepositoryCreateOptions, GitRepositoryRef = GitRepositoryRef, GitResolutionError = GitResolutionError, GitResolutionMergeContent = GitResolutionMergeContent, GitResolutionMergeType = GitResolutionMergeType, GitResolutionPathConflict = GitResolutionPathConflict, GitResolutionPathConflictAction = GitResolutionPathConflictAction, GitResolutionPickOneAction = GitResolutionPickOneAction, GitResolutionRename1to2 = GitResolutionRename1to2, GitResolutionRename1to2Action = GitResolutionRename1to2Action, GitResolutionStatus = GitResolutionStatus, GitResolutionWhichAction = GitResolutionWhichAction, GitRevert = GitRevert, GitStatus = GitStatus, GitStatusState = GitStatusState, GitTargetVersionDescriptor = GitTargetVersionDescriptor, GitTreeDiff = GitTreeDiff, GitTreeDiffEntry = GitTreeDiffEntry, GitTreeDiffResponse = GitTreeDiffResponse, GitTreeEntryRef = GitTreeEntryRef, GitTreeRef = GitTreeRef, GitUserDate = GitUserDate, GitVersionDescriptor = GitVersionDescriptor, GitVersionOptions = GitVersionOptions, GitVersionType = GitVersionType, HistoryEntry = HistoryEntry, IncludedGitCommit = IncludedGitCommit, ItemContent = ItemContent, ItemContentType = ItemContentType, ItemDetailsOptions = ItemDetailsOptions, IterationReason = IterationReason, PullRequestAsyncStatus = PullRequestAsyncStatus, PullRequestMergeFailureType = PullRequestMergeFailureType, PullRequestStatus = PullRequestStatus, RefFavoriteType = RefFavoriteType, SupportedIde = SupportedIde, SupportedIdeType = SupportedIdeType, TfvcBranch = TfvcBranch, TfvcBranchRef = TfvcBranchRef, TfvcChange = TfvcChange, TfvcChangeset = TfvcChangeset, TfvcChangesetRef = TfvcChangesetRef, TfvcCheckinEventData = TfvcCheckinEventData, TfvcHistoryEntry = TfvcHistoryEntry, TfvcItem = TfvcItem, TfvcItemDescriptor = TfvcItemDescriptor, TfvcItemRequestData = TfvcItemRequestData, TfvcLabel = TfvcLabel, TfvcLabelRef = TfvcLabelRef, TfvcShelveset = TfvcShelveset, TfvcShelvesetRef = TfvcShelvesetRef, TfvcVersionDescriptor = TfvcVersionDescriptor, TfvcVersionOption = TfvcVersionOption, TfvcVersionType = TfvcVersionType, UpdateRefsRequest = UpdateRefsRequest, VersionControlChangeType = VersionControlChangeType, VersionControlProjectInfo = VersionControlProjectInfo, VersionControlRecursionType = VersionControlRecursionType)
  
    __obj.asInstanceOf[Anon_AttachmentChange]
  }
}

