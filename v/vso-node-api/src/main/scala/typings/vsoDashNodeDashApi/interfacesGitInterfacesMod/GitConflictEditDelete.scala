package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictEditDelete extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionPickOneAction
  var sourceBlob: GitBlobRef
}

object GitConflictEditDelete {
  @scala.inline
  def apply(
    _links: js.Any,
    baseBlob: GitBlobRef,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolution: GitResolutionPickOneAction,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    sourceBlob: GitBlobRef,
    url: String
  ): GitConflictEditDelete = {
    val __obj = js.Dynamic.literal(_links = _links, baseBlob = baseBlob, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceBlob = sourceBlob, url = url)
  
    __obj.asInstanceOf[GitConflictEditDelete]
  }
}

