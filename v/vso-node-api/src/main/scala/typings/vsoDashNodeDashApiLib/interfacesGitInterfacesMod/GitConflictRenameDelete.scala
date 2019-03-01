package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRenameDelete extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionPickOneAction
  var sourceBlob: GitBlobRef
  var sourceNewPath: java.lang.String
}

object GitConflictRenameDelete {
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
    resolution: GitResolutionPickOneAction,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolvedDate: stdLib.Date,
    sourceBlob: GitBlobRef,
    sourceNewPath: java.lang.String,
    url: java.lang.String
  ): GitConflictRenameDelete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("baseBlob")(baseBlob)
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
    __obj.updateDynamic("sourceNewPath")(sourceNewPath)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitConflictRenameDelete]
  }
}

