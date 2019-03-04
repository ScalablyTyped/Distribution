package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemUpdate extends WorkItemTrackingResource {
  /**
    * List of updates to fields.
    */
  var fields: org.scalablytyped.runtime.StringDictionary[WorkItemFieldUpdate]
  /**
    * ID of update.
    */
  var id: scala.Double
  /**
    * List of updates to relations.
    */
  var relations: WorkItemRelationUpdates
  /**
    * The revision number of work item update.
    */
  var rev: scala.Double
  /**
    * Identity for the work item update.
    */
  var revisedBy: IdentityReference
  /**
    * The work item updates revision date.
    */
  var revisedDate: stdLib.Date
  /**
    * The work item ID.
    */
  var workItemId: scala.Double
}

object WorkItemUpdate {
  @scala.inline
  def apply(
    _links: js.Any,
    fields: org.scalablytyped.runtime.StringDictionary[WorkItemFieldUpdate],
    id: scala.Double,
    relations: WorkItemRelationUpdates,
    rev: scala.Double,
    revisedBy: IdentityReference,
    revisedDate: stdLib.Date,
    url: java.lang.String,
    workItemId: scala.Double
  ): WorkItemUpdate = {
    val __obj = js.Dynamic.literal(_links = _links, fields = fields, id = id, relations = relations, rev = rev, revisedBy = revisedBy, revisedDate = revisedDate, url = url, workItemId = workItemId)
  
    __obj.asInstanceOf[WorkItemUpdate]
  }
}

