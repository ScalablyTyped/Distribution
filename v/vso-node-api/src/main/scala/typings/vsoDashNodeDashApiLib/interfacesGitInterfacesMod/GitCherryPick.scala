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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("cherryPickId")(cherryPickId)
    __obj.updateDynamic("detailedStatus")(detailedStatus)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitCherryPick]
  }
}

