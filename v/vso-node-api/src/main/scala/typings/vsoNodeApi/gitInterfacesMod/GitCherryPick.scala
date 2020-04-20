package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCherryPick extends GitAsyncRefOperation {
  var cherryPickId: Double
}

object GitCherryPick {
  @scala.inline
  def apply(
    _links: js.Any,
    cherryPickId: Double,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitCherryPick = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], cherryPickId = cherryPickId.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCherryPick]
  }
}

