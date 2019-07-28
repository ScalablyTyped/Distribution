package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportRequest extends js.Object {
  /**
    * Links to related resources.
    */
  var _links: js.Any
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
    val __obj = js.Dynamic.literal(_links = _links, detailedStatus = detailedStatus, importRequestId = importRequestId, parameters = parameters, repository = repository, status = status, url = url)
  
    __obj.asInstanceOf[GitImportRequest]
  }
}

