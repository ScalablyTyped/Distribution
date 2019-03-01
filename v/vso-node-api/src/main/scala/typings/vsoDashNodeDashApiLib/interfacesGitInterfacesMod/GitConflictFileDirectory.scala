package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictFileDirectory extends GitConflict {
  var resolution: GitResolutionPathConflict
  var sourceBlob: GitBlobRef
  var targetTree: GitTreeRef
}

object GitConflictFileDirectory {
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
    sourceBlob: GitBlobRef,
    targetTree: GitTreeRef,
    url: java.lang.String
  ): GitConflictFileDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("conflictId")(conflictId)
    __obj.updateDynamic("conflictPath")(conflictPath)
    __obj.updateDynamic("conflictType")(conflictType)
    __obj.updateDynamic("mergeBaseCommit")(mergeBaseCommit)
    __obj.updateDynamic("mergeOrigin")(mergeOrigin)
    __obj.updateDynamic("mergeSourceCommit")(mergeSourceCommit)
    __obj.updateDynamic("mergeTargetCommit")(mergeTargetCommit)
    __obj.updateDynamic("resolution")(resolution)
    __obj.updateDynamic("resolutionError")(resolutionError)
    __obj.updateDynamic("resolutionStatus")(resolutionStatus)
    __obj.updateDynamic("resolvedBy")(resolvedBy)
    __obj.updateDynamic("resolvedDate")(resolvedDate)
    __obj.updateDynamic("sourceBlob")(sourceBlob)
    __obj.updateDynamic("targetTree")(targetTree)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitConflictFileDirectory]
  }
}

