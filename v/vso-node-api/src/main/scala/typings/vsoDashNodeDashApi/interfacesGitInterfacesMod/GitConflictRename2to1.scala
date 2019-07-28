package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRename2to1 extends GitConflict {
  var resolution: GitResolutionPathConflict
  var sourceNewBlob: GitBlobRef
  var sourceOriginalBlob: GitBlobRef
  var sourceOriginalPath: String
  var targetNewBlob: GitBlobRef
  var targetOriginalBlob: GitBlobRef
  var targetOriginalPath: String
}

object GitConflictRename2to1 {
  @scala.inline
  def apply(
    _links: js.Any,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolution: GitResolutionPathConflict,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    sourceNewBlob: GitBlobRef,
    sourceOriginalBlob: GitBlobRef,
    sourceOriginalPath: String,
    targetNewBlob: GitBlobRef,
    targetOriginalBlob: GitBlobRef,
    targetOriginalPath: String,
    url: String
  ): GitConflictRename2to1 = {
    val __obj = js.Dynamic.literal(_links = _links, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceNewBlob = sourceNewBlob, sourceOriginalBlob = sourceOriginalBlob, sourceOriginalPath = sourceOriginalPath, targetNewBlob = targetNewBlob, targetOriginalBlob = targetOriginalBlob, targetOriginalPath = targetOriginalPath, url = url)
  
    __obj.asInstanceOf[GitConflictRename2to1]
  }
}

