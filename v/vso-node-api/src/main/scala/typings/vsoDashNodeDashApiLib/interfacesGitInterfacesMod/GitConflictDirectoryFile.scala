package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictDirectoryFile extends GitConflict {
  var resolution: GitResolutionPathConflict
  var sourceTree: GitTreeRef
  var targetBlob: GitBlobRef
}

object GitConflictDirectoryFile {
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
    sourceTree: GitTreeRef,
    targetBlob: GitBlobRef,
    url: java.lang.String
  ): GitConflictDirectoryFile = {
    val __obj = js.Dynamic.literal(_links = _links, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolution = resolution, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, sourceTree = sourceTree, targetBlob = targetBlob, url = url)
  
    __obj.asInstanceOf[GitConflictDirectoryFile]
  }
}

