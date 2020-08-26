package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitConflictRename2to1 extends GitConflict {
  var resolution: GitResolutionPathConflict = js.native
  var sourceNewBlob: GitBlobRef = js.native
  var sourceOriginalBlob: GitBlobRef = js.native
  var sourceOriginalPath: String = js.native
  var targetNewBlob: GitBlobRef = js.native
  var targetOriginalBlob: GitBlobRef = js.native
  var targetOriginalPath: String = js.native
}

object GitConflictRename2to1 {
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
    resolution: GitResolutionPathConflict,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    sourceNewBlob: GitBlobRef,
    sourceOriginalBlob: GitBlobRef,
    sourceOriginalPath: String,
    targetNewBlob: GitBlobRef,
    targetOriginalBlob: GitBlobRef,
    targetOriginalPath: String,
    url: String
  ): GitConflictRename2to1 = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], sourceNewBlob = sourceNewBlob.asInstanceOf[js.Any], sourceOriginalBlob = sourceOriginalBlob.asInstanceOf[js.Any], sourceOriginalPath = sourceOriginalPath.asInstanceOf[js.Any], targetNewBlob = targetNewBlob.asInstanceOf[js.Any], targetOriginalBlob = targetOriginalBlob.asInstanceOf[js.Any], targetOriginalPath = targetOriginalPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictRename2to1]
  }
  @scala.inline
  implicit class GitConflictRename2to1Ops[Self <: GitConflictRename2to1] (val x: Self) extends AnyVal {
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
    def setResolution(value: GitResolutionPathConflict): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceNewBlob(value: GitBlobRef): Self = this.set("sourceNewBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceOriginalBlob(value: GitBlobRef): Self = this.set("sourceOriginalBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceOriginalPath(value: String): Self = this.set("sourceOriginalPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetNewBlob(value: GitBlobRef): Self = this.set("targetNewBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetOriginalBlob(value: GitBlobRef): Self = this.set("targetOriginalBlob", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetOriginalPath(value: String): Self = this.set("targetOriginalPath", value.asInstanceOf[js.Any])
  }
  
}

