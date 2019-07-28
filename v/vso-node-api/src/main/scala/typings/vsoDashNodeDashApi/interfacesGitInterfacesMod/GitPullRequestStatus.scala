package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitPullRequestStatus extends GitStatus {
  /**
    * ID of the iteration to associate status with. Minimum value is 1.
    */
  var iterationId: Double
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
    createdBy: IdentityRef,
    creationDate: Date,
    description: String,
    id: Double,
    iterationId: Double,
    properties: js.Any,
    state: GitStatusState,
    targetUrl: String,
    updatedDate: Date
  ): GitPullRequestStatus = {
    val __obj = js.Dynamic.literal(_links = _links, context = context, createdBy = createdBy, creationDate = creationDate, description = description, id = id, iterationId = iterationId, properties = properties, state = state, targetUrl = targetUrl, updatedDate = updatedDate)
  
    __obj.asInstanceOf[GitPullRequestStatus]
  }
}

