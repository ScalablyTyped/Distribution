package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeBehavior extends js.Object {
  var behavior: WorkItemBehaviorReference
  var isDefault: Boolean
  var url: String
}

object WorkItemTypeBehavior {
  @scala.inline
  def apply(behavior: WorkItemBehaviorReference, isDefault: Boolean, url: String): WorkItemTypeBehavior = {
    val __obj = js.Dynamic.literal(behavior = behavior, isDefault = isDefault, url = url)
  
    __obj.asInstanceOf[WorkItemTypeBehavior]
  }
}

