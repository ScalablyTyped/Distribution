package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemDeleteUpdate extends js.Object {
  /**
    * Sets a value indicating whether this work item is deleted.
    */
  var isDeleted: scala.Boolean
}

object WorkItemDeleteUpdate {
  @scala.inline
  def apply(isDeleted: scala.Boolean): WorkItemDeleteUpdate = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted)
  
    __obj.asInstanceOf[WorkItemDeleteUpdate]
  }
}

