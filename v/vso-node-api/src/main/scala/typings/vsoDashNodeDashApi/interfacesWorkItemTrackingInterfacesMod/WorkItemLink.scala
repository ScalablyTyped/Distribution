package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemLink extends js.Object {
  /**
    * The type of link.
    */
  var rel: String
  /**
    * The source work item.
    */
  var source: WorkItemReference
  /**
    * The target work item.
    */
  var target: WorkItemReference
}

object WorkItemLink {
  @scala.inline
  def apply(rel: String, source: WorkItemReference, target: WorkItemReference): WorkItemLink = {
    val __obj = js.Dynamic.literal(rel = rel, source = source, target = target)
  
    __obj.asInstanceOf[WorkItemLink]
  }
}

