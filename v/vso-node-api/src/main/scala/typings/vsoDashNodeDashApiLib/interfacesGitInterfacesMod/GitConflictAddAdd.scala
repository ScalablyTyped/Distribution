package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictAddAdd extends GitConflict {
  var resolution: GitResolutionMergeContent
  var sourceBlob: GitBlobRef
  var targetBlob: GitBlobRef
}

object GitConflictAddAdd {
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
    resolution: GitResolutionMergeContent,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolvedDate: stdLib.Date,
    sourceBlob: GitBlobRef,
    targetBlob: GitBlobRef,
    url: java.lang.String
  ): GitConflictAddAdd = {
    val __obj = js.Dynamic.literal(_links = _links, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceBlob = sourceBlob, targetBlob = targetBlob, url = url)
  
    __obj.asInstanceOf[GitConflictAddAdd]
  }
}

