package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRename2to1 extends GitConflict {
  var resolution: GitResolutionPathConflict
  var sourceNewBlob: GitBlobRef
  var sourceOriginalBlob: GitBlobRef
  var sourceOriginalPath: java.lang.String
  var targetNewBlob: GitBlobRef
  var targetOriginalBlob: GitBlobRef
  var targetOriginalPath: java.lang.String
}

object GitConflictRename2to1 {
  @scala.inline
  def apply(
    _links: js.Any,
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
    sourceNewBlob: GitBlobRef,
    sourceOriginalBlob: GitBlobRef,
    sourceOriginalPath: java.lang.String,
    targetNewBlob: GitBlobRef,
    targetOriginalBlob: GitBlobRef,
    targetOriginalPath: java.lang.String,
    url: java.lang.String
  ): GitConflictRename2to1 = {
    val __obj = js.Dynamic.literal(_links = _links, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceNewBlob = sourceNewBlob, sourceOriginalBlob = sourceOriginalBlob, sourceOriginalPath = sourceOriginalPath, targetNewBlob = targetNewBlob, targetOriginalBlob = targetOriginalBlob, targetOriginalPath = targetOriginalPath, url = url)
  
    __obj.asInstanceOf[GitConflictRename2to1]
  }
}

