package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRename1to2 extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionRename1to2
  var sourceBlob: GitBlobRef
  var sourceNewPath: java.lang.String
  var targetBlob: GitBlobRef
  var targetNewPath: java.lang.String
}

object GitConflictRename1to2 {
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
    resolution: GitResolutionRename1to2,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolvedDate: stdLib.Date,
    sourceBlob: GitBlobRef,
    sourceNewPath: java.lang.String,
    targetBlob: GitBlobRef,
    targetNewPath: java.lang.String,
    url: java.lang.String
  ): GitConflictRename1to2 = {
    val __obj = js.Dynamic.literal(_links = _links, baseBlob = baseBlob, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceBlob = sourceBlob, sourceNewPath = sourceNewPath, targetBlob = targetBlob, targetNewPath = targetNewPath, url = url)
  
    __obj.asInstanceOf[GitConflictRename1to2]
  }
}

