package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRevert extends GitAsyncRefOperation {
  var revertId: Double
}

object GitRevert {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    revertId: Double,
    status: GitAsyncOperationStatus,
    url: String
  ): GitRevert = {
    val __obj = js.Dynamic.literal(_links = _links, detailedStatus = detailedStatus, parameters = parameters, revertId = revertId, status = status, url = url)
  
    __obj.asInstanceOf[GitRevert]
  }
}

