package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportRequest extends js.Object {
  
  /**
    * Links to related resources.
    */
  var _links: js.Any = js.native
  
  /**
    * Detailed status of the import, including the current step and an error message, if applicable.
    */
  var detailedStatus: GitImportStatusDetail = js.native
  
  /**
    * The unique identifier for this import request.
    */
  var importRequestId: Double = js.native
  
  /**
    * Parameters for creating the import request.
    */
  var parameters: GitImportRequestParameters = js.native
  
  /**
    * The target repository for this import.
    */
  var repository: GitRepository = js.native
  
  /**
    * Current status of the import.
    */
  var status: GitAsyncOperationStatus = js.native
  
  /**
    * A link back to this import request resource.
    */
  var url: String = js.native
}
object GitImportRequest {
  
  @scala.inline
  def apply(
    _links: js.Any,
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
  
  @scala.inline
  implicit class GitImportRequestOps[Self <: GitImportRequest] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatus(value: GitImportStatusDetail): Self = this.set("detailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportRequestId(value: Double): Self = this.set("importRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: GitImportRequestParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: GitRepository): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GitAsyncOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
