package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var importRequestId: scala.Double
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
  var url: java.lang.String
}

object GitImportRequest {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitImportStatusDetail,
    importRequestId: scala.Double,
    parameters: GitImportRequestParameters,
    repository: GitRepository,
    status: GitAsyncOperationStatus,
    url: java.lang.String
  ): GitImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("detailedStatus")(detailedStatus)
    __obj.updateDynamic("importRequestId")(importRequestId)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("repository")(repository)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitImportRequest]
  }
}

