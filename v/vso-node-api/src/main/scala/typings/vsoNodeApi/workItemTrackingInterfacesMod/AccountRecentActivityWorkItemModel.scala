package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRecentActivityWorkItemModel extends js.Object {
  
  /**
    * Date of the last Activity by the user
    */
  var activityDate: Date = js.native
  
  /**
    * Type of the activity
    */
  var activityType: WorkItemRecentActivityType = js.native
  
  /**
    * Assigned To
    */
  var assignedTo: String = js.native
  
  /**
    * Last changed date of the work item
    */
  var changedDate: Date = js.native
  
  /**
    * Work Item Id
    */
  var id: Double = js.native
  
  /**
    * TeamFoundationId of the user this activity belongs to
    */
  var identityId: String = js.native
  
  /**
    * State of the work item
    */
  var state: String = js.native
  
  /**
    * Team project the work item belongs to
    */
  var teamProject: String = js.native
  
  /**
    * Title of the work item
    */
  var title: String = js.native
  
  /**
    * Type of Work Item
    */
  var workItemType: String = js.native
}
object AccountRecentActivityWorkItemModel {
  
  @scala.inline
  def apply(
    activityDate: Date,
    activityType: WorkItemRecentActivityType,
    assignedTo: String,
    changedDate: Date,
    id: Double,
    identityId: String,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountRecentActivityWorkItemModel = {
    val __obj = js.Dynamic.literal(activityDate = activityDate.asInstanceOf[js.Any], activityType = activityType.asInstanceOf[js.Any], assignedTo = assignedTo.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecentActivityWorkItemModel]
  }
  
  @scala.inline
  implicit class AccountRecentActivityWorkItemModelOps[Self <: AccountRecentActivityWorkItemModel] (val x: Self) extends AnyVal {
    
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
    def setActivityDate(value: Date): Self = this.set("activityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: WorkItemRecentActivityType): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityId(value: String): Self = this.set("identityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: String): Self = this.set("teamProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemType(value: String): Self = this.set("workItemType", value.asInstanceOf[js.Any])
  }
}
