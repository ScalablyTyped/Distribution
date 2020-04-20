package typings.vsoNodeApi.workItemTrackingInterfacesMod

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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], revisedBy = revisedBy.asInstanceOf[js.Any], revisedDate = revisedDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemId = workItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemUpdate]
  }
}

