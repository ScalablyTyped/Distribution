package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GitConflictRename2to1MutableBuilder[Self <: GitConflictRename2to1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolution(value: GitResolutionPathConflict): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNewBlob(value: GitBlobRef): Self = StObject.set(x, "sourceNewBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOriginalBlob(value: GitBlobRef): Self = StObject.set(x, "sourceOriginalBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceOriginalPath(value: String): Self = StObject.set(x, "sourceOriginalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNewBlob(value: GitBlobRef): Self = StObject.set(x, "targetNewBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOriginalBlob(value: GitBlobRef): Self = StObject.set(x, "targetOriginalBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOriginalPath(value: String): Self = StObject.set(x, "targetOriginalPath", value.asInstanceOf[js.Any])
  }
}
