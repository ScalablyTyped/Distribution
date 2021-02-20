package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitAsyncRefOperation extends StObject {
  
  var _links: js.Any = js.native
  
  var detailedStatus: GitAsyncRefOperationDetail = js.native
  
  var parameters: GitAsyncRefOperationParameters = js.native
  
  var status: GitAsyncOperationStatus = js.native
  
  /**
    * A URL that can be used to make further requests for status about the operation
    */
  var url: String = js.native
}
object GitAsyncRefOperation {
  
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitAsyncRefOperation = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperation]
  }
  
  @scala.inline
  implicit class GitAsyncRefOperationMutableBuilder[Self <: GitAsyncRefOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailedStatus(value: GitAsyncRefOperationDetail): Self = StObject.set(x, "detailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: GitAsyncRefOperationParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GitAsyncOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
