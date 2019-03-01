package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflict extends js.Object {
  var _links: js.Any
  var conflictId: scala.Double
  var conflictPath: java.lang.String
  var conflictType: GitConflictType
  var mergeBaseCommit: GitCommitRef
  var mergeOrigin: GitMergeOriginRef
  var mergeSourceCommit: GitCommitRef
  var mergeTargetCommit: GitCommitRef
  var resolutionError: GitResolutionError
  var resolutionStatus: GitResolutionStatus
  var resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var resolvedDate: stdLib.Date
  var url: java.lang.String
}

object GitConflict {
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
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    resolvedDate: stdLib.Date,
    url: java.lang.String
  ): GitConflict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("conflictId")(conflictId)
    __obj.updateDynamic("conflictPath")(conflictPath)
    __obj.updateDynamic("conflictType")(conflictType)
    __obj.updateDynamic("mergeBaseCommit")(mergeBaseCommit)
    __obj.updateDynamic("mergeOrigin")(mergeOrigin)
    __obj.updateDynamic("mergeSourceCommit")(mergeSourceCommit)
    __obj.updateDynamic("mergeTargetCommit")(mergeTargetCommit)
    __obj.updateDynamic("resolutionError")(resolutionError)
    __obj.updateDynamic("resolutionStatus")(resolutionStatus)
    __obj.updateDynamic("resolvedBy")(resolvedBy)
    __obj.updateDynamic("resolvedDate")(resolvedDate)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitConflict]
  }
}

