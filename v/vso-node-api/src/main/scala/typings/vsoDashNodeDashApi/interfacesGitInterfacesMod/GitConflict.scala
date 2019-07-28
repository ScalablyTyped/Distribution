package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflict extends js.Object {
  var _links: js.Any
  var conflictId: Double
  var conflictPath: String
  var conflictType: GitConflictType
  var mergeBaseCommit: GitCommitRef
  var mergeOrigin: GitMergeOriginRef
  var mergeSourceCommit: GitCommitRef
  var mergeTargetCommit: GitCommitRef
  var resolutionError: GitResolutionError
  var resolutionStatus: GitResolutionStatus
  var resolvedBy: IdentityRef
  var resolvedDate: Date
  var url: String
}

object GitConflict {
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
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    url: String
  ): GitConflict = {
    val __obj = js.Dynamic.literal(_links = _links, conflictId = conflictId, conflictPath = conflictPath, conflictType = conflictType, mergeBaseCommit = mergeBaseCommit, mergeOrigin = mergeOrigin, mergeSourceCommit = mergeSourceCommit, mergeTargetCommit = mergeTargetCommit, resolutionError = resolutionError, resolutionStatus = resolutionStatus, resolvedBy = resolvedBy, resolvedDate = resolvedDate, url = url)
  
    __obj.asInstanceOf[GitConflict]
  }
}

