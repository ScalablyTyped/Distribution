package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitAsyncRefOperation extends StObject {
  
  var _links: Any
  
  var detailedStatus: GitAsyncRefOperationDetail
  
  var parameters: GitAsyncRefOperationParameters
  
  var status: GitAsyncOperationStatus
  
  /**
    * A URL that can be used to make further requests for status about the operation
    */
  var url: String
}
object GitAsyncRefOperation {
  
  inline def apply(
    _links: Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitAsyncRefOperation = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitAsyncRefOperation] (val x: Self) extends AnyVal {
    
    inline def setDetailedStatus(value: GitAsyncRefOperationDetail): Self = StObject.set(x, "detailedStatus", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: GitAsyncRefOperationParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: GitAsyncOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
