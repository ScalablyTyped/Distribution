package typings.vsoNodeApi.workItemTrackingInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountWorkWorkItemModel extends StObject {
  
  var assignedTo: String = js.native
  
  var changedDate: Date = js.native
  
  var id: Double = js.native
  
  var state: String = js.native
  
  var teamProject: String = js.native
  
  var title: String = js.native
  
  var workItemType: String = js.native
}
object AccountWorkWorkItemModel {
  
  @scala.inline
  def apply(
    assignedTo: String,
    changedDate: Date,
    id: Double,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountWorkWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountWorkWorkItemModel]
  }
  
  @scala.inline
  implicit class AccountWorkWorkItemModelMutableBuilder[Self <: AccountWorkWorkItemModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTo(value: String): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: String): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemType(value: String): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
