package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemReference extends js.Object {
  /**
    * Work item ID.
    */
  var id: Double
  /**
    * REST API URL of the resource
    */
  var url: String
}

object WorkItemReference {
  @scala.inline
  def apply(id: Double, url: String): WorkItemReference = {
    val __obj = js.Dynamic.literal(id = id, url = url)
  
    __obj.asInstanceOf[WorkItemReference]
  }
}

