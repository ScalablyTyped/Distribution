package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemBehaviorReference extends js.Object {
  var id: String
  var url: String
}

object WorkItemBehaviorReference {
  @scala.inline
  def apply(id: String, url: String): WorkItemBehaviorReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemBehaviorReference]
  }
}

