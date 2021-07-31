package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitForkSyncRequest extends StObject {
  
  /**
    * Collection of related links
    */
  var _links: js.Any
  
  var detailedStatus: GitForkOperationStatusDetail
  
  /**
    * Unique identifier for the operation.
    */
  var operationId: Double
  
  /**
    * Fully-qualified identifier for the source repository.
    */
  var source: GlobalGitRepositoryKey
  
  /**
    * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
    */
  var sourceToTargetRefs: js.Array[SourceToTargetRef]
  
  var status: GitAsyncOperationStatus
}
object GitForkSyncRequest {
  
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitForkOperationStatusDetail,
    operationId: Double,
    source: GlobalGitRepositoryKey,
    sourceToTargetRefs: js.Array[SourceToTargetRef],
    status: GitAsyncOperationStatus
  ): GitForkSyncRequest = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceToTargetRefs = sourceToTargetRefs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitForkSyncRequest]
  }
  
  @scala.inline
  implicit class GitForkSyncRequestMutableBuilder[Self <: GitForkSyncRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailedStatus(value: GitForkOperationStatusDetail): Self = StObject.set(x, "detailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationId(value: Double): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: GlobalGitRepositoryKey): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceToTargetRefs(value: js.Array[SourceToTargetRef]): Self = StObject.set(x, "sourceToTargetRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceToTargetRefsVarargs(value: SourceToTargetRef*): Self = StObject.set(x, "sourceToTargetRefs", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: GitAsyncOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
