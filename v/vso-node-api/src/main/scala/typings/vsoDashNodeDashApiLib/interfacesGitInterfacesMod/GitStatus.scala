package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitStatus extends js.Object {
  /**
    * Reference links.
    */
  var _links: js.Any
  /**
    * Context of the status.
    */
  var context: GitStatusContext
  /**
    * Identity that created the status.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Creation date and time of the status.
    */
  var creationDate: stdLib.Date
  /**
    * Status description. Typically describes current state of the status.
    */
  var description: java.lang.String
  /**
    * Status identifier.
    */
  var id: scala.Double
  /**
    * State of the status.
    */
  var state: GitStatusState
  /**
    * URL with status details.
    */
  var targetUrl: java.lang.String
  /**
    * Last update date and time of the status.
    */
  var updatedDate: stdLib.Date
}

object GitStatus {
  @scala.inline
  def apply(
    _links: js.Any,
    context: GitStatusContext,
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    creationDate: stdLib.Date,
    description: java.lang.String,
    id: scala.Double,
    state: GitStatusState,
    targetUrl: java.lang.String,
    updatedDate: stdLib.Date
  ): GitStatus = {
    val __obj = js.Dynamic.literal(_links = _links, context = context, createdBy = createdBy, creationDate = creationDate, description = description, id = id, state = state, targetUrl = targetUrl, updatedDate = updatedDate)
  
    __obj.asInstanceOf[GitStatus]
  }
}

