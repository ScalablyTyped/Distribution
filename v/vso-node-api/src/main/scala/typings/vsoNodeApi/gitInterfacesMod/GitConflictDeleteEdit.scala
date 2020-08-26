package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConflictDeleteEdit extends GitConflict {
  var baseBlob: GitBlobRef = js.native
  var resolution: GitResolutionPickOneAction = js.native
  var targetBlob: GitBlobRef = js.native
}

object GitConflictDeleteEdit {
  @scala.inline
  def apply(
    _links: js.Any,
    baseBlob: GitBlobRef,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolution: GitResolutionPickOneAction,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    targetBlob: GitBlobRef,
    url: String
  ): GitConflictDeleteEdit = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], baseBlob = baseBlob.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], targetBlob = targetBlob.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictDeleteEdit]
  }
  @scala.inline
  implicit class GitConflictDeleteEditOps[Self <: GitConflictDeleteEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseBlob(value: GitBlobRef): Self = this.set("baseBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: GitResolutionPickOneAction): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetBlob(value: GitBlobRef): Self = this.set("targetBlob", value.asInstanceOf[js.Any])
  }
  
}

