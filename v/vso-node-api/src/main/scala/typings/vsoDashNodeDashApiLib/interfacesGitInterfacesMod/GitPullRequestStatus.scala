package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestStatus extends GitStatus {
  /**
    * ID of the iteration to associate status with. Minimum value is 1.
    */
  var iterationId: scala.Double
  /**
    * Custom properties of the status.
    */
  var properties: js.Any
}

object GitPullRequestStatus {
  @scala.inline
  def apply(
    _links: js.Any,
    context: GitStatusContext,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    creationDate: stdLib.Date,
    description: java.lang.String,
    id: scala.Double,
    iterationId: scala.Double,
    properties: js.Any,
    state: GitStatusState,
    targetUrl: java.lang.String,
    updatedDate: stdLib.Date
  ): GitPullRequestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("creationDate")(creationDate)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("iterationId")(iterationId)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("targetUrl")(targetUrl)
    __obj.updateDynamic("updatedDate")(updatedDate)
    __obj.asInstanceOf[GitPullRequestStatus]
  }
}

