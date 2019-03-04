package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemHistory extends WorkItemTrackingResource {
  var rev: scala.Double
  var revisedBy: IdentityReference
  var revisedDate: stdLib.Date
  var value: java.lang.String
}

object WorkItemHistory {
  @scala.inline
  def apply(
    _links: js.Any,
    rev: scala.Double,
    revisedBy: IdentityReference,
    revisedDate: stdLib.Date,
    url: java.lang.String,
    value: java.lang.String
  ): WorkItemHistory = {
    val __obj = js.Dynamic.literal(_links = _links, rev = rev, revisedBy = revisedBy, revisedDate = revisedDate, url = url, value = value)
  
    __obj.asInstanceOf[WorkItemHistory]
  }
}

