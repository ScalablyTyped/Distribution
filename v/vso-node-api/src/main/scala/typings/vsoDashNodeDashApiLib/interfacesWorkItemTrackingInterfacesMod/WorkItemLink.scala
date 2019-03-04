package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemLink extends js.Object {
  /**
    * The type of link.
    */
  var rel: java.lang.String
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
  def apply(rel: java.lang.String, source: WorkItemReference, target: WorkItemReference): WorkItemLink = {
    val __obj = js.Dynamic.literal(rel = rel, source = source, target = target)
  
    __obj.asInstanceOf[WorkItemLink]
  }
}

