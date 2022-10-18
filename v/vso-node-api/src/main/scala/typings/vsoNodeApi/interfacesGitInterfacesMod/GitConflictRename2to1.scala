package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConflictRename2to1
  extends StObject
     with GitConflict {
  
  var resolution: GitResolutionPathConflict
  
  var sourceNewBlob: GitBlobRef
  
  var sourceOriginalBlob: GitBlobRef
  
  var sourceOriginalPath: String
  
  var targetNewBlob: GitBlobRef
  
  var targetOriginalBlob: GitBlobRef
  
  var targetOriginalPath: String
}
object GitConflictRename2to1 {
  
  inline def apply(
    _links: Any,
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
    resolvedDate: js.Date,
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
  
  extension [Self <: GitConflictRename2to1](x: Self) {
    
    inline def setResolution(value: GitResolutionPathConflict): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSourceNewBlob(value: GitBlobRef): Self = StObject.set(x, "sourceNewBlob", value.asInstanceOf[js.Any])
    
    inline def setSourceOriginalBlob(value: GitBlobRef): Self = StObject.set(x, "sourceOriginalBlob", value.asInstanceOf[js.Any])
    
    inline def setSourceOriginalPath(value: String): Self = StObject.set(x, "sourceOriginalPath", value.asInstanceOf[js.Any])
    
    inline def setTargetNewBlob(value: GitBlobRef): Self = StObject.set(x, "targetNewBlob", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginalBlob(value: GitBlobRef): Self = StObject.set(x, "targetOriginalBlob", value.asInstanceOf[js.Any])
    
    inline def setTargetOriginalPath(value: String): Self = StObject.set(x, "targetOriginalPath", value.asInstanceOf[js.Any])
  }
}
