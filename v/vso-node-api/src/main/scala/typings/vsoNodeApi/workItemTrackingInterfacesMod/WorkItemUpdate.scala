package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemUpdate extends WorkItemTrackingResource {
  /**
    * List of updates to fields.
    */
  var fields: StringDictionary[WorkItemFieldUpdate] = js.native
  /**
    * ID of update.
    */
  var id: Double = js.native
  /**
    * List of updates to relations.
    */
  var relations: WorkItemRelationUpdates = js.native
  /**
    * The revision number of work item update.
    */
  var rev: Double = js.native
  /**
    * Identity for the work item update.
    */
  var revisedBy: IdentityReference = js.native
  /**
    * The work item updates revision date.
    */
  var revisedDate: Date = js.native
  /**
    * The work item ID.
    */
  var workItemId: Double = js.native
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
  @scala.inline
  implicit class WorkItemUpdateOps[Self <: WorkItemUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFields(value: StringDictionary[WorkItemFieldUpdate]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelations(value: WorkItemRelationUpdates): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def setRev(value: Double): Self = this.set("rev", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisedBy(value: IdentityReference): Self = this.set("revisedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisedDate(value: Date): Self = this.set("revisedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemId(value: Double): Self = this.set("workItemId", value.asInstanceOf[js.Any])
  }
  
}

