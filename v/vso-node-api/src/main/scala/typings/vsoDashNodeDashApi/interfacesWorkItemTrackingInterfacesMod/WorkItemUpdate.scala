package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemUpdate extends WorkItemTrackingResource {
  /**
    * List of updates to fields.
    */
  var fields: StringDictionary[WorkItemFieldUpdate]
  /**
    * ID of update.
    */
  var id: Double
  /**
    * List of updates to relations.
    */
  var relations: WorkItemRelationUpdates
  /**
    * The revision number of work item update.
    */
  var rev: Double
  /**
    * Identity for the work item update.
    */
  var revisedBy: IdentityReference
  /**
    * The work item updates revision date.
    */
  var revisedDate: Date
  /**
    * The work item ID.
    */
  var workItemId: Double
}

object WorkItemUpdate {
  @scala.inline
  def apply(
    _links: js.Any,
    fields: StringDictionary[WorkItemFieldUpdate],
    id: Double,
    relations: WorkItemRelationUpdates,
    rev: Double,
    revisedBy: IdentityReference,
    revisedDate: Date,
    url: String,
    workItemId: Double
  ): WorkItemUpdate = {
    val __obj = js.Dynamic.literal(_links = _links, fields = fields, id = id, relations = relations, rev = rev, revisedBy = revisedBy, revisedDate = revisedDate, url = url, workItemId = workItemId)
  
    __obj.asInstanceOf[WorkItemUpdate]
  }
}

