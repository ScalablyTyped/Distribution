package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRevert extends GitAsyncRefOperation {
  var revertId: scala.Double
}

object GitRevert {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    revertId: scala.Double,
    status: GitAsyncOperationStatus,
    url: java.lang.String
  ): GitRevert = {
    val __obj = js.Dynamic.literal(_links = _links, detailedStatus = detailedStatus, parameters = parameters, revertId = revertId, status = status, url = url)
  
    __obj.asInstanceOf[GitRevert]
  }
}

