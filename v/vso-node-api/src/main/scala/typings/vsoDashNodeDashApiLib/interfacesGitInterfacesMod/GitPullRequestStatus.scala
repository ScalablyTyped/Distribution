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
    val __obj = js.Dynamic.literal(_links = _links, context = context, createdBy = createdBy, creationDate = creationDate, description = description, id = id, iterationId = iterationId, properties = properties, state = state, targetUrl = targetUrl, updatedDate = updatedDate)
  
    __obj.asInstanceOf[GitPullRequestStatus]
  }
}

