package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTrackingReference extends WorkItemTrackingResource {
  /**
    * The name.
    */
  var name: String
  /**
    * The reference name.
    */
  var referenceName: String
}

object WorkItemTrackingReference {
  @scala.inline
  def apply(_links: js.Any, name: String, referenceName: String, url: String): WorkItemTrackingReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemTrackingReference]
  }
}

