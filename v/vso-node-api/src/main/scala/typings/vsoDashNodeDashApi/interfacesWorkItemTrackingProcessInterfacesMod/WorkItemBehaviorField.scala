package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemBehaviorField extends js.Object {
  var behaviorFieldId: String
  var id: String
  var url: String
}

object WorkItemBehaviorField {
  @scala.inline
  def apply(behaviorFieldId: String, id: String, url: String): WorkItemBehaviorField = {
    val __obj = js.Dynamic.literal(behaviorFieldId = behaviorFieldId, id = id, url = url)
  
    __obj.asInstanceOf[WorkItemBehaviorField]
  }
}

