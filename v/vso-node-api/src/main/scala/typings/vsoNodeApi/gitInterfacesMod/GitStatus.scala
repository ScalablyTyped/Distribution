package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
  var createdBy: IdentityRef
  /**
    * Creation date and time of the status.
    */
  var creationDate: Date
  /**
    * Status description. Typically describes current state of the status.
    */
  var description: String
  /**
    * Status identifier.
    */
  var id: Double
  /**
    * State of the status.
    */
  var state: GitStatusState
  /**
    * URL with status details.
    */
  var targetUrl: String
  /**
    * Last update date and time of the status.
    */
  var updatedDate: Date
}

object GitStatus {
  @scala.inline
  def apply(
    _links: js.Any,
    context: GitStatusContext,
    createdBy: IdentityRef,
    creationDate: Date,
    description: String,
    id: Double,
    state: GitStatusState,
    targetUrl: String,
    updatedDate: Date
  ): GitStatus = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], targetUrl = targetUrl.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitStatus]
  }
}

