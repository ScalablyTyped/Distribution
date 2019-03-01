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
    __obj.updateDynamic("sourceNewBlob")(sourceNewBlob)
    __obj.updateDynamic("sourceOriginalBlob")(sourceOriginalBlob)
    __obj.updateDynamic("sourceOriginalPath")(sourceOriginalPath)
    __obj.updateDynamic("targetNewBlob")(targetNewBlob)
    __obj.updateDynamic("targetOriginalBlob")(targetOriginalBlob)
    __obj.updateDynamic("targetOriginalPath")(targetOriginalPath)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitConflictRename2to1]
  }
}

