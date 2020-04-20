package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemDeleteUpdate extends js.Object {
  /**
    * Sets a value indicating whether this work item is deleted.
    */
  var isDeleted: Boolean
}

object WorkItemDeleteUpdate {
  @scala.inline
  def apply(isDeleted: Boolean): WorkItemDeleteUpdate = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemDeleteUpdate]
  }
}

