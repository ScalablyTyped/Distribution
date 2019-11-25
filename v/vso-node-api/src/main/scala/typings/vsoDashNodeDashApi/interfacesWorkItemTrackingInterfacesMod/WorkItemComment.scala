package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemComment extends WorkItemTrackingResource {
  var revisedBy: IdentityReference
  var revisedDate: Date
  var revision: Double
  var text: String
}

object WorkItemComment {
  @scala.inline
  def apply(
    _links: js.Any,
    revisedBy: IdentityReference,
    revisedDate: Date,
    revision: Double,
    text: String,
    url: String
  ): WorkItemComment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemComment]
  }
}

