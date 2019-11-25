package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeReference extends WorkItemTrackingResourceReference {
  /**
    * Name of the work item type.
    */
  var name: String
}

object WorkItemTypeReference {
  @scala.inline
  def apply(name: String, url: String): WorkItemTypeReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemTypeReference]
  }
}

