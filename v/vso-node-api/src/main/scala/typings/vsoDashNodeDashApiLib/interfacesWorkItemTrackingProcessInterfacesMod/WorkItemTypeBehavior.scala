package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeBehavior extends js.Object {
  var behavior: WorkItemBehaviorReference
  var isDefault: scala.Boolean
  var url: java.lang.String
}

object WorkItemTypeBehavior {
  @scala.inline
  def apply(behavior: WorkItemBehaviorReference, isDefault: scala.Boolean, url: java.lang.String): WorkItemTypeBehavior = {
    val __obj = js.Dynamic.literal(behavior = behavior, isDefault = isDefault, url = url)
  
    __obj.asInstanceOf[WorkItemTypeBehavior]
  }
}

