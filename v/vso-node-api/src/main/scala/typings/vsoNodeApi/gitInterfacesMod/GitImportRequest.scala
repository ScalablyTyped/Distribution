package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitImportRequest extends StObject {
  
  /**
    * Links to related resources.
    */
  var _links: Any
  
  /**
    * Detailed status of the import, including the current step and an error message, if applicable.
    */
  var detailedStatus: GitImportStatusDetail
  
  /**
    * The unique identifier for this import request.
    */
  var importRequestId: Double
  
  /**
    * Parameters for creating the import request.
    */
  var parameters: GitImportRequestParameters
  
  /**
    * The target repository for this import.
    */
  var repository: GitRepository
  
  /**
    * Current status of the import.
    */
  var status: GitAsyncOperationStatus
  
  /**
    * A link back to this import request resource.
    */
  var url: String
}
object GitImportRequest {
  
  inline def apply(
    _links: Any,
    detailedStatus: GitImportStatusDetail,
    importRequestId: Double,
    parameters: GitImportRequestParameters,
    repository: GitRepository,
    status: GitAsyncOperationStatus,
    url: String
  ): GitImportRequest = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], importRequestId = importRequestId.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportRequest]
  }
  
  extension [Self <: GitImportRequest](x: Self) {
    
    inline def setDetailedStatus(value: GitImportStatusDetail): Self = StObject.set(x, "detailedStatus", value.asInstanceOf[js.Any])
    
    inline def setImportRequestId(value: Double): Self = StObject.set(x, "importRequestId", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: GitImportRequestParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: GitRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: GitAsyncOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
