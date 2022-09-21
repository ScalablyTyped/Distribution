package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRecentMentionWorkItemModel extends StObject {
  
  /**
    * Assigned To
    */
  var assignedTo: String
  
  /**
    * Work Item Id
    */
  var id: Double
  
  /**
    * Lastest date that the user were mentioned
    */
  var mentionedDateField: js.Date
  
  /**
    * State of the work item
    */
  var state: String
  
  /**
    * Team project the work item belongs to
    */
  var teamProject: String
  
  /**
    * Title of the work item
    */
  var title: String
  
  /**
    * Type of Work Item
    */
  var workItemType: String
}
object AccountRecentMentionWorkItemModel {
  
  inline def apply(
    assignedTo: String,
    id: Double,
    mentionedDateField: js.Date,
    state: String,
    teamProject: String,
    title: String,
    workItemType: String
  ): AccountRecentMentionWorkItemModel = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mentionedDateField = mentionedDateField.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecentMentionWorkItemModel]
  }
  
  extension [Self <: AccountRecentMentionWorkItemModel](x: Self) {
    
    inline def setAssignedTo(value: String): Self = StObject.set(x, "assignedTo", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMentionedDateField(value: js.Date): Self = StObject.set(x, "mentionedDateField", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTeamProject(value: String): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWorkItemType(value: String): Self = StObject.set(x, "workItemType", value.asInstanceOf[js.Any])
  }
}
