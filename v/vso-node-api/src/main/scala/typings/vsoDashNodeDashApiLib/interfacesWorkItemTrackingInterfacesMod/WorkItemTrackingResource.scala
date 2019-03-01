package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  def apply(_links: js.Any, url: java.lang.String): WorkItemTrackingResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemTrackingResource]
  }
}

