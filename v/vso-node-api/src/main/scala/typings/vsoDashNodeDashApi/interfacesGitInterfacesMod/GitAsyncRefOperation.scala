package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperation extends js.Object {
  var _links: js.Any
  var detailedStatus: GitAsyncRefOperationDetail
  var parameters: GitAsyncRefOperationParameters
  var status: GitAsyncOperationStatus
  /**
    * A URL that can be used to make further requests for status about the operation
    */
  var url: String
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
}

