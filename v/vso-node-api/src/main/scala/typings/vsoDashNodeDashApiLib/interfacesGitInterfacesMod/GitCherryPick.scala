package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCherryPick extends GitAsyncRefOperation {
  var cherryPickId: scala.Double
}

object GitCherryPick {
  @scala.inline
  def apply(
    _links: js.Any,
    cherryPickId: scala.Double,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: java.lang.String
  ): GitCherryPick = {
    val __obj = js.Dynamic.literal(_links = _links, cherryPickId = cherryPickId, detailedStatus = detailedStatus, parameters = parameters, status = status, url = url)
  
    __obj.asInstanceOf[GitCherryPick]
  }
}

