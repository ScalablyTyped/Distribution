package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConflict extends StObject {
  
  var _links: Any
  
  var conflictId: Double
  
  var conflictPath: String
  
  var conflictType: GitConflictType
  
  var mergeBaseCommit: GitCommitRef
  
  var mergeOrigin: GitMergeOriginRef
  
  var mergeSourceCommit: GitCommitRef
  
  var mergeTargetCommit: GitCommitRef
  
  var resolutionError: GitResolutionError
  
  var resolutionStatus: GitResolutionStatus
  
  var resolvedBy: IdentityRef
  
  var resolvedDate: js.Date
  
  var url: String
}
object GitConflict {
  
  inline def apply(
    _links: Any,
    conflictId: Double,
    conflictPath: String,
    conflictType: GitConflictType,
    mergeBaseCommit: GitCommitRef,
    mergeOrigin: GitMergeOriginRef,
    mergeSourceCommit: GitCommitRef,
    mergeTargetCommit: GitCommitRef,
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: js.Date,
    url: String
  ): GitConflict = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflict]
  }
  
  extension [Self <: GitConflict](x: Self) {
    
    inline def setConflictId(value: Double): Self = StObject.set(x, "conflictId", value.asInstanceOf[js.Any])
    
    inline def setConflictPath(value: String): Self = StObject.set(x, "conflictPath", value.asInstanceOf[js.Any])
    
    inline def setConflictType(value: GitConflictType): Self = StObject.set(x, "conflictType", value.asInstanceOf[js.Any])
    
    inline def setMergeBaseCommit(value: GitCommitRef): Self = StObject.set(x, "mergeBaseCommit", value.asInstanceOf[js.Any])
    
    inline def setMergeOrigin(value: GitMergeOriginRef): Self = StObject.set(x, "mergeOrigin", value.asInstanceOf[js.Any])
    
    inline def setMergeSourceCommit(value: GitCommitRef): Self = StObject.set(x, "mergeSourceCommit", value.asInstanceOf[js.Any])
    
    inline def setMergeTargetCommit(value: GitCommitRef): Self = StObject.set(x, "mergeTargetCommit", value.asInstanceOf[js.Any])
    
    inline def setResolutionError(value: GitResolutionError): Self = StObject.set(x, "resolutionError", value.asInstanceOf[js.Any])
    
    inline def setResolutionStatus(value: GitResolutionStatus): Self = StObject.set(x, "resolutionStatus", value.asInstanceOf[js.Any])
    
    inline def setResolvedBy(value: IdentityRef): Self = StObject.set(x, "resolvedBy", value.asInstanceOf[js.Any])
    
    inline def setResolvedDate(value: js.Date): Self = StObject.set(x, "resolvedDate", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
