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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("rev")(rev)
    __obj.updateDynamic("revisedBy")(revisedBy)
    __obj.updateDynamic("revisedDate")(revisedDate)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[WorkItemHistory]
  }
}

