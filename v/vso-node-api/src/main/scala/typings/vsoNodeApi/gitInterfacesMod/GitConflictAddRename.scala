package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConflictAddRename
  extends StObject
     with GitConflict {
  
  var baseBlob: GitBlobRef
  
  var resolution: GitResolutionPathConflict
  
  var sourceBlob: GitBlobRef
  
  var targetBlob: GitBlobRef
  
  var targetOriginalPath: String
}
object GitConflictAddRename {
  
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
    resolution: GitResolutionPathConflict,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    sourceBlob: GitBlobRef,
    targetBlob: GitBlobRef,
    targetOriginalPath: String,
    url: String
  ): GitConflictAddRename = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], baseBlob = baseBlob.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], sourceBlob = sourceBlob.asInstanceOf[js.Any], targetBlob = targetBlob.asInstanceOf[js.Any], targetOriginalPath = targetOriginalPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflictAddRename]
  }
  
  @scala.inline
  implicit class GitConflictAddRenameMutableBuilder[Self <: GitConflictAddRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseBlob(value: GitBlobRef): Self = StObject.set(x, "baseBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: GitResolutionPathConflict): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBlob(value: GitBlobRef): Self = StObject.set(x, "sourceBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBlob(value: GitBlobRef): Self = StObject.set(x, "targetBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetOriginalPath(value: String): Self = StObject.set(x, "targetOriginalPath", value.asInstanceOf[js.Any])
  }
}
