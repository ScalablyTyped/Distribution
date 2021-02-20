package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitConflict extends StObject {
  
  var _links: js.Any = js.native
  
  var conflictId: Double = js.native
  
  var conflictPath: String = js.native
  
  var conflictType: GitConflictType = js.native
  
  var mergeBaseCommit: GitCommitRef = js.native
  
  var mergeOrigin: GitMergeOriginRef = js.native
  
  var mergeSourceCommit: GitCommitRef = js.native
  
  var mergeTargetCommit: GitCommitRef = js.native
  
  var resolutionError: GitResolutionError = js.native
  
  var resolutionStatus: GitResolutionStatus = js.native
  
  var resolvedBy: IdentityRef = js.native
  
  var resolvedDate: Date = js.native
  
  var url: String = js.native
}
object GitConflict {
  
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
    resolutionError: GitResolutionError,
    resolutionStatus: GitResolutionStatus,
    resolvedBy: IdentityRef,
    resolvedDate: Date,
    url: String
  ): GitConflict = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], conflictId = conflictId.asInstanceOf[js.Any], conflictPath = conflictPath.asInstanceOf[js.Any], conflictType = conflictType.asInstanceOf[js.Any], mergeBaseCommit = mergeBaseCommit.asInstanceOf[js.Any], mergeOrigin = mergeOrigin.asInstanceOf[js.Any], mergeSourceCommit = mergeSourceCommit.asInstanceOf[js.Any], mergeTargetCommit = mergeTargetCommit.asInstanceOf[js.Any], resolutionError = resolutionError.asInstanceOf[js.Any], resolutionStatus = resolutionStatus.asInstanceOf[js.Any], resolvedBy = resolvedBy.asInstanceOf[js.Any], resolvedDate = resolvedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConflict]
  }
  
  @scala.inline
  implicit class GitConflictMutableBuilder[Self <: GitConflict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflictId(value: Double): Self = StObject.set(x, "conflictId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictPath(value: String): Self = StObject.set(x, "conflictPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictType(value: GitConflictType): Self = StObject.set(x, "conflictType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeBaseCommit(value: GitCommitRef): Self = StObject.set(x, "mergeBaseCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOrigin(value: GitMergeOriginRef): Self = StObject.set(x, "mergeOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeSourceCommit(value: GitCommitRef): Self = StObject.set(x, "mergeSourceCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTargetCommit(value: GitCommitRef): Self = StObject.set(x, "mergeTargetCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionError(value: GitResolutionError): Self = StObject.set(x, "resolutionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionStatus(value: GitResolutionStatus): Self = StObject.set(x, "resolutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedBy(value: IdentityRef): Self = StObject.set(x, "resolvedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedDate(value: Date): Self = StObject.set(x, "resolvedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
