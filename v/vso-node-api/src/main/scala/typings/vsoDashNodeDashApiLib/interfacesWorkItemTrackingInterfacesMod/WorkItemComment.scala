package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemComment extends WorkItemTrackingResource {
  var revisedBy: IdentityReference
  var revisedDate: stdLib.Date
  var revision: scala.Double
  var text: java.lang.String
}

object WorkItemComment {
  @scala.inline
  def apply(
    _links: js.Any,
    revisedBy: IdentityReference,
    revisedDate: stdLib.Date,
    revision: scala.Double,
    text: java.lang.String,
    url: java.lang.String
  ): WorkItemComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("revisedBy")(revisedBy)
    __obj.updateDynamic("revisedDate")(revisedDate)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemComment]
  }
}

