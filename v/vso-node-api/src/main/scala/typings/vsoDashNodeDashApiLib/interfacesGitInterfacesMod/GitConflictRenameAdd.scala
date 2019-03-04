package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRenameAdd extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionPathConflict
  var sourceBlob: GitBlobRef
  var sourceOriginalPath: java.lang.String
  var targetBlob: GitBlobRef
}

object GitConflictRenameAdd {
  @scala.inline
  def apply(
    _links: js.Any,
    baseBlob: GitBlobRef,
    conflictId: scala.Double,
    conflictPath: java.lang.String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolution: GitResolutionPathConflict,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolvedDate: stdLib.Date,
    sourceBlob: GitBlobRef,
    sourceOriginalPath: java.lang.String,
    targetBlob: GitBlobRef,
    url: java.lang.String
  ): GitConflictRenameAdd = {
    val __obj = js.Dynamic.literal(_links = _links, baseBlob = baseBlob, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceBlob = sourceBlob, sourceOriginalPath = sourceOriginalPath, targetBlob = targetBlob, url = url)
  
    __obj.asInstanceOf[GitConflictRenameAdd]
  }
}

