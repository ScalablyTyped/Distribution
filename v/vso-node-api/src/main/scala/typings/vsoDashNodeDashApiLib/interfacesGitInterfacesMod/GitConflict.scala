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

