package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemQuerySortColumn extends js.Object {
  /**
    * The direction to sort by.
    */
  var descending: Boolean
  /**
    * A work item field.
    */
  var field: WorkItemFieldReference
}

object WorkItemQuerySortColumn {
  @scala.inline
  def apply(descending: Boolean, field: WorkItemFieldReference): WorkItemQuerySortColumn = {
    val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemQuerySortColumn]
  }
}

