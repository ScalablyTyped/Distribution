package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemQuerySortColumn extends js.Object {
  /**
    * The direction to sort by.
    */
  var descending: scala.Boolean
  /**
    * A work item field.
    */
  var field: WorkItemFieldReference
}

object WorkItemQuerySortColumn {
  @scala.inline
  def apply(descending: scala.Boolean, field: WorkItemFieldReference): WorkItemQuerySortColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descending")(descending)
    __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[WorkItemQuerySortColumn]
  }
}

