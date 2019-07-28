package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemHistory extends WorkItemTrackingResource {
  var rev: Double
  var revisedBy: IdentityReference
  var revisedDate: Date
  var value: String
}

object WorkItemHistory {
  @scala.inline
  def apply(
    _links: js.Any,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: Date,
    url: String,
    value: String
  ): WorkItemHistory = {
    val __obj = js.Dynamic.literal(_links = _links, rev = rev, revisedBy = revisedBy, revisedDate = revisedDate, url = url, value = value)
  
    __obj.asInstanceOf[WorkItemHistory]
  }
}

