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
    val __obj = js.Dynamic.literal(_links = _links, name = name, referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[WorkItemTrackingReference]
  }
}

