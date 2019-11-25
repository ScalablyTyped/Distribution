package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTrackingResource extends WorkItemTrackingResourceReference {
  /**
    * Link references to related REST resources.
    */
  var _links: js.Any
}

object WorkItemTrackingResource {
  @scala.inline
  def apply(_links: js.Any, url: String): WorkItemTrackingResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemTrackingResource]
  }
}

